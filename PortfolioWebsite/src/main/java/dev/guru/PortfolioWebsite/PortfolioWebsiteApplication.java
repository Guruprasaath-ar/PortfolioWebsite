package dev.guru.PortfolioWebsite;

import dev.guru.PortfolioWebsite.model.About;
import dev.guru.PortfolioWebsite.model.Skill;
import dev.guru.PortfolioWebsite.model.User;
import dev.guru.PortfolioWebsite.repository.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PortfolioWebsiteApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(PortfolioWebsiteApplication.class, args);
		Skill skill = context.getBean(Skill.class);
		skill.setName("Java");


		About aboutSection = context.getBean(About.class);
		aboutSection.setTitle("Developer by profession");

		User profile = new User.UserBuilder("Guru Prasaath")
								.withEmail("guruprasaathar2002@gmail.com")
								.withAboutSection(aboutSection)
								.addSkill(skill)
								.build();

		UserRepo userRepo = context.getBean(dev.guru.PortfolioWebsite.repository.UserRepo.class);
		userRepo.save(profile);
	}

}

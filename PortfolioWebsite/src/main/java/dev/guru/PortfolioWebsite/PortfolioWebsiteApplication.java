package dev.guru.PortfolioWebsite;

import dev.guru.PortfolioWebsite.model.About;
import dev.guru.PortfolioWebsite.model.Profiles;
import dev.guru.PortfolioWebsite.model.Skill;
import dev.guru.PortfolioWebsite.model.User;
import dev.guru.PortfolioWebsite.repository.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PortfolioWebsiteApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(PortfolioWebsiteApplication.class, args);

		/* Skills section */
//		Skill tailwind = new Skill.SkillBuilder("Tailwind")
//									.withImg("https://img.icons8.com/color/48/tailwind_css.png")
//									.build();
//
//		Skill js = new Skill.SkillBuilder("JavaScript")
//							.withImg("https://img.icons8.com/color/48/javascript.png")
//							.build();
//
//		Skill cpp = new Skill.SkillBuilder("C++")
//							.withImg("https://img.icons8.com/color/48/c-plus-plus-logo.png")
//							.build();
//
//		Skill java = new Skill.SkillBuilder("Java")
//							.withImg("https://img.icons8.com/color/48/java-coffee-cup-logo.png")
//							.build();
//
//		Skill SpringBoot = new Skill.SkillBuilder("Spring Boot")
//									.withImg("https://img.icons8.com/officel/50/spring-logo.png")
//									.build();
//
//		Skill db = new Skill.SkillBuilder("PostgreSQL")
//							.withImg("https://img.icons8.com/color/48/postgreesql.png")
//							.build();
//
//		Skill git = new Skill.SkillBuilder("Git")
//							.withImg("https://img.icons8.com/color/48/git.png")
//							.build();
//
//		Skill ue = new Skill.SkillBuilder("Unreal Engine")
//							.withImg("https://img.icons8.com/nolan/50/unreal-engine.png")
//							.build();
//
// 		/* about section */
//		About aboutSection = new About.AboutBuilder("Passionate developer with expertise in multiple technologies")
//										.withHeaderDescription("I'm a software developer with expertise in Java, Spring Boot, " +
//												"and building scalable backend systems. " +
//												"Alongside this, I have professional experience as a game developer, " +
//												"working with Unreal Engine and C++ to create immersive gameplay systems.")
//										.withBodyDescription("Outside of work, I'm a football enthusiast, a curious learner, " +
//												"and someone who enjoys turning challenges into opportunities. " +
//												"Whether it's coding, playing on the field, or learning something new, " +
//											"I'm driven by passion and the joy of improvement.")
//										.build();
//		/* profiles */
//		Profiles profiles = new Profiles.ProfilesBuilder()
//										.withLinkedIn("https://www.linkedin.com/in/guruprasaathar/")
//										.withGithub("https://github.com/Guruprasaath-ar")
//										.withEmailId("guruprasaathar2002@gmail.com")
//										.build();
//
//		List<Skill> skills = new ArrayList<Skill>();
//		skills.add(tailwind);
//		skills.add(js);
//		skills.add(cpp);
//		skills.add(java);
//		skills.add(SpringBoot);
//		skills.add(db);
//		skills.add(git);
//		skills.add(ue);
//
//		/* user */
//		User profile = new User.UserBuilder("Guruprasaath")
//							.withProfession("Software Developer")
//								.withHeader("Engineer and problem-solver, " +
//										"I specialize in building robust, " +
//										"scalable systems that deliver both speed and reliability, " +
//										"because great software should feel effortless.")
//								.withCvPath("/cv/resume.pdf")
//								.withProfileImgPath("/images/ProfileImg.jpg")
//								.withProfiles(profiles)
//								.withAboutSection(aboutSection)
//								.addSkills(skills)
//								.build();
//
//
//
//		UserRepo userRepo = context.getBean(dev.guru.PortfolioWebsite.repository.UserRepo.class);
//		userRepo.save(profile);
	}
}

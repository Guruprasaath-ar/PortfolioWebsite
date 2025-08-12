package dev.guru.PortfolioWebsite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String ImgPath;

    public Skill() {

    }

    public String getImgPath() {
        return ImgPath;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Skill(SkillBuilder builder) {
        this.name = builder.name;
        this.ImgPath = builder.ImgPath;
    }

    public static class SkillBuilder {
        private final String name;
        private String ImgPath;

        public SkillBuilder (String name) {
            this.name = name;
        }

        public SkillBuilder withImg(String path) {
            this.ImgPath = path;
            return this;
        }

        public Skill build() {
            return new Skill(this);
        }
    }
}

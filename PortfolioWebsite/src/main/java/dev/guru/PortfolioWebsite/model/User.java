package dev.guru.PortfolioWebsite.model;

import jakarta.persistence.*;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Entity
@Component
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String profession;
    private String header;
    private String cvPath;
    private String profileImgPath;

    @OneToOne(cascade = CascadeType.ALL)
    private Profiles profile;

    @OneToOne(cascade = CascadeType.ALL)
    private About aboutSection;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Skill> skills;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Project> projects;

    public User() {
        skills = new ArrayList<Skill>();
        projects = new ArrayList<>();
    }

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.profession = builder.profession;
        this.header = builder.header;
        this.cvPath = builder.cvPath;
        this.profileImgPath = builder.profileImgPath;
        this.profile = builder.profile;
        this.aboutSection = builder.aboutSection;
        this.skills = builder.skills;
        this.projects = builder.Projects;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getCvPath() {
        return cvPath;
    }

    public String getProfileImgPath() {
        return profileImgPath;
    }

    public About getAboutSection() {
        return aboutSection;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public static class UserBuilder{
        private final String name;
        private String profession;
        private String header;
        private String cvPath;
        private String profileImgPath;
        private Profiles profile;
        private About aboutSection;
        private List<Skill> skills;
        private List<Project> Projects;

        public UserBuilder (String name) {
            this.name = name;
            skills = new ArrayList<Skill>();
            Projects = new ArrayList<Project>();
        }

        public User build() {
            return new User(this);
        }

        public UserBuilder withProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public UserBuilder withHeader(String header) {
            this.header = header;
            return this;
        }

        public UserBuilder withCvPath(String cvPath) {
            this.cvPath = cvPath;
            return this;
        }

        public UserBuilder withProfileImgPath(String profileImgPath) {
            this.profileImgPath = profileImgPath;
            return this;
        }

        public UserBuilder withProjects(List<Project> Projects) {
            this.Projects = Projects;
            return this;
        }

        public UserBuilder withSkills(List<Skill> skills) {
            this.skills = skills;
            return this;
        }

        public UserBuilder withAboutSection(About aboutSection) {
            this.aboutSection = aboutSection;
            return this;
        }

        public UserBuilder withProfiles(Profiles profiles) {
            this.profile = profiles;
            return this;
        }

        public UserBuilder addSkill(Skill skill) {
            this.skills.add(skill);
            return this;
        }

        public UserBuilder addProject(Project project) {
            this.Projects.add(project);
            return this;
        }

        public UserBuilder addSkills(List<Skill> skills) {
            this.skills.addAll(skills);
            return this;
        }

        public UserBuilder addProjects(List<Project> projects) {
            this.Projects.addAll(projects);
            return this;
        }
    };
}

package dev.guru.PortfolioWebsite.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Profiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String LinkedIn;
    private String Github;
    private String emailId;

    public String getLinkedIn() {
        return LinkedIn;
    }


    public String getGithub() {
        return Github;
    }

    public String getEmailId() {
        return emailId;
    }

    public Profiles() {

    }

    public Profiles(ProfilesBuilder builder){
        this.LinkedIn = builder.LinkedIn;
        this.Github = builder.Github;
        this.emailId = builder.emailId;
    }

    public static class ProfilesBuilder{
        private String LinkedIn;
        private String Github;
        private String emailId;

        public ProfilesBuilder(){

        }

        public ProfilesBuilder withLinkedIn(String linkedIn){
            this.LinkedIn = linkedIn;
            return this;
        }

        public ProfilesBuilder withGithub(String github){
            this.Github = github;
            return this;
        }

        public ProfilesBuilder withEmailId(String emailId){
            this.emailId = emailId;
            return this;
        }

        public Profiles build(){
            return new Profiles(this);
        }
    }
}

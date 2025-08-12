package dev.guru.PortfolioWebsite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
@Component
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String headerDescription;
    private String bodyDescription;
    private String footerDescription;

    public About() {

    }

    public String getTitle() {
        return title;
    }

    public String getHeaderDescription() {
        return headerDescription;
    }

    public String getBodyDescription() {
        return bodyDescription;
    }

    public String getFooterDescription() {
        return footerDescription;
    }

    public About(AboutBuilder builder){
        this.title = builder.title;
        this.headerDescription = builder.headerDescription;
        this.bodyDescription = builder.bodyDescription;
        this.footerDescription = builder.footerDescription;
    }

    public static class AboutBuilder{
        private final String title;
        private String headerDescription;
        private String bodyDescription;
        private String footerDescription;

        public AboutBuilder(String title){
            this.title = title;
        }

        public AboutBuilder withHeaderDescription(String headerDescription){
            this.headerDescription = headerDescription;
            return this;
        }

        public AboutBuilder withBodyDescription(String bodyDescription){
            this.bodyDescription = bodyDescription;
            return this;
        }

        public AboutBuilder withFooterDescription(String footerDescription){
            this.footerDescription = footerDescription;
            return this;
        }

        public About build(){
            return new About(this);
        }
    }

}

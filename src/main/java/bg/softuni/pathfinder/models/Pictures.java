package bg.softuni.pathfinder.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Pictures extends BaseEntity {
    private String title;
    @Column(columnDefinition = "TEXT")
    private String url;
    @ManyToOne
    private User author;
    @ManyToOne
    private Route route;

    public String getTitle() {
        return title;
    }

    public Pictures setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Pictures setUrl(String url) {
        this.url = url;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Pictures setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Pictures setRoute(Route route) {
        this.route = route;
        return this;
    }
}

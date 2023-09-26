package bg.softuni.pathfinder.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comments extends BaseEntity {
    private boolean approved;
    private LocalDateTime created;
    @Column(columnDefinition = "TEXT")
    private String content;
    @ManyToOne
    private User author;
    @ManyToOne
    private Route route;

    public boolean isApproved() {
        return approved;
    }

    public Comments setApproved(boolean approved) {
        this.approved = approved;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Comments setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Comments setContent(String content) {
        this.content = content;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Comments setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Comments setRoute(Route route) {
        this.route = route;
        return this;
    }
}

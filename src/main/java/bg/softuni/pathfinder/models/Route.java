package bg.softuni.pathfinder.models;

import bg.softuni.pathfinder.models.enums.Level;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "routes")
public class Route extends BaseEntity {
    @Column(name = "gpx_coordinates", columnDefinition = "TEXT")
    private String gpxCoordinates;
    @Enumerated(value = EnumType.STRING)
    private Level level;
    private String name;
    @ManyToOne
    private User author;
    @Column(name = "video_url")
    private String videoURL;
    @ManyToMany
    private Set<Categories> categories;

    public Set<Categories> getCategories() {
        return categories;
    }

    public Route setCategories(Set<Categories> categories) {
        this.categories = categories;
        return this;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public Route setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public Route setLevel(Level level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public Route setName(String name) {
        this.name = name;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Route setAuthor(User author) {
        this.author = author;
        return this;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public Route setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
}

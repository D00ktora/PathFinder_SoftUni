package bg.softuni.pathfinder.models;

import bg.softuni.pathfinder.models.enums.Level;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    private String username;
    private String password;
    @Column(name = "full_name")
    private String fullName;
    private String email;
    @OneToMany
    private Set<Role> role;
    @Enumerated(value = EnumType.STRING)
    private Level level;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<Role> getRole() {
        return role;
    }

    public User setRole(Set<Role> role) {
        this.role = role;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public User setLevel(Level level) {
        this.level = level;
        return this;
    }
}

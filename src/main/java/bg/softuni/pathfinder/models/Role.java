package bg.softuni.pathfinder.models;

import bg.softuni.pathfinder.models.enums.Roles;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {
    @Enumerated(value = EnumType.STRING)
    private Roles name;

    public Roles getName() {
        return name;
    }

    public Role setName(Roles name) {
        this.name = name;
        return this;
    }
}

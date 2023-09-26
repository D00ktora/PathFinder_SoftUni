package bg.softuni.pathfinder.models;

import bg.softuni.pathfinder.models.enums.VehicleType;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Categories extends BaseEntity {
    @Enumerated(value = EnumType.STRING)
    private VehicleType name;
    @Column(columnDefinition = "TEXT")
    private String description;

    public VehicleType getName() {
        return name;
    }

    public Categories setName(VehicleType name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Categories setDescription(String description) {
        this.description = description;
        return this;
    }
}

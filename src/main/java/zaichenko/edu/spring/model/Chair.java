package zaichenko.edu.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Chair {

    @Id
    private String id;
    private String name;
    private String chief;
    private LocalDateTime createdAt, updatedAt;
    private String description;

    public Chair() {

    }

    public Chair(String name, String chief, String description) {
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public Chair(String id, String name, String chief, String description) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public Chair(String id,
                 String name,
                 String chief,
                 LocalDateTime createdAt,
                 LocalDateTime updatedAt,
                 String description) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Chair { " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", description='" + description + '\'' +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return getId().equals(chair.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

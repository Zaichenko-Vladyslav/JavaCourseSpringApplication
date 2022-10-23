package zaichenko.edu.spring.model;

import java.time.LocalDateTime;

public class Group {

    private String id;
    private String name;
    private String description;
    private Chair chair;
    private LocalDateTime createdAt, updateAT;

    public Group() {

    }

    public Group(String id,
                 String name,
                 String description,
                 Chair chair,
                 LocalDateTime createdAt,
                 LocalDateTime updateAT) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.chair = chair;
        this.createdAt = createdAt;
        this.updateAT = updateAT;
    }

    public Group(String name, String description, Chair chair) {
        this.name = name;
        this.description = description;
        this.chair = chair;
    }

    public Group(String id, String name, String description, Chair chair) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.chair = chair;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAT() {
        return updateAT;
    }

    public void setUpdateAT(LocalDateTime updateAT) {
        this.updateAT = updateAT;
    }
}
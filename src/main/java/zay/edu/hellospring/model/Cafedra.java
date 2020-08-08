package zay.edu.hellospring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
@Document
public class Cafedra {
    @Id
    private String id;
    private String name;
    private String chief;
    private LocalDateTime createdAt, updatedAt;
    private String desc;

    public Cafedra() {
    }

    public Cafedra(String name, String chief, String desc) {
        this.name = name;
        this.chief = chief;
        this.desc = desc;
    }

    public Cafedra(String id, String name, String chief, String desc) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.desc = desc;
    }

    public Cafedra(String id, String name, String chief, LocalDateTime createdAt, LocalDateTime updatedAt, String desc) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.desc = desc;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Cafedra{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafedra cafedra = (Cafedra) o;
        return getId().equals(cafedra.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}

package zay.edu.hellospring.model;

import java.time.LocalDateTime;

public class Group {

    private String id;
    private String name;
    private String desc;
    private Cafedra cafedra;
    private LocalDateTime createdAt, updateAT;

    public Group() {
    }

    public Group(String id, String name, String desc, Cafedra cafedra, LocalDateTime createdAt, LocalDateTime updateAT) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
        this.createdAt = createdAt;
        this.updateAT = updateAT;
    }

    public Group(String name, String desc, Cafedra cafedra) {
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
    }

    public Group(String id, String name, String desc, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.cafedra = cafedra;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
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

package zay.edu.hellospring.model;

import java.time.LocalDateTime;

public class Examination {
    private String id;
    private Student student;
    private int mark;
    private String subject;
    private LocalDateTime date;
    private Teacher teacher;
    private LocalDateTime createAt, updateAt;

    public Examination() {
    }

    public Examination(String id, Student student, int mark, String subject, LocalDateTime date, Teacher teacher, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Examination(String id, Student student, int mark, String subject, LocalDateTime date, Teacher teacher) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }

    public Examination(Student student, int mark, String subject, LocalDateTime date, Teacher teacher) {
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}

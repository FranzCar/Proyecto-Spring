package org.umss.SIS_UMSS.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.umss.SIS_UMSS.DTOs.SubjectDTO;

import java.util.List;

@Entity
public class Professor {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, unique = true, length = 36)
    private String uuid;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(length = 8)
    private int phone;
    @Email
    private String email;
    @ManyToMany
    @JoinTable(
            name = "professor_subject",
            joinColumns = @JoinColumn(name = "professor_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;

    public Professor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

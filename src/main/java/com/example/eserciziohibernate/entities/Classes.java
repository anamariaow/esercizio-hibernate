package com.example.eserciziohibernate.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollmentsList;

    public Classes(Long id, String title, String description, List<Enrollments> enrollmentsList) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.enrollmentsList = enrollmentsList;
    }

    public Classes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Enrollments> getEnrollmentsList() {
        return enrollmentsList;
    }

    public void setEnrollmentsList(List<Enrollments> enrollmentsList) {
        this.enrollmentsList = enrollmentsList;
    }
}

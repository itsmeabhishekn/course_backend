package com.example.courseBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue
    private int id;
    private String courseTitle;
    private String courseDescription;
    private String courseVenue;
    private String courseDuration;
    private String courseDate;

    public Courses() {
    }

    public Courses(int id,String courseTitle, String courseDescription, String courseVenue, String courseDuration, String courseDate) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseVenue = courseVenue;
        this.courseDuration = courseDuration;
        this.courseDate = courseDate;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDesc() {
        return courseDescription;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDescription = courseDesc;
    }

    public String getVenue() {
        return courseVenue;
    }

    public void setVenue(String courseVenue) {
        this.courseVenue = courseVenue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDuration() {
        return courseDuration;
    }

    public void setDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getDate() {
        return courseDate;
    }

    public void setDate(String courseDate) {
        this.courseDate = courseDate;
    }
}

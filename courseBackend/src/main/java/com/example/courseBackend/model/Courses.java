package com.example.courseBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Courses {

    private String courseTitle;
    private String courseDesc;
    private String venue;
    private String duration;
    private String date;

    public Courses() {
    }

    public Courses(String courseTitle, String courseDesc, String venue, String duration, String date) {
        this.courseTitle = courseTitle;
        this.courseDesc = courseDesc;
        this.venue = venue;
        this.duration = duration;
        this.date = date;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

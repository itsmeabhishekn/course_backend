package com.example.courseBackend.dao;

import com.example.courseBackend.model.Courses;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Courses, Integer> {
    @Query(value = "SELECT `id`, `course_date`, `course_description`, `course_duration`, `course_title`, `course_venue` FROM `courses` WHERE `course_title`=:courseTitle",nativeQuery = true)
    List<Courses> search(@Param("courseTitle") String courseTitle);
}

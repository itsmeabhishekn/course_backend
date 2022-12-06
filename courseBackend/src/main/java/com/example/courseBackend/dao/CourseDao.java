package com.example.courseBackend.dao;

import com.example.courseBackend.model.Courses;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses, Integer> {
}

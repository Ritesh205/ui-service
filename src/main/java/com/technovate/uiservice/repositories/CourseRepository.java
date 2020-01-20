package com.technovate.uiservice.repositories;

import com.technovate.uiservice.models.College;
import com.technovate.uiservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findByCollege(College college);
}

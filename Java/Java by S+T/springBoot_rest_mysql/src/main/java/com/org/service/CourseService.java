package com.org.service;

import java.util.List;

import com.org.model.Course;

public interface CourseService {
	public String upsert(Course course);	//insert+update=upsert
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);
}

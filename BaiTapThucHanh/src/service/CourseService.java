package service;

import java.util.List;

import model.Course;

public interface CourseService {
	void input(Course course);

	void info(Course course);

	// luu xuong file/db
	void insert(Course course);

	void update(Course course);

	void delete(int id);

	// doc danh sach tu file/db
	List<Course> getAll();
}

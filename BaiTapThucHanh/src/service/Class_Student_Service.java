package service;

import java.util.List;

import model.Class;
import model.Class_Student;

public interface Class_Student_Service {
	void input(Class_Student class_Student);

	void info(Class_Student class_Student);

	// luu xuong file/db
	void insert(Class_Student class_Student);

	void update(Class_Student class_Student);

	void delete(int id);

	// doc danh sach tu file/db
	List<Class_Student> selectAll();

}

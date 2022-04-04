package service;

import java.util.List;

import model.Student;

public interface StudentService {

	void input(Student student);

	void info(Student student);

	void insert(Student student);

	void update(Student student);

	void delete(int id);

	List<Student> selectAll();

	List<Student> searchByName(String name);

	Student searchbyStudentCode(String code);
}

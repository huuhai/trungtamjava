package service;

import java.util.List;

import model.Student;
import model.Teacher;

public interface TeacherService {

	void input(Teacher teacher);

	void info(Teacher teacher);

	void insert(Teacher teacher);

	void update(Teacher teacher);

	void delete(int id);

	List<Teacher> selectAll();

	List<Teacher> searchByName(String name);

	List<Teacher> searchBydepartment(String department);
}

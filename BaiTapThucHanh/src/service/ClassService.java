package service;

import java.util.List;

import model.Class;

public interface ClassService {
	void input(Class class1);

	void info(Class class1);

	// luu xuong file/db
	void insert(Class class1);

	void update(Class class1);

	void delete(int id);

	// doc danh sach tu file/db
	List<Class> selectAll();

	List<Class> searchByCourseName(String courseName);
}

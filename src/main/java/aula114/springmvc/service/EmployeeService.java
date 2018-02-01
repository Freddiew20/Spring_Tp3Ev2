package aula114.springmvc.service;

import java.util.List;

import aula114.springmvc.domain.Contact;

public interface EmployeeService {

	public List<String> listIdEmployee();
	public List<String> listIdGroup(String nombre);
	public List<String> listGroupsAlumnos(String nombre);
	//public Contact show(String id);
}

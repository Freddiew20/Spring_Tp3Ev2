package aula114.springmvc.service;

import java.util.List;

import aula114.springmvc.domain.Contact;

public interface EmployeeService {

	public List<String> listIdEmployee();
	public List<String> listGrupos(String name);
	public List<String> listAlumnos(String grupo);

	//public Contact show(String id);
}

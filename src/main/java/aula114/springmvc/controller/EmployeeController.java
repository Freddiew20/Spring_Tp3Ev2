package aula114.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import aula114.springmvc.service.EmployeeService;
import aula114.springmvc.domain.Contact;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.ArrayList;

@Controller
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @RequestMapping("/employee")
  public String consultaEmployee(Model model) {
     List<String> list = new ArrayList<String>();
     list = employeeService.listIdEmployee();
     model.addAttribute("list", list);
     return "consulta";
  }

  @RequestMapping("/show/{id}")
	public String saludar(@PathVariable("id") String id, Model model) {
		List<String> listgrupos = new ArrayList<String>();
     	listgrupos = employeeService.listGrupos(id);
     	model.addAttribute("grupos", listgrupos);
		return "saludar";
	}

	@RequestMapping("/show_grupo/{grupo}")
	public String alumno(@PathVariable("grupo") String grupo, Model model) {
		List<String> listalumnos = new ArrayList<String>();
     	listalumnos = employeeService.listAlumnos(grupo);
     	model.addAttribute("alumno", listalumnos);
		return "info_grupo";
	}

	@RequestMapping("/nota/{alumno}")
	public String nota(@PathVariable("alumno") String alumno, Model model) {
		model.addAttribute("nombre", alumno);
		System.out.println(alumno);
		return "nota";
	}

	@RequestMapping("/almacenar")
	public String mostrar(@RequestParam("nota") String nota, Model model) {
		System.out.println(nota);
		model.addAttribute("nota", nota);
		return "confirmar";
	}

}

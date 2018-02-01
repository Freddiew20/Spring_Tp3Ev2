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

  @RequestMapping(value="/show/{item}", method=RequestMethod.GET)
  public String show(@PathVariable("item")String param, Model model) {
      System.out.println("Nombre:" + param);    
      model.addAttribute("nombre", param);
      List<String> list2 = new ArrayList<String>();
      list2 = employeeService.listGroups(param);
      model.addAttribute("grupos", list2);
      return "show";
  }
  
  @RequestMapping(value="/fichaAlumnos/{item}", method=RequestMethod.GET)
  public String fichaAlumnos(@PathVariable("item")String param, Model model) {
      System.out.println("Grupo:" + param);
      model.addAttribute("nombre", param);
      List<String> list2 = new ArrayList<String>();
      list2 = employeeService.listGroupsAlumnos(param);
      model.addAttribute("alumnos", list2);
      return "fichaAlumnos";
  }
  
  @RequestMapping(value="/ficha/{item}", method=RequestMethod.GET)
  public String mostrarFicha (@PathVariable("item")String param, Model model) {
	  model.addAttribute("nombre",param);
      return "ficha";
  }
  
}

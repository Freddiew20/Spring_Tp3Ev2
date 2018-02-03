package aula114.springmvc.service;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aula114.springmvc.domain.Contact;

@Service
public class EmployeeServiceImpl implements EmployeeService {

        private Jedis conn;
        public EmployeeServiceImpl() {
          conn = new Jedis("localhost");
          conn.select(12);
        }

	public List<String> listIdEmployee() {
           List<String> list1 = new ArrayList<String>();
           Set<String> list = conn.lrange("grupos:usuario:set");
           for(String st : list) { 
             list1.add(st);
           }
           return list1;
	}
	
	public List<String> listIdGroup(String nombre) {
        List<String> list2 = new ArrayList<String>();
        Set<String> list = conn.lrange("grupos:usuario:"+nombre+":grupos", 0, -1);
        for(String st : list) { 
          list2.add(st);
        }
        return list2;
	}

  public List<String> listGroupsAlumnos(String nombre){
        List<String> list2 = new ArrayList<String>();
        List<String> list = conn.lrange("grupos:grupo:"+nombre, 0, -1);
        for(String st : list) { 
          list2.add(st);
        }
        return list2;   
    
  }
	
}

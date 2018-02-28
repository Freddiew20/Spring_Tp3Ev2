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
           Set<String> list = conn.smembers("grupos:usuario:nombres");
           for(String st : list) { 
             list1.add(st);
           }
           return list1;
	}

  public List<String> listGrupos(String name) {
           List<String> listgrupos = new ArrayList<String>();
           for(String st : conn.lrange("grupos:usuario:"+name+":grupos", 0, -1)) { 
             listgrupos.add(st);
           }
           return listgrupos;
  }

  public List<String> listAlumnos(String grupo) {
           List<String> listalumno = new ArrayList<String>();
           for(String st : conn.lrange("grupos:grupo:"+grupo, 0, -1)) { 
             listalumno.add(st);
           }
           return listalumno;
  }
}

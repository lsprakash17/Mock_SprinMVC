package mvc.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.dao.Employeedao;
import mvc.dto.Employee;

@Service
public class Employee_service {
   
	@Autowired
	Employeedao dao;
	
	public ModelAndView save(Employee s, String date) {
		s.setDob(Date.valueOf(date));
		s.setAge(Period.between(LocalDate.parse(date), LocalDate.now()).getYears());
		dao.save(s);
		ModelAndView view = new ModelAndView();
		view.setViewName("Home");
		view.addObject("success", "Data added Succefully");
		return view;
	}

	public ModelAndView Fetchall() {
		ModelAndView view = new ModelAndView();

		List<Employee> s = dao.fetchall();
		if (s.isEmpty()) {
			view.addObject("fail", "No Data Found");
			view.setViewName("Home");
		} else {
			view.setViewName("Fetchall");
			view.addObject("list", s);
		}
		return view;
	}

	public ModelAndView delete(int id) {
		ModelAndView view = new ModelAndView();
		dao.delete(id);
		List<Employee> s = dao.fetchall();
		if (s.isEmpty()) {
			view.addObject("fail", "Deleted Success No Data Found");
			view.setViewName("Home");
		} else {
			view.setViewName("Fetchall");
			view.addObject("success", "deleted success");
			view.addObject("list", s);
		}
		return view;

	}

	public ModelAndView edit(int num) {
		ModelAndView view = new ModelAndView("Edit");
		Employee s =dao.fetchbyid(num);
		view.addObject("employee", s);
		return view;
	}

	public ModelAndView update(Employee s, String date) {
		s.setDob(Date.valueOf(date));
		s.setAge(Period.between(LocalDate.parse(date), LocalDate.now()).getYears());
		dao.Update(s);
		ModelAndView view = new ModelAndView();
		view.setViewName("Fetchall");
		view.addObject("success", "Data updated");
		view.addObject("list", dao.fetchall());
		return view;
	}
}

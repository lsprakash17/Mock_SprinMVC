package mvc.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc.dto.Employee;
import mvc.service.Employee_service;

@Controller
public class Employeecontroler
{
	@Autowired
	Employee_service service;
	
	@PostMapping("insert")
	private ModelAndView Save(@ModelAttribute Employee s,@RequestParam String date ) 
	{
		return service.save(s, date);
	}
	@GetMapping("fetchall")
	private ModelAndView Fectchall()
	{
		return service.Fetchall();
	}
	@GetMapping("delete")
	private ModelAndView delete(@RequestParam int Id)
	{
		return service.delete(Id);
	}
	@GetMapping("Edit")
	public ModelAndView edit(@RequestParam int num)
	{
		return service.edit(num);
	}
	@PostMapping("update")
	public ModelAndView Update(@ModelAttribute Employee s,@RequestParam String date)
	{
		return service.update(s, date);
	}
}


package mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.dto.Employee;


@Repository
public class Employeedao 
{
	@Autowired
	EntityManager m;

public void save(Employee s)
{
	EntityTransaction t=m.getTransaction();
	t.begin();
	m.persist(s);
	t.commit();
}

public List<Employee> fetchall() {
	return m.createQuery("select a from Employee a").getResultList();
}

public void delete(int id) 
{
	EntityTransaction t=m.getTransaction();
	t.begin();
	m.remove(m.find(Employee.class, id));
	t.commit();
}
public Employee fetchbyid(int num) {
	return m.find(Employee.class, num);
}
public void Update(Employee s) {
	EntityTransaction t=m.getTransaction();
	t.begin();
	m.merge(s);
	t.commit();
}

}

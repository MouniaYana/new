package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Department;
import model.Employee;

@SuppressWarnings("unchecked")

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionfactory;

	public EmployeeDaoImpl() {

		// TODO Auto-generated constructor stub
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override

	public Integer add(int id, String name, String gender, int age, String email, int salary, String designation,
			String department) {
		Employee emp = new Employee();
		Department dep = new Department();
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Integer i = null;
		try {
			tx = session.beginTransaction();

			dep.setName(department);
			session.save(dep);

			emp.setId(id);
			emp.setName(name);
			emp.setGender(gender);
			emp.setAge(age);
			emp.setEmail(email);
			emp.setSalary(salary);
			emp.setDesignation(designation);
			emp.setDepartment(dep);
			session.save(emp);

			i = (Integer) session.save(emp);

			tx.commit();

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return i;

	}

	@Override
	public List<Employee> getlist() {

		Session session = sessionfactory.openSession();
		Transaction tx = null;
		List<Employee> emplist = null;
		Query query = session.createQuery("from Employee");
		try {
			tx = session.beginTransaction();
			emplist = query.list();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public List<Employee> getbyid() {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Query query = session.createQuery("from Employee e order by e.id");
		List<Employee> emplist = null;
		try {
			tx = session.beginTransaction();
			emplist = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public List<Employee> getbyname() {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Query query = session.createQuery("from Employee e order by e.name");
		List<Employee> emplist = null;
		try {
			tx = session.beginTransaction();
			emplist = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public List<Employee> getbysalary() {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Query query = session.createQuery("from Employee e order by e.salary");
		List<Employee> emplist = null;
		try {
			tx = session.beginTransaction();
			emplist = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public List<Employee> getbydepartment() {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Query query = session.createQuery("from Department d order by d.name");
		List<Employee> emplist = null;
		try {
			tx = session.beginTransaction();
			emplist = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public List<Employee> getbydesignation() {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Query query = session.createQuery("from Employee e order by e.designation");
		List<Employee> emplist = null;
		try {
			tx = session.beginTransaction();
			emplist = query.list();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public Employee edit(int id) {
		Session session = sessionfactory.openSession();
		Transaction tx = null;

		Employee emplist = null;
		try {
			tx = session.beginTransaction();
			emplist = (Employee) session.get(Employee.class, id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public Integer update(Employee Employee) {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Serializable id = null;

		try {
			session.clear();

			tx = session.beginTransaction();

			session.saveOrUpdate(Employee);

			id = session.getIdentifier(Employee);

			System.out.println(id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return (Integer) id;
	}

	@SuppressWarnings("unused")
	@Override
	public int delete(int id) {

		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Serializable id1 = null;
		Employee emp = null;

		try {
			tx = session.beginTransaction();
			emp = (Employee) session.get(Employee.class, id);
			session.delete(emp);
			id1 = session.getIdentifier(emp);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return (Integer) id;
	}

	@Override
	public List<Department> getlistd() {
		Session session = sessionfactory.openSession();
		Transaction tx = null;

		List<Department> emplist = null;
		Query query = session.createQuery("from Employee");
		try {

			tx = session.beginTransaction();
			emplist = query.list();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return emplist;
	}

	@Override
	public Department editdep(int id) {
		Session session = sessionfactory.openSession();
		Transaction tx = null;

		Department dep = null;
		try {
			tx = session.beginTransaction();
			dep = (Department) session.get(Department.class, id);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dep;
	}

	@Override
	public void updatedep(Department Department) {
		Session session = sessionfactory.openSession();
		Transaction tx = null;
		try {
			session.clear();

			tx = session.beginTransaction();
			session.saveOrUpdate(Department);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@SuppressWarnings("unused")
	@Override
	public int deletedep(int id) {

		Session session = sessionfactory.openSession();
		Transaction tx = null;
		Serializable id1 = null;
		Department dep = null;

		try {
			tx = session.beginTransaction();
			dep = (Department) session.get(Department.class, id);
			session.delete(dep);
			id1 = session.getIdentifier(dep);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return (Integer) id;
	}

}

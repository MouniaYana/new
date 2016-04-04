package dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import model.*;


@SuppressWarnings("unused")
@Repository("UserDao")
public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernatetemplate;
	

	public UserDaoImpl() {

		// TODO Auto-generated constructor stub
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}

	@Override
	public boolean checkuser(String username, String password) {
		System.out.println("Inside into service class");
		boolean userstatus = false;
		try {
			System.out.println("Inside into service class");
			@SuppressWarnings("unchecked")
			List<Admin> userobj = (List<Admin>) hibernatetemplate
					.find("from Admin as a where a.username=? and a.password=?", username, password);
			if (userobj.size() > 0) {
				System.out.println("hello implementation");
				userstatus = true;
			}
		} catch (HibernateException e) {
			System.out.println(e);
		}

		return userstatus;
	}

	
}

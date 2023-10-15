package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.empleado;

public class EmpleadoController {
	
	public String createEmpleado(String apellidos, String nombres, int edad, String sexo, double salario) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			
			empleado e ;
			
			e= new empleado(apellidos,nombres,edad,sexo,salario);
			
			session.beginTransaction();
			session.persist(e);
			
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "empleado creado";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "error";
		
	}
	
	
	public String deleteEmpleado ( int IdEm) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			empleado e = session.get(empleado.class, IdEm);
			session.remove(e);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "empleado eliminado";
			
			
		} catch (Exception e) {
			return "error al eliminar ";
		}
		
		
	}
	
	
	public String updateEmpleado(int IdEm, String apellidos, String nombres,int edad, String sexo, double salario) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			empleado e = session.get(empleado.class, IdEm);
			e.setApellidos(apellidos);
			e.setNombres(nombres);
			e.setEdad(edad);
			e.setSexo(sexo);
			e.setSalario(salario);

			session.merge(e);
			
			session.getTransaction().commit();
			sessionFactory.close();
			
			return "empleado actualizado";
			
			
		} catch (Exception e) {
		
			return "error al actualizar empleado";
		}
		
		
	}
	
	
	public String getEmpleado(int IdEm) {
		
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(empleado.class).buildSessionFactory();
		
		Session session;
		session = sessionFactory.openSession();
		
		try {
			
			session.beginTransaction();
			empleado e = session.get(empleado.class, IdEm);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return e.toString();
			
			
			
			
		} catch (Exception e) {

              return "no hay ningun empleado";
		}
		
	}
	


}

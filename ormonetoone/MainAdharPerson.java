package ormonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainAdharPerson 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Anand");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Adhar a=new Adhar();
		a.setAddress("Mysore");
		a.setAdharId(103);
		a.setPincode(571415);
		
		Person p=new Person();
		p.setName("PreethiAnand");
		p.setPhone(9986568114l);
		p.setAdhar(a);
		
		et.begin();
		em.persist(a);
		em.persist(p);
		et.commit();
		
		System.out.println("Data inserted");
		
	}

}

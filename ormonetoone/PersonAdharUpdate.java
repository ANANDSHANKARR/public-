package ormonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class PersonAdharUpdate 
{

	public static void main(String[] args) 
	{
		
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("Anand");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
			 Person p=em.find(Person.class, 3);
			p.setName("Anand Shankar");
			
			System.out.println(p.getName());
			
			Adhar a=em.find(Adhar.class, 102);
			a.setPincode(521461);
			
			System.out.println(a.getPincode());
			
			et.begin();
			em.merge(p);
			em.merge(a);
			et.commit();

	}

	
}

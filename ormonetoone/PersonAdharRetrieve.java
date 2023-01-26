package ormonetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class PersonAdharRetrieve 
{

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Anand");
		EntityManager em=emf.createEntityManager();
		
		Person p=em.find(Person.class, 3);
		
		if(true)
		{
			System.out.println(" id "+p.getId()+" name "+p.getName()+" phone "+p.getPhone()+" class "+p.getClass()+" adhar"+p.getAdhar());
		}
		
		System.out.println("---------break----------");
		
		Adhar a=em.find(Adhar.class, 102);
		if(true)
		{
			System.out.println(" id "+a.getAdharId()+" Address "+a.getAddress()+" cl "+a.getPincode()+" class "+a.getClass());
		}
		
		
	}

}
//to access the class name of reference variable or any class simply use getClass method 

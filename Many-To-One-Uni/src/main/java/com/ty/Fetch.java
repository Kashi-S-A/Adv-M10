package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
		EntityManager em = emf.createEntityManager();

		Account account = em.find(Account.class, 1L);
		
		if (account!=null) {
			System.out.println("------Account-------");
			System.out.println(account);
			System.out.println("--------bank----------");
			Bank bank = account.getBank();
			System.out.println(bank);
			
		} else {
			System.out.println("not found");
		}
	}
}

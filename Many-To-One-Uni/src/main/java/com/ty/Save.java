package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Account account = new Account();
		account.setAccNo(3);
		account.setName("Z");

		Bank bank = em.find(Bank.class, 101);
		
		account.setBank(bank);
		
		et.begin();
		em.persist(account);
		et.commit();

		System.out.println("saved");
	}
}

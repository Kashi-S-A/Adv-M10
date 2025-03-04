package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Account account = new Account();
		account.setAccNo(2);
		account.setName("Y");

		Bank bank = new Bank();
		bank.setBid(102);
		bank.setName("HDFC");

		account.setBank(bank);

		et.begin();
		em.persist(bank);
		em.persist(account);
		et.commit();

		System.out.println("saved");
	}
}

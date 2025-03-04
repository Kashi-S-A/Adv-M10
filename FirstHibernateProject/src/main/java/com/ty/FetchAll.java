package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {;
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

//		String q1="select s from Student s where s.sid=?1";//indexed based parameter
//		Query query1 = em.createQuery(q1);
//		query1.setParameter(1, 102);

//		String q2="select s from Student s where s.sid=:studentId";//naming based parameter
//		Query query = em.createQuery(q2);
//		query.setParameter("studentId", 102);

		String q = "select s from Student s";
		Query query = em.createQuery(q);

		List<Student> students = query.getResultList();

		System.out.println("==========Student Details===========");

		for (Student student : students) {
			System.out.println(student);
			System.out.println("-------------------");
		}
	}
}

package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetomany");
		EntityManager em = emf.createEntityManager();

		College college = em.find(College.class, 101);

		if (college != null) {
			System.out.println("-------College----------");
			System.out.println(college);
			List<Student> students = college.getStudents();
			System.out.println("========Students===========");
			for (Student student : students) {
				System.out.println(student);
				System.out.println("*********************");
			}

		} else {
			System.out.println("not found");
		}
	}
}

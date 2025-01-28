package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pagea")
public class PageA extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("This is PageA");

		PrintWriter pw = resp.getWriter();
		pw.print("<h1>This is PageA</h1>");
		
		req.setAttribute("uid", 101);
		req.setAttribute("name", "Dinga");
		
		Student student=new Student();
		student.setSid(111);
		student.setName("Manga");
		student.setEmail("manga@gmail.com");
		
		req.setAttribute("stu", student);
		
		RequestDispatcher rd = req.getRequestDispatcher("pageb");/* to dispatch
		 														    to html->greet.html
		 														    to jsp -> app.jsp
		 												to servlet -> url of servlet*/
//		rd.include(req, resp);
		rd.forward(req, resp);
	}
}

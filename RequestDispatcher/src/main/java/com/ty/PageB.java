package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pageb")
public class PageB extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("This is PageB");
		
		Student student = (Student) req.getAttribute("stu");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>This is PageB</h1>");
		pw.print("<h1>uid : "+req.getAttribute("uid")+"</h1>");
		pw.print("<h1>name : "+req.getAttribute("name")+"</h1>");
		pw.print("<h1>==========Student Details==============</h1>");
		pw.print("<h1>Sid : "+student.getSid()+"</h1>");
		pw.print("<h1>Name : "+student.getName()+"</h1>");
		pw.print("<h1>Email : "+student.getEmail()+"</h1>");
	
	}
}

package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("un");
		String email = req.getParameter("ue");
		
		System.out.println(name);
		System.out.println(email);
		
		PrintWriter pw = resp.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Name : "+name+"</h1>");
		pw.print("<h1>Email : "+email+"</h1>");
		pw.print("</body></html>");
	}
}

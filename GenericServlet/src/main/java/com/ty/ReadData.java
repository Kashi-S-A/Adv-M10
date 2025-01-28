package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String email=req.getParameter("uemail");
		String address=req.getParameter("add");
		
		System.out.println(name);
		
		System.out.println(email);
		
		System.out.println(address);
		
		PrintWriter pw=res.getWriter();
		pw.print("<html><body>");
		pw.print("<h2>Name : "+name+"</h2>");
		pw.print("<h2>Email : "+email+"</h2>");
		pw.print("<h2>Address : "+address+"</h2>");
		pw.print("</body></html>");
	}

}

package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo") /*
						 * to provide an url for this servlet 
						 * (should be passed in browser in order to
						 * trigger this servlet)
						 */
public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws 
	ServletException, IOException {
		System.out.println("Servlet Triggered");

		/* to print the content on the browser 
		 * we use PrintWriter Object 
		*/
		PrintWriter pw = res.getWriter();
		pw.print("<h1>Hi this is first servlet</h1>");
	}
}

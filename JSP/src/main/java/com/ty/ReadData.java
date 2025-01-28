package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class ReadData extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, 
HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("userEmail");
		String name = req.getParameter("userName");
		
		req.setAttribute("n", name);
		req.setAttribute("e", email);
		
		RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}

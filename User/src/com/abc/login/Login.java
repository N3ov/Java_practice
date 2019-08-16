package com.abc.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		pw.println("Welcome " + name + "<br>");
		
		String firstname = request.getParameter("firstname");
		String secondname = request.getParameter("lastname");
		pw.println("Name: " + firstname +" "+ secondname+ "<br>");
		
		String gender = request.getParameter("gender");
		pw.println("Gendder: " + gender+ "<br>");
		
		String habit1 = request.getParameter("habit1");
		String habit2 = request.getParameter("habit2");
		if (!habit1.equals(null)) {
			pw.println(habit1+ "<br>");
		}
		if (!habit2.equals(null)) {
			pw.println(habit2+ "<br>");
		}
		
		String birth = request.getParameter("bday");
		pw.println(birth+ "<br>");

		
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

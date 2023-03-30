//Checking the PR1
//checking test
package com.App1;

import java.io.IOException;
import java.io.PrintWriter;
//added comment
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //get PrintWriter
		PrintWriter pw = resp.getWriter();
		//set resp type
		resp.setContentType("text/html");
		
		//read the form data
		String name = req.getParameter("name");
		String designation = req.getParameter("designation");
		
		//print the data
		pw.println("Name: "+name+"<br>");
		pw.println("Designation: "+name);
		
		//close the stream
		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

}

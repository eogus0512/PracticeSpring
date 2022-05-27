package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class Calc extends HttpServlet {
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext aplication = req.getServletContext();
		resp.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html; charset=UTF-8");
    	PrintWriter out = resp.getWriter();
    	
    	String num_ = req.getParameter("num");
    	String op = req.getParameter("operator");
    	
    	
    	if (op.equals("=")) {
    		
    		int firstNum = Integer.valueOf((String) req.getAttribute("number"));
    		int secondNum = Integer.parseInt(num_);
    		String operator = (String)req.getAttribute("operator");
    		int result = 0;
    		
    		if(operator.equals("+"))
    			result = firstNum + secondNum;
    		else
    			result = firstNum - secondNum;
    		
        	out.println("°á°ú : "+ result);
    	}
    	else {
    		
    		aplication.setAttribute("number", num_);
    		aplication.setAttribute("operator", op);
    	}
	}

}

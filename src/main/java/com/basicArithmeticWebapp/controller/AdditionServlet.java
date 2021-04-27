package com.basicArithmeticWebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class guru_register
 */
public class AdditionServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;


   /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          PrintWriter out = response.getWriter();
          int number1 = Integer.parseInt(request.getParameter("no1"));
          int number2 = Integer.parseInt(request.getParameter("no2"));
          int result=number1+number2;

          out.println("<h1>"+number1+" + "+number2+"= "+result+"<h1>");

  }
}

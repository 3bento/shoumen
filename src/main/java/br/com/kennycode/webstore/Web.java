/*package br.com.kennycode.webstore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.kennycode.gaikujin.model.Account;

@WebServlet(urlPatterns="/timeline")
public class Web extends HttpServlet {

	
	private static final long serialVersionUID = -7549846059463730204L;
	private String message;

	public void init() throws ServletException {
		// Do required initialization
		
		Account a = new Account();
		a.setBank("bank X");
		
		message = "Hello World - "+ a.getBank();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}

}
*/
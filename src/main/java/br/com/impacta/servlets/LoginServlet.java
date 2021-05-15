package br.com.impacta.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome     = request.getParameter("nome");
		String login    = request.getParameter("login");
		String senha = request.getParameter("senha");
		String senhaConfirmada = request.getParameter("senhaConfirmada");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<HTML><H3>Dados informados" + "</H3></HTML><p>");
		writer.println(nome);
		writer.println(login);
		writer.println();
		writer.println(senha);
		writer.println(senhaConfirmada);
	}

}

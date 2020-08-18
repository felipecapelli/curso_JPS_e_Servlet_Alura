package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi", loadOnStartup=1)
public class OiMundoServlet extends HttpServlet{
	
	public OiMundoServlet() {
		System.out.println("Posso usar o loadOnStartup para obrigar o servlet a criar uma instancia de OiMundoServlet ao subir a aplicação");
		System.out.println("Pois o padrão sigleton eh utilizado para instanciar o servlet somente se alguem usar essa rota");
		System.out.println("Essa pode ser uma opção caso eu queira retirar o padrão singleton para esse servlet");

	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
			out.println("<body>");
				out.println("oi mundo, parabéns vc escreveu o primeiro servlets.");
			out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OiMundoServlet foi iniciado");
	}
	
}

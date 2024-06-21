package br.com.alex;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Testando  extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Olá Mundo 2</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Recupera o valor do campo de entrada de texto pelo nome
        java.lang.String nome;
        nome = request.getParameter("nome");

        // Escreve a resposta
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resposta do Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Olá, " + nome + "!</h2>");
        out.println("</body>");
        out.println("</html>");
    }


}

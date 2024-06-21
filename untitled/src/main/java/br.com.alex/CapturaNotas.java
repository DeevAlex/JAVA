package br.com.alex;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class CapturaNotas extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            String nome = req.getParameter("nome");
            double nota1 = Double.parseDouble(req.getParameter("nota1"));
            double nota2 = Double.parseDouble(req.getParameter("nota2"));

            resp.setContentType("text/html");

            PrintWriter writer = resp.getWriter();

            double media = (nota1 + nota2) / 2;

            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>O aluno, " + nome + ", ficou com a media " + media + "!</h1>");
            writer.println("</body>");
            writer.println("</html>");
        } catch (Exception e) {
            PrintWriter writer = resp.getWriter();
            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h1>Ocorreu um erro ao processar os dados fornecidos!</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}

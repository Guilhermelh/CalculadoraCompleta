package br.edu.usj.ads.lpii;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalculadoraSubtrair")
public class CalculadoraSubtrair extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String valorDigitadoA = request.getParameter("a");
        String valorDigitadoB = request.getParameter("b");

        int a = Integer.valueOf(valorDigitadoA);
        int b = Integer.valueOf(valorDigitadoB);
        int resultado = a-b;

        PrintWriter saida = response.getWriter();
        saida.println("<html>");
        saida.println("<body>");
        saida.println("<h1>Resultado:</h1>");
        saida.println("<h2>");
        saida.println(valorDigitadoA);
        saida.println(" - ");
        saida.println(valorDigitadoB);
        saida.println(" =");
        saida.print(" "+resultado);
        saida.println("</h2>");
        saida.println("</body>");
        saida.println("</html>");

    }
}

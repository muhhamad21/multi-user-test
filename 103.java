import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class XSSVulnerableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userInput = request.getParameter("input");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body>");
        out.println("<p>User Input: " + userInput + "</p>"); // Vulnerable line - directly outputting user input without proper encoding
        out.println("</body>");
        out.println("</html>");
    }
}
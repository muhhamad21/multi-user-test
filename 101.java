import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.owasp.encoder.Encode;

public class XSSFixedServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input");
        
        // Sanitize user input to prevent XSS
        String sanitizedInput = Encode.forHtml(userInput);
        
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>User Input: " + sanitizedInput + "</h1>"); // Sanitized user input is now reflected back in the response
        out.println("</body>");
        out.println("</html>");
    }
}
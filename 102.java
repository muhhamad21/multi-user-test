import java.io.*;
import java.util.*;

public class XSSVulnerableCode {

    public static void main(String[] args) {
        // Simulating user input from a form submission
        String userInput = "<script>alert('XSS Vulnerability!')</script>";

        // Displaying the user input on a web page without proper sanitization
        System.out.println("<div>" + userInput + "</div>");
    }
}
import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class WelcomeClass extends HttpServlet { 
 
 public void doPost(HttpServletRequest request, 
 HttpServletResponse response) 
 throws ServletException, IOException 
 { 
    response.setContentType("text/html"); 
    PrintWriter pwriter = response.getWriter(); 
    String name=request.getParameter("uname"); 
    String fname=request.getParameter("upass"); 
    pwriter.print("Hello "+name+"!");
    pwriter.print("Hello "+fname+"!");
    pwriter.print(" Welcome to Beginnersbook.com"); 
 } 
 
} 

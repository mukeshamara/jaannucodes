import java.io.*;  
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;      
public class LoginClass extends HttpServlet 
{    
   public void doPost(HttpServletRequest request, 
     HttpServletResponse response) 
       throws ServletException, IOException 
   {        
       response.setContentType("text/html");      
       PrintWriter pwriter = response.getWriter();                
       String name=request.getParameter("uname");      
       String pass=request.getParameter("upass");                
       if(name.equals("aa") && 
          pass.equals("bb"))
       {          
    	  pwriter.print("Correct name "); //this response does no work
          RequestDispatcher dis=request.getRequestDispatcher("WelcomePath");   
          dis.forward(request, response); 
       }     
       else
       {      
          pwriter.print("User name or password is incorrect!");          
          RequestDispatcher dis=request.getRequestDispatcher("index.html"); 
          dis.include(request, response);                               
       }      
   }    
}  

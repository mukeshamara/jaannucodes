import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
		Student aimpl = context.getBean("student",Student.class);
	    aimpl.show();
	    context.registerShutdownHook();
  	}
}
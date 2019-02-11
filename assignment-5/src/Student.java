import java.util.List;


public class Student {
private List<String>movie;

public Student(List<String> movie) {
	super();
	this.movie = movie;
}

public void show()
{
	for(String x:movie)	
       System.out.println(x);
}
}

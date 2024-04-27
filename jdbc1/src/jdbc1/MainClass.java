package jdbc1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("jdbc1");
		context.refresh();
		
		MethodsClass bean = context.getBean(MethodsClass.class);
		Student s=new Student();
		
		s.setUser("Mahesh");
		s.setGender("Male");
		
		int data = bean.addData(s);
		if(data > 0)
		{
			System.out.println("Row inserted");
		}
		else {
			System.out.println("Not inserted");
		}
	}

}

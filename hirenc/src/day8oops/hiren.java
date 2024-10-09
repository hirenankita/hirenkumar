package day8oops;

public class hiren{

	int student_id;
	String student_name;
	String student_job;
	float student_salary;
	String student_surname;
	hiren(String surname)//constructor
	{
		student_id   =   123;
		student_name =   surname;
		student_job  =  "Worker";
	}
	void dispaly()//dispaly is method
	{
		System.out.println(student_id);
		System.out.println(student_name);
		System.out.println(student_job);
		System.out.println(student_surname);
		System.out.println(student_salary);				
	}
	
	String M2()
	{
		return("hello hiren");
	}
	
	void M3(String name)
	{
		
		System.out.println("good day "+ name);
	}
		
}



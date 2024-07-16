import java.lang.*;

public class  Student   extends  Object{

	static	int sid;
	static String sname;	


	public Student(){
		super();   // Object();

	 System.out.println("Student object created..");

	}
		

	public static void main(String ar[]){
		

		Student  s1 = new Student();

		System.out.println(s1);

		System.out.println("sid "+s1.sid);
		System.out.println("sname "+s1.sname);

	


			s1.sid = 101;
			s1.sname = "king";
		
		System.out.println("s1  sid "+s1.sid);
		System.out.println("s1  sname "+s1.sname);

		Student  s2 = new Student();
		System.out.println(s2);

		System.out.println("s2  sid "+s2.sid);
		System.out.println("s2  sname "+s2.sname);

		

			s2.sid = 102;
			s2.sname = "Tom";

		System.out.println("s1  sid "+s1.sid);
		System.out.println("s1  sname "+s1.sname);

		System.out.println("s2  sid "+s2.sid);
		System.out.println("s2  sname "+s2.sname);


		System.out.println("static sid "+Student.sid);
		System.out.println("static sname "+Student.sname);

			
		

	}



}


package �dev2;

public class Main {

	public static void main(String[] args) {
	   
		
		Student student= new Student();
		student.id=2;
		student.FirstName="G�k�enur";
		student.LastName="Ev";
		student.emailAddress="gokceenure@icloud.com";
		
		Student student2= new Student();
		student.id=2;
		student.FirstName="Yusuf";
		student.LastName="Ev";
		student.emailAddress="gokceenure@icloud.com";
		
		StudentManager studentManager= new StudentManager();
		studentManager.add(student);
		System.out.println("��renci kaydedildi ");
		studentManager.delete(student);
		System.out.println("��renci silindi ");
		
		
		Instructor instructor= new Instructor();
		instructor.id=3;
		instructor.FirstName="Engin";
		instructor.LastName="Demiro�";
		
		
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.add(instructor);
		System.out.println("e�itmen kaydedildi");
		instructorManager.delete(instructor);
		System.out.println("e�itmen silindi");
		
		
		UserManager userManager= new UserManager();
		
		
		User[] users = {student, instructor };
		
		Student[] students= {student, student2};
		
		studentManager.addMultiple(students);

		
		
	}

}

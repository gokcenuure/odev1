package ödev2;

public class Main {

	public static void main(String[] args) {
	   
		
		Student student= new Student();
		student.id=2;
		student.FirstName="Gökçenur";
		student.LastName="Ev";
		student.emailAddress="gokceenure@icloud.com";
		
		Student student2= new Student();
		student.id=2;
		student.FirstName="Yusuf";
		student.LastName="Ev";
		student.emailAddress="gokceenure@icloud.com";
		
		StudentManager studentManager= new StudentManager();
		studentManager.add(student);
		System.out.println("öğrenci kaydedildi ");
		studentManager.delete(student);
		System.out.println("öğrenci silindi ");
		
		
		Instructor instructor= new Instructor();
		instructor.id=3;
		instructor.FirstName="Engin";
		instructor.LastName="Demiroğ";
		
		
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.add(instructor);
		System.out.println("eğitmen kaydedildi");
		instructorManager.delete(instructor);
		System.out.println("eğitmen silindi");
		
		
		UserManager userManager= new UserManager();
		
		
		User[] users = {student, instructor };
		
		Student[] students= {student, student2};
		
		studentManager.addMultiple(students);

		
		
	}

}

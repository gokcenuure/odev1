package ödev2;

public class InstructorManager extends UserManager{
	
    @Override
	public void add(User user) {
		System.out.println(user.id + " kaydedildi");
	}
     
	
	
	public void delete (User user) {
		System.out.println(user.id + " silindi");
	}
	
	
	
	
	public void add(Instructor instructor) {
		System.out.println(instructor.FirstName + " kaydedildi");
	}
     
	
	
	public void delete (Instructor instructor) {
		System.out.println(instructor.FirstName + " silindi");
	}
}

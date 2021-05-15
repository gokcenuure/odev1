package ödev2;


public class StudentManager extends UserManager{
	
	
	
	@Override

	public void add(User user) {
		System.out.println(user.id + " kaydedildi");
	}
     
	
	
	public void delete (User user) {
		System.out.println(user.id + " silindi");
	}
	
	
	
	
	public void add(Student student) {
		
		System.out.println(student.FirstName + " kaydedildi");
	}
	
	
	
		
	public void delete(Student student) {
		
		System.out.println(student.FirstName + " silindi");
		
	}
	
	public void addMultiple(Student[] students) {
        for(Student student : students)  {
      	  this.add(student);
	 
		
	 }}}



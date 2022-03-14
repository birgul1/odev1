package odev1;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println("Eğitmen eklendi"+" "+instructor.getFirstName());
	}
	public void Update(Instructor instructor) {
		System.out.println("Eğitmen güncellendi"+ " "+instructor.getLastName());
	}

}

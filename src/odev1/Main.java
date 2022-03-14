package odev1;

public class Main {

	public static void main(String[] args) {
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Java & Angular");
		category1.setDescription("Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)");
		
		Category category2= new Category(2, "Programlama", "Programlamaya Giriş İçin Temel");
		Category category3=new Category(3,"JavaAcript","JavaScript Öğreniyoruz");
		Category category4=new Category(4,"C#","C# Giriş");
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.Remove(category2);
		categoryManager.Update(category3);
		categoryManager.Add(category4);
		
		Instructor instructor=new Instructor("Engin","DEMİROĞ");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.Add(instructor);
		instructorManager.Update(instructor);
		

	}

}

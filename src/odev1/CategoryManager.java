package odev1;

public class CategoryManager {
	public void Remove(Category category) {
		System.out.println("Ders silindi"+" "+category.getName());
	}
	public void Update(Category category) {
		System.out.println("Ders güncellendi"+" "+category.getDescription());
	}
	public void Add(Category category) {
		System.out.println("Ders eklendi"+" "+category.getId());
	}

}

package chapter_2.page_36;

class DogTestDrive {
	public static void main (String[] args) {
		Dog d = new Dog();
		d.size = 40;
		d.breed = "German Shepard";
		d.name = "Ruffles";
		d.bark();

		System.out.println();
		System.out.println("----- Dog Info -----");
		System.out.println("Name: " + d.name);
		System.out.println("Breed: " + d.breed);
		System.out.println("Size: " + d.size);

	}
}

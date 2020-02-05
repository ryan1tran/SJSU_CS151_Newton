package hw1;

public class AnimalTest
{
	public static void main(String[] args)
	{
		Dog d = new Dog("dog", "Doggie", 4, "female", "house", 20);
		Cat c = new Cat("cat", "Cattie", 8, "male", "house", 30);
		Racoon r = new Racoon("racoon", "Racoonie", 6, "male", "trash can", 15);
		Whale w = new Whale("whale", "Whalie", 100, "female", "ocean", 12);
		
		System.out.println(d.getName() + " barking: ");
		d.bark();
		System.out.println();
		
		System.out.println(c.getName() + " greeting human: ");
		c.greetHuman();
		System.out.println();
		
		System.out.println(r.getName() + " scratching: ");
		r.scratch();
		System.out.println();
		
		System.out.println(w.getName() + " sound: ");
		w.sound();
		System.out.println();
	}
}

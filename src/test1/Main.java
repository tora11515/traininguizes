package test1;

public class Main {

	public static void main(String[] arg) {
		Engineer firstEngineer = new Developer("Tora", "FullStack Engineer", 5);
		firstEngineer.setExperienceYears(6);
		System.out.println(firstEngineer.getRole());


	}
}

import java.util.*;

public class HealthyHearts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your age?");
		String str = in.nextLine();
		int age = Integer.parseInt(str);
		
		int max_rate = 220-age;
		int lower_rate = (int)(0.5*max_rate);
		int higher_rate = (int)(0.85*max_rate);
		
		System.out.println("Your maximum heart rate should be "+max_rate+" beats per minute");
		System.out.println("Your target HR Zone is "+lower_rate+" - "+higher_rate+" per minute");
	}
}

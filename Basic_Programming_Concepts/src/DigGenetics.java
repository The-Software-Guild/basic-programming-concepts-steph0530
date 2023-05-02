import java.util.*;
import java.util.Map.Entry;


public class DigGenetics {
	public static void main(String[] args) {
		String[] breeds = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
		
		Scanner in  = new Scanner(System.in);
		System.out.println("What's your dog's name?");
		String name = in.nextLine();
		System.out.println("Well then, I have this highly reliable report on "+name);
		System.out.println(name+ " is: ");
		
		double percentages = 1;
		Random rnd = new Random();
		Map<String, Double> mp = new HashMap<>();
		
		for(int i=0;i<5;i++) {
			double percentage = percentages * rnd.nextDouble();
			percentages-=percentage;
			mp.put(breeds[i], 100*percentage);
		}
		
		for(Entry<String, Double> entry: mp.entrySet()) {
			System.out.println(entry.getKey()+" :");
			System.out.println(entry.getValue()+" %");
		}
	}
}

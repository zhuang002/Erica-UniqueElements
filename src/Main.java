import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0;i<n;i++) 
			set.add(sc.nextInt());
		System.out.println(set.size());
	}

}

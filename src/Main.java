
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int ele = sc.nextInt();
			if (!al.contains(ele))
				al.add(ele);
		}
			
		System.out.println(al.size());
	}

}

import java.util.*;
import java.io.*;


class ListMethods {

	ArrayList<Integer> list1 = new ArrayList<>();
	ListMethods() {
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
	}

	void adding(int x){
		list1.add(x);
	}
	
	void removing(int index) {
		list1.remove(index); 
	}
	
	void fetching(int index) {
		System.out.println(list1.get(index));
	}
	
	void display() {
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		} 
		System.out.println();
	}
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		ListMethods a1 = new ListMethods();
		System.out.println("Operations on list interafce");
		System.out.println("1. Adding	2.Removing 	3.Fetching 	4. Displaying ");
		System.out.println("Enter your option (1,2,3,4)/* (Enter 0 to stop operations) */");
		int option = in.nextInt();
		while(option != 0) {
			switch(option) {
				case 1: System.out.println("Enter the element to add");
					int x = in.nextInt();
					a1.adding(x);
					a1.display();
					break;

				case 2: System.out.println("Enter the index to remove");
					int y = in.nextInt();
					a1.removing(y);
					a1.display();
					break;

				case 3: System.out.println("Enter the index to fetch");
					int p = in.nextInt();
					a1.fetching(p);
					break;

				case 4: a1.display();
					break;
				default: System.out.println("Invalid Option");
			}
			option = in.nextInt();
		}
	}
}

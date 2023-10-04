import  java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList<String> Name = new ArrayList<String>();
		Name.add("yogesh");
		Name.add("yogesht");
		Name.add("tyogesh");
		
		System.out.println(Name);
		Name.add(2,"thorat");
		System.out.println(Name);
		
	}

}

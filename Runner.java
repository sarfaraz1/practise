package practice;

import java.util.HashSet;

public class Runner {
	public static void main(String[] args) {
		HashSet<Square> set = new HashSet<>();

		System.out.println(set.add(new Square()));
		System.out.println(set.add(new Square()));
		System.out.println(set.add(new Square()));
		System.out.println(set.add(new Square()));
		System.out.println(set.add(new Square()));
	    int a=	new Square().hashCode();
	    int b=	new Square().hashCode();
	    int c=	new Square().hashCode();
	    System.out.println(a+"--"+b+"--"+c);
	    Square s = new Square();
	    Square s1 = new Square();
	    System.out.println(s.equals(s1));
	    
	    
	    
	}
}

class Square {
	public int hashCode() {
		return 1;
	}

}
package practice;

public class Child extends Parent {
	Child(int a)
	{
		super(a);
	}
	public static void main(String[] args) {
		Child obj = new Child(5);
		//Parent obj1=new Parent();
	}
	
	

}
abstract class Parent{
	Parent(int a)
	{
		System.out.println("hello");
	}
}

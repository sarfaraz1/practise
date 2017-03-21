package practice;

class Test {

	void m1() {
		System.out.println("no arg");
	}

	void m1(int i,float f) {
		System.out.println("int-float arg");
	}
	
	void m1(float f,int i) {
		System.out.println("float-int arg");
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.m1(1,1.2f);
		t.m1(1.2f,1);
		t.m1(1,1);
		
		
	}

}
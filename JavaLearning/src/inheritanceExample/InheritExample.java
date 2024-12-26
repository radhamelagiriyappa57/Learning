package inheritanceExample;

import day4.staticdemo;

class A{
	
	int a =100;
	void display(){
		System.out.println(a);
		
	}
	
}

class B extends A
{
	int b =200;
	void show(){
		System.out.println(b);
		//System.out.println(a);
	}
	
	
}

class C extends B
{
	int c= 300;
	void print()
	{
		System.out.println(c);
	}
	}

public class InheritExample {
	

	public static void main(String[] args) {
		
		B obj = new B();
		obj.display();
		obj.show();
		
		C obj2=new C();
		obj2.print();
		obj2.show();
		obj.display();
	}

}

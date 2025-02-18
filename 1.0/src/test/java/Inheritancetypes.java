

class A
{
int a =100;

void display()
{
	System.out.println(a);
}
}


class B extends A
{
int b = 200;
void show()
{
	
	System.out.println(b);

}
}

class C extends B
{
int c = 600;
void showc()
{
	
	System.out.println(c);

}
}






public class Inheritancetypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b = new B();
b.display();
b.show();
C c = new C();
c.display();
c.show();
c.showc();
	}



}


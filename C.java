class A
{
int c=10;

void show()
{
System.out.println(this.c);
}
}

class B extends A
{
int  b=20;
void display()
{
System.out.println(b);
}
}

class C 
{
public static void main(String x[])
{
A a=new A();
B b1=new B();
b1.display();
b1.show();
}
}
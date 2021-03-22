class D
{
int a=20;
void show()
{
System.out.println(a);
}
}
 
class B extends D
{
int b=60;
void display()
{
System.out.println(b*b);
}
} 

class C extends B
{
int c=40;
void calculate()
{
System.out.println(c+c);
}
}

class S
{
public static void main(String c[])
{
C b1=new C();
b1.show();
b1.display();
b1.calculate();
}
} 
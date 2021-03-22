class V
{
int a=10;
void show()
{
System.out.println(a);
}
}

class X
{
int b=30;
void calculate()
{
System.out.println(b);
}
}

class F extends V,X
{
int z=20;
void display()
{
System.out.println(z);
}
}

class sample
{
public static void main(String q[])
{
F f1=new F();
f1.show();
f1.display();
f1.calculate();
}
}
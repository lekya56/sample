class L
{
protected int a=20;
void calculate()
{
System.out.println(a*a);
}
}

class M extends L
{
void calculate()
{
super.calculate();
System.out.println(a-a);
}
}

class N
{
public static void main(String x[])
{
M m=new M();
m.calculate();
}
}
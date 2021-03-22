class G
{
int a=10;
void show()
{
System.out.println(a*a);
}
}

class J extends G
{
int a=40;
void show()
{
super.show();
System.out.println(a+a);
}
}

class H
{
public static void main(String d[])
{
J k1=new J();
k1.show();
}
}
class Bacc
{

Bacc()
{
int r;
}
void display()
{
Interest i=new Interest();
i.calInterest();
}
}

class Interest
{
int rate;
Interest()
{

}
void calInterest()
{
double bal=bal*(rate/100);
}
}

class A
{
public static void main(String x[])
{
Bacc bal=new Bacc(10000);
bal.display();
}
}

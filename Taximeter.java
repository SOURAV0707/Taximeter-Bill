import java.util.*;
class Taximeter
{
int taxino;
String name;
int km;
Taximeter()
{
taxino=0;
name="";
km=0;
}
void input()
{
Scanner sc=new Scanner(System.in);
String S;
System.out.println("enter the taxi no:");
S=sc.nextLine();
taxino=Integer.parseInt(S);
System.out.println("enter the name:");
name=sc.nextLine();
System.out.println("enter the km:");
S=sc.nextLine();
km=Integer.parseInt(S);
}
int calculate()
{
int bill=0;
if(km<=1)
bill=25*km;
else if(km>1 && km<=6)
bill=10*km;
else if(km>6 && km<=12)
bill=15*km;
else if(km>12 && km<=18)
bill=20*km;
else
bill=25*km;
return bill;
}
void display()
{
System.out.println("taxino \t name \t km travelled \t bill amount");
System.out.println(taxino+"\t"+name+"\t\t"+km+"\t\t"+calculate());
}
public static void main(String args[])
{
Taximeter obj=new Taximeter();
obj.input();
obj.calculate();
obj.display();
}
}


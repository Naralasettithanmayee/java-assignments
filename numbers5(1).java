import java.util.*;
class numbers
{
public static void main(String args[])
{
int n,x,y,s=0,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
System.out.println("enter x value");
x=sc.nextInt();
System.out.println("enter y value");
y=sc.nextInt();
while(n!=0)
{
int r=n%10;
int p=n/10;
if(r==x)
{
r=y;
}
s=s+r*(int)Math.pow(10,c);
c+=1;
n=p;
}
System.out.println("number is "+s);
}
}

import java.util.*;
class stars
{
public static void main(String args[])
{
int i,j,k;
char ch='*';
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
for(j=n;j>i;j--)
{
System.out.print("");
}
for(k=1;k<=(i-1);k++)
{
System.out.print(ch+" ");
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(j=n-1;j>=i;j--)
{
System.out.print("");
}
for(k=1;k<=(i-1);k++)
{
System.out.print(ch+" ");
}
System.out.println();
}
return;
}
}
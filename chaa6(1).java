import java.util.*;
class chaa
{
public static void main(String args[])
{
int i,j,k;
char ch='*';
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value");
int n=sc.nextInt();
for(i=1;i<=n;++i)
{
for(k=n;k>=i;k--)
{
System.out.print(ch+" ");
}
for(j=1;j<i;j++)
{
System.out.print(" ");
}
System.out.println();
}
return;
}
}

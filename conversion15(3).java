import java.util.*;
class Convertions
{
     public static void main(String args[])
{
     System.out.println("1.DecimaltoBinary\n2.DecimaltoOctal\n3.DecimaltoHexa");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your choice");
     int choice=sc.nextInt();
     System.out.println("Enter a decimal num:");
     int n=sc.nextInt();
      switch(choice)
{
                case 1: String a=Integer.toBinaryString(n);
                            System.out.println("Binary:"+a);
                break;
     
                case 2: String b=Integer.toOctalString(n);
                            System.out.println("Octal:"+b);
                break;

                case 3: String c=Integer.toHexString(n);
                            System.out.println("Hexa:"+c);
                break;
                            default:System.out.println("Enter correct choice");

}
}
}
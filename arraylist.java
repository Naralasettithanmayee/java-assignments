import java.util.*;
class arraylist
{
public static void main(String args[])
{
ArrayList<String> s1=new ArrayList<String>();
ArrayList<String> s2=new ArrayList<String>();
s1.add("red");
s1.add("blue");
s1.add("green");
s1.add("pink");
s2.addAll(s1);
s2.add("white");
s2.add("yellow");
s2.add("pink");
for(String s:s2)
System.out.print(s+" ");
}
}
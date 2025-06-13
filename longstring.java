import java.util.Scanner;
public class longstring{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1="hello how are you";
    System.out.println(s1);
    String[] str=s1.split(" ");//strored in terms of array
    String rev=" ";
for(int i=str.length-1;i>=0;i--)

{
    rev=rev+str[i]+" ";
}
System.out.println(rev);
}
}
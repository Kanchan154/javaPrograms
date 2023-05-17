import java.util.Scanner; 
public class StringJava{
   public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the name");
   String name=sc.nextLine();
   String rev = " ";
   for(int i=name.length()-1;i>=0;i--){
      rev=rev+name.charAt(i);
   }
   System.out.println(rev);
   if(name.equals(rev)){
      System.out.println("String is palindrome");
   }else{
      System.out.println("not a palindrome");
   }
int alphac=0,digitc=0;
System.out.println(name.replace(" ","_"));
for(int i=name.length()-1;i>=0;i--){
char ch=name.charAt(i);
if(Character.isUpperCase(ch)){
   System.out.print(Character.toLowerCase(ch));}
else{
   System.out.print(Character.toUpperCase(ch));
}
}
int i=0;
char ch=name.charAt(i);
for(i=0;i<name.length();i++){
if(Character.isUpperCase(ch)){
alphac+=1;
}
else if(Character.isLowerCase(ch)){
   alphac+=1;
   }
else if(Character.isDigit(ch)){
   digitc+=1;
   }
}
System.out.println("percentage of Alphabet is : " +(((float)alphac/name.length())*100));
System.out.println("percentage of digit is : " +(((float)digitc/name.length())*100));

}
}
//System.out.println(name.toUpperCase())

Scanner sc=new Scanner(System.in);
String a=sc.next();
int i=
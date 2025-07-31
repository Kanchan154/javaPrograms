import java.util.Scanner;
class Boxes {
    int accno;//member variable or instance variable
    int principal;
   String name; 
   static double roi=10.5;
    int years;
    double total;
    public void setdata(){
Scanner sc=new Scanner(System.in);
System.out.println("enter account no: ");
int x=sc.nextInt();
System.out.println("enter principal amount: ");
int y=sc.nextInt();
System.out.println("enter years: ");
int z=sc.nextInt();
String n=sc.nextLine();

    accno=x;
    principal=y;
    years=z;
    name=n;
    total=principal+
(principal*roi*years)/100;
    }
    public void showdata(){
        System.out.println("Account no is"+accno);
        System.out.println("principal is"+principal);
        System.out.println("time duration is"+years);
        System.out.println("intrest is"+total);
    }
}

public class BoxesJava{
public static void main(String[]args){


    System.out.println("length is "+length);
    System.out.println("breadth is "+breadth);
    System.out.println("height is "+height);
    System.out.println("value of k= "+k);

static void setk(int p){
    k=p;
}
public static void main(String[]args){
    Boxes b1=new Boxes();
    Boxes.setk(5);
    b1.setdata(15,30,50);
    b1.showdata();

    Boxes b2=new Boxes();
    b2.setdata(15,30,50);
    b2.showdata();

    Boxes b3=new Boxes();
    b3.setdata(15,30,50);
    b3.showdata();

    //System.out.println();
    b3.setk(5);
    b3.showdata();
    
 

// }
// }
class Student(){
int a;
String b;
Student(int x, int y){
    a=x;
    b=y;
}
void display(){
    System.out.println("value of a is "+a+" value of b is "+b);
    student s1=new Student
}
public static void main(String )
    System.out.println();
}
    }
}

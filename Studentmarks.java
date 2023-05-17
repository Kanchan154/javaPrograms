import java.util.Scanner;
public class Studentmarks{
    int maths,hindi,english,chemistry,physics,total;
    float per;
    Studentmarks(int x,int y,int z,int p,int q){
    maths=x;
    chemistry=y;
    physics=z;
    hindi=p;
    english=q;

}
void calculate(){
total = (maths+hindi+english+chemistry+physics);
per= (total*100)/500;
}
void display(){
System.out.println("marks in maths "+maths);
System.out.println("marks in hindi "+hindi);
System.out.println("marks in english "+english);
System.out.println("marks in chemistry "+chemistry);
System.out.println("marks in physics "+physics);
System.out.println(" total is "+total);
System.out.println("percentage is "+per);
}

public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of Student");
   // Studentmarks S1 = new Studentmarks(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    

    System.out.println("marks in maths ");
int x=sc.nextInt();
System.out.println("marks in hindi ");
int y=sc.nextInt();
System.out.println("marks in english ");
int z=sc.nextInt();
System.out.println("marks in chemistry ");
int p=sc.nextInt();
System.out.println("marks in physics ");
int q=sc.nextInt();
    Studentmarks S1 = new Studentmarks(x,y,z,p,q);
    S1.calculate();
    S1.display();
}
}




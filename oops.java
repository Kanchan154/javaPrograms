public class oops {
    int a;
    int b;
    oops(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("value of a is "+a+ "value of b is "+b);
    }
    public static void main(String[]args){
        oops op1= new oops(1,2);
        op1.display();
        System.out.println();
        oops op2 =new oops(3,5);
        op2.display();
        System.out.println();
        
    }
    }


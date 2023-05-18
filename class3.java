import java.util.Scanner;
class A{
void wish (){
            System.out.println("good afternoon");
}
    }
    class B extends A{
        void wish(){
            System.out.println("goodnight");
        }
    }
    class demo{
        public static void main(String args[]){
            B bb=new B();
            bb.wish();
        }
    }
           
public class Student {
   int length;//member variable or instance variable
   int breadth; 
   int height;
   public void setdata(int x,int y,int z){
    length=x;
    breadth=y;
    height=z;
}
public void showdata(){
    System.out.println("length is "+length);
    System.out.println("breadth is "+breadth);
    System.out.println("height is "+height);
}
}


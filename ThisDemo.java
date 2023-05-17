public class ThisDemo{
    private int empid ;
     public void setdata(int emp_id){
        empid=emp_id;
     }
     public int showdata(){
        return empid;
     }
        public static void main(String[]args){
            ThisDemo t=new ThisDemo();
            t.setdata(100);
            System.out.println(t.showdata());

        }
    }


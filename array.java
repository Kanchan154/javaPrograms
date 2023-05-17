public class array {
    public static void main(String[]args){
        int a[][]={{1,2,3},{1,3,2},{1,1,1}};
        int b[][]={{2,6,2},{2,4,2},{2,8,2}};
        int c[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            c[i][j]=0;
            for(int k=0;k<3;k++){
                c[i][j]+=a[i][k]*b[k][i];
            } System.out.print(c[i][j]+"  ");
        }System.out.println();
    }

    System.out.println("transpose of a matrix is");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(c[j][i]+"  ");
        }
        System.out.println();
    }
    System.out.println("reverse of transpose of a matrix is");
    for(int i=2;i>=0;i--){
        for(int j=2;j>=0;j--){
            System.out.print(c[j][i]+"  ");
        }
        System.out.println();
    }
    int i;
    int[]arr={1,17,15,28,93,65,75};
    int l=arr.length;
    int n=Math.floorDiv(l,2);
    int temp;
    for(i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[l-1-i];
        arr[l-1-i]=temp;
    }
    for (int element:arr){
        System.out.println(element+" ");

    }

    System.out.println();
    //int[] arr ={1,17,15,28,93,65,75};
    int max=0;
    for (int element:arr){
        if (max<element){
            max=element;
        }
       
     } System.out.println(max+" ");

    }
}

            
        
    


public class pettern {
public static void main(String[]args){
//   int i,j,k;
//     for(i=0;i<=5;i++){
//     for(j=i;j<5;j++){
//     System.out.print("* ");    
//     }
// // for(k=1;k<=i;k++){
// //     System.out.print("*");
// // }   
// System.out.println();
//     }
// }

int i,j,k,row=5;
for(i=0;i<row;i++){
    for(j=0;j<i;j++){
    System.out.print(" ");
    }
    for(k=0;k<row-i;k++){
    System.out.print((char)(j+65));
}
System.out.println();
}
}
}


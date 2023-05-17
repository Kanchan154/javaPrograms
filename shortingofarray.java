
public class shortingofarray {//Bubble sort of an array

    public static void main(String[]args){
        int[]arr={1,34,67,8,34,12,98};
        int i,j,temp;
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        }
        }


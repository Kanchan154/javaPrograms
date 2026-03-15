import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        int[] array = {10,12,5,40,20,7,5,9,10};
        List<Integer> nonMultiples = new ArrayList<>();
        List<Integer> multiples = new ArrayList<>();

        for (int num: array){
            if(num % 10 == 0){
                multiples.add(num);
            }
            else {
                nonMultiples.add(num);
            }
        }

        int index = 0;
        for(int num: nonMultiples){
            array[index++] = num;
        }
        for(int num: multiples){
            array[index++] = num;
        }

        System.err.println(Arrays.toString(array));
    }
}

import java.util.*;

public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        if (isCapital(str) || isSmall(str) || (isCapital(str.substring(0, 1)) && isSmall(str.substring(1)))) {
            System.out.println("Valid String......");
        } else {
            System.out.println("Invalid String.....");
        }
    }

    public static boolean isCapital(String str) {
        for (char ch : str.toCharArray()) {
            if (ch < 'A' || ch > 'Z') {
                return false;
            }
        }
        return true;
    }

    public static boolean isSmall(String str) {
        for (char ch : str.toCharArray()) {
            if (ch < 'a' || ch > 'z') {
                return false;
            }
        }
        return true;
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String NumberSequence(String str){
        String[] arr = str.split(",");

        int[] numbers = new int[arr.length];

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < arr.length; i++ ){
            numbers[i] = Integer.parseInt(arr[i].trim());
        }

        Arrays.sort(numbers);

        for(int i = 0; i < numbers.length; i++){
            builder.append(numbers[i]);
            if(i < numbers.length -1){
                builder.append(",");
            }
        }

        return builder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(NumberSequence(scanner.nextLine()));
        scanner.close();
    }
}
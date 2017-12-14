import java.util.Scanner;

public class UdemyArrays {

    public static void main(String[] args) {
        int[] num = getNum(5);
        for (int i = 0; i < num.length; i++){
            System.out.println("val " + i + " is "+ num[i]);
        }
    }
    public static Scanner scanner = new Scanner(System.in);

    public static int[] getNum(int num){
        int[] val = new int[num];
        for (int i = 0; i < val.length; i++){
            val[i] = scanner.nextInt();
        }
        return val;
    }
}

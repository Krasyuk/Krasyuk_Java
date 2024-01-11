import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;

        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Введите число:");
            number = sc.nextInt();
            if (number > 7){
                System.out.println("Привет");
            }else{
                System.out.println("Число меньше 7");
            }
        }
    }
}

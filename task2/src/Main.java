import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();
        String result = name.toLowerCase();

        if (result.equals("вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}

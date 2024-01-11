import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(array[i]);
        }
        System.out.println("Элементы массива кратные 3: " + resultArray(array));
    }

    private static ArrayList<Integer> resultArray(int[] array){
        ArrayList<Integer> result = new ArrayList<>();
        for (int var : array) {
            if (var % 3 == 0) {
                result.add(var);
            }
        }
        return result;
    }
}

package algorithmes.binarySearch;

import java.util.ArrayList;

public class binarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 1;
        for (int i = 0; i <= 256; i++) {
            numbers.add(number);
            number++;
        }
        System.out.println(binarySearch(numbers, 256));
    }

    public static String binarySearch(ArrayList<Integer> numbers, int item) {
        int low = 0; // минимальное число
        int high = numbers.size() - 1; // максимальное
        int mid = 0;
        int counter = 0;
        System.out.println("Интервал для поиска : с " + low + " до " + high);


        while (low <= high) {
            mid = (low + high) / 2;
            if (numbers.get(mid) == item) {
                counter++;
                System.out.println("Предполагаемый элемент - " + mid);
                System.out.println("В точку! Завершаем цикл");
                break;
            }
            if (numbers.get(mid) > item) {
                high = mid - 1;
                counter++;
                System.out.println("Предполагаемый элемент - " + mid);
                System.out.println("Слишком много. Новый интервал поиска : с " + low + " до " + high);
            }
            if (numbers.get(mid) < item){
                low = mid + 1;
                counter++;
                System.out.println("Предполагаемый элемент - " + mid);
                System.out.println("Слишком мало. Новый интервал поиска : с " + low + " до " + high);
            }
        }
        return "Индекс " + item + " это - " + mid + ". Индекс элемента найден за " + counter + " шагов.";
    }
}

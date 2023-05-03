import java.util.Arrays;
public class Main {
    public static int [] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] apgs)  {
        int[] arr = generateRandomArray();

        System.out.println("Зарплаты:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Задание 1");

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        String message = String.format("Сумма трат за месяц составила %S", + sum);
        System.out.println(message);
        System.out.println("=== === ===");

        System.out.println("Задание 2");

        int min = arr [0];
        int max = arr [0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        String messageMinMax = String.format("Минимальная сумма трат за день составила %S рублей.Максимальная сумма трат за день составила %S рублей", min,max);
        System.out.println(messageMinMax);
        System.out.println("=== === ===");

        System.out.println("Задание 3");

        int sumForAvg = 0;

        for (int i : arr) {
            sumForAvg += i;
        }

        int days = arr.length;
        double avg = (double) sumForAvg / days;
        String messageAvg = String.format("Средняя сумма трат за месяц составила %S рублей",avg);
        System.out.println(messageAvg);
        System.out.println("=== === ===");

        System.out.println("Задание 4");

        char[] reverseFullName = {'n','a','v','I' ,' ','v','o','n','a','v','I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
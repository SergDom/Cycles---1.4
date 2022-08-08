public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int count1 = 0;

        while (count1 < 10) {
            count1 = count1 + 1;
            System.out.print(count1 + " ");
        }
        System.out.println();

        int count2 = 11;
        for (; count2 > 0; ) {
            count2 = count2 - 1;
            System.out.print(count2 + " ");

        }
        System.out.println();
        System.out.println("Задание 2");

        int friday = 5;
        for (; friday <= 31; friday = friday +7) {
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет.");

            }

        }

    }
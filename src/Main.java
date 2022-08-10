public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println();
        int count1 = 0;

        while (count1 < 10) {
            count1 = count1 + 1;
            System.out.print(count1 + " ");
        }
        System.out.println();

        int count2 = 11;
        for (; count2 > 0;) {
            count2 = count2 - 1;
            System.out.print(count2 + " ");

        }
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();

        int friday = 5;
        for (; friday <= 31; friday = friday +7) {
            System.out.println("Сегодня пятница " + friday + " -е число. Необходимо подготовить отчет.");

            }

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        int firstYear =79;
        int currentYear =2022;
        int yearBefore = currentYear - 200;
        int yearAfter = currentYear + 100;

        for (; firstYear<= yearAfter; firstYear = firstYear + 79 )
            if (firstYear >= yearBefore && firstYear <= yearAfter) {
           System.out.println(firstYear); }

        System.out.println();
        System.out.println("Задание 4");
        System.out.println();

        int i = 30;
        for (i=0; i<=30; i++)
            if (i % 3 ==0 && i % 5 == 0)
                 { System.out.println(i + " Ping" + " Pong");}
                if  (i % 3 == 0) {System.out.println(i + " Ping");}
                else {System.out.println(i-1);}
            }





}
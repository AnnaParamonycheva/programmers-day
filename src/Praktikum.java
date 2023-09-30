import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            // здесь выводим результат
            System.out.println ("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        // здесь определяем, является ли переданный год високосным
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        /*
            Ревью:
            1. даже если после else идёт всего один оператор, лучше выделить его в отдельный блок кода с помощью {}
            Это визуально выделит оператор и, в случае добавления операторов перед, в данном случае, return,
            позволит проще внести изменения. Т.е. можно сделать так

            } else {
                return year % 100 != 0;
            }

            2. Не следует оставлять комментарии к предыдущему этапу ревью. Смысл отправки кода на ревью не в том, чтобы
            его пройти, а чтобы код без недочётов отправился в продакшн, где не стоит злоупотреблять комментариями.
        */
        /*изменила, стало аккуратнее*/
        } else return year % 100 != 0;
}

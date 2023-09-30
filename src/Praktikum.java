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
            Ревью: можно избежать дополнительных условных операторов если изменить условие
               на (year % 100 != 0) и сразу вернуть его значение
        */
        /*изменила, стало аккуратнее*/
        } else return year % 100 != 0;
    }
}

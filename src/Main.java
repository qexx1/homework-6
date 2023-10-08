public class Main {
    public static void main(String[] args) {
        //задание 1
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        //задание 2
        for(int a = 10; a > -1; a--){
            System.out.println(a);
        }

        //задание 3
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }

        //задание 4
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        //задание 5
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " Год является високостным");
        }

        //задание 6
        for (int i = 7; i < 100; i = i + 7) {
            System.out.println(i);
        }

        //задание 7
        for (int i = 1; i < 1000; i = i * 2){
            System.out.println(i);
        }

        //задание 8
        var ourMoney = 29000;
        var total = 0;
        for (int month = 1; month < 12; month++) {
            total += ourMoney;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }

        //задание 9
        var Money = 29000;
        var overall = 0;
        for (int i = 1; i < 12; i++) {
            overall += Money;
            overall = overall + overall * 12 / 100;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + overall + " рублей");
        }

        //задание 10
        for (int i = 1; i < 11; i++){
            int answer = 2 * i;
            System.out.println("2*" + i + "=" + answer);
        }
    }
}
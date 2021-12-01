package rtu.mirea.gibo01.pr6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Какой Вам размер чашки кофе: 1) Small, 2) Middle, 3) Big?");
        System.out.println("Для выбора чашечки введите соответствующую цифру (1, 2 или 3)");

        Scanner sc = new Scanner(System.in);

        CoffeeSize coffee1 = CoffeeSize.Small;
        CoffeeSize coffee2 = CoffeeSize.Middle;
        CoffeeSize coffee3 = CoffeeSize.Big;

        int cup = sc.nextInt();

        if (cup == 1) {
            System.out.println(coffee1);
            System.out.println("Насладитесь чашечкой кофе объёмом 100 мл");
        }

        if (cup == 2) {
            System.out.println(coffee2);
            System.out.println("Насладитесь чашечкой кофе объёмом 200 мл");
        }

        if (cup == 3) {
            System.out.println(coffee3);
            System.out.println("Насладитесь чашечкой кофе объёмом 400 мл");
        }
    }
}

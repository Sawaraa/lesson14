package Maximum;

import java.util.Objects;
import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);

   static String name;

   static Commodity commodity = new Commodity();
    public static void menu(){

        System.out.println("1.Додати товар");
        System.out.println("2.Видалити товар");
        System.out.println("3.Замінити товар");
        System.out.println("4.Сортувати за назвоню");
        System.out.println("5.Сортувати за довжиною");
        System.out.println("6.Сортувати за шириною");
        System.out.println("7.Сортувати за вагою");
        System.out.println("8.Вивести товар за іменем");
        System.out.println("9.Вийти з програми");

    }
    public static void main(String[] args) {

        while (true){
            menu();
            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Ведіть назву товару:");
                    String name1 = scanner.next();

                    System.out.println("Введіть довжину товару");
                    double length = scanner.nextDouble();

                    System.out.println("Введіть ширену товару");
                    double width = scanner.nextDouble();

                    System.out.println("Введіть вагу товару");
                    double weight = scanner.nextDouble();

                    Goods goods = new Goods(name1, length, width, weight);

                    commodity.add(goods);

                    break;
                case 2:
                    System.out.println("Введіть ім'я товару якого хочете видалити");
                    String name2 = scanner.next();
                    commodity.remove(name2);

                    break;
                case 3:
                    System.out.println("Введіть ім'я товару якого хочете замінити");
                    name = scanner.next();

                    System.out.println("Введіть ім'я на яке хочете замінити:");
                    String replaceName = scanner.next();

                    System.out.println("Введіть довжину на яку хочете замінити");
                    double newLength = scanner.nextDouble();

                    System.out.println("Введіть ширину на яку хочете замінити");
                    double newWidth = scanner.nextDouble();

                    System.out.println("Введіть вагу на яку хочете замінити");
                    double newWeight = scanner.nextDouble();

                    commodity.replace(name, replaceName, newLength, newWidth, newWeight);
                    break;
                case 4:
                    commodity.nameSort();
                    break;
                case 5:
                    commodity.lenghtSort();
                    break;
                case 6:
                    commodity.widthSort();
                    break;
                case 7:
                    commodity.weightSort();
                    break;
                case 8:
                    name = scanner.next();
                    commodity.outputElement(name);
                    break;
                case 9:
                    commodity.exit();
                    break;
                default:
                    System.out.println("Ви ввели інше число");
                    break;
            }
        }

    }
}

package third_week.second_day.PracticeInterface2;

import second_week.phone.SimCard;

import java.util.Scanner;

/**
 * Created by George on 30.05.2017.
 */
public class Phone  {


    void addKyivstar() {
        Kyivstar kyivstar = new Kyivstar();
        kyivstar.aboutSimcard();
    }

    void addVodafone() {
        Vodafone vodafone = new Vodafone();
        vodafone.aboutSimcard();
    }

    void addLifecell() {
        Lifecell lifecell = new Lifecell();
        lifecell.aboutSimcard();
    }



    void aboutPhone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone Mark: ");
        String mark = scanner.nextLine();
        System.out.println("Enter phone Model: ");
        String model = scanner.nextLine();
        System.out.println(mark);
        System.out.println(model);
        addKyivstar();
            }

}
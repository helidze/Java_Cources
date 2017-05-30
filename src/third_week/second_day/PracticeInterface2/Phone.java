package third_week.second_day.PracticeInterface2;

import second_week.phone.SimCard;

import java.util.Scanner;

/**
 * Created by George on 30.05.2017.
 */
public class Phone  {
        private Simcard simcard;
        String model;
        String mark;

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

        void addSimcard(){
        if (!this.simcard.SIMCARD){
            System.out.println("Симка не установлена");
        }
        else {
            System.out.println("Установлена");
        }
        }

    void aboutPhone(String model,String mark) {
            this.model = model;
            this.mark = mark;
        System.out.println(mark + " " + model);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter phone Mark: ");
//        String mark = scanner.nextLine();
//        System.out.println("Enter phone Model: ");
//        String model = scanner.nextLine();
//        System.out.println(mark);
//        System.out.println(model);
        addKyivstar();
            }

    public Simcard getSimcard() {
        return simcard;
    }

    public void setSimcard(Simcard simcard) {
        this.simcard = simcard;
    }
}
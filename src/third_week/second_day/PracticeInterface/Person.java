package third_week.second_day.PracticeInterface;

/**
 * Created by George on 30.05.2017.
 */
public class Person implements BasePerson {

    @Override
    public void go() {
        System.out.println("Человечек наш пошел");
    }

    @Override
    public void eat() {
        System.out.println("Человечек наш кушает");
    }

    @Override
    public void dance() {
        System.out.println("Человечек наш танцует");
    }

    public void printAbout(){
        System.out.println("Голова: " + HEAD + "\nРуки: " + ARMS + "\nНоги: " + LEGS);
    }
}

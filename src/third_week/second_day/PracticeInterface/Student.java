package third_week.second_day.PracticeInterface;

/**
 * Created by George on 30.05.2017.
 */
public class Student extends Person {
    @Override
    public void go() {
        System.out.println("Студент пошел");
    }

    @Override
    public void eat() {
        System.out.println("Студент кушает");
    }

    @Override
    public void dance() {
        System.out.println("Студент танцует");
    }
}

package fourth_week;

/**
 * Created by George on 06.06.2017.
 */
public class Task
{
    public static void main(String[] args) {
//        NestedInner.Nested nested = new NestedInner.Nested();
//        nested.voo();
        NestedInner nestedInner = new NestedInner();
        NestedInner.Inner inner = nestedInner.new Inner();


    }
}

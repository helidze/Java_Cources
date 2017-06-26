package seventh_week;

/**
 * Created by George on 26.06.2017.
 */
public class Box <T, U>{

private T object;
private U object1;

public Box(T object, U object1){

    this.object = object;
    this.object1= object1;


}

public T getObject(){
    return object;
}

    public U getObject1(){
        return object1;
    }

public void print(){
    System.out.println(object.getClass().getName());
    System.out.println(object1.getClass().getName());
}

}

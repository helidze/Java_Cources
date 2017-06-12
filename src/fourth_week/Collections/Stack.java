package fourth_week.Collections;

/**
 * Created by George on 06.06.2017.
 */
public interface Stack {

    Integer push(int elem);
    boolean empty(); //проверяет есть ли элементы в стеке
    void pop(); //удаляет и возвращает последнее удаленное им значение
    int peek(); //Возвращает но не удаляет из стека

    Integer pick();

    void size(); //Показывает кол-во елементов

}

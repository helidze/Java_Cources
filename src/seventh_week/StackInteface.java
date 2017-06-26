package seventh_week;

/**
 * Created by George on 26.06.2017.
 */
public interface StackInteface <E> {
    Integer push(int elem);

    E push(E elem);

    boolean empty(); //проверяет есть ли элементы в стеке
    void pop(); //удаляет и возвращает последнее удаленное им значение
    int peek(); //Возвращает но не удаляет из стека

    Integer pick();

    void size(); //Показывает кол-во елементов
}

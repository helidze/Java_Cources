package fifth_week.Queue;

/**
 * Created by George on 13.06.2017.
 */
public interface Queue {



    boolean add (Integer el); //либо удачно доавил элемент в конец очереди либо нет (true/false)
    Integer remove(); //возвращает и удаляет элемент из очереди
    Integer element(); //возвращает элемент без удаления из очереди
    int size(); //размер очереди
    boolean isEmpty();// пустая очередь или не пустая
    void clear();// очищает очередь

    void addAllFrom(Queue q); //в нашу очеред скопировать все елементы
    void removeAllTo(Queue q);// из нашей очереди скопировать и удалить все элементы

    boolean offer(Integer el); //тоже что и выше только в случае false генерит ошибку
    Integer poll(); //удаляет элемент из очереди, если нет он генерит ошибку
    Integer peek(); //возвращает эелемент без удаления из очереди

    int [] toArray(); // возвращает массив из элементов очереди в той последовательности в которой к ним можно получить доступ

}

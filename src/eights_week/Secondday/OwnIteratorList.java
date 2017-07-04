package eights_week.Secondday;
import java.util.Iterator;
/**
 * Created by George on 04.07.2017.
 */
public class OwnIteratorList<Type> implements Iterable<Type> {

        private Type[] arrayList;
        private int currentSize;

        public OwnIteratorList(Type[] newArray) {
            this.arrayList = newArray;
            this.currentSize = arrayList.length;
        }

        @Override
        public Iterator<Type> iterator() {
            Iterator<Type> it = new Iterator<Type>() {

                private int currentIndex = 0;

                @Override
                public boolean hasNext() {
                    return currentIndex < currentSize && arrayList[currentIndex] != null;
                }

                @Override
                public Type next() {
                    return arrayList[currentIndex++];
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
            return it;
        }
    }


import java.util.Arrays;
import java.util.Comparator;

public class SupremeArray<T> {
    private T[] array;
    public SupremeArray(){
        array = (T[])(new Object[0]);
    }
    public void add(T element){
        T[] newArr = (T[]) (new Object[array.length + 1]);
        for (int i = 0; i < array.length; i++)
            newArr[i] = array[i];
        newArr[array.length - 1] = element;
        array = newArr;
    }
    public void addAt(T element, int index){
        T[] newArr = (T[]) (new Object[array.length + 1]);
        for (int i = 0; i < index; i++)
            newArr[i] = array[i];
        newArr[index] = element;
        for (int i = index; i < array.length; i++)
            newArr[i+1] = array[i];
        array = newArr;
    }
    public void remove(){
        T[] newArr = (T[]) (new Object[array.length - 1]);
        for (int i = 0; i < array.length; i++)
            newArr[i] = array[i];
        array = newArr;
    }
    public void removeAt(int index) {
        T[] newArray = (T[]) (new Object[array.length - 1]);
        for (int i = 0; i < index; i++)
            newArray[i] = array[i];
        for (int i = index + 1; i < array.length; i++)
            newArray[i - 1] = array[i];
        array = newArray;
    }
    public void sort(){
        Arrays.sort(array);
    }
    public void sort(Comparator<T> comp){
        Arrays.sort(array, comp);
    }
    public void print(){
        for(T t: array) System.out.println(t);
    }
}

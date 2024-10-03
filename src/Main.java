import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tree[] trees = new Tree[]{
                new Tree(3.5, 3, "Okaliptus"),
                new Tree(4.8, 1, "Ataturk Cicegi"),
                new Tree(2.3, 6, "Begonvil"),
                new Tree(10.3, 21, "Ceviz Agaci")
        };
        //task2
        /*for(Tree t : trees) System.out.println(t);
        System.out.println("AFTER SORTINGG BY AGE!!!");
        Arrays.sort(trees);
        for(Tree t : trees) System.out.println(t);*/

        //task3
        /*System.out.println("AFTER SORTINGG BY HEIGHT!!!");
        Arrays.sort(trees,(Tree t1, Tree t2) -> {
            return (int)(t1.getHeight() - t2.getHeight());
        });

        for(Tree t : trees) System.out.println(t);*/

        //task4

    }
}

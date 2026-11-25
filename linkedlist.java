import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> num=new LinkedList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        num.addFirst(100);
        num.addLast(200);
        num.addAll(3, num);

        System.out.println(num);
        System.out.println(num.get(0));

        num.removeFirst();
        num.removeLast();

        System.out.println(num);
    }
}

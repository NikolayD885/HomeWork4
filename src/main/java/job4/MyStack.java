package job4;

import java.util.LinkedList;

public class MyStack {
    private static LinkedList<String> stack;

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        push(linkList, 9); //добавить в конец
        System.out.println(linkList);
        System.out.println(peek(linkList)); //посмотреть последнее в стеке
        System.out.println(linkList);
        System.out.println(pop(linkList)); //посмотреть и извлечь последнее в стеке
        System.out.println(linkList);
    }

    private static void push(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    private static int peek(LinkedList<Integer> list) {
        int num = 0;
        num = list.getLast();
        return num;
    }

    private static int pop(LinkedList<Integer> list) {
        int num = 0;
        num = list.getLast();
        list.removeLast();
        return num;
    }
}

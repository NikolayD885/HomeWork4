package job4;

import java.util.LinkedList;

public class MyQueue {
    private static LinkedList<String> queue;

    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
        add(linkList, 9); //добавить в конец
        System.out.println(linkList);
        System.out.println(top(linkList)); //посмотреть первое в очереди
        System.out.println(linkList);
        System.out.println(remove(linkList)); //извлечь и вернуть первое в очереди
        System.out.println(linkList);
    }

    private static void add(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    private static int top(LinkedList<Integer> list) {
        int num = 0;
        num = list.getFirst();
        return num;
    }

    private static int remove(LinkedList<Integer> list) {
        int num = 0;
        num = list.getFirst();
        list.removeFirst();
        list.addFirst(num);
        return num;
    }
}


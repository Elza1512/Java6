package homework6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        // 1.
        System.out.println("\n1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts:");
        Set<Integer> hs = new HashSet<>();
        Set<Integer> lhs = new LinkedHashSet<>();
        Set<Integer> ts = new TreeSet<>();
        System.out.println(hs + " - HashSet (hs)\n" + lhs + " - LinkedHashSet (lhs)\n" + ts + " - TreeSet (ts)");
        // 2.
        System.out.println("\n2. Добавить в множества по 10 случайных целочисленных ключей:");
        hs.addAll(rndmList(10));
        lhs.addAll(rndmList(10));
        ts.addAll(rndmList(10));
        System.out.println("hs: " + hs + "\nlhs: " + lhs + "\nts: " + ts);
        // 3.
        System.out.println(
                "\n3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs:");
        System.out.println("hs: " + removeElementSet(hs, lhs));
        // 4.
        System.out.println(
                "\n4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts:");
        System.out.println("lhs: " + addElementSet(lhs, ts));
        // 5.
        System.out.println(
                "\n5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1 15 случайными числами и вывести на печать:");
        Set<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return int1 == int2 ? 0 : int2 % 2 == 0 ? -1 : 1;
            }
        });
        ts1.addAll(rndmList(15));
        System.out.println("ts1: " + ts1 + "\n");
    }

    // 2.
    private static List<Integer> rndmList(int sizeList) {
        List<Integer> rndList = new ArrayList<>();
        while (rndList.size() < sizeList) {
            rndList.add((int) (Math.random() * 100));
        }
        return rndList;
    }

    // 3.
    private static Set<Integer> removeElementSet(Set<Integer> hs, Set<Integer> lhs) {
        hs.removeAll(lhs);
        return hs;
    }

    // 4.
    private static Set<Integer> addElementSet(Set<Integer> lhs, Set<Integer> ts) {
        lhs.addAll(ts);
        return lhs;
    }

}
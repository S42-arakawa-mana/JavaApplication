package lesson11;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionSample {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        //最初の要素を取得
        int firstItem = arrayList.getFirst();
        // 最後の要素を取得
        int lastItem = arrayList.getLast();

        System.out.println(firstItem);
        System.out.println(lastItem);
    }
}
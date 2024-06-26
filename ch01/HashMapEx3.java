package ch01.map;

import java.util.HashMap;
import java.util.Iterator;
public class HashMapEx3 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        // put() 메소드를 이용한 요소의 저장
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
        for (String key : hm.keySet()) {
            System.out.println(String.format(
                    "Key : %s, Value : %s", key, hm.get(key)));
        }

        // remove() 메소드를 이용한 요소의 제거
        hm.remove("사십");
        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format(
                    "Key : %s, Value : %s", key, hm.get(key)));
        }
        // replace() 메소드를 이용한 요소의 수정
        hm.replace("이십", 200);
        System.out.println(hm);

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : " + hm.size());
    }
}

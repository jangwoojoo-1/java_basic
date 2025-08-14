package java_advanced_01.day15.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        //
        set.add(new Member("신세계", 30));
        set.add(new Member("신세계", 30));
        set.add(new Member("신세종", 30));

        System.out.println(set.size());

        Iterator<Member> iterator = set.iterator();

        while(iterator.hasNext()){
            Member member = iterator.next();
            System.out.println(member.name + " " + member.age);
        }
        System.out.println();

        for (Member member : set) {
            System.out.println(member.name + " " + member.age);
        }
    }
}

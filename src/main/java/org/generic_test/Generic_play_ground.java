package org.generic_test;

import org.junit.Test;
import org.protected_test.Animal;
import org.protected_test.Tiger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * extends 规定泛型的上限，super 规定泛型的下限
 * extends 只能遍历，不能添加，
 * super只能添加，遍历其中的对象的类型只能是Object
 */
public class Generic_play_ground {



    @Test
    public void addChild() {
        List<? extends Animal> list = new ArrayList<>();
//        list.add(new Tiger());
//        list.add(new Creture());
    }

    @Test
    public void iterateChild() {
        List<? extends Animal> tigers = Arrays.asList(new Tiger(), new Tiger(), new Tiger());
        for (Animal tiger : tigers) {
            System.out.println(tiger);
        }
    }

    @Test
    public void superAddChild() {
        List<? super Animal> list = new ArrayList<>();
        list.add(new Tiger());
        list.add(new Tiger());
        for (Object o : list) {
            System.out.println((Tiger)o);
        }
    }
}

package org.protected_test;

import org.another.Fish;
import org.junit.Test;

public class PlayGround {



    @Test
    public void samePack() {
        Tiger tiger = new Tiger();
        tiger.publicSay(tiger.publicName);
        tiger.protectedSay(tiger.protectedName);
        tiger.defaultSay(tiger.defaultName);
    }

    @Test
    public void anotherPack() {
        Fish fish = new Fish();
        fish.publicSay(fish.publicName);
        fish.protectedSay(fish.protectedName);
    }

}

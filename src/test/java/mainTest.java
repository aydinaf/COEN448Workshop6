/*
    COEN 448 - Winter 2023
    Workshop Week 6

    Keeano Gerald 40095571
    Savvas Sideris 40129938
    Kleard Mama 40088019
    Aydin Azari Farhad 40063330
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    @Test
    public void test1() {
        int testArr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            testArr[i] = i + 10;
        }
        //main.pairsOfSocks(testArr);
        assertEquals(main.pairsOfSocks(testArr),0);
    }
}
// COEN 448 - Winter 2023
// Workshop Week 6


import java.util.HashMap;
import java.util.Map;

public class main {
    static int pairsOfSocks(int[] array) {

        Map<Integer, Integer> socks = new HashMap<>();


        for (int sock : array) {

            if (socks.containsKey(sock)) {

                int count = socks.get(sock);

                count++;

                socks.put(sock, count);

            } else {

                socks.put(sock, 1);

            }

        }

        int pairs = 0;

        for (int value : socks.values()) {

            pairs += value / 2;

        }


        return pairs;

    }
}

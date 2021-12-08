package work13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author e.a.vlasov
 */
public class Solution {

    class Pair<K,V> {
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static <T> List<T> newArrayList(T... items) {
        return new ArrayList<>(Arrays.asList(items));
    }

    public static <T> HashSet<T> newHashSet(T... items) {
        return new HashSet<>(Arrays.asList(items));
    }

    public static <K, V> HashMap<K,V> newHashNap(Pair<K,V>... pairs) {
        HashMap<K,V> hashMap = new HashMap<>();
        for(Pair<K, V> pair: pairs)
            hashMap.put(pair.key, pair.value);
        return hashMap;
    }
}

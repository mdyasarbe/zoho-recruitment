import java.util.HashMap;
import java.util.*;

public class LRUCache {

    static List<Integer> cache;
    static HashMap<Integer, Integer> hash;

    static int CacheSize;

    public static void set(int i, int j) {

        if (cache.size() > CacheSize) {
            int x = cache.get(0);
            cache.remove(0);
            hash.put(x, -1);

            cache.add(i);
            hash.put(i, j);
        } else {
            cache.add(i);
            hash.put(i, j);
        }

    }

    public static int get(int i) {

        if (hash.containsKey(i)) {
            int x = 0;
            for (x = 0; x < cache.size(); x++) {
                if (cache.get(x) == i) {
                    break;
                }
            }
            cache.remove(x);
            cache.add(i);

            return hash.get(i);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Tc = sc.nextInt();

        while (Tc > 0) {
            cache = new ArrayList<Integer>();
            hash = new HashMap<>();
            int n = sc.nextInt();
            CacheSize = n;
            int noQ = sc.nextInt();
            while (noQ > 0) {
                String q = sc.next();
                int x = sc.nextInt();
                int y = -1;
                boolean isSet = "SET".equals(q) ? true : false;
                if (isSet) {
                    y = sc.nextInt();

                    set(x, y);
                }
                if (!isSet) {
                    System.out.print(get(x) + " ");
                }
                noQ--;
            }

            Tc--;
        }
    }

}
/*
 * 2 7 SET 1 2 SET 2 3 SET 1 5 SET 4 5 SET 6 7 GET 4 GET 1
 * 
 */
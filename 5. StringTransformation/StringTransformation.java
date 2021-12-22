import java.util.*;

public class StringTransformation {
    public static int numOfOperations(String str1, String str2) {
        if (str1.length() != str2.length())
            return -1;

        int i, j, op = 0;
        int cnt[] = new int[256];
        for (i = 0; i < str1.length(); i++) {
            cnt[str1.charAt(i)]++;
            cnt[str2.charAt(i)]--;
        }
        for (i = 0; i < 256; i++)
            if (cnt[i] != 0)
                return -1;

        i = str1.length() - 1;
        j = str2.length() - 1;

        while (i >= 0) {
            if (str1.charAt(i) != str2.charAt(j))
                op++;
            else
                j--;
            i--;
        }
        return op;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            System.out.println(numOfOperations(str1, str2));
            T--;
        }

    }
}

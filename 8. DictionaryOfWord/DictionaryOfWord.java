import java.util.*;

class DictionaryOfWord {
    public static void wordBreak(List<String> dict, String word, String out) {
        if (word.length() == 0) {

            System.out.print("(" + out + ")");
            return;
        }

        for (int i = 1; i <= word.length(); i++) {
            String prefix = word.substring(0, i);
            String str = "";
            if (out == "") {
                str = prefix;
            } else {
                str = out + " " + prefix;
            }
            if (dict.contains(prefix)) {
                wordBreak(dict, word.substring(i), str);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase > 0) {
            List<String> dict = new ArrayList<>();
            int numOfWords = sc.nextInt();
            int j = 0;
            while (j < numOfWords) {
                String str = sc.next();
                dict.add(str);
                j++;
            }
            String word = sc.next();
            wordBreak(dict, word, "");
            testCase--;
        }
    }
}

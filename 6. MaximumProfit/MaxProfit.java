import java.util.*;

class MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase > 0) {
            int n = sc.nextInt();

            int i;
            int start=0,preVal=0;
            for(i=0;i<n;i++){
                int val = sc.nextInt();
                if(val<preVal){
                    System.out.print("("+ start+" "+i+")");
                    start= i;
                }
                if(i==n-1&& val>preVal){
                    System.out.print("("+ start+" "+i+")");
                }

                preVal=val;
            }
            System.out.println();

            testCase--;
        }
    }
}

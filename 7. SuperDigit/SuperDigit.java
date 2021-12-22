import java.util.Scanner;
public class SuperDigit
{
    static int superDigit(String number, int k) {
        if (number.length() > 1)
        {
            long sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
                sum += number.charAt(i)-'0';
            }
            return superDigit(String.valueOf(sum * k), 1);
        }
        else
            return number.charAt(0)-'0';

    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    String n=sc.next();
	    int k=sc.nextInt();
        int ans=superDigit(n, k);
        System.out.println(ans);
	}
}


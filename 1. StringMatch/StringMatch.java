import java.util.Scanner;

class StringMatch 
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String pattern = sc.nextLine();
        System.out.println(FindMatch(string, 0, pattern, 0) ? 1 : 0);
    }
    public static boolean FindMatch(String s, int i, String p, int j)
    {
        if (i == s.length() && j == p.length())
        { 
            return true;
        }
        if (j == p.length()) {
            return false;
        }
        if (i == s.length())
        {
            for (int k = j; k < p.length(); ++k) 
            {
                if (p.charAt(k) != '*') 
                {
                    return false;
                }
            }
            return true;
            
        }
        
        if (p.charAt(j) == '*')
        {
            return FindMatch(s, i + 1, p, j) || FindMatch(s, i, p, j + 1);
        }
        else
        {
            if (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))
            {
                return FindMatch(s, i + 1, p, j + 1);
            }
            return false;
        }
    }
}

/*
baaabab
*aabab
*/
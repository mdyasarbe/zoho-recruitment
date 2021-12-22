import java.util.*;

class PrintWordsInBetween{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String sentence=sc.nextLine();
        String word= sc.nextLine();

        String sentenceArray[]= sentence.split("\\s+");
        String wordArray[]= word.split("\\s+");

        String op="";
        String currentRequiredWord=wordArray[0];
        int k=0;
        boolean matchFound = false;

        for(String x : sentenceArray){
            if(x.equals(currentRequiredWord)&& ! matchFound){
                matchFound =true;
                if(k<wordArray.length-1){ 
                    currentRequiredWord= wordArray[++k];
                }
                continue;
            }
            if(x.equals(currentRequiredWord) && matchFound){
                matchFound= false;
                if(k<wordArray.length-1){ 
                    currentRequiredWord= wordArray[++k];
                }
            }

            if(matchFound){
                op += x+" ";
            }
        } 

        if(op.length()>0){
            System.out.println(op);
        }
        else{
            System.out.println("Empty");
        }
    }
}

/*
hello world how are you Im fine how about you
world you how you
*/
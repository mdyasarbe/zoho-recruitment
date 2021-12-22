import java.util.*;

class SumOfContinousSubArray {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int testCase=sc.nextInt();
        while(testCase>0){
           int n= sc.nextInt();
           int x=0,y=0;
           int expsum = sc.nextInt();

           int ar[]= new int[n];
           int i,j;
           for(i=0;i<n;i++){
               ar[i]=sc.nextInt();
           }
           boolean isSumFound= false;
           for(i=0;i<n;i++){
               int sum = ar[i];
               if(sum==expsum){
                isSumFound = true;
                   x=i;
                   y=i;
                   break;
               }
               if(sum>expsum){
                    continue;
                }
               for(j=i+1;j<n;j++){
                   sum+= ar[j];

                   if(sum>expsum){
                       break;
                   }
                   if(sum==expsum){
                        x=i;
                        y=j;
                        isSumFound= true;
                        break;
                   }

               }
               if(isSumFound){
                   break;
               }
            }
            System.out.println("Answer: "+(isSumFound ? ((x+1)+" "+(y+1)):"Sum is not possible"));

            testCase--;
        }
    }
}
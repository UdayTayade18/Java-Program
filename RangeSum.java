import java.util.*;
class RangeSum {
    public static void main(String[]argss){
        int array[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int N=10;
        int Q=3;
        //prifixSum
        int Psarray[]=new int[N];
        Psarray[0]=array[0];
        for(int i=1;i<N;i++){
            Psarray[i]=Psarray[i-1]+array[i];
        }
        //queries
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<Q;i++){
            int StartingIndex=sc.nextInt();
            int EndingIndex=sc.nextInt();
            if(StartingIndex==0){
                sum=Psarray[EndingIndex];
            }else{
                sum=Psarray[EndingIndex]-Psarray[StartingIndex-1];
                System.out.println(sum);
            }
        }

    }
    
}

import java.util.*;
class ArrayDemo8 {
    public static void main(String[]args){
        int array[]=new int[]{2,3,4,5,7,4,9};
        int Q=3;
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<Q;j++){
            int sum=0;
            int startIndex=sc.nextInt();
            int endIndex=sc.nextInt();
            for(int i=startIndex;i<=endIndex;i++){
                sum=sum+array[j];
                
            }
            System.out.println(sum);
        }
    }
}
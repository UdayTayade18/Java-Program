import java.util.*;
class ArrayDemo5 {
    //odd elemnt sum
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre array Size: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Entre elemrnt in array: ");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2!=0){
                System.out.println(sum=sum+array[i]);
            }
        }
    }
    
}

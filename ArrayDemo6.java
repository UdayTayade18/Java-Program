import java.util.*;
class ArrayDemo6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre size of array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Entere array element:");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<10){
                System.out.println(array[i]+" less than 10");

            }
        }
    }
    
}

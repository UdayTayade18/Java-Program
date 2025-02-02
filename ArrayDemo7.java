import java.util.*;
class ArrayDemo7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre size of array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Entre araay Element:");
            array[i]=sc.nextInt();
        }
        System.out.println("Arraay Element are: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%4==0){
                System.out.println(array[i]+" is divisible by 4 Index "
                +i);
            }
        }
    }
    
}

import java.util.*;
class ArrayDemo2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter array Element: ");
            array[i]=sc.nextInt();
        }
        System.out.println("Array Elemnt are: ");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
            
        }
    }
}
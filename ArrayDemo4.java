import java.util.*;
class ArrayDemo4 {
    public static void main(String[]args){
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("enter Array Element: ");
            array[i]=sc.nextInt();
        }
        System.out.println("Araay element are:");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}

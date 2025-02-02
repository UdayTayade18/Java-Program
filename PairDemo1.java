class PairDemo1 {
    public static void main(String[]args){
        char array[]=new char[]{'a','b','e','g','a','g'};
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]=='a'&&array[j]=='g'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}

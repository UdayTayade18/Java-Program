class pair {
        public static void main(String[]args){
            char array[]=new char[]{'a','b','e','g','a','g'};
            int count=0;
            int pair=0;
            for(int i=0;i<array.length;i++){
                if(array[i]=='a'){
                    count++;
                }else if(array[i]=='g'){
                    pair=pair+count;
                }
            }
            System.out.println(pair);
        
    }
    
}   


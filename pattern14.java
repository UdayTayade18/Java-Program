class pattern14 {
    public static void main(String[]args){
        int x=26;
        char ch='Z';
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4;j++){
            if(j%2==0){
                System.out.print(" "+ch--);
            }else{
                System.out.print(" "+x--);
            }

        }
        System.out.println();
    }
    }
}

public class subbarray {
    public static void subbarray1(int number[]) {
        int tp=0;
        for(int i=0;i<number.length;i++){
            for(int j =i;j<number.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(number[k]+" "); 
                }
                tp++;
                System.out.println();
            }
            System.out.println();
           
        }
        System.out.println("total subbarray ="+tp);
        
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};
        subbarray1(number);
    }
    
}

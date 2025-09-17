public class subbarraysum {
    public static void subbarraysum1(int number[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<number.length;i++){
            for(int j =i;j<number.length;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    sum +=number[k];
                }
                System.out.println(sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
               
            }
        }
        System.out.println("TOTAL="+maxsum);
            }


    
    public static void main(String[] args) {
        int number[]={1,2,3,4};
        subbarraysum1(number);

    }
    
}

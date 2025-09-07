public class greater {
    public static int getlargest(int numbers[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(Largest<numbers[i]){
            Largest =numbers[i];
            }
        }
        return Largest;

    }
    public static void main(String[] args) {
        int numbers[]={10,5,20,6,70,90,65,54,99};
        System.out.println("largest value is:"+getlargest(numbers));
    }
    
}

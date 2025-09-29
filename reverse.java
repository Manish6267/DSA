public class reverse {
    public static void reverse1(int number[]) {
        int first=0, last =number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int number[]={5,20,30,40,50};
        reverse1(number);
        for(int i=0;i<number.length;i++){
            System.out.print(" "+number[i]);
        }
        System.out.println();
    }
    
}

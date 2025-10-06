public class binarysearch {
    public static int getbinary(int numbers[],int key){
        int start=0,end =numbers.length-1;
        while(start<=end){
            int mid =(start+end)/2;
            if(numbers[mid]==key){
                return mid;

            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;

            }
        }
        return-1;
    } 
    public static void main(String[] args) {
        int numbers[]={10,45,60,2,5,90};
        int key=5;
        System.out.println("number is greater="+getbinary(numbers, key));
    }   
}

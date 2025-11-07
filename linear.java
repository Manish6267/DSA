public class linear {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
        
    }

    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,10,20,30,40,50};
        int key=55;
            System.out.println("key found __"+linearsearch(numbers, key));
       
    }
    
}

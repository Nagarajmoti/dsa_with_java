public class linearsearchalgo{
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int findLargest(int numbers[]){
        int largestnum=Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (largestnum < numbers[i]) {
                largestnum = numbers[i];
                
                
            }
            if (smallest > numbers[i]) {
                smallest =numbers[i];
                
            }
        }
        System.out.println("The samllest element in array is "+smallest);
        return largestnum;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,4,10,12,100,16};
        int key =10;
        int index =linearSearch(numbers, key);
        if(index ==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("key is at index "+index);
        }
        int large =findLargest(numbers);
        System.out.println(large);

    }
}
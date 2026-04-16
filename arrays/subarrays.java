public class subarrays{
    public static void printsubarry(int numbers[]){
        int n =numbers.length;
        int total_subarray=n*(n+1)/2;
        int sum_of_subarray[] = new int[total_subarray];
        int f=0;

        
        for(int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=0;j<numbers.length;j++){
                int end =j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    sum =sum+numbers[k];   
                }
                if(sum>0){
                    sum_of_subarray[f]=sum;
                    f++;

                }
                
              
                System.out.print("sub arry sum is "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(sum_of_subarray.length);
        for(int i=0;i<sum_of_subarray.length;i++){
            System.out.print(sum_of_subarray[i]+" ");
        }
        int largestnum=Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<sum_of_subarray.length;i++){
            if (largestnum < sum_of_subarray[i]) {
                largestnum = sum_of_subarray[i];
                
                
            }
            if (smallest >sum_of_subarray[i]) {
                smallest =sum_of_subarray[i];
                
            }
        }
        System.out.println();
        System.out.println("The samllest element in array is "+smallest);
        System.out.println("The samllest element in array is "+largestnum);
        
        
       

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printsubarry(numbers);
    }
}
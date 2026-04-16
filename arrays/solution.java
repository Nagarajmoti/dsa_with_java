public class solution{
    public static void main(String[] args) {
        int nums [] ={1,2,3,4};
        int n =nums.length;
        System.out.println(n/2);
        if(n%2 !=0){
            System.out.println(nums[n/2]);
        }
        else{
            int median = nums[n/2];
            int median1 =nums[(n/2)-1];
            // System.out.println((n/2)+1);
            // System.out.println((n+1)/2);
            System.out.println(median+" "+median1);
        }
        
    }
}
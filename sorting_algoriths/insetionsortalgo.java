public class insetionsortalgo{
    public static void insertionsort(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr =nums[i];
            int prev=i-1;
            // find out the correct postion to insert
            while (prev>=0 && nums[prev]>curr) {
                nums[prev+1] =nums[prev];
                prev--;
                
            }
            // insertion of elements is occuring
            nums[prev+1] =curr;

        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] ={5,4,1,3,2};
        insertionsort(nums);
    }
}
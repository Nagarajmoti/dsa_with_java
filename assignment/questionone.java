public class questionone{
    public static boolean atleasttwo(int nums[]){
        boolean istrue =false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    istrue =true;
                }
            }

        }
        return istrue;

    }
    public static void main(String[] args) {
        // Given an integer array nums, return true if any value appears at least twice in the array, 
        // and return false if every element is distinct
        int nums[]={1,2,3,4,5,6,7,8,9};
        System.out.println(atleasttwo(nums));

    }
}
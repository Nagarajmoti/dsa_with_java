public class bubblesort{
    public static void bubblesort(int nums[]){
        for(int turn=0;turn<nums.length;turn++){
            int swap=0;
            for(int j=0;j<nums.length-turn-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp =nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]=temp;
                    swap++;
                }
            }
             System.err.println(swap);
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
       
        System.out.println(' ');

    }
    public static void main(String[] args) {
        int nums[]={5,4,1,2,3};
        bubblesort(nums);

    }
}
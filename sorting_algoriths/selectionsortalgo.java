public class selectionsortalgo {
    public static void selectionsort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int min =i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[min]>nums[j]){ // decreasing order sorting use less than symbol in if statement
                    min =j;
                }

            }
            int temp =nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]+" ");
        }

    }
    public static void main(String[] args) {
        int nums[] ={5,4,1,3,2};
        selectionsort(nums);
    }
}

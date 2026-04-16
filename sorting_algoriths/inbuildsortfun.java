import java.util.*;
public class inbuildsortfun {
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        Arrays.sort(nums); // sorted array is in increassing oreder
        Arrays.sort(nums,0,3);
        Integer num[]={5,4,1,3,2};
        // Integer is used because reverseOrder is for objects only
        Arrays.sort(num,Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.print(num[i]+" ");
        }
        
        
      
    }
    
}

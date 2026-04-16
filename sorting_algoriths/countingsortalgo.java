public class countingsortalgo {
    public static void countingsort(int numbers[]){
        int largest =Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            largest =Math.max(largest, numbers[i]);
        }
        int count[]= new int[largest+1];
        for(int i=0;i<numbers.length;i++){
            count[numbers[i]]++;
            System.out.print(count[i]+" ");

        }
        // sorting 
        int j=0;
        for(int i=0;i<numbers.length;i++){
            while(count[i]>0){
                numbers[i]=j;
                j++;
                count[i]--;
            }

        }
    System.out.println();
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
    public static void main(String args[]){
        int numbers[]={1,4,1,3,2,4,3,7};
        countingsort(numbers);
    }
    
}

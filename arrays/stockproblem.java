public class stockproblem{
    public static void totalprofit(int prices[]){
        int n=prices.length;
        System.out.println(n);
        int profitarray[] =new int[n+1];
        int smallest =Integer.MAX_VALUE;
        int largest =Integer.MIN_VALUE;
        profitarray[0]=0;
        for(int i=1;i<n;i++){
            int sp = prices[i];
            for(int j=0;j<i;j++){
                if (smallest >prices[j]) {
                   smallest =prices[j];
                //    System.out.print(smallest+" ");
 
                   }
                int profit = sp-smallest;
                if (profit>0) {
                    profitarray[i]=profit;
                    
                }
                else{
                    profitarray[i]=0;
                }
                

            }
        }
        for(int i=0;i<n;i++){
            if(largest<profitarray[i]){
                largest=profitarray[i];
            }
        }
        System.out.println(largest);
         
    }
    public static void main(String[] args) {
        int prices [] ={7,1,5,3,6,4};
        totalprofit(prices);
    }
}
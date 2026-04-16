public class rainwaterproblem{
    public static int trappedrainwater(int heights[]){
        int n =heights.length;
        int leftMaxheight[] =new int[n];
        int rightMaxheight[] =new int[n];
        leftMaxheight[0]=heights[0];
        for(int i=1;i<n;i++){
            leftMaxheight[i]= Math.max(leftMaxheight[i-1],heights[i]);
        }
        rightMaxheight[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightMaxheight[i]=Math.max(rightMaxheight[i+1],heights[i]);
        }
        int total_trapedwater =0;
        for(int i =0;i<n;i++){
            int waterlevel =Math.min(leftMaxheight[i], rightMaxheight[i]);
            total_trapedwater+=waterlevel-heights[i];
        }
        return total_trapedwater;
    }
    public static void main(String[] args) {
        int heights[] ={4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(heights));

    }
}
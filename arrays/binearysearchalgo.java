public class binearysearchalgo{
    public static int binarySearch(int num[],int key){
        int start=0;
        int end =num.length-1;
        while(start<=end){
          int   mid =(start+end)/2;
          if(num[mid]==key){
            return mid;
          }
          if(num[mid]<key){
            start =mid+1;
          }else{
            end =mid-1;
          }
        }
        return -1;
    }
    public static void reverseArray(int num[]){
        int n=num.length-1;
        for(int i=0;i<n/2;i++){
            int temp =num[n-i];
            num[n-i] = num[i];
            num[i]=temp;

        }
       
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println(binarySearch(num, key));
        reverseArray(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        

    }
}
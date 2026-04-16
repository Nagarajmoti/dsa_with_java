public  class sumofdigit{
   
    public static void sumofdigits(int num){
        int mynum=num;
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum =sum+rem;
            num=num/10;
        }
        System.out.println("The sum of digit of "+ mynum+ " is " +sum);

    }
    public static void main(String[] args) {
        sumofdigits(35);
        
    }
}
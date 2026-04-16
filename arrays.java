import java.util.*;
public class arrays{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            // passing an elements in array means the values passed with refernces
            // it means that any changes update function will reflect in the main function
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int marks[] = new int[n];
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        update(marks);
        System.out.println("Physics marks is "+ marks[0]);
        System.out.println("chemisty marks is "+ marks[1]);
        System.out.println("maths marks is "+ marks[2]);


    }
}
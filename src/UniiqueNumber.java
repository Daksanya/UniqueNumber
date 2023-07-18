import java.util.Scanner;

public class UniiqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrray=new int[n];
        int result=0;
        for (int i=0;i<n;i++){
            arrray[i]= sc.nextInt();
        }
        for (int i=0;i<n;i++){
            result=result^arrray[i];
        }
        System.out.println(result);
    }
}

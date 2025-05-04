import java.util.Scanner;
public class a1hq2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of lines to input");
        int n=sc.nextInt();
        String ar[]= new String[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextLine();
        }
        for (int i = ar.length-1; i >= 0; i++) {
            System.out.println(ar[i]);

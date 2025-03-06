
import java.util.Scanner;

public class a1hq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={1,2,3,4,5};
        int b[]={3,-2,4,-1,-7};
        int c[]= new int[5];
        for (int i = 0; i < c.length; i++) {
            c[i]=a[i]*b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }

    }
}

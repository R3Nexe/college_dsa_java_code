
public class sumdigit {

    /* public static int sumdig(int num){
        int sum=0;
        while (num>0){
            int dig=num%10;
            sum+=dig;
            num/=10;
        }
        return sum;
    }*/
    public static void main(String[] args) {
        int num = 231;

        //RECURSION METHOD
        /*while(num>9){
            num=sumdig(num);
        }
        System.out.println(num);*/


        while (num > 9) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            num = sum;
        }
        System.out.println(num);
    }

}

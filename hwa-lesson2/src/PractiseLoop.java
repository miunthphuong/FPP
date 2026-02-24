import java.util.Scanner;

public class PractiseLoop {
    public static void main(String[] args) {
        questionB();
    }

    static void questionA(){
        int n = new Scanner(System.in).nextInt();
        double sum=0;

        for (int i = 0,step=1; i<n ; i++,step+=2) {
            if( i%2==0 )
                sum+= 1.0/step;
            else
                sum-= 1.0/step;
        }

        IO.println(sum);
    }

    static void questionB(){
        int n = new Scanner(System.in).nextInt();
        double sum=0;

        for (int i = 0,step=2; i<n ; i++,step*=2) {
            if( i%2==0 )
                sum+= (i+1.0)/step;
            else
                sum+= (i+1.0)/step;
        }

        IO.println(sum);
    }

}

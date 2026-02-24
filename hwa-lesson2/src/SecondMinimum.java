


public class SecondMinimum {
    public static void main(String[] args) {
        secondMin(  new int[] {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22} );
//        secondMin(  new int[] {1,2,3,4,5} );
//        secondMin(  new int[] {5,4,3,2,1} );
     }


    public static void secondMin(int[] arrayOfInts){

        int min = arrayOfInts[0], secondMin = arrayOfInts[1];

        if(secondMin<min)
        {
            int temp = secondMin;
            secondMin = min;
            min = temp;
        }

        for(int n:arrayOfInts)
        {
            if(n<min)
            {
                secondMin = min;
                min = n;
            }
            else if(n >min && n<secondMin )
            {
                secondMin=n;
            }
        }


        IO.println(secondMin);
     }
}

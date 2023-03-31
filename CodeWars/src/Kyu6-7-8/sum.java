package Kyu8;

public class sum {
    public static int sum(int[] arr){
        int positiveSum=0;
        for (int i=0; i<arr.length;i++){
            if(arr[i]>0)
                positiveSum+=arr[i];
        }

        return positiveSum;
    }


}

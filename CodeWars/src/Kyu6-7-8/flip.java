package Kyu8;
import java.util.Arrays;

public class flip {
    public static void main(String[] args) {

    }
    public static int[] flip(char dir, int[] arr) {
        switch (dir){
            case 'R':
                Arrays.sort(arr);
                break;
            case 'L':
            {
                for (int i=0; i<arr.length-1;i++){
                    for(int j=arr.length-1;j>i;j--){
                        if(arr[j-1]<arr[j]){
                            int temp=arr[j-1];
                            arr[j-1]=arr[j];
                            arr[j]=temp;
                        }
                    }
                }
                return arr;
            }
        }
        return arr;
    }

}

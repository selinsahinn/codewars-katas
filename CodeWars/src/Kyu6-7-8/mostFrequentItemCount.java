package Kyu8;

public class mostFrequentItemCount {

    public static int mostFrequentItemCount(int[] collection) {
       int currentDigit=0;
       int count;
       int highestCount=0;

       for (int i=0;i< collection.length;i++){
           currentDigit=collection[i];
           count=0;

           for(int j=0;j<collection.length;j++){

               if (currentDigit==collection[j]) {
                   count++;

                   if (count > highestCount) {
                       highestCount = count;
                   }
               }
           }
       }

        return highestCount;


    }

}

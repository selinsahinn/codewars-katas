package Kyu8;

public class Multiple35 {

    public static int solution(int number) {
        int ans=0;
        if(number<0) return 0;
        else{
            for(int i=1; i<number; i++){
                if((i % 3== 0 || i%5==0)){
                    ans+=i;
                }

            }

            return ans;
        }

    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}

package Kyu8;

public class roman {
    public String solution(int n) {
        System.out.println("Integer: " + n);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(n >= values[i])
            {
                n = n - values[i];
                roman.append(romanLetters[i]);
            }
        }
        return roman.toString();
    }
}

package Kyu8;

public class isValid {
    public static boolean isValid(char[] walk) {
        int countN = 0;
        int countS = 0;
        int countW = 0;
        int countE = 0;
        if (walk.length!=10) {
            return false;
        }

        else {

            for (int i = 0; i < walk.length; i++) {
                char index = walk[i];
                switch (index) {
                    case 'n':
                        countN++;
                        break;
                    case 's':
                        countS++;
                        break;
                    case 'w':
                        countW++;
                        break;
                    case 'e':
                        countE++;
                        break;
                    default:
                }
            }
        }
        if (countE == countW && countN == countS) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}

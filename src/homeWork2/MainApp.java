package homeWork2;

public class MainApp {
    public static void main(String[] args) {
        within10and20(2, 5);
        isPositiveOrNegative(-1234);
        isNegative(-9);
        printWordNTimes("Nurs", 13);
        leapYear(2023);

    }


    public static boolean within10and20(int a, int b){
        int c = a + b;
        if (c >= 10 && c < 21){
            return true;
        } else{
            return false;
        }
    }
    public static void isPositiveOrNegative(int x){
        if (x >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрецательное");
        }


    }
    public static boolean isNegative(int y){
        if (y < 0){
            return true;
        } else {
            return false;
        }
    }
    public static void printWordNTimes( String word, int line) {

        for (int i = 0; i <7; i++) {
            System.out.println(line + " " + word);
        }
    }

    public static boolean leapYear(int y){
        if ((y % 4 == 0) || (y % 400 == 0 && y % 100 != 0)){
            return true;
        } else {
            return false;
        }

    }
}

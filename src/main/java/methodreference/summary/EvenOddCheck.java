package methodreference.summary;

public class EvenOddCheck {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int isEven2(int n) {
        return n % 2 == 0 ? n : 0;
    }
}

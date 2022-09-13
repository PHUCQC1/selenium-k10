package lession_2;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = ++a + b++;
        // prefix tinh truoc > right operand > assign result into left operand > postfix
        // cong postfix > tinh nhu binh thuong > cong prefix
        // a = 2
        // c = 4
        // b = 3

    }
}

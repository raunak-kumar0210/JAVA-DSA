package _07_Strings;

public class _01_PalindromeString {
    public static boolean pal(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String str = "Raunak";
        String str1 = new String("Kumar");
        String str2 = new String("noon");

        System.out.println(pal(str));
        System.out.println(pal(str1));
        System.out.println(pal(str2));

    }
}

package _02_Function;
public class _08_Func_Overloading{

    public static int findsum(int a, int b) {
        return a+b;
    }
    public static float findsum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(findsum(3,6));

        System.out.println(findsum(3.0f,6.0f));

    }
}
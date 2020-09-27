package basic;

public class Sum {
    public static void main(String[] args) {
        System.out.println(Sum());
    }

    public static int Sum() {
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            ans += i;
        }
        return ans;

    }
}

package reivews.reviews1;

public class Review5 {
    public static void main(String[] args) {
        int a = 10; int b = 20; int c = 10;
        System.out.println(a == b); //false
        System.out.println(a == c); //true
        System.out.println(a != b); //true
        System.out.println(a != c); //false
        System.out.println(a < b); // true
        System.out.println(a <= c); //true
        System.out.println(a > b); // false
        System.out.println(a >= c); //true
        System.out.println(a+ 10 == b);//true
        System.out.println(c + 10 < b + -5);//false
    }
}

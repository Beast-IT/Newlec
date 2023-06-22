package 방과후연습용.Jin;

public class String_ {
    public static void main(java.lang.String[] args) {
        java.lang.String str = "우리반짱이다";
        java.lang.String str2 = "우리반짱이다";

        java.lang.String str3 = new java.lang.String("우리반짱이다.");


        System.out.println(str.substring(2, 3));
        System.out.println(str.substring(2));

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));


        if (str == str2) {
            System.out.println("맞다.");
        }
        if (str.equals(str2)) {
            System.out.println("문자열도 같다.");
        }

        int length = str.length();
        str = str.replace("우", "아");

        System.out.println(str.indexOf("아"));
        System.out.println("     d   d    d d d    ".trim());//양쪽 끝 공백제거

    }
}

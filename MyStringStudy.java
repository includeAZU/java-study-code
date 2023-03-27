import java.util.Arrays;

//1.String 不可以被继承

public class MyStringStudy {
    public static boolean func(String str) {
        // 要有static

        char[] data = str.toCharArray();// 像数组一样访问,把字符串转换为数组
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (data[i] >= '0' && data[i] <= '9') {
                count++;
                if (count == str.length()) {
                    System.out.println(str.length());
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean func1(String str) {
        for (

                int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);// 像数组一样访问
            if (ch < '0' || ch > '9') {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        // 通过字节数组构建字符串
        byte[] bytes = { 97, 98, 99, 100 };
        String str = new String(bytes);
        System.out.println(str);
        // 字符串变成字节数组
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

    }

    public static void main2(String[] args) {

        String str = "1324566";
        boolean flag = func(str);
        System.out.println(flag);

    }

    public static void main1(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = new String("adsgg");//
        System.out.println(str2);
        // 数组转换为字符串
        char[] val = { '1', '2', '3' }; // 有逗号
        String str3 = new String(val);
        System.out.println(val);

        // 字符串转换为数组
        char[] data = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(data[i] + " ");

        }
    }
}

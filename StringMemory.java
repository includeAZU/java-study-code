import java.io.File;
import java.lang.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Scanner;

public class StringMemory {
    //字符串拼接
    //不会产生大量临时变量
    public static void main(String[] args) {
         StringBuilder stringBuilder=new StringBuilder();
         stringBuilder.append("sdf");
         stringBuilder.append("sdfg");
         System.out.println(stringBuilder);
    }


    // 字符串逆序
    public static char[] reversed_order(String str) {

        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length();
        while (left < right) {
            char tem = arr[left];

            arr[left] = arr[right - 1];
            arr[right - 1] = tem;
            left++;
            right--;

        }
        return arr;
        // return new String(arr);//可以这样返回字符串
    }

    public static void main16(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] a = reversed_order(str);
        System.out.println(Arrays.toString(a));

    }

    // 求长度
    public static void main15(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        System.out.println(a.length);// 6,是a的属性
        String str = "1232345";
        System.out.println(str.length());// 是方法
    }

    // 字符串拆分例子
    public static void main14(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();// 遇到空空格不结束
        String[] arr = str.split(" ");
        for (String string : arr) {
            System.out.print(string);
        }
    }

    // 字符串拆分例子
    public static void main13(String[] args) {
        String str1 = "192.168.2.1";
        String[] ab = str1.split("\\.");// 没有就全部才,空格不拆,要加转义字符
        // ".$|()[{^?*+\\"
        for (String a : ab) {
            System.out.println(a);
        }

        String str2 = "192\\168\\2\\1";// "\\"表示一个\
        String[] ac = str2.split("\\\\");// 没有就全部才,空格不拆,要加转义字符
        // ".$|()[{^?*+\\"
        for (String b : ac) {
            System.out.println(b);
        }
        String str3 = "192-168#123";//
        String[] al = str3.split(" |-|#");// 前面要加个空格
        // ".$|()[{^?*+\\"
        for (String b : al)// 字符串 要分割数组
        {
            System.out.println(b);
        }

    }

    // 字符串拆分
    public static void main12(String[] args) {
        String str1 = "sdf ghjs dfg hj";
        String[] ab = str1.split(" ");// 以空格分开
        for (String a : ab) {
            System.out.println(a);
        }

    }

    // 字符串的查找
    public static void main11(String[] args) {
        String str1 = "sdfghjsdfghj";
        System.out.println(str1.contains("sdf"));
        // 查找元素位置
        String str2 = "sdfghjsdfghj";
        System.out.println(str2.indexOf("gh"));
        System.out.println(str2.lastIndexOf("gh")); // 从后往前找
        System.out.println(str2.startsWith("s", 2));// 以什么开始
    }

    // 字符串的替换

    public static void main10(String[] args) {
        String str1 = "sdfghjsdfghj";
        String str2 = str1.replace('s', 'm');
        System.out.println(str2);
        String str3 = str1.replaceFirst("sd", "pp");// 只替换第一次找到的
        System.out.println(str3);
        // 字符串截取
        String str4 = str1.substring(1);// 截取第一个后面的
        System.out.println(str4);

    }

    // 字符串的比较
    public static void main9(String[] args) {
        String str1 = "hello";
        String str2 = "hell";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));// 忽略大小写
        System.out.println(str1.compareTo(str2));// 两字符串比较//结果:1//str1>str2,正数
    }

    // 字符与字符串之间的转化
    public static void main8(String[] args) {
        // 把字符数组内容转化为字符串
        char[] val = { 'a', 'd', 'w', 'q', 'f', 'r' };
        String str = new String(val, 1, 2);// 要转化数组,起点,偏移量
        System.out.println(str);
        // 把字符串内容转化为字符数组
        String str2 = "fgdtgyhj";
        char[] val2 = str2.toCharArray();
        System.out.println(Arrays.toString(val2));

    }

    public static void main7(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";
        // 利用反射--》自省的过程 反射
        Class cl = String.class;
        Field field = cl.getDeclaredField("value");
        field.setAccessible(true);
        char[] val = (char[]) field.get(str);
        val[0] = 'g';
        System.out.println(str);
    }

    public static void main6(String[] args) {// 字符串不可变
        String str = "hello";
        str = str + "word";// 变量加常量,编译时不会自动拼接成hello word
        str += "!!!";
        System.out.println(str);// 产生大量临时变量
    }

    // 比较字符串是否相等
    public static void main5(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);// 比较的是引用//false
        System.out.println(str1.equals(str2));// 比较的是字符串里面的内容//true
        String str3 = new String("hello").intern();// 查看常量池中是否有hello,
        // 如果有,把当前对象返回给str3
    }

    public static void func(String str1, char[] array) {
        str1 = "123456";
        array[0] = 'q';

    }

    public static void main4(String[] args) {
        String str1 = "hello";
        char[] val = { 's' };
        System.out.println(str1);// hello
        System.out.println(val);// s
        func(str1, val);// str1是常量,通过传参方式改不了
        System.out.println(str1);// hello
        System.out.println(val);// q
    }

    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = str1;
        System.out.println(str1); // hello
        System.out.println(str2);// hello
        str1 = "ABC";
        System.out.println(str1); // ABC
        System.out.println(str2);// hello
    }

    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = "hel" + "lo";// 有双引号,放常量池中//编译时变成了hello
        System.out.println(str1 == str2); // true
        String str3 = new String("hel") + "lo";
        System.out.println(str2 == str3); // false
    }

    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2); // false
        // str1,与str2 是引用类型,==比较的是地址
        String str3 = "hello";
        System.out.println(str1 == str3); // true
        // 在jdk1.7开始,常量池被挪到堆里了
        // 常量池里的数据不重复
        // str1 str2 str3 在栈上,因为是局部变量
        // new String str2 因为str1已经放常量池,所以引用str2的对象是放在堆里
        // str1 str3 放常量池里
    }
}

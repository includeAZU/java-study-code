import java.util.concurrent.atomic.AtomicMarkableReference;

public class Java_anomaly {
    public static void main1(String[] args) {
        // 数组下标越界异常
        char[] a = { 12, 13, 14 };
        System.out.println(a[4]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 4 out of bounds for length 3
        // at Java_anomaly.main(Java_anomaly.java:6)

    }

    // 访问空指针异常
    public int num = 10;

    public static void main2(String[] args) {
        Java_anomaly t = null;

        // System.out.println(t.num);
        // Exception in thread "main" java.lang.NullPointerException:
        // Cannot read field "num" because "t" is null
        // at Java_anomaly.main(Java_anomaly.java:17)
        try {
            System.out.println(t.num);
            System.out.println("不执行");
        } catch (NullPointerException F) {// 不推荐使用 exception ,这个是异常的父类
            System.out.println("访问空指针异常");
            F.printStackTrace(); // 打印栈追踪
        } finally {
            System.out.println("finally里的东西肯定会被执行,用于善后工作");

        }
        System.out.println("可以往下执行");

    }

    // 异常测试
    public static int func() {
        Java_anomaly t = null;

        try {
            System.out.println(t.num);
            return 1;
        } catch (NullPointerException F) {
            System.out.println("访问空指针异常");
            F.printStackTrace();
            return 2;
        } finally {
            return 3;
            // 不建议有return
        }

    }

    public static void main3(String[] args) {
        System.out.println(func());// 结果:3
    }

    // 抛出异常
    public static void func2() throws UnsupportedOperationException {// 说明这个函数会抛出异常
        int a = 0;
        if (a == 0) {
            throw new UnsupportedOperationException("a==0");// 抛出异常
            // 抛出异常
        }

    }

    public static void main4(String[] args) // throws UnsupportedOperationException
    {// 声明抛出异常
        try {
            func2();
        } catch (UnsupportedOperationException a) {
            a.printStackTrace();

        }

    }
    // 抛出异常练习

    public static void main6(String[] args)// 第一种方法 throws CloneNotSupportedException // 谁调用就就处理异常
    {

        Person person1 = new Person();

        try {
            Person person2 = (Person) person1.clone();
        } catch (CloneNotSupportedException a) {
            a.printStackTrace();
        }

    }

    public static void func3() throws MyException {// 声明抛出异常
        int a = 1;
        if (a == 0) {
            throw new MyException("a==0");

        }

    }

    public static void main(String[] args) {
        try {
            func3();
        } catch (MyException a) {
            a.printStackTrace();

        }
    }
}

class Person {
    int a = 10;
}

// 自定义异常
class MyException extends RuntimeException// 运行时报异常
{// 继承于RuntimeException
    public MyException(String a) {
        super();
        // 调用父类方法
    }

}
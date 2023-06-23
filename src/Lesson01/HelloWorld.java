package Lesson01;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(l);

        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);

        // 计算前N个自然数的和
        int n = 100;
        int sum = ((1 + n) * n) / 2;
        System.out.println(sum);    // 5050

        // 根据一元二次方程求根公式
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        double sqrt = Math.sqrt(b * b - 4 * a * c);
        double r1 = ((-b) + sqrt) / (2 * a);
        double r2 = ((-b) - sqrt) / (2 * a);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "Test Passed." : "Test Failed");
        // Test Passed.

    }
}

//    Hello World!
//    2147483647
//    -2147483648
//    2000000000
//    16711680
//    512
//    9000000000000000000

package day07_UnarayOperators;

public class PostPre {

    public static void main(String[] args) {

        int x = 2;
        int y = x++; // post increment: first passes current value
        System.out.println(x); //3
        System.out.println(y); //2

        int x2 = 2;
        System.out.println(x2++); //2
        System.out.println(x2); //3

        int x3 = 2;
        System.out.println(--x3);

        int x4 = 8;
        int y4 = x4--; // y4 = 8,
        System.out.println(y4);
        System.out.println(x4); // x4 = 7,


        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        // b =  -1 + 0 / - 1 * -1
        // b =  -1 + 0 * 1
        // b = -1 + 0 = -1
        System.out.println(b); // -1 (same as above breakdown)


        int A = 50;
        int B = --A + A++ + A-- + A++;
        //  B =  49 + 49 + 50 + 49 = 197
        System.out.println(B);

        int X = 4;
        int Y = X * 4 - X++;
        //  Y = 4 * 4 - 4
        //  Y = 16 - 4
        System.out.println(Y);

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        //  p = -101 * -101 / 100 + 100
        //  p = 10201 / 100 + 100
        //  p = 102 + 100 = 202
        System.out.println(p);


        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = -20 + -19 + 19 * 19 % 2
        //  W = -20 + -19 + 361 % 2
        //  W = -20 + -19 + 1
        //  W = -39 + 1 = -38
        System.out.println(W);



        int M = 300, N = 400;

        int U = ++M + N++ - M-- % 2 + --N % 2;
        //  U = 301 + 400 - 301 % 2 + 400 % 2
        //  U = 301 + 400 - 1 + 0
        //  U = 700
        System.out.println(U);

        int J = M + N - M * N + M / N;
        //  J = 300 + 400 - 300 * 400 + 300 / 400






    }
}

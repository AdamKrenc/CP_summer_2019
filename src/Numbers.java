public class Numbers {

    public static void main(String[] args) {
        float f1 = 455.3f;
        double dl = f1;
        //float f2 = d1;
        int a = 6;
        long b = a;
        int c = Long.valueOf(b).intValue();
        Long bb = Long.valueOf(a);
        int cc = bb.intValue();

        int i = 0;
        i++;
        i--;
        a = 8;
        a = i++;
        System.out.println(a);
        a = 8;
        a = ++i;
        System.out.println(a);

        //PI to the power of 2
        double res = Math.pow(Math.PI, 2);
        System.out.println(res);
        System.out.println(i);
        // the rest of the division by 7
        a = i % 7;
        System.out.println(a);



    }
}

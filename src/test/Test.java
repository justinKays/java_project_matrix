package test;

import tensor.Factory;
import tensor.Scalar;
import tensor.Vector;
import tensor.Matrix;

import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        Factory ff = new Factory();

        Scalar aa = ff.buildScalar("3.14");
        Scalar aa2 = ff.buildScalar("3.14");
        Scalar bb = ff.buildScalar(1,2);
        System.out.println("Scalar aa: "+aa+"   Scalar aa2: "+aa2+"   Scalar bb: "+bb+" 이거 범위 정해야함");
        System.out.println("aa equal to aa2: "+aa.equals(aa2));
        System.out.println("aa equal to bb: "+aa.equals(bb));
        System.out.println("aa compare aa2: ");
        System.out.println("aa compare bb: ");
        System.out.println();

        Vector cc = ff.buildVector(3, 2.2);
        System.out.println("===Vector cc");
//        System.out.println(cc.viewElement(0));
        System.out.println("size: "+cc.viewSize());
        System.out.println(cc);

        Vector cc2 = ff.buildVector(3, 2.2);
        System.out.println("===Vector cc2");
//        System.out.println(cc2.viewElement(0));
        System.out.println("size: "+cc2.viewSize());
        System.out.println(cc2);

        System.out.println("cc equal to cc2: "+cc.equals(cc2));
        System.out.println();

        Matrix dd = ff.buildMatrix(2, 3, 1.1);
        System.out.println("===Matrix dd");
//        System.out.println(dd.viewElement(0, 0));
        System.out.println("size: "+Arrays.toString((dd.viewSize())));
        System.out.println(dd);
        Matrix dd2 = ff.buildMatrix(2, 3, 1.1);
        System.out.println("===Matrix dd2");
//        System.out.println(dd2.viewElement(0, 0));
        System.out.println("size: "+Arrays.toString((dd2.viewSize())));
        System.out.println(dd2);
        Matrix ee = ff.buildMatrix(2, 3, 1.2);
        System.out.println("===Matrix ee");
//        System.out.println(ee.viewElement(0, 0));
        System.out.println("size: "+Arrays.toString((ee.viewSize())));
        System.out.println(ee);

        System.out.println("dd equal to dd2: "+dd.equals(dd2));
        System.out.println("dd equal to ee: "+dd.equals(ee));

        //해야되는 것:
        // 8, 11, 12, 16, 17~

    }
}

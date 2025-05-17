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
        Scalar bb = ff.buildScalar(1,2);
        System.out.println(aa+" "+bb);
        System.out.println();

        Vector cc = ff.buildVector(3, 2.2);
        System.out.println(cc.viewElement(0));
        System.out.println("size: "+cc.viewSize());
        System.out.println(cc);
        System.out.println();

        Matrix dd = ff.buildMatrix(2, 3, 1.1);
        System.out.println(dd.viewElement(0, 0));
        System.out.println("size: "+Arrays.toString((dd.viewSize())));
        System.out.println(dd);

    }
}

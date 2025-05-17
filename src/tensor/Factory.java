package tensor;

import java.math.BigDecimal;

public class Factory {
    public static Scalar buildScalar(String ss){
        return new ScalarImpl(ss);
    }

    public static Scalar buildScalar(int ii, int jj){
        return new ScalarImpl(ii, jj);
    }

    public static Vector buildVector(int nn, double dd){
        return new VectorImpl(nn, dd);
    }

    public static Matrix buildMatrix(int mm, int nn, double dd){
        return new MatrixImpl(mm, nn, dd);
    }
}

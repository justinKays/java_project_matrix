package tensor;

import java.math.BigDecimal;

class ScalarImpl implements Scalar {
    private final BigDecimal scalar;

    //01
    ScalarImpl(String ss) {
        scalar = new BigDecimal(ss);
    }

    //02
    ScalarImpl(double ii, double jj) {
        double randomVal = Math.random() * (jj - ii) + ii;
        scalar = BigDecimal.valueOf(randomVal);
    }

    @Override
    public BigDecimal getScalar() {
        return scalar;
    }

    //14
    @Override
    public String toString() {
        return scalar.toString();
    }

    //15 ing
    @Override
    public boolean equals(){
        return true;
    }

}

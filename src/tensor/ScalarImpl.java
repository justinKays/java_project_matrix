package tensor;

import java.math.BigDecimal;

class ScalarImpl implements Scalar, Cloneable {
    private final BigDecimal scalar;

    //01
    ScalarImpl(String ss) {
        this.scalar = new BigDecimal(ss);
    }

    //02
    ScalarImpl(double ii, double jj) {
        double randomVal = Math.random() * (jj - ii) + ii;
        this.scalar = BigDecimal.valueOf(randomVal);
    }

    @Override
    public BigDecimal getScalar() {
        return this.scalar;
    }

    //14
    @Override
    public String toString() {
        return scalar.toString();
    }

    //15
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Scalar ss = (Scalar) obj;
        return this.scalar.equals(ss.getScalar());
    }

//    16 ing
//    @Override
//    public int compareTo(Scalar ss){
//        return this.scalar.compareTo(ss.getScalar());
//    }

    //17 ing
    @Override
    public Scalar clone(){
        return null;
    }

}

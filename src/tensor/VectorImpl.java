package tensor;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class VectorImpl implements Vector{
    private final List<Scalar> vector;

    //03
    VectorImpl(int nn, double dd){
        this.vector = new ArrayList<Scalar>(nn);
        for(int i=0;i<nn;i++){
            this.vector.add(new ScalarImpl(Double.toString(dd)));
        }
    }

    //04
    VectorImpl(int nn, double ii, double jj){
        this.vector = new ArrayList<Scalar>();
        for(int i=0;i<nn;i++){
            double randomVal = Math.random()*(jj-ii) + ii;
            this.vector.add(new ScalarImpl(Double.toString(randomVal)));
        }
    }

    //05
    VectorImpl(double[] arr){
        this.vector = new ArrayList<Scalar>();
        for(double dd: arr){
            this.vector.add(new ScalarImpl(Double.toString(dd)));
        }
    }

    @Override
    public List<Scalar> getVector(){
        return this.vector;
    }

    //11 지정?
    @Override
    public Scalar viewElement(int ind){
        return this.vector.get(ind);
    }

    //13
    @Override
    public int viewSize(){
        return this.vector.size();
    }

    //14
    @Override
    public String toString(){
        return this.vector.toString();
    }

}

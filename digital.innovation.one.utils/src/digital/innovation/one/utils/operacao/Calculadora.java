package digital.innovation.one.utils.operacao;

import digital.innovation.one.utils.operacao.internal.DivHelper;
import digital.innovation.one.utils.operacao.internal.MultiHelper;
import digital.innovation.one.utils.operacao.internal.SubHelper;
import digital.innovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {

    private SumHelper sumhelper;
    private SubHelper subhelper;
    private MultiHelper multihelper;
    private DivHelper divhelper;

    public Calculadora(){
        sumhelper = new SumHelper();
        subhelper = new SubHelper();
        multihelper = new MultiHelper();
        divhelper = new DivHelper();
    }

    public int sum(int a, int b){
        return sumhelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subhelper.execute(a, b);
    }

    public int multi(int a, int b){
        return multihelper.execute(a,b);
    }

    public int div(int a, int b){
        return divhelper.execute(a,b);
    }
}

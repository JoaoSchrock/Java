package _7_11_intruducao_a_generics;

import java.util.List;

public class RetiraElementos  {

    public static  <T> T recuperarPrimeiro(List<T> list){
        return list.get(0);
    }
}

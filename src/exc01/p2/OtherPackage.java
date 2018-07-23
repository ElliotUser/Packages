package exc01.p2;

import exc01.p1.Protection;

public class OtherPackage {
    public OtherPackage(){
        Protection p = new Protection();
        System.out.println("конструктор из другого пакета");

        //System.out.println("n = "+ p.n);

        //System.out.println("n_pri = "+p.n_pri);

        //System.out.println("n_pro = "+p.n_pro);

        System.out.println("n_pub = "+p.n_pub);
    }
}

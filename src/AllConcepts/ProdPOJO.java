package AllConcepts;


import java.util.*;

class product{
    int pid; String pn;

    public product(int pid, String pn) {
        this.pid = pid;
        this.pn = pn;
    }

    public int getpid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }
    @Override
    public String toString(){
        return "{ProductId: " + pid + ", ProductName: '" + pn + "'}";
    }
}
public class ProdPOJO {

    public static void main(String[] args) {
        List<product> p = new ArrayList<>();
        p.add(new product(1, "hari"));
        p.add(new product(2, "Ram"));
        p.add(new product(3, "mani"));
        p.add(new product(4, "hitler"));
        p.add(new product(5, "love"));


        Collections.sort(p,Comparator.comparing(product ::getpn));
        for (product p1 : p) {
            System.out.println(p1);
        }
    }
}

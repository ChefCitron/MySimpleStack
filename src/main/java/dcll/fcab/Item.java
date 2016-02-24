package dcll.fcab;

/**
 * Created by M20110625 on 24/02/2016.
 */
public class Item {
    public int in;

    public Item(Item i){
        this.in = i.in;
    }

    public Item(int k){
        this.in = k;
    }
    public Item(){
        this.in =-1;
    }
}

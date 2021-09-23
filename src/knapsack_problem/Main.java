package knapsack_problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<> ();
        items.add (new Item ("tel1",19,10));
        items.add (new Item ("tel2",5,8));
        items.add (new Item ("tel3",5,8));
        items.add (new Item ("tel4",12,7));
        items.add (new Item ("tel5",3,6));
        items.add (new Item ("tel6",1,5));
        items.add (new Item ("tel7",2,2));

        Knapsack knapsack = new Knapsack (20);
        System.out.println ( knapsack.addItems (items));
    }
}

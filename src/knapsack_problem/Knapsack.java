package knapsack_problem;

import java.util.ArrayList;
import java.util.List;

public class Knapsack {
    List<Item> knapsackItems;
    final int maxWeight;

    public Knapsack(int maxWeight) {
        this.knapsackItems = new ArrayList<> ();
        this.maxWeight = maxWeight;
    }

    public int getTotalWeightOfItems(){
        int totalWeight = 0;
        for (Item item:knapsackItems) {
            totalWeight += item.getWeight ();
        }
        if (totalWeight > maxWeight){
            return -1;
        }
        return totalWeight;
    }

    public int getTotalPriceOfItems(){
        int totalPrice = 0;
        for (Item item:knapsackItems) {
            totalPrice += item.getPrice ();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Knapsack " + knapsackItems
                + ", totalWeight=" + getTotalWeightOfItems ()
                + ", totalPrice=" + getTotalPriceOfItems ()
                +", maxWeight=" + maxWeight;
    }

    public int addItems(List<Item> items){
        return recAddItems (items, items.size () -1, maxWeight);
    }

    private int recAddItems(List<Item> items, int index, int capacity){
        if (index == -1 || capacity == 0)
            return 0;
        if (items.get (index).getWeight () > capacity) {
            return recAddItems (items ,index - 1, capacity);
        } else return Math.max(recAddItems (items,index -1, capacity),
                items.get (index).getPrice () +
                        recAddItems (items,index-1,
                                capacity - items.get (index).getWeight ()));
    }
}

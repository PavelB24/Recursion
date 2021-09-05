import java.util.*;

public class Bag {
    private int maxWeight;
    private List<Item> itemList = new ArrayList<>();
    private Set<List<Item>> itemCombinations = new HashSet<>();

    public Set<List<Item>> getItemCombinations() {
        return itemCombinations;
    }


    public Bag(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void put(Item item) {
        itemList.add(item);
    }

    public Set<List<Item>> toFindCombo() {
        int startIndex = 0;
        toFind(itemList);
        return itemCombinations;
    }

    private void toFind(List<Item> items) {
        if(items.size()==1){
            return;
        }
        int weightIn=0;
        for (Item item: items) {
            weightIn+= item.getWeight();
        }
        if (weightIn<=maxWeight){
            itemCombinations.add(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> newItemList = new ArrayList<>(items);
            newItemList.remove(i);
            toFind(newItemList);
        }
    }


    }
// БЕСЦЕННЫЙ ОБРАЗЕЦ ГОВНОСПАГЕТТИКОДА... а ещё он не работает нихрена, быть может когда стану джуном, допишу

//    private void toFind2(int size) {
//        if (size == 0) {
//            return;
//        }
//        toFind2(size - 1);
//        List<Item> temp = new ArrayList<>();
//        int first = itemList.size() - size;
//        int weightIn = 0;
//        int prev=0;
//        for (int i = first; i < itemList.size(); i++) {
//            weightIn += itemList.get(i).getWeight();
//            if (weightIn <= maxWeight) {
//                temp.add(itemList.get(i));
//                 prev = i;
//            } else if (weightIn>maxWeight && i!=itemList.size()-1) {
//                weightIn -= itemList.get(i).getWeight();
//            } else if (weightIn>maxWeight && i==itemList.size()-1){
//                weightIn-=itemList.get(prev).getWeight();
//                if(weightIn <= maxWeight){
//                    List<Item> temp2= new ArrayList<>(temp);
//                    temp2.add(itemList.get(i));
//                    itemCombinations.add(temp2);
//                }
//            }
//        }
//        itemCombinations.add(temp);
//    }

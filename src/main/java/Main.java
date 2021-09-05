import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(simpleRecursion(16,4));
//ЗАДАЧА С РЮКЗАКОМ
        Bag bag = new Bag(10);
        bag.put(new Item("Монитор", 5, 2000));
        bag.put(new Item("Колонки", 2, 500));
        bag.put(new Item("Клавиатура", 1, 220));
        bag.put(new Item("Системный блок", 8, 8900));
        bag.put(new Item("UPS", 7, 1800));
        Set<List<Item>> getItemCombinations=bag.toFindCombo();
        System.out.println("Всего комбинаций " +bag.getItemCombinations().size());
        System.out.println(" ");
        int maxV=0;
        int maxAll=0;
        System.out.println("Комбинации: ");
        for (List<Item> itemList: getItemCombinations) {
            maxV=0;
            System.out.println(" ");
        for (Item item: itemList) {
            System.out.print(item.getName()+ " ");
            maxV+= item.getValue();
            if(maxV>maxAll){
                maxAll=maxV;
            }
        }

        }
        System.out.println(" ");
        System.out.println("Максимальная добыча вора: " + maxAll);


    }
    

    // ВОЗВЕДЕНИЕ ЧИСЛА В СТЕПЕНЬ РЕКУРСИЕЙ
    public static int simpleRecursion(int num, int degree) {
        if(degree<=1){
            return num;
        }
       return num*simpleRecursion(num, --degree);
    }


}

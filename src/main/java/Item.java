import java.util.Objects;

public class Item {
    private String name;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    private int weight;
    private int value;

    public Item(String name, int weight, int value){
        this.name=name;
        this.weight=weight;
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return weight == item.weight && value == item.value && Objects.equals(name, item.name);
    }


}

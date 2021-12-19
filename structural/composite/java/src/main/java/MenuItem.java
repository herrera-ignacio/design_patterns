import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public String getVegetarian() {
        return Boolean.toString(vegetarian);
    }

    @Override
    public void print() {
        System.out.println(getName() + ", ");
        System.out.println(getPrice() + ", ");
        System.out.println("Vegetarian: " + getVegetarian() + " -- ");
        System.out.println(getDescription());
    }
}

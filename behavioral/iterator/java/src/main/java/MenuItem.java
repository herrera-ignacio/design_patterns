import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
}

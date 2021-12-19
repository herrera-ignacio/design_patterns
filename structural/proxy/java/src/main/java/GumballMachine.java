import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class GumballMachine {
    @Getter
    @NonNull final String location;

    @Getter
    int count;

    @Getter
    @NonNull String state; // This may be implemented with State pattern
}

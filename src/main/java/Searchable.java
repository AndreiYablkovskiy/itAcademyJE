import java.util.List;

public interface Searchable {

    List<Gem> searchByClarity(double minRange, double maxRange);
}


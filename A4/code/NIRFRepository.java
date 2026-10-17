import java.util.ArrayList;
import java.util.List;

public class NIRFRepository<T> {

    private final List<T> records = new ArrayList<>();

    public void addRecord(T item) {
        records.add(item);
    }

    public List<T> getAllRecords() {
        return records;
    }

    public static <E> void printBatchSummary(String title, List<E> list) {
        System.out.println(title + " (Total Count: " + list.size() + ")");
    }
}
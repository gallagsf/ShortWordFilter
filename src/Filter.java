import java.util.ArrayList;

public interface Filter {
    boolean accept(Object x);

    static ArrayList<Object> applyFilter(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> filtered = new ArrayList<>();

        for (Object o : objects) {
            if (f.accept(o)) {
                filtered.add(o);
            }
        }

        return filtered;
    }
}

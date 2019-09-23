import java.util.ArrayList;

public interface Filter {


    static ArrayList<Object> applyFilter(ArrayList<Object> objects, Filter f) {
        ArrayList<Object> filtered = new ArrayList<>();
        // loop over the array list of objects
        // if the passed filter's accept method returns true, then add the element to the arraylist to be returned.
        // return the filtered array list
        return filtered;
    }
}

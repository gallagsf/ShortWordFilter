public class MediumWordFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        String word = (String) x;
        return word.length() >= 5 && word.length() <= 8;
    }
}

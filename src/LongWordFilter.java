public class LongWordFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        String word = (String) x;
        return word.length() > 8;
    }
}

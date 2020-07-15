import java.util.List;

public class Algorithm {
    public <T> int count(List<T> list, SomeSpecialNumber<T> s) {
        int count = 0;
        for (T type : list) {
            if (s.match(type)) {
                ++count;
            }
        }
        return count;
    }
}

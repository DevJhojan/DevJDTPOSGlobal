package op.resources;

import java.util.List;

public class AnyListToString {
    public AnyListToString(){}
    private  <T> String cleanedid(List<T> list ) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}

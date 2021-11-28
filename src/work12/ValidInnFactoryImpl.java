package work12;

import java.util.ArrayList;
import java.util.List;

public class ValidInnFactoryImpl implements ValidInnFactory {
    @Override
    public List<String> getValidInn() {
        List<String> inns = new ArrayList<String>();
        inns.add("12223");
        inns.add("21212");
        inns.add("21214");
        inns.add("12444");
        inns.add("214124");
        inns.add("2414124");
        inns.add("21314");
        return inns;
    }
}

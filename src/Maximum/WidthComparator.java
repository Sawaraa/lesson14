package Maximum;

import java.util.Comparator;

public class WidthComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return (int) (o1.getWidth() - o2.getWidth());
    }
}

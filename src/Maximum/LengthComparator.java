package Maximum;

import java.util.Comparator;

public class LengthComparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return (int) (o1.getLength() - o2.getLength());
    }
}

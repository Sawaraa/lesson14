package Maximum;

import java.util.Comparator;

public class WeightCoparator implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}

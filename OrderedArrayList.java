import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int starting) {
    super(starting);
  }

  public boolean add(T value) {
    for (int i = 0; i < size(); i++) {
      if (value.compareTo(this.get(i)) > 0) {
        super.add(i + 1, value);
        return true;
      }
    }
    return false;
  }
}

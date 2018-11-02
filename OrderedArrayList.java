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
      if (value.compareTo(this.get(i)) <= 0) {
        super.add(i, value);
        return true;
      }
    }
    super.add(0, value);
    return true;
  }

  public void add(int index, T value) {
    this.add(value);
  }

  public T set(int i, T value) {
    T old = this.get(i);
    super.remove(i);
    add(value);
    return old;
  }

}

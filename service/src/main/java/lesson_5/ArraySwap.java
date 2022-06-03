package lesson_5;

import java.util.List;

public class ArraySwap<T> {
    private List<T> list;

    public ArraySwap(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public List<T> swap(List<T> list, int pos1, int pos2) {
        T element1 = list.get(pos1);
        T element2 = list.get(pos2);
        list.remove(pos1);
        list.add(pos1, element2);
        list.remove(pos2);
        list.add(pos2, element1);
        return list;
    }
}

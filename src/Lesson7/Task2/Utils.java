package Lesson7.Task2;

public final class Utils {

    public static Object find(Predicate pred, List list) {

        for (Object o : list) {
            if (pred.apply(o))
                return o;
        }
        return null;
    }

    public static List filter(Predicate pred, List list) {
        List tmplist = new LinkedList();

        for (Object o : list) {
            if (pred.apply(o))
                tmplist.add(o);
        }
        return tmplist;
    }

    public static List transform(List list) {
        List tmpList = new LinkedList();
        for (Object o : list) {
            tmpList.add(o.toString() + o.toString());
        }
        return tmpList;
    }
}

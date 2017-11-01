/*
Интерфейс List должен расширять Iterable. Таким образом, LinkedList и ArrayList должны реализовать метод iterator(),
который возвращает экземпляр объекта внутреннего класса, который реализует интерфейс Iterator. Если все сделано
правильно, то ваш List сможет работать в цикле foreach:
for (Object o: list) {
System.out.println(o);
}

Контракт интерфейса заключается в том, что при создании он указывает на первый элемент списка, т.е. hasNext() вернет
true, а next() вернет текущий элемент и сдвинет указатель на следующий. Когда достигнет последнего элемента,
то hasNext() вернет false, а next() - null.
List list = new LinkedList();
list.add("a");
list.add(1);
list.add("b);

Iterator iter = listt.iterator();
while (iter.hasNext()) {
Object o = iter.next();

System.out.println(o);
}

аналогично

for (Object o: list) {
System.out.println(o);
}

выведут:
a
1
b
 */

package Lesson7.Task2;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++)
            list.add(i);
/*
        for (Object o : list) {
            System.out.println(o);
        }
*/

        List result = Utils.filter(new Predicate(){
            public boolean apply(Object o) {
               return "1".equals(o.toString());
            }
        }, list);

        for (Object o : result) {
            System.out.println(o);
        }

        List transres = Utils.transform(list);

        for (Object o : transres) {
            System.out.println(o);
        }

    }
}


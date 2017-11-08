package com.itmo.collections;

import com.itmo.collections.inner.MessageGenerator;
import com.itmo.collections.inner.Message;
import com.itmo.collections.inner.MessagePriority;

import java.util.*;

/**
 * Created by xmitya on 17.10.16.
 */
public class Tasks1 {

    public static void main(String[] args) {
        MessageGenerator generator = new MessageGenerator();

        List<Message> messages = generator.generate(100);

        countEachPriority(messages);
        countCountEachCode(messages);
        countUniqueMessages(messages);

        System.out.println("Genuine messages in natural order: \n" + genuineMessagesInOriginalOrder(messages));

        removeEach(generator.generate(100), MessagePriority.LOW);
        removeOther(generator.generate(100), MessagePriority.URGENT);
    }

    private static void countEachPriority(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого приоритета.
        // Ответ необходимо вывести в консоль.
        int lowprior = 0, mediumprior = 0, highprior = 0, urgentprior = 0;

        for (Message msg : messages) {
            if (msg.getPriority() == MessagePriority.LOW) {
                lowprior += 1;
            }
            if (msg.getPriority() == MessagePriority.MEDIUM) {
                mediumprior += 1;
            }
            if (msg.getPriority() == MessagePriority.HIGH) {
                highprior += 1;
            }
            if (msg.getPriority() == MessagePriority.URGENT) {
                urgentprior += 1;
            }
        }
        System.out.printf("LOW=%d%n", lowprior);
        System.out.printf("MEDIUM=%d%n", mediumprior);
        System.out.printf("HIGH=%d%n", highprior);
        System.out.printf("URGENT=%d%n", urgentprior);
}

    private static void countCountEachCode(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого кода сообщения.
        // Ответ необходимо вывести в консоль.

        Integer n;
        Map<Integer, Integer> map = new HashMap<>();
        for(Message mes : messages){
            n = map.get(mes.getCode());
            if (n == null)
                n = 0;
            n += 1;
            map.put(mes.getCode(), n);
        }
        System.out.println(map);
    }

    private static void countUniqueMessages(List<Message> messages) {
        // Сосчитайте количество уникальных сообщений.
        // Ответ необходимо вывести в консоль.

        HashSet<Message> msg = new HashSet<>(messages);

        System.out.println("Количество уникальных сообщений:"+msg.size());
    }

    private static List<Message> genuineMessagesInOriginalOrder(List<Message> messages) {
        // Здесь необходимо вернуть только неповторяющиеся сообщения и в том порядке, в котором
        // они встречаются в первоначальном списке. Например, мы на входе имеем такие сообщения:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}],
        // то на выходе должны получить:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}].
        // Т.е. остались только уникальные значения, и порядок их поступления сохранен.

        LinkedHashSet<Message> msg= new LinkedHashSet<>(messages);

        return new LinkedList<Message>(msg);
    }

    private static void removeEach(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции каждое сообщение с заданным приоритетом.
        System.out.printf("Before remove each: %s, %s\n", priority, messages);

        // TODO implement

        System.out.printf("After remove each: %s, %s\n", priority, messages);
    }

    private static void removeOther(Collection<Message> messages, MessagePriority priority) {
        // Удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет.
        System.out.printf("Before remove other: %s, %s\n", priority, messages);

        // TODO implement

        System.out.printf("After remove other: %s, %s\n", priority, messages);
    }
}

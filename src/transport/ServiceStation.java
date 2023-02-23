package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Transport transport;
    private Queue<Transport> queue = new LinkedList<>();

    public ServiceStation() {
    }

    public Queue<Transport> getQueue() {
        return queue;
    }

    public void addTransports(Transport transport) {
        if (transport.checkAbilityToGoInspection()) {
            queue.offer(transport);
            System.out.println(transport.getBrand() + " " + transport.getModel() + " успешно добавлен в очередь");
        } else {
            System.out.println("Автобус " + transport.getBrand() + " " + transport.getModel() + " не нуждается в техобслуживании перед заездом");
        }
    }

    public void carryOutATechnicalInspection() {
        System.out.println("Транспорт " + queue.poll() + " успешно прошел техобслуживание");
    }
}

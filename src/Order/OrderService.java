package Order;

import java.util.Date;

public interface OrderService {

    Order[] getOrdersByClient (long clientId);

    default int getOrdersByClient(long clientId, Date date) {

        Order[] allOrder = getOrdersByClient(clientId);
        return  0;

    }
}

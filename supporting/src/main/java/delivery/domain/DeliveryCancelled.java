package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private String customerId;
    private Integer qty;
    private String address;

    public DeliveryCancelled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancelled() {
        super();
    }
}
//>>> DDD / Domain Event

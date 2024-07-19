package delivery.domain;

import delivery.domain.*;
import delivery.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private String cutomerId;
    private Integer qty;

    public OrderCancelled(Order aggregate) {
        super(aggregate);
    }

    public OrderCancelled() {
        super();
    }
}
//>>> DDD / Domain Event

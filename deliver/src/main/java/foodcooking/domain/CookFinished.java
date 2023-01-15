package foodcooking.domain;

import foodcooking.domain.*;
import foodcooking.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private Object options;
}



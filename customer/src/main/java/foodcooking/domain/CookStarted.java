package foodcooking.domain;

import foodcooking.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class CookStarted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
}

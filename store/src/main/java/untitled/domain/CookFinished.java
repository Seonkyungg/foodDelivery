package untitled.domain;

import untitled.domain.*;
import untitled.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;

    public CookFinished(FoodCooking aggregate){
        super(aggregate);
    }
    public CookFinished(){
        super();
    }
}

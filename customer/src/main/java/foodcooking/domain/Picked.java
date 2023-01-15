package foodcooking.domain;

import foodcooking.domain.*;
import foodcooking.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Picked extends AbstractEvent {

    private Long id;
}



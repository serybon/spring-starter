package by.bnd.spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EntityListener {

    @EventListener(condition = "#p0.accessType.name == 'READ'")
    public void acceptEntity(EntityEvent entityEvent) {
        System.out.println(entityEvent);
    }
}

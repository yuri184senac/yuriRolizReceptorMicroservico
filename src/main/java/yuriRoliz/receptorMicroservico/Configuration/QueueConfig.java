package yuriRoliz.receptorMicroservico.Configuration;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

    @Bean
    public Queue queueA() {
        return QueueBuilder
                .durable("queue-a")
                .build();
    }
}

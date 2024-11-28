package yuriRoliz.receptorMicroservico.Configuration;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExchangeConfig {
    @Autowired
    private Queue queueA;

    @Bean
    public Exchange directExchange() {
        return ExchangeBuilder
                .directExchange("direct-exchange-default")
                .build();
    }

    @Bean
    public Binding bindingQueueA() {
        return BindingBuilder
                .bind(queueA)
                .to(directExchange())
                .with("queue-a-key")
                .noargs();
    }
}

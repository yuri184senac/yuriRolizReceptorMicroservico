package yuriRoliz.receptorMicroservico.Services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuriRoliz.receptorMicroservico.Entities.Carro;
import yuriRoliz.receptorMicroservico.Repositories.CarroRepository;

@Service
public class carroService {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    private CarroRepository carroRepository;

    public carroService (CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro adcionar(Carro carro) {
        return this.carroRepository.save(carro);
    }

    @RabbitListener(queues = "queue-a")
    private void listener(Carro carro){
        System.out.println(carro.getModelo());
    }


}

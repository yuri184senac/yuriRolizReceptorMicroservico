package yuriRoliz.receptorMicroservico.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import yuriRoliz.receptorMicroservico.Entities.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}

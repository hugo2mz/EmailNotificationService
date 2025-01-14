package pe.joedayz.ws.emailnotificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.joedayz.ws.emailnotificationservice.io.ProcessedEventEntity;

/**
 * @author josediaz
 **/
@Repository
public interface ProcessedEventRepository extends JpaRepository<ProcessedEventEntity, Long> {

    ProcessedEventEntity findByMessageId(String messageId);
}

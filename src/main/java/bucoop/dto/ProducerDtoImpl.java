package bucoop.dto;

import bucoop.model.Producer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProducerDtoImpl implements ProducerDto{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistProducer(Producer producer) {
        entityManager.persist(producer);
    }
    
    @Override
    public Producer getProducerWithId(Integer producerId) {
        final Producer producer = entityManager.find(Producer.class, producerId);
        if (producer == null) {
            return null;
        }
        return producer;
    }
    
    @Override
    public List<Producer> getProducers() {
        final List producersOrdered = entityManager.createQuery("SELECT h FROM Producer h ORDER BY h.id ASC").getResultList();
        return producersOrdered;
    }

    
    @Override
    public List<Producer> getProducerList() {
        final List<Producer> producerList = getProducers();
        return producerList;
    }
    
    @Override
    @Transactional
    public List<Producer> getProducerByName(String producername) {
        final List producersWithName = entityManager.createQuery("SELECT h FROM Producer h WHERE h.producername = :producername")
                .setParameter("producername", producername).getResultList();
        return producersWithName;
    }
    
    @Override
    @Transactional
    public List<Producer> getProducerByDescription(String producerdesc) {
        final List producersWithDescription = entityManager.createQuery("SELECT h FROM Producer h WHERE h.producerdesc = :producerdesc")
                .setParameter("producerdesc", producerdesc).getResultList();
        return producersWithDescription;
    }
    
    @Override
    @Transactional
    public List<Producer> getProducerByLocation(String location) {
        final List producersWithLocation = entityManager.createQuery("SELECT h FROM Producer h WHERE h.location = :location")
                .setParameter("location", location).getResultList();
        return producersWithLocation;
    }
}

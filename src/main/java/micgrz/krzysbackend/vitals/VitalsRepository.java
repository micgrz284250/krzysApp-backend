package micgrz.krzysbackend.vitals;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VitalsRepository extends CrudRepository<Vitals, Integer> {
    Vitals findFirstByOrderByIdDesc();
}

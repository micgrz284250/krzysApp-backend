package micgrz.krzysbackend.vitals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalsService {

    @Autowired
    private VitalsRepository vitalsRepository;

    public List<Vitals> getAllVitals() {
        return (List<Vitals>) vitalsRepository.findAll();
    }

    public Vitals getVitalsById(int id) {
        return vitalsRepository.findById(id).orElse(null);
    }

    public Vitals getTopVitals() {
        return vitalsRepository.findFirstByOrderByIdDesc();
    }

    public void saveVitals(Vitals vitals) {
        vitalsRepository.save(vitals);
    }

    public Vitals saveDefaultVitals() {
        Vitals vitals = new Vitals();
        System.out.println(vitals);
        return vitalsRepository.save(vitals);
    }
}

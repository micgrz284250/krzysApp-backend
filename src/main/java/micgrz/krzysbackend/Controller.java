package micgrz.krzysbackend;

import micgrz.krzysbackend.vitals.VitalsService;
import micgrz.krzysbackend.vitals.Vitals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class Controller {

    @Autowired
    private VitalsService vitalsService;

    @GetMapping("/vitals")
    public Vitals getVitals() {
        return vitalsService.getTopVitals();
    }

    @GetMapping("/vitals/put/default")
    public Vitals getAllVitals() {
        return vitalsService.getTopVitals();
    }

    @PostMapping("/vitals/put/default")
    public Vitals putDefaultVitals() {
        return vitalsService.saveDefaultVitals();
    }
}
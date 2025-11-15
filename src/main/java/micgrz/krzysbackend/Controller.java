package micgrz.krzysbackend;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class Controller {

    private final Krzys krzys;

    public Controller(Krzys krzys) {
        this.krzys = krzys;
    }

    @GetMapping("/vitals")
    public JSONObject getVitals() {
        JSONObject jo = new JSONObject();
        jo.put("energia", krzys.getEnergia());
        jo.put("tetno", krzys.getTetno());
        jo.put("temperatura", krzys.getTemperatura());
        jo.put("nastroj", krzys.getStringNastroj());
        System.out.println("działa");
        return jo;
    }
}

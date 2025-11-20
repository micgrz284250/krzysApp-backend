package micgrz.krzysbackend;

import micgrz.krzysbackend.message.Message;
import micgrz.krzysbackend.message.MessageService;
import micgrz.krzysbackend.vitals.VitalsService;
import micgrz.krzysbackend.vitals.Vitals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class Controller {

    @Autowired
    private VitalsService vitalsService;
    @Autowired
    private MessageService messageService;

    @GetMapping("/vitals")
    public Vitals getVitals() {
        return vitalsService.getTopVitals();
    }

    @PostMapping("/vitals/default")
    public Vitals putDefaultVitals() {
        return vitalsService.saveDefaultVitals();
    }

    @PostMapping("/message")
    public Message postMessage(@RequestBody String content) {
        return messageService.saveMessage(content);
    }
}
package micgrz.krzysbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KrzysBackendApplication {

    public static void main(String[] args) {
        Krzys krzys = new Krzys();
        SpringApplication.run(KrzysBackendApplication.class, args);
    }

}

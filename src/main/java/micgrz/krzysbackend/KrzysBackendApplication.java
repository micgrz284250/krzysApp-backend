package micgrz.krzysbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KrzysBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KrzysBackendApplication.class, args);
    }

}

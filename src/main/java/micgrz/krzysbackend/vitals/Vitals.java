package micgrz.krzysbackend.vitals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Vitals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private LocalDateTime dateTime;
    private int energia;
    private int tetno;
    private float temperatura;
    private Nastroj nastroj;

    public Vitals() {
        this.dateTime = LocalDateTime.now();
    }
}

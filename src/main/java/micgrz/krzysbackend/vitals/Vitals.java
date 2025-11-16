package micgrz.krzysbackend.vitals;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vitals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int energia;
    private int tetno;
    private int temperatura;
    private Nastroj nastroj;
}

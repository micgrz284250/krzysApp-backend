package micgrz.krzysbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KrzysDatabase {
    @Id
    private Long id;
    private int energia;
    private int tetno;
    private float temperatura;
    private Nastroj nastroj;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public int getEnergia() {
        return energia;
    }
    public int getTetno() {
        return tetno;
    }
    public float getTemperatura() {
        return temperatura;
    }
    public Nastroj getNastroj() {
        return nastroj;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public void setTetno(int tetno) {
        this.tetno = tetno;
    }
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    public void setNastroj(Nastroj nastroj) {
        this.nastroj = nastroj;
    }
}

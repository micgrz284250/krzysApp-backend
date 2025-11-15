package micgrz.krzysbackend;

import org.springframework.stereotype.Service;

@Service
public class Krzys {
    private int energia;
    private int tetno;
    private float temperatura;
    private Nastroj nastroj;

    public Krzys() {
        this.energia = 100;
        this.tetno = 60;
        this.temperatura = 36.6f;
        this.nastroj = Nastroj.SZCZESLIWY;
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

    public String getStringNastroj() {
        return switch (nastroj) {
            case SZCZESLIWY -> "szczęśliwy";
            case ZNUDZONY -> "znudzony";
            case SMUTNY -> "smutny";
            case ZLY -> "zły";
            default -> "nieznany";
        };
    }
}

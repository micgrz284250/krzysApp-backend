package micgrz.krzysbackend;

import micgrz.krzysbackend.vitals.Nastroj;
import micgrz.krzysbackend.vitals.Vitals;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Service
public class Krzys {
    private final Vitals vitals;
    private final Nastroj[] nastroje;

    public Krzys() {
        vitals = new Vitals(1, 100, 60, 36.6f, Nastroj.SZCZESLIWY);
        nastroje = Nastroj.values();
    }

    private void simulate() {
        // Krzyś traci od 1 do 10 energii
        vitals.setEnergia(vitals.getEnergia() - ThreadLocalRandom.current().nextInt(1, 11));
        // temperatura waha się między 35 a 39 stopni
        vitals.setTemperatura(ThreadLocalRandom.current().nextFloat(35, 40));
        // tętno jest wyższe niż 60 to spada od 10 do 15
        if (vitals.getTetno() >= 60) vitals.setTetno(vitals.getTetno() - ThreadLocalRandom.current().nextInt(10, 16));
        // przybiera losowy z dostępnych nastrojów
        vitals.setNastroj(nastroje[ThreadLocalRandom.current().nextInt(0, nastroje.length)]);
    }

    private void restoreEnergy() {
        if (vitals.getEnergia() <= 25) vitals.setEnergia(ThreadLocalRandom.current().nextInt(50, 101));
        else {
            boolean isEnergyRestored = ThreadLocalRandom.current().nextDouble() < 0.75;
            if (isEnergyRestored) vitals.setEnergia(ThreadLocalRandom.current().nextInt(50, 101));
        }
    }

    private void heartbeatSpike() {
        if (vitals.getTetno() <= 60) {
            boolean isHeartbeatSpiked = ThreadLocalRandom.current().nextDouble() < 0.25;
            if (isHeartbeatSpiked) vitals.setTetno(vitals.getTetno() + ThreadLocalRandom.current().nextInt(100, 151));
        }
    }

    private void restore() {
        restoreEnergy();
        heartbeatSpike();
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void simulateVitals() {
        simulate();
        restore();
    }
}

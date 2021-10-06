
import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class DieGrube extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Pit");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("DieGrube");
    }
}
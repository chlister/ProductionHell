package ResourceManager;
import Model.Resource.*;

/**
 * Manager class for generating global resources.
 * @author Marc Rohwedder Kær
 * @date 09-01-2019
 */
public class ResourceSpawner implements Runnable, ISpawnable {
    private static boolean running;
    private double countdown;

    /**
     *
     */
    @Override
    public void run() {

        running = true;
        // Start spawnTimer
        SpawnTimer();
    }

    @Override
    public void SpawnTimer() {
        while (running){
            // TODO: Create countdown for adding a resource to the pile

            //TODO: check if interrupt then break the while loop
        }
    }
}

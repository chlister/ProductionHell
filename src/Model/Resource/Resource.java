package Model.Resource;

/**
 * @author Marc Rohwedder Kær
 * @date 09-01-2019
 */
public abstract class Resource {
    // TODO: Define all generic variables for all resources
    private String name;
    private int value = 0;
    private double spawnRate = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getSpawnRate() {
        return spawnRate;
    }

    public void setSpawnRate(double spawnRate) {
        this.spawnRate = spawnRate;
    }

    Resource(String name, int value) {
        this.name = name;
        this.value = value;
    }
}

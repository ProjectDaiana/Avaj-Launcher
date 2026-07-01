package ro.academyplus.avaj.simulator;

public class Tower {
    private List<Flyable> observers;

    public void register(Flyable p_flyable);

    public void unregister(Flyable p_flyable);

    protected void conditionChanged();
}

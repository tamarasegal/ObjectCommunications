public class Lung {
    private Lung other;
    private Body owner;

    public Lung(Body owner) {
        this.owner = owner;
    }

    public Lung getOther() {
        return other;
    }

    public void initializeOtherLung(Lung other) {
        this.other = other;
    }
}

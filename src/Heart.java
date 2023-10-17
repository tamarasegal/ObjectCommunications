public class Heart {
    private Body owner; //handle to its owner (Body class) - i predicted code lol
    private int rate; //my heart rate
    public static final int RESTINGRATE = 70;
    public static final int DANGERRATE = 30;
    public Heart(Body owner) {
        this.owner = owner;
        this.rate = RESTINGRATE;
    }


    public void beatFaster() {
        this.rate += DANGERRATE;
        System.out.println("Heart is beating at a faster rate: " + rate);
        owner.sweat();
    }


}

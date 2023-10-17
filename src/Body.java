public class Body {
    private Heart myHeart; //body has a handle to its heart - myHeart is the body's handle to it's heart
    private Lung leftLung;
    private Lung rightLung;

    public Body() {
        this.myHeart = new Heart(this);
        this.leftLung = new Lung(this);
        this.rightLung = new Lung(this);
        this.leftLung.initializeOtherLung(this.rightLung);
        this.rightLung.initializeOtherLung(this.leftLung); //this is kinda weak bc people need to KNOW to do it this way, but it IS an okay solution


    }

    public void senseDanger() {
        System.out.println("Sensing danger");
        myHeart.beatFaster();
    }

    public void sweat() {
        System.out.println("I am sweating");
    }
}

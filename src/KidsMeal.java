import javax.xml.stream.events.EntityReference;

// KidsMeal CFJ EGR222 CBU Oct 9, 2017
// This little class demonstrates multiple constructors
public  class  KidsMeal {
    private String entree;
    private String side;
    private int drinkSize;

    public KidsMeal () {  // Overloading for the diffrent constructor methods.
        entree = "Nuggets,"+ " ";
        side = "Side: "+"Fries, " + "Drink Size = ";
        drinkSize = 8 ;

    }
    public KidsMeal (String entree ){
        this.entree = entree+",";
        side = " Side: " + "Chips, "+"Drink Size = ";
        drinkSize = 12;


    }
    public KidsMeal (String entree, String side , int drinkSize){
            this.entree = entree+", ";
            this.side = "Side: " + side +", Drink size = ";
            this.drinkSize = drinkSize;
    }

    public String toString(){ // allows the conversion of the memory adress into the proper output
        return  String.format(entree+side+drinkSize);
    }








    public static void main(String[] args) {
        KidsMeal[] K = new KidsMeal[5];
        K[0] = new KidsMeal();
        K[1] = new KidsMeal("Burrito");
        K[2] = new KidsMeal("Grilled Cheese", "Tater Tots", 6);
        K[3] = new KidsMeal("Hot Dog");
        K[4] = new KidsMeal("Mac and Cheese");
        for (int incr = 0; incr < K.length; incr++) {
            System.out.println("Entree: "+K[incr] + " ounces");
        }

       // System.out.println("Entree:" + K[2].entree+ " " + K[2].side + " = " + K[2].drinkSize); // debugger
    }
}

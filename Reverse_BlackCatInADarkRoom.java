import java.math.BigDecimal;

public class Reverse_BlackCatInADarkRoom {

    public static Object[] process() {
        Object[] darkRoom = new Object[100];

        darkRoom[3] = getCost();
        darkRoom[7] = getDescription() + " (" + getQuantity() + ")";

        darkRoom[0] = null; //don't remove this
        darkRoom[16] = "#";

        return darkRoom;
    }

}

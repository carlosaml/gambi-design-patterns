import java.math.BigDecimal;
import java.util.List;

public class BlackCatInADarkRoom_Classic {

    public static void process(Object[] darkRoom) {
        ((Product)darkRoom[7]).setCost((BigDecimal)darkRoom[26]);
        ((Product)darkRoom[7]).setPrice((BigDecimal) darkRoom[44]);
        //((Product)darkRoom[7]).setFactor((Integer)darkRoom[30] / (Integer)darkRoom[40]);
        ((Product)darkRoom[7]).setDescription(darkRoom[23] + ((String)darkRoom[3]));

        ((Order)darkRoom[14]).addProduct((Product)darkRoom[7]);

//        darkRoom[13] = darkRoom[21];
        ((List)darkRoom[32]).remove(darkRoom[0]);

        darkRoom[27] = (String)darkRoom[5] + darkRoom[9];
    }
}


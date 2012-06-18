import java.util.Map;

public class BlackCatInADarkRoom_Improved {

    public static void process(Map<String, Object> darkRoom) {

        darkRoom.put("cst", darkRoom.get("ORD_CST_MN"));
//        darkRoom.put("price", darkRoom.get("PRC_PRD"));
        darkRoom.put("prc", darkRoom.get("PRC_PRD_NEW"));
        darkRoom.put("dscrptn", darkRoom.get("PRD_DSC_SRT"));

        ((Order)darkRoom.get("ordr")).addProduct((Product)darkRoom.get("prd_org"));

        darkRoom.put("nwPrc", darkRoom.get("prc"));
    }
}


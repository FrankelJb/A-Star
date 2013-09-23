package graph;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: jonathan
 * Date: 2013/09/17
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovementCosts {
    private static final Map<String, Integer> MOVEMENT_COSTS = new HashMap<String, Integer>();

    static {
        MOVEMENT_COSTS.put(".", 1);
        MOVEMENT_COSTS.put("@", 1);
        MOVEMENT_COSTS.put("X", 1);
        MOVEMENT_COSTS.put("*", 2);
        MOVEMENT_COSTS.put("^", 3);
        MOVEMENT_COSTS.put("~", null);
    }

    public static Map<String, Integer> getMovementCosts() {
        return MOVEMENT_COSTS;
    }
}

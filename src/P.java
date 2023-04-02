

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P {
   // private static K MainMap;

    public static void main(String[] args) {
        Main B = new Main("d", "狗");
        Main C = new Main("B", "猫");
        Main D = new Main("c", "学霸");


        Map<String, Main> petMain = new HashMap<String, Main>();
        petMain.put(B.getName(), B);
        petMain.put(C.getName(), C);
        petMain.put(D.getName(), D);

        System.out.println("");
        Set<String> keys = petMain.keySet();
        Iterator<String> it = keys.iterator();


        while (it.hasNext()) {
            String key = it.next();
            Main main = MainMap.get(key);
            System.out.println(key + "\t" + main.getName());
        }
        for (String key : keys) {
            Main main = MainMap.get(key);
            System.out.println(key + "" + main.getName());
        }
    }
}
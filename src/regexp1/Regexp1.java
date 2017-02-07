package regexp1;

import java.util.ArrayList;
import java.util.List;

public class Regexp1 {

    public static void main(String[] args) {
    
		List<String> input = new ArrayList<String>();
		input.add("2016-11-11");
                input.add("11-11-2016");
                input.add("11-11-2016");
                input.add("12-11-2016");
                input.add("12-12-2016");
                input.add("2016-11-12");
                input.add("12-12-4534");
		input.add("2016-12-11-");
		input.add("2016-12-12-");
		input.add("2016-12--13");

                for (String re : input) {
                    if (re.matches("([0-9]{2}-).*(\\1)([0-9]{4})")) {
                        System.out.println("Daty, które posiadają ten sam dzień i miesiąc: " + re);
                        }
                }
    }
    
} 
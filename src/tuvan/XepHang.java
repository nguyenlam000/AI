/*
1 fire the first rule in sequence
2 Assign rule priorities (by importance)
3 More specific rule are preferred over general rule (longest matching)
4 Prefer rule whose premises are added more recently (time stamping)
5 Parallel strategy (create view points)
*/
package tuvan;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class XepHang {
    public static int longestMatching(ArrayList<String> small, ArrayList<String> big) {
        int count = 0;
        for (int i = 0; i < small.size(); i++) {
            for (int j = 0; j < big.size(); j++) {
                if(small.get(i).equals(big.get(j))){
                    count = count + 1;
                }
            }
        }
        if(count==small.size()){
            return count;
        }
        return 0;
    }
}

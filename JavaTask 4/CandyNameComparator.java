package Gift;
import Gift.Content.Candy;

import java.util.Comparator;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */

public class CandyNameComparator implements Comparator<Candy> {

    public int compare (Candy c1, Candy c2){
        String name1 = c1.getName();
        String name2 = c2.getName();
        return name1.compareTo(name2);
    }

}

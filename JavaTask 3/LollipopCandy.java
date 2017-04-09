package Gift.Content.Candies.Lollipop;
import Gift.Content.Candy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class LollipopCandy extends Candy {

    public LollipopCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean lollipop = true;
        super.lollipop = lollipop;

    }
}
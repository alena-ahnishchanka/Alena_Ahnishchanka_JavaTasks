package Gift.Content.Candies.Toffee;
import Gift.Content.Candy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class ToffeeCandy extends Candy {

    public ToffeeCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean toffee = true;
        super.toffee = toffee;
    }
}
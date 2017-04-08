package Gift.Content.Candies.Chocolate.ChocolateWithJelly;
import Gift.Content.Candies.Chocolate.ChocolateCandy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class ChocolateWithJellyCandy extends ChocolateCandy {

    public ChocolateWithJellyCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean chocolateWithJelly = true;
        super.chocolateWithJelly = chocolateWithJelly;
    }
}
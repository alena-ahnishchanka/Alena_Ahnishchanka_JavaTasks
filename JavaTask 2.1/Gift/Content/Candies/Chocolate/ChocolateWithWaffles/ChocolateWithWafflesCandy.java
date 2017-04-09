package Gift.Content.Candies.Chocolate.ChocolateWithWaffles;
import Gift.Content.Candies.Chocolate.ChocolateCandy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class ChocolateWithWafflesCandy extends ChocolateCandy {

    public ChocolateWithWafflesCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean chocolateWithWaffles = true;
        super.chocolateWithWaffles = chocolateWithWaffles;
    }
}

package Gift.Content.Candies.Chocolate.ChocolateWithNuts;
import Gift.Content.Candies.Chocolate.ChocolateCandy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class ChocolateWithNutsCandy extends ChocolateCandy {

    public ChocolateWithNutsCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean chocolateWithNuts = true;
        super.chocolateWithNuts = chocolateWithNuts;
    }
}
package Gift.Content.Candies.Chocolate.PureMilkChocolate;
import Gift.Content.Candies.Chocolate.ChocolateCandy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class PureMilkChocolateCandy  extends ChocolateCandy {

    public PureMilkChocolateCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean pureMilkChocolate = true;
        super.pureMilkChocolate = pureMilkChocolate;
    }
}

package Gift.Content.Candies.Chocolate.PureWhiteChocolate;
import Gift.Content.Candies.Chocolate.ChocolateCandy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class PureWhiteChocolateCandy  extends ChocolateCandy {

    public PureWhiteChocolateCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean pureWhiteChocolate = true;
        super.pureWhiteChocolate = pureWhiteChocolate;
    }
}

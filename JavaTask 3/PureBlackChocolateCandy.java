package Gift.Content.Candies.Chocolate.PureBlackChocolate;
import Gift.Content.Candies.Chocolate.ChocolateCandy;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class PureBlackChocolateCandy extends ChocolateCandy {

    public PureBlackChocolateCandy(String contentName, double contentWeight) {
        super.contentName = contentName;
        super.contentWeight = contentWeight;
        boolean pureBlackChocolate = true;
        super.pureBlackChocolate = pureBlackChocolate;
    }

}
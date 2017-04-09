package Gift.Box;
import Gift.GiftBox;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class CardboardBox extends GiftBox {

    public CardboardBox(double boxWeight){
        super.boxWeight = boxWeight;
    }

    public void giftBoxInfo() {
        System.out.println();
        System.out.println("Gift box is cardboard. Its weight is " + boxWeight + "g");
    }

}

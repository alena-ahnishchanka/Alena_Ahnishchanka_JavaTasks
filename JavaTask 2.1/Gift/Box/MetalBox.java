package Gift.Box;
import Gift.GiftBox;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public class MetalBox extends GiftBox {

    public MetalBox(double boxWeight){
        super.boxWeight = boxWeight;
    }

    public void giftBoxInfo() {
        System.out.println();
        System.out.println("Gift box is metal. Its weight is " + boxWeight + "g");
    }

}

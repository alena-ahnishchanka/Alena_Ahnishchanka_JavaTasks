package Gift;

/**
 * Created by Alena_Ahnishchanka on 2/27/2017.
 */
public class GiftWeight implements Gift{

    protected static double boxWeight;
    protected static double cookiesWeight;
    protected static double candiesWeight;
    protected static double bubbleGumsWeight;

    public void giftWeight(){

        double giftWeight;
        double contentWeight;

        contentWeight = cookiesWeight + bubbleGumsWeight + candiesWeight;
        System.out.println("Gift content weight is: " + contentWeight);
        System.out.println("Gift box weight is: " + boxWeight);

        giftWeight = boxWeight + contentWeight;
        System.out.println("Total gift weight is: " + giftWeight);
    }
}

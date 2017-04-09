package Gift;

/**
 * Created by Alena_Ahnishchanka on 2/26/2017.
 */
public abstract class GiftContent extends GiftWeight {

    protected double contentWeight;
    protected String contentName;

    protected String getName() {
        return contentName;
    }
    protected void setName(String contentName) {
        this.contentName = contentName;
    }

    protected double getWeight() {
        return contentWeight;
    }
    protected void setWeight(double contentWeight) {
        this.contentWeight = contentWeight;
    }

}

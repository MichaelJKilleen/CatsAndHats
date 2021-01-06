package bottomfeedersoftware.service;

import com.google.inject.Inject;
import bottomfeedersoftware.module.annotation.*;

public class CatInAHat implements SuessCat {

    private Thing thing1;
    private Thing thing2;

    @Inject
    public CatInAHat(@Thing1Value Thing thing1, @Thing2Value Thing thing2) {
        this.thing1 = thing1;
        this.thing2 = thing2;
    }

    @Override
    public String sayWhatYouAre() {
        return "A Cat in a Hat";
    }

    @Override
    public String speak() {
        return "I like green eggs and ham! "
                + (hasThings() ? thing1.whichThingAmI() + " " + thing2.whichThingAmI() : "");
    }

    @Override
    public boolean hasThings() {
        return (thing1 != null || thing2 != null);

    }

}

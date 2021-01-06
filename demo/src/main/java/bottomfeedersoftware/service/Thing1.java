package bottomfeedersoftware.service;

import com.google.inject.Inject;

public class Thing1 implements Thing {

    private Eggs eggs;

    @Inject
    public Thing1(Eggs eggs) {
        this.eggs = eggs;
    }

    @Override
    public String whichThingAmI() {
        return "Thing 1 with " + whichEggs();
    }

    @Override
    public String whichEggs() {
        return eggs.whatKindOfEggs();
    }

}

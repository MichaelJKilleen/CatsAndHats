package bottomfeedersoftware.service;

import com.google.inject.Inject;

public class Thing2 implements Thing {

    private Eggs eggs;

    @Inject
    public Thing2(Eggs eggs) {
        this.eggs = eggs;
    }

    @Override
    public String whichThingAmI() {
        return "Thing2 with " + whichEggs();
    }

    @Override
    public String whichEggs() {
        return eggs.whatKindOfEggs();
    }

}

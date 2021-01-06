package bottomfeedersoftware.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import bottomfeedersoftware.module.annotation.Thing1Value;
import bottomfeedersoftware.module.annotation.Thing2Value;
import bottomfeedersoftware.service.Cat;
import bottomfeedersoftware.service.CatInAHat;
import bottomfeedersoftware.service.Eggs;
import bottomfeedersoftware.service.EliotCat;
import bottomfeedersoftware.service.GreenEggs;
import bottomfeedersoftware.service.HouseCat;
import bottomfeedersoftware.service.RegularEggs;
import bottomfeedersoftware.service.RumTumTugger;
import bottomfeedersoftware.service.SuessCat;
import bottomfeedersoftware.service.Thing;
import bottomfeedersoftware.service.Thing1;
import bottomfeedersoftware.service.Thing2;

public class AppModule extends AbstractModule {

    int whichEggs = 1;

    @Override
    protected void configure() {
        bind(Thing.class).annotatedWith(Thing1Value.class).to(Thing1.class);
        bind(Thing.class).annotatedWith(Thing2Value.class).to(Thing2.class);
        bind(Cat.class).to(HouseCat.class);
        bind(SuessCat.class).to(CatInAHat.class);
        bind(EliotCat.class).to(RumTumTugger.class);
    }

    @Provides
    public Eggs get() {
        Eggs thing = null;

        if (whichEggs == 1) {
            whichEggs = 2;
            thing = new RegularEggs();
        } else {
            whichEggs = 1;
            thing = new GreenEggs();
        }
        return thing;
    }

}

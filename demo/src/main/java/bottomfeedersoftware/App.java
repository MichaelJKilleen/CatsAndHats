package bottomfeedersoftware;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import bottomfeedersoftware.module.AppModule;
import bottomfeedersoftware.service.Cat;
import bottomfeedersoftware.service.SuessCat;
import bottomfeedersoftware.service.Thing;

/**
 * Hello world!
 *
 *
 */
public final class App {

    // private Thing thing;
    // private Injector injector;

    // @Inject
    private App(Thing thing) {
        // injector = Guice.createInjector(new AppModule());
        // this.thing = thing;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppModule());
        SuessCat cat = injector.getInstance(SuessCat.class);

        System.out.println("Hello World! I am " + cat.sayWhatYouAre() + " and " + cat.speak());
        System.out.println("Does cat have things " + cat.hasThings());
    }
}

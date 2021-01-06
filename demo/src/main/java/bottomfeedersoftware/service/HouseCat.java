package bottomfeedersoftware.service;

public class HouseCat implements Cat {

    @Override
    public String sayWhatYouAre() {
        return "House Cat";
    }

    @Override
    public String speak() {
        return "meow";
    }

}

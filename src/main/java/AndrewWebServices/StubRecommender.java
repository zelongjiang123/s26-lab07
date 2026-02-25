package AndrewWebServices;

import java.util.concurrent.TimeUnit;

public class StubRecommender extends RecSys{
    public String getRecommendation(String accountName) {
        return "Animal House";
    }
}

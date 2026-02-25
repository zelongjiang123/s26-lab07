package AndrewWebServices;

public class StubRecommender extends RecSys{
    public String getRecommendation(String accountName) {
        if (accountName.equals("Scotty"))
            return "Animal House";
        return "";
    }
}

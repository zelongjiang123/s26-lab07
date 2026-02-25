package AndrewWebServices;

import java.util.HashMap;
import java.util.Map;

/*
 * InMemoryDatabase is a fake for the AndrewWS database which is used to improve test efficiency.
 * Remember, fakes are fully functional classes with simplified implementation.
 * What is the simplest core functionality that we need for a functional database?
 * 
 * Hint: there is one method you need to implement
 */
public class InMemoryDatabase extends Database/* should there be something here? */ {
    Map<String, Integer> map;
    // Implement your fake database here
    public InMemoryDatabase() {
        map = new HashMap<>();
        map.put("Scotty", 17214);
    }

    public int getPassword(String accountName) {
        return map.getOrDefault(accountName, 0);
        // if (accountName == "Scotty") {
        //     return 17214;
        // } else {
        //     return 0;
        // }
    }
}

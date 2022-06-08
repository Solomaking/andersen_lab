package lesson_4;

import java.util.HashMap;
import java.util.Map;

public class Park {

    private String name;
    private Map<String, Attraction> attractions;

    public Park() {
        this.name = "New amazing park of best attractions";
        this.attractions = new HashMap<>();
    }

    public void addAttraction(Attraction attraction) {
        String uniqueKey = attraction.getId() + attraction.getName();
        attractions.put(uniqueKey, attraction);
    }

    private static class Attraction {
        private int id;
        private String name;
        private int cost;
        private long startTs;
        private long endTs;
        private String info;

        public Attraction(int id, String name, int cost, long startTs, long endTs, String info) {
            this.id = id;
            this.name = name;
            this.cost = cost;
            this.startTs = startTs;
            this.endTs = endTs;
            this.info = info;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}

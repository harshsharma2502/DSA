import java.util.*;

class TimeMap {

    // Map: key -> list of (timestamp, value)
    private Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);

        // Binary search for largest timestamp <= given timestamp
        int left = 0, right = list.size() - 1;
        String res = "";
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).timestamp <= timestamp) {
                res = list.get(mid).value;
                left = mid + 1;  // try to find closer timestamp
            } else {
                right = mid - 1;
            }
        }
        return res;
    }

    // Helper class to store (timestamp, value)
    private static class Pair {
        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}

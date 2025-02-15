class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Map to store the frequency of each task
        Map<Character, Integer> taskMap = new HashMap<>();
        // Highest frequency of the same task appearing
        int maxFrequency = 0;
        for (char task : tasks) {
            taskMap.put(task, taskMap.getOrDefault(task, 0) + 1);
            maxFrequency = Math.max(taskMap.get(task), maxFrequency);
        }
        // Number of such max frequency tasks
        int maxFreqTasks = 0;
        for (char task : taskMap.keySet()) {
            if (taskMap.get(task) == maxFrequency) {
                maxFreqTasks++;
            }
        }
        // Rest of the tasks
        int nonMaxFreqTasks = tasks.length - (maxFreqTasks * maxFrequency);
        // Rest of the distributed tasks on each cycle
        int cycleLength = maxFrequency > 1 ? (nonMaxFreqTasks / (maxFrequency - 1)) : 0;
        // Extra tasks distributed to the first few cycles if any
        int remaining = maxFrequency > 1 ? (nonMaxFreqTasks % (maxFrequency - 1)) : 0;
        // Total length of each cycle (minus remaining)
        int cycle = maxFreqTasks + cycleLength;
        int idle = 0;
        // Distribute idles if needed
        if (cycle + 1 <= n && remaining > 0) {
            idle += ((maxFrequency - 1) * (n - cycle));
        } else if (cycle <= n && remaining == 0) {
            idle += ((maxFrequency - 1) * (n - cycle + 1));
        }
        // Add extra idles for the cycles that didn't get the "remaining" tasks
        if (remaining > 0 && cycle <= n) {
            idle += (maxFrequency - 1 - remaining);
        }
        return tasks.length + idle;
    }
}
class TimeMap {
    private Map<String, List<Object[]>> map;

    public TimeMap() {
        this.map = new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {

        map.computeIfAbsent(key, k -> new ArrayList<>())
       .add(new Object[]{timestamp, value});
    }

    public String get(String key, int timestamp) {
        List<Object[]> list = map.getOrDefault(key, new ArrayList<>());
        if (list.isEmpty()) {
            return "";
        }
       
        // TRACK INDICES, NOT TIMESTAMPS
        int lowIndex = 0;
        int highIndex = list.size() - 1;

        while (lowIndex <= highIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2; 
            int currTimeStamp = (Integer) list.get(mid)[0];
            
            if (currTimeStamp == timestamp) {
                return (String) list.get(mid)[1];
            } else if (currTimeStamp < timestamp) {
                lowIndex = mid + 1;
            } else {
                highIndex = mid - 1;
            }
        }
        if (highIndex >= 0) {
            return (String) list.get(highIndex)[1];
        }
        return "";
    }
    
}

class Solution {
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        List<String> answer = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < keyName.length; i++) {
            String name = keyName[i];
            String time = keyTime[i];

            String[] arrTime = time.split(":");
            int numTime = Integer.valueOf(arrTime[0]) * 60 + Integer.valueOf(arrTime[1]);
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(numTime);
        }

        for (Map.Entry<String, List<Integer>> e : map.entrySet()) {
            if (e.getValue().size() < 3) {
                continue;
            }
            Collections.sort(e.getValue());


            for (int i = 2; i < e.getValue().size(); i++) {
                if (e.getValue().get(i) - e.getValue().get(i - 2) <= 60) {
                    answer.add(e.getKey());
                    break;
                }
            }
        }


        Collections.sort(answer);
        return answer;
    }
}
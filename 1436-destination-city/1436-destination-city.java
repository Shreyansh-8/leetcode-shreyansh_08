class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> s = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for(int i=0;i<paths.size();i++){
            s.add(paths.get(i).get(0));
            d.add(paths.get(i).get(1));
        }
        for(int j=0;j<paths.size();j++){
            if(!s.contains(d.get(j))){
                return d.get(j);
            }
        }
        return null;
    }
}
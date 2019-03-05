public class Team {
    
    private String name;
    private String mascot;
    private int seed;
    private String region;
    private int powerRanking;
    
    public Team(String n, String m, int se, 
            String r, int pR){
        name = n;
        mascot = m;
        seed = se;
        region = r;
        powerRanking = pR;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setMascot(String m){
        mascot = m;
    }
    
    public void setSeed(int se){
        seed = se;
    }
    
    public void setRegion(String r){
        region = r;
    }
    
    public void setPowerRanking(int pR){
        powerRanking = pR;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMascot(){
        return mascot;
    }
    
    public int getSeed(){
        return seed;
    }
    
    public String getRegion(){
        return region;
    }
    
    public int getPowerRanking(){
        return powerRanking;
    }
}

import java
public class Plot {
  private long startTme;
  private double growthProgress;
  private boolean isEmpty;
  private Seed seed;
  
  public Plot(long startTime){
    this.startTime=startTime;
    growthProgress =0.0;
    this.seed = null;
    this.isEmpty = true;
  }
  
  public void setStartTime (long startTime) {
    this.startTime = startTime;
    
  }
  
  public long getStartTime () {
    return startTime;
  }
  
  public void setSeed (Seed s) {
    seed=s;
    !isEmpty;
  }
  
  
  
}


public class TestEuclidean{
    
    public void testWalkAlmostCircle(){
        try{
            Robot r = new Robot();
            double actualResult = r.findEuclideanDistance("NES");
            assert 1.0 == actualResult;
        } catch (Exception e) { }
    }
    
    public void testGoNorthAndTurnLeft(){
        try{
            Robot r = new Robot();
            double actualResult = r.findEuclideanDistance
                                        ("NNNNNNNW");
            double start  = 7.071067 - 0.000001; // -delta
            double finish = 7.071067 + 0.000001; // +delta
            
            assert start <= actualResult && 
                   actualResult <= finish;
        } catch (Exception e) { }
    }
}

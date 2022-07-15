
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
            double start  = 7.071067 - 0.000001;
            double finish = 7.071067 + 0.000001;
            
            assert start <= actualResult && 
                   actualResult <= finish;
        } catch (Exception e) { }
    }
}

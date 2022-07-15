
public class TestManhattan{
    
    public void testGoAroundAndBacktoOriginalPoint() throws Exception{
        Robot r = new Robot();
        int actualResult = r.findManhattonDistance("NESW");  //ActualResult
        assert 0 == actualResult;
    }
    
    public void testGoNorthAndTurnLeft1(){
        try{
            Robot r = new Robot();
            int actualResult = r.findManhattonDistance("NNW");
            assert 3 == actualResult;
        } catch (Exception e) { }
    }
    
    public void test003(){
        try{
            Robot r = new Robot();
            double actualResult = r.findEuclideanDistance("NNNNNNNW"); // 7.07
            assert 7.0710678 == actualResult;
        } catch (Exception e) { }
    }
    
    public void test004(){
        try{
            Robot r = new Robot();
            double actualResult = r.findEuclideanDistance("NES"); // 7.07
            assert 1.0 == actualResult;
        } catch (Exception e) { }
    }
}

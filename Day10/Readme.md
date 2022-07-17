
Day10:

Java Instance
Instance can be created by keyword "new"
Instance can be referenced by address in memory.

'-- java-15
	'-- pom.xml
	'-- code
	'	'-- Start.java
	'-- test
		'-- Test.java

In Java, Unit Test is a testing of method.
									'-- subroutine
									'-- subprogram
									'-- function

FILE pom.xml

<project>
	<modelVersion> 4.0.0 </modelVersion>
	<groupId> daeng-guitar </groupId>
	<artifactId> sample-15 </artifactId>
	<version> 0.5 </version>

	<build>
		<sourceDirectory> code </sourceDirectory>
		<testSourceDirectory> test </testSourceDirectory>
	</build>

	<properties>
		<maven.complier.source> 18 </maven.complier.source>
		<maven.complier.target> 18 </maven.complier.target>
	</properties>
	
</project>

// Live Coding should know 12 command of Java
// https://codestar.work/java-fundamental.pdf


// Manhattan Distance
	1. Euclidean Distance - Pythagoras --> (sqrt (a^2+b^2))
	2. Manhattan Distance is have square block 

===========

Test-Driven Development	(TDD)
-->Writing Unit test before writing real code.
	'--> test001(), test002()

Behavior-Driver Development (BDD)
-->Write test case by English 


Domain-Driven Development (DDD)
	naming everything like in business.

	class Member { } --> class Investor { }

===================================================

import java.util.Scanner;

class Start{
    
        public static void main(String[] data){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Path: ");
            String path = input.nextLine();
            Robot robot = new Robot();
            try {
                int distance = robot.findManhattonDistance(path);
                System.out.println(distance);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}


class Robot{
    int findManhattonDistance(String path) throws Exception{
        char[] a = path.toCharArray();
        int x = 0; int y = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 'N') y++;
            if(a[i] == 'S') y--;
            if(a[i] == 'E') x++;
            if(a[i] == 'W') x--;
        } //how to handle error
        
        for(int i = 0; i < a.length; i++){
            if (a[i] != 'N' &&
                a[i] != 'S' &&
                a[i] != 'E' &&   
                a[i] != 'W' ) { 
            throw new Exception("Invalid Command");
            }
        }
        
        if(x < 0) x = -x;
        if(y < 0) y = -y;
        return x + y;
    }
    double findEuclideanDistance(String path) throws Exception{
       char[] a = path.toCharArray();
        int x = 0; int y = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 'N') y++;
            if(a[i] == 'S') y--;
            if(a[i] == 'E') x++;
            if(a[i] == 'W') x--;
        } //how to handle error
        
        for(int i = 0; i < a.length; i++){
            if (a[i] != 'N' &&
                a[i] != 'S' &&
                a[i] != 'E' &&   
                a[i] != 'W' ) { 
            throw new Exception("Invalid Command");
            }
        }
        
        if(x < 0) x = -x;
        if(y < 0) y = -y;
        return Math.sqrt(x * x + y * y);
    }
}

====================================================

Surefire -> test


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

====================================


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

==========================================





package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BranchController{
    
    @RequestMapping("/area")
	String showArea(String width, String height){
	  try{
		double w = Double.parseDouble(width);
		double h = Double.valueOf(height);
		return "" + w*h;
		} catch (Exception e) {
			return "Invalid Number";
		}
	}
    
    Manager manager;
    Team team;
    
    @Autowired
    void setTeam(Team t){
        team = t;
    }
    
    @Autowired //@Qualifier("second") --> can use
    void setManager(@Qualifier("first") Manager m){
        manager = m;
    }

    @RequestMapping("/get-iso-team-name")
    String getTeamName(){
        return team.getName();
    }
    
    @RequestMapping("/list-branch")
    String[] listBranch() {
        return branches;
    }
    
    String[] branches = { "Paris", "London", "New York" };
    
}

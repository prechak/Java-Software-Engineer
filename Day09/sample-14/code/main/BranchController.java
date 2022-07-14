package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BranchController{
    
    @Autowired Team t;
    
    @RequestMapping("/get-iso-team-name")
    String getTeamName(){
        return t.getName();
    }
    
    @RequestMapping("/list-branch")
    String[] listBranch() {
        return branches;
    }
    
    String[] branches = { "Paris", "London", "New York" };
    
}

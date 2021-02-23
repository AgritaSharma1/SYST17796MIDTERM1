/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author agrit
 */
public class UserNameValidator {
    
    
    public void validate(User user){
        String name = user.getName();
        if (name.length()<1 || name == null){
            System.out.println("UserName Empty !");
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curdoperations.api.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author raghu.v
 */
@RestController
public class CurdOperations {
    
    Map<String,Map<String,String>> usermap=new HashMap<>();
    
    @PostMapping("/addUserdetails")
    public String adduserdetails(@RequestBody Map<String,String> userdeatils){
        userdeatils.get("useraname");
        userdeatils.get("age");
        userdeatils.get("gender");
        userdeatils.get("address");
        System.out.println("com.curdoperations.api.service.CurdOperations.adduserdetails()"+userdeatils.get("useraname")+userdeatils.get("age")
        +userdeatils.get("gender")+userdeatils.get("address"));
        Map<String,String> details=new HashMap<>();
        details.put("age",userdeatils.get("age"));
        details.put("gender",userdeatils.get("gender"));
        details.put("address",userdeatils.get("address"));
        usermap.put(userdeatils.get("useraname"), details);
        System.out.println("userdetails"+usermap);
        return "sucess";
    }
    
    @GetMapping("/getUserdetails/{username}")
    public  Map<String,String> getUserdetails(@PathVariable String username){
        
        System.out.println("userdetails are"+usermap.get(username));
        
        return usermap.get(username);
        
    }
    
}

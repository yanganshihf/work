package com.how2java.mapper;
 
import java.util.List;

import com.how2java.pojo.SPJL;


 
public interface SPJLMapper {
 
      
    public int add(SPJL spjl);  
       
      
    public void delete(int id);  
       
      
    public SPJL get(int id);  
     
      
    public int update(SPJL spjl);   
       
      
    public List<SPJL> list();
    
      
    public int count();  
    
    
    
}
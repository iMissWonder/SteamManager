package com.steammanager.tables.mapper;
 
import java.util.List;

import com.steammanager.tables.pojo.Tables;
 
public interface TablesMapper {
 
      
    public int add(Tables tables);  
       
      
    public void delete(int id);  
       
      
    public Tables get(int id);  
     
      
    public int update(Tables tables);   
       
      
    public List<Tables> list();
    
      
    public int count();  
    
    
    
}
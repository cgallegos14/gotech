package us.secureapps.gotech.service;

import java.util.List;

import us.secureapps.gotech.model.OngardWell;
import us.secureapps.gotech.utility.Pager;

public interface OngardWellService {
    
    public void create(OngardWell ongardWell);
    
    public OngardWell fetchOne(int id);
    
    public void update(OngardWell ongardWell);
    
    public void delete(int id);
    
    public List<OngardWell> fetchList();
    
    public List<OngardWell> fetchListByExample(OngardWell ongardWell, Pager pager);
    
    public List<OngardWell> fetchListByExample2(OngardWell ongardWell);
    
}

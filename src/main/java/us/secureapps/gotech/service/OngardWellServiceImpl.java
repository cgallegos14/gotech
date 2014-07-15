package us.secureapps.gotech.service;

import java.util.List;

import us.secureapps.gotech.persistence.OngardWellDAO;
import us.secureapps.gotech.utility.Pager;
import us.secureapps.gotech.model.OngardWell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OngardWellServiceImpl implements OngardWellService {
    
    @Autowired
    private OngardWellDAO ongardWellDAO;
    
    @Override
    public void create(OngardWell ongardWell) {
        ongardWellDAO.create(ongardWell);
    }
    
    @Override
    public void update(OngardWell ongardWell) {
        ongardWellDAO.update(ongardWell);
    }
    
    @Override
    public OngardWell fetchOne(int id) {
        return ongardWellDAO.fetchOne(id);
    }
    
    @Override
    public void delete(int id) {
        ongardWellDAO.delete(id);
    }
    
    @Override
    public List<OngardWell> fetchList() {
        return ongardWellDAO.fetchList();
    }
    
    @Override
    public List<OngardWell> fetchListByExample(OngardWell ongardWell, Pager pager) {
        return ongardWellDAO.fetchListByExample(ongardWell, pager);
    }
    
    @Override
    public List<OngardWell> fetchListByExample2(OngardWell ongardWell) {
        // list.size();
        return ongardWellDAO.fetchListByExample2(ongardWell);
    }
    
}

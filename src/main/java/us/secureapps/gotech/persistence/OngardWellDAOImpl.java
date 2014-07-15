package us.secureapps.gotech.persistence;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Example.PropertySelector;
import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.Restrictions;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import us.secureapps.gotech.model.OngardWell;
import us.secureapps.gotech.utility.NotNullOrZeroOrBlankStringPropertySelector;
import us.secureapps.gotech.utility.Pager;

@Repository
public class OngardWellDAOImpl implements OngardWellDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
    public void create(OngardWell ongardWell) {
        getCurrentSession().save(ongardWell);
    }
    
    public void update(OngardWell ongardWell) {
        OngardWell ongardWellToUpdate = fetchOne(ongardWell.getId());
        // TODO Try this without the setters and just pass ongardWell straight to update(). Need to protect the id field and maybe others.
        ongardWellToUpdate.setApi(ongardWell.getApi());
        ongardWellToUpdate.setWellid(ongardWell.getWellid());
        ongardWellToUpdate.setTownship(ongardWell.getTownship());
        getCurrentSession().update(ongardWellToUpdate);
    }
    
    public OngardWell fetchOne(int id) {
        OngardWell ongardWell = (OngardWell) getCurrentSession().get(OngardWell.class, id);
        return ongardWell;
    }
    
    public void delete(int id) {
        OngardWell ongardWell = fetchOne(id);
        if (ongardWell != null)
            getCurrentSession().delete(ongardWell);
    }
    
    /**
     * Return a list of OngarWell objects based on the input fields entered
     * in the well search form using QBE (Query By Example).  
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<OngardWell> fetchListByExample2(OngardWell ongardWell) {
        
        //Query q = getCurrentSession().createQuery("from DomesticCat cat");
        Query q = getCurrentSession().createQuery("from OngardWell");
        q.setFirstResult(20);
        q.setMaxResults(10);
        //q.addOrder( Order.asc("api");
        
        return q.list();
    }
    
    /**
     * Return a list of OngarWell objects based on the input fields entered
     * in the well search form using QBE (Query By Example).
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<OngardWell> fetchListByExample(OngardWell ongardWell, Pager pager) {
        
        Example example = Example.create(ongardWell)
            .ignoreCase() // As expected
            .enableLike() // Allows wildcard searches.
            // excludeProperty
                // Excludes specified fields. The default uses all fields except for the identifier. 
                //.excludeProperty()
            //.excludeZeroes()
                // Can't be used at same time as excludeNone() 
                //or setPropertySelector() (Hibernate docs are very weak on QBE).
            // setPropertySelector
                // Oh the horror. The Hibernate devs should be ashamed by their lack of ignoreEmtpyStrings and 
                // the extremely poor documentaion of PropertySelector usage.
            .setPropertySelector(new NotNullOrZeroOrBlankStringPropertySelector());
        
        Criteria criteriaForCount = getCurrentSession().createCriteria(OngardWell.class)
            .add(example);
        
        // TJH 2014-06-29 new entities don't have "name" atribute in @Column annotation.
        
        // TJH 2014-06-29 Search results empty (cnfirmd working w/ only 3 fields enabled so the problem is QBE related)
        // Generate a complete form for all class fields
        // Look into ignoring blank / empty / null fields
        Long itemCount = (Long) criteriaForCount.setProjection(Projections.rowCount()).uniqueResult();
        pager.setItemCount(itemCount.intValue());
        
        Criteria criteria = getCurrentSession().createCriteria(OngardWell.class)
            .add(example)
            .addOrder( Order.asc("api"))
            .setFirstResult(0)
            .setMaxResults(100);
            //.addOrder( Order.asc(pager.getSortBy()))
            //.setFirstResult(pager.getStartPosition())
            //.setMaxResults(pager.getPageSize());
            
        return criteria.list();
    }
    
    public List<OngardWell> fetchList() {
        List<OngardWell> list = new ArrayList<OngardWell>();
        
        return list;
    }

}

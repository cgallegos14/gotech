package us.secureapps.gotech.utility;

import org.hibernate.criterion.Example;
import org.hibernate.type.Type;
import org.apache.commons.lang3.StringUtils;

public final class NotNullOrZeroOrBlankStringPropertySelector implements Example.PropertySelector
{
    private static final long serialVersionUID = 1L;
    
    public boolean include(Object propertyValue, String propertyName, Type type) {
        
        // May need to address BIT / boolean
        // May need to address DECIMAL / BigDecimal
        // Might need to address TIMESTAMP / Timestamp
        
        if ( propertyValue == null ) {
            return false;
        }
        
        if ( (propertyValue instanceof String) && StringUtils.isBlank((String) propertyValue) ) {
            return false;
        }
        
        if ( ( propertyValue instanceof Integer )
                && propertyValue.equals(0) ) {
            return false;
        }
        
        if ( ( propertyValue instanceof Short ) ) {
            //propertyValue.equals(0) failed here for reasons unknown
            Short comp = 0;
            return !(propertyValue.equals(comp));
        }
        
        if ( ( propertyValue instanceof Float) 
                && propertyValue.equals(0.0f) ) {
            return false;
        }
        
        // Undtested
        if ( (propertyValue instanceof Double) 
                && propertyValue.equals(0.0d) ) {
            return false;
        }
        
        // Undtested
        if ( ( propertyValue instanceof Long ) 
                && propertyValue.equals(0L) ) {
            return false;
        }
        
        // Untested
        if ( ( propertyValue instanceof Byte )
                && propertyValue.equals(0) ) {
            Byte comp = 0;
            return !(propertyValue.equals(comp));
        }
        
        return true;
    }
}
package us.secureapps.gotech.utility;

import org.hibernate.criterion.Example;
import org.hibernate.type.Type;
import org.apache.commons.lang3.StringUtils;

public final class NotNullOrBlankStringPropertySelector implements Example.PropertySelector
{
    private static final long serialVersionUID = 1L;
    
    public boolean include(Object propertyValue, String propertyName, Type type) {
        
        // Needed to add the whole of Apache Commons to the POM just to use the StringUtils.isNotBlank method.

        return propertyValue != null && (!(propertyValue instanceof String) || StringUtils.isNotBlank((String) propertyValue));
    }
}
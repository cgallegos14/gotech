package us.secureapps.gotech.config;

import org.springframework.core.annotation.Order;
import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import us.secureapps.gotech.config.DatabaseConfig;
import us.secureapps.gotech.config.ThymeleafConfig;
import us.secureapps.gotech.config.WebConfig;

/*
 * This class bootstraps/initializes the web application.
 * AbstractAnnotationConfigDispatcherServletInitialize extends AbstractDispatcherServletInitializer
 * which extends AbstractContextLoaderInitializer which implements WebApplicationInitializer which declares onStartup(). 
 * 
 * This means contexts don't need to be manually created. Instead the appropriate config classes are set in 
 * the getRootConfigClasses() and getServletConfigClasses() methods.
 * It initializes the DispatcherServlet.
 * It loads resource files.
 * It loads the dataSource.
 * It eliminates the need for web.xml although it will support a mix of JavaConfig and XML config. 
 * 
 * @author Terence J Heinel
 *
 */
@Order(1)
public class ApplicationInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override
    protected Class<?>[] getRootConfigClasses() {
        
        return new Class[] { DatabaseConfig.class };
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses() {
        
        return new Class<?>[] { ThymeleafConfig.class, WebConfig.class };
    }
    
    @Override
    protected String[] getServletMappings() {
        
        return new String[] { "/" };
    }
}
package us.secureapps.gotech.utility;


// TODO Condsider making this comatible with the datatables plugin
//import com.github.dandelion.datatables.core.util.StringUtils;

/**
 * This class is used in controllers to store pagination input parameters.
 * These parameters are then passed to the model which will add other
 * pagination related values and calculations relating to a query.
 * The full set of pagination values can then be stored in the view model
 * by the controller so that the view can use them to display a pagination
 * widget.
 * 
 * @author Terence J Heinel
 *
 */
public class Pager
{
    //private static final long serialVersionUID = 1L;
    
    private int startPosition    = 0;
    private int pageSize         = 0;
    
    private int itemCount        = 0;
    
    private int pageCount        = 0;
    
    private String sortBy        = "";
    private String sortDirection = "";
    
    public Pager(int startPosition, int pageSize, int itemCount, String sortBy, String sortDirection) {
        this.startPosition   = startPosition;
        this.pageSize        = pageSize;
        this.itemCount       = itemCount;
        this.sortBy          = sortBy;
        this.sortDirection   = sortDirection;
        
     // TODO Call validate method and calculate the startPosition & pageCount values
        
    }
    
    
    
    // Accessors
    public int getStartPosition() {
        return startPosition;
    }
    
    public int getPageCount() {
        return pageCount;
    }
    
    public int getPageSize() {
        return pageSize;
    }
    
    public int getItemCount() {
        return itemCount;
    }
    
    public String getSortBy() {
        return sortBy;
    }
    
    public String getSortDirection() {
        return sortDirection;
    }
    
    
    // Mutators
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    
    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }
    
    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
    
}
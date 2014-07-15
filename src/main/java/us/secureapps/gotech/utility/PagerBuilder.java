package us.secureapps.gotech.utility;


public class PagerBuilder
{
    private int startPostion     = 0;
    private int pageSize         = 20;
    private int itemCount        = 0;
    
    private String sortBy        = "";
    private String sortDirection = "asc";

    public PagerBuilder() { }

    public Pager buildPager()
    {
        return new Pager(startPostion, pageSize, itemCount, sortBy, sortDirection);
    }

    
    public PagerBuilder startPostion(int startPostion)
    {
        this.startPostion = startPostion;
        return this;
    }

    
    public PagerBuilder pageSize(int pageSize)
    {
        this.pageSize = pageSize;
        return this;
    }
    
    public PagerBuilder itemCount(int itemCount)
    {
        this.itemCount = itemCount;
        return this;
    }
    
    public PagerBuilder sortBy(String sortBy)
    {
        this.sortBy = sortBy;
        return this;
    }

    public PagerBuilder sortDirection(String sortDirection)
    {
        this.sortDirection = sortDirection;
        return this;
    }
}

package us.secureapps.gotech.model;

import java.io.Serializable;

import javax.persistence.*;

import us.secureapps.gotech.model.OngardWell;

import com.google.common.base.Objects;

import java.sql.Timestamp;


/**
 * The persistent class for the "ongard_well" database table.
 * 
 */
@Entity
@Table(name="\"ongard_well\"", schema="pttc")
@NamedQuery(name="OngardWell.findAll", query="SELECT o FROM OngardWell o")
public class OngardWell implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(unique=true, nullable=false)
    private int id;

    @Column(length=1)
    private String apdworktypecode;

    @Column(nullable=false, length=10)
    private String api;

    private Timestamp aprdate;

    private short countyid;

    private int depthmvd;

    private int depthpb;

    private int depthtgt;

    private int depthtot;

    private int depthtvd;

    private Timestamp effdate;

    private int elevcsghd;

    private int elevgl;

    private int elevkb;

    @Column(length=1)
    private String ewcode;

    private int ftgew;

    private int ftgns;

    @Column(length=2)
    private String landtype;

    private Timestamp lastupdate;

    @Column(precision=53)
    private double lat;

    @Column(length=12)
    private String leaseid;

    @Column(name="\"LONG\"", precision=53)
    private double longitude;

    @Column(length=1)
    private String multsincomplind;

    @Column(length=1)
    private String nscode;

    private int ogridid;

    @Column(length=45)
    private String ogridname;

    private Timestamp plugdate;

    @Column(length=12)
    private String problemflag;

    @Column(length=55)
    private String propertydesc;

    private int propertyid;

    @Column(nullable=false, length=40)
    private String propertyname;

    @Column(length=5)
    private String range;

    @Column(length=3)
    private String sdivunit;

    private int section;

    private Timestamp spuddate;

    @Column(length=5)
    private String township;

    @Column(length=1)
    private String unit;

    @Column(length=30)
    private String updateby;

    @Column(nullable=false, length=4)
    private String wellid;

    @Column(length=1)
    private String wellstatus;

    @Column(length=1)
    private String welltype;

    public OngardWell() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApdworktypecode() {
        return this.apdworktypecode;
    }

    public void setApdworktypecode(String apdworktypecode) {
        this.apdworktypecode = apdworktypecode;
    }

    public String getApi() {
        return this.api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public Timestamp getAprdate() {
        return this.aprdate;
    }

    public void setAprdate(Timestamp aprdate) {
        this.aprdate = aprdate;
    }

    public short getCountyid() {
        return this.countyid;
    }

    public void setCountyid(short countyid) {
        this.countyid = countyid;
    }

    public int getDepthmvd() {
        return this.depthmvd;
    }

    public void setDepthmvd(int depthmvd) {
        this.depthmvd = depthmvd;
    }

    public int getDepthpb() {
        return this.depthpb;
    }

    public void setDepthpb(int depthpb) {
        this.depthpb = depthpb;
    }

    public int getDepthtgt() {
        return this.depthtgt;
    }

    public void setDepthtgt(int depthtgt) {
        this.depthtgt = depthtgt;
    }

    public int getDepthtot() {
        return this.depthtot;
    }

    public void setDepthtot(int depthtot) {
        this.depthtot = depthtot;
    }

    public int getDepthtvd() {
        return this.depthtvd;
    }

    public void setDepthtvd(int depthtvd) {
        this.depthtvd = depthtvd;
    }

    public Timestamp getEffdate() {
        return this.effdate;
    }

    public void setEffdate(Timestamp effdate) {
        this.effdate = effdate;
    }

    public int getElevcsghd() {
        return this.elevcsghd;
    }

    public void setElevcsghd(int elevcsghd) {
        this.elevcsghd = elevcsghd;
    }

    public int getElevgl() {
        return this.elevgl;
    }

    public void setElevgl(int elevgl) {
        this.elevgl = elevgl;
    }

    public int getElevkb() {
        return this.elevkb;
    }

    public void setElevkb(int elevkb) {
        this.elevkb = elevkb;
    }

    public String getEwcode() {
        return this.ewcode;
    }

    public void setEwcode(String ewcode) {
        this.ewcode = ewcode;
    }

    public int getFtgew() {
        return this.ftgew;
    }

    public void setFtgew(int ftgew) {
        this.ftgew = ftgew;
    }

    public int getFtgns() {
        return this.ftgns;
    }

    public void setFtgns(int ftgns) {
        this.ftgns = ftgns;
    }

    public String getLandtype() {
        return this.landtype;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype;
    }

    public Timestamp getLastupdate() {
        return this.lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getLeaseid() {
        return this.leaseid;
    }

    public void setLeaseid(String leaseid) {
        this.leaseid = leaseid;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getMultsincomplind() {
        return this.multsincomplind;
    }

    public void setMultsincomplind(String multsincomplind) {
        this.multsincomplind = multsincomplind;
    }

    public String getNscode() {
        return this.nscode;
    }

    public void setNscode(String nscode) {
        this.nscode = nscode;
    }

    public int getOgridid() {
        return this.ogridid;
    }

    public void setOgridid(int ogridid) {
        this.ogridid = ogridid;
    }

    public String getOgridname() {
        return this.ogridname;
    }

    public void setOgridname(String ogridname) {
        this.ogridname = ogridname;
    }

    public Timestamp getPlugdate() {
        return this.plugdate;
    }

    public void setPlugdate(Timestamp plugdate) {
        this.plugdate = plugdate;
    }

    public String getProblemflag() {
        return this.problemflag;
    }

    public void setProblemflag(String problemflag) {
        this.problemflag = problemflag;
    }

    public String getPropertydesc() {
        return this.propertydesc;
    }

    public void setPropertydesc(String propertydesc) {
        this.propertydesc = propertydesc;
    }

    public int getPropertyid() {
        return this.propertyid;
    }

    public void setPropertyid(int propertyid) {
        this.propertyid = propertyid;
    }

    public String getPropertyname() {
        return this.propertyname;
    }

    public void setPropertyname(String propertyname) {
        this.propertyname = propertyname;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getSdivunit() {
        return this.sdivunit;
    }

    public void setSdivunit(String sdivunit) {
        this.sdivunit = sdivunit;
    }

    public int getSection() {
        return this.section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public Timestamp getSpuddate() {
        return this.spuddate;
    }

    public void setSpuddate(Timestamp spuddate) {
        this.spuddate = spuddate;
    }

    public String getTownship() {
        return this.township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getUpdateby() {
        return this.updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public String getWellid() {
        return this.wellid;
    }

    public void setWellid(String wellid) {
        this.wellid = wellid;
    }

    public String getWellstatus() {
        return this.wellstatus;
    }

    public void setWellstatus(String wellstatus) {
        this.wellstatus = wellstatus;
    }

    public String getWelltype() {
        return this.welltype;
    }

    public void setWelltype(String welltype) {
        this.welltype = welltype;
    }

    @Override
    public String toString() {
        
        return String.format("%s(id=%d, api='%s', wellid='%s')", 
                this.getClass().getSimpleName(), 
                this.getId(), this.getApi(), this.getWellid());
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof OngardWell) {
            final OngardWell other = (OngardWell) o;
            return Objects.equal(getId(), other.getId())
                    && Objects.equal(getApi(), other.getApi())
                    && Objects.equal(getWellid(), other.getWellid());
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        
        return Objects.hashCode(getId(), getApi(), getWellid());
    }
    
}
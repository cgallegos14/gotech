package us.secureapps.gotech.model;

import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-06-28T21:23:42.497-0400")
@StaticMetamodel(AllWell.class)
public class AllWell_ {
    public static volatile SingularAttribute<AllWell, Integer> idPk;
    public static volatile SingularAttribute<AllWell, String> api;
    public static volatile SingularAttribute<AllWell, String> choke;
    public static volatile SingularAttribute<AllWell, Timestamp> compDate;
    public static volatile SingularAttribute<AllWell, String> county;
    public static volatile SingularAttribute<AllWell, String> eorW;
    public static volatile SingularAttribute<AllWell, Double> EWFoot;
    public static volatile SingularAttribute<AllWell, String> gas_MCFGPD_;
    public static volatile SingularAttribute<AllWell, String> gor;
    public static volatile SingularAttribute<AllWell, String> grav;
    public static volatile SingularAttribute<AllWell, Integer> id;
    public static volatile SingularAttribute<AllWell, String> norS;
    public static volatile SingularAttribute<AllWell, Double> NSFoot;
    public static volatile SingularAttribute<AllWell, String> oil_BOPD_;
    public static volatile SingularAttribute<AllWell, String> operator;
    public static volatile SingularAttribute<AllWell, String> PBDepth;
    public static volatile SingularAttribute<AllWell, String> perfBottom;
    public static volatile SingularAttribute<AllWell, String> perfTop;
    public static volatile SingularAttribute<AllWell, String> producingFormation;
    public static volatile SingularAttribute<AllWell, String> range;
    public static volatile SingularAttribute<AllWell, Double> section;
    public static volatile SingularAttribute<AllWell, String> status;
    public static volatile SingularAttribute<AllWell, Double> TDDepth;
    public static volatile SingularAttribute<AllWell, String> TDFormation;
    public static volatile SingularAttribute<AllWell, String> township;
    public static volatile SingularAttribute<AllWell, String> water_BWPD_;
    public static volatile SingularAttribute<AllWell, String> wellName;
}

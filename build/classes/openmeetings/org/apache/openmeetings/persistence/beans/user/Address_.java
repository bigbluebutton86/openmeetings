/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.user;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.user.Address.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:10 CST 2013")
public class Address_ {
    public static volatile SingularAttribute<Address,String> additionalname;
    public static volatile SingularAttribute<Address,Long> adresses_id;
    public static volatile SingularAttribute<Address,String> comment;
    public static volatile SingularAttribute<Address,Boolean> deleted;
    public static volatile SingularAttribute<Address,String> email;
    public static volatile SingularAttribute<Address,String> fax;
    public static volatile SingularAttribute<Address,String> phone;
    public static volatile SingularAttribute<Address,Date> starttime;
    public static volatile SingularAttribute<Address,State> states;
    public static volatile SingularAttribute<Address,String> street;
    public static volatile SingularAttribute<Address,String> town;
    public static volatile SingularAttribute<Address,Date> updatetime;
    public static volatile SingularAttribute<Address,String> zip;
}
/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openmeetings.persistence.beans.lang;

import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=org.apache.openmeetings.persistence.beans.lang.Fieldvalues.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Tue Mar 05 10:12:10 CST 2013")
public class Fieldvalues_ {
    public static volatile SingularAttribute<Fieldvalues,Boolean> deleted;
    public static volatile SetAttribute<Fieldvalues,Fieldlanguagesvalues> fieldlanguagesvalues;
    public static volatile SingularAttribute<Fieldvalues,Long> fieldvalues_id;
    public static volatile SingularAttribute<Fieldvalues,String> name;
    public static volatile SingularAttribute<Fieldvalues,Date> starttime;
    public static volatile SingularAttribute<Fieldvalues,Date> updatetime;
}

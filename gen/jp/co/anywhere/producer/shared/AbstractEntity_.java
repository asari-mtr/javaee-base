package jp.co.anywhere.producer.shared;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AbstractEntity.class)
public abstract class AbstractEntity_ {

	public static volatile SingularAttribute<AbstractEntity, Date> updateDate;
	public static volatile SingularAttribute<AbstractEntity, Long> id;
	public static volatile SingularAttribute<AbstractEntity, Long> version;
	public static volatile SingularAttribute<AbstractEntity, Date> createDate;

}


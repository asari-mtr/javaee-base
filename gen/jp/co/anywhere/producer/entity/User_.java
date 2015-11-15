package jp.co.anywhere.producer.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends jp.co.anywhere.producer.shared.AbstractEntity_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> email;

}


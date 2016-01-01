#Hibernate Configurations:<br/>
####1. POM.xml Dependencies
```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>4.0.0.Final</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.10</version>
		</dependency>
	</dependencies>
</project>
```
####2. src/main/resources/hibernate.cfg.xml file:
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

<hibernate-configuration>

	<session-factory>

		<!-- Database connection settings -->
		<property name="connection.driver_class">com.mysql.jdbc.Driver</property>
		<property name="connection.url">jdbc:mysql://localhost:3306/test</property>
		<property name="connection.username">root</property>
		<property name="connection.password" />

		<!-- JDBC connection pool (use the built-in) -->
		<property name="connection.pool_size">1</property>

		<!-- SQL dialect -->
		<property name="dialect">org.hibernate.dialect.MySQLDialect</property>

		<!-- Enable Hibernate's automatic session context management -->
		<property name="current_session_context_class">thread</property>

		<!-- Disable the second-level cache -->
		<property name="cache.provider_class">org.hibernate.cache.NoCacheProvider</property>

		<!-- Echo all executed SQL to stdout -->
		<property name="show_sql">true</property>
		<property name="hbm2ddl.auto">validate</property>
		
		<!-- Mapping to Entity: Add all the Entities here -->
		<mapping class="yrojha.hannotation.Employee" />
	</session-factory>

</hibernate-configuration>
```
####3. Get Hibernate Session:
```
import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
-------------------------------
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	------------------------------
	Session session = sessionFactory.openSession();
	---------------Save-----------
		session.beginTransaction();
	
		Long id = (Long) session.save(emp);

		session.getTransaction().commit();
		
		session.close();
		--------------GET--------------------
		Employee emp = (Employee) session.get(Employee.class, 8L);
		---------------UPDATE----------------
		session.beginTransaction();

		Employee emp = (Employee) session.get(Employee.class, 8L);
		emp.setLastname("Joshi");

		session.update(emp);

		session.getTransaction().commit();
		session.close();
		-------------------DELETE---------------------
		session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, 9L);
		session.delete(employee);

		session.getTransaction().commit();

		session.close();
		----------------------------------------
```

'''
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

<bean autowire="byName" class="di.constructorInjection.User" id="user">
	<constructor-arg value="Buddha"/>
	<constructor-arg value="30"/>
	<constructor-arg value="Nepal"/>
	<constructor-arg>
		<list>
			<value>Kathmandu</value>
			<value>Dhangadi</value>
			<value>Mahendranagar</value>
		</list>
	</constructor-arg>
</bean>


<bean class="di.setterInjection.Address" id="address">
	<property name="city" value="KTM"/>
	<property name="state" value="STATE"/>
	<property name="zip" value="0977"/>
	<property name="country" value="NEPAL"/>
</bean>

<bean class="di.setterInjection.UserDto" id="userSetterInjection">
	<property value="Buddha(Gautam)" name="name"/>
	<property value="30" name="age"/>
	<property name="address" ref="address"/>
</bean>

</beans>
'''

Make sure you have spring-beans framework is also in pom.xml file.
'''
<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-beans</artifactId>
			<version>${spring-framework.version}</version>
		</dependency>
'''

# EventTicketManager
This is a team project built with Spring Boot + Thymeleaf + MySQL. HTML theme musica made by [Colorlib](https://colorlib.com/).

To run this app on your local machine, please config the [application.properties](https://github.com/csi518-team7/EventTicketsApp/blob/master/src/main/resources/application.properties) file to match your setting:

```javascript
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=create-drop
spring.datasource.url=jdbc:mysql://localhost:3306/${dbname}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWD}
```

User configuration is located in [UsersLoader.java](https://github.com/csi518-team7/EventTicketsApp/blob/master/src/main/java/us/team7pro/EventTicketsApp/DatabaseLoaders/UsersLoader.java)

```java
// Add user role
Role userRole = new Role("ROLE_USER");
roleRepo.save(userRole);
// Add an user
User customer1 = new User("customer1@gmail.com", secret, true);
customer1.addRole(userRole);
userRepo.save(customer);
```



#### Screenshots

##### Homepage

![homepage](https://github.com/csi518-team7/EventTicketsApp/blob/master/screenshots/homepage.png)



##### Ticket detail page

![detailpage](https://github.com/csi518-team7/EventTicketsApp/blob/master/screenshots/detailpage.png)
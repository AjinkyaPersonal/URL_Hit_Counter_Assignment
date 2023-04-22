
<h1 align = "center"> URL-Hit-Counter </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>
This project is a URL Hit counter system built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The user data model is defined in the User class, which has the following attributes:
```
UserName : Name of the user
UrlHitCount : count of the times user hit url
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves and modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>


> * GetMapping: /count 
```
This endpoint makes a call to method in userService class which retrieves data of user from database and updates urlHitCount by + 1. This data is sent to controller which is then sent through the API to client.
```

> * GetMapping: /username/{userName}/count

```
This endpoint returns data of specific user and updates it's urlCount by +1 based on username through API .
```

---

## Data structure Used
> * HashMap
```
We have used HashMap data structure as a database to get, add and update Users data in database .
```
---

## Project Summary

This is a simple Spring Boot project that implements a URL hit counter. The application keeps track of the number of times a specific URL is accessed and also provides an additional feature to show the hit count for a specific username.

### Usage
Once the application is running, you can access the following URLs to test the functionality:

http://localhost:8080/api/v1/visitor-count-app/count - This URL will increment the hit count for the entire application.

http://localhost:8080/api/v1/visitor-count-app/username/{userName}/count - This URL will show the hit count for the specified username.


#### Incrementing the Hit Count
To increment the hit count for the entire application, simply access the following URL in your web browser or a tool like Postman: 
```
http://localhost:8080/api/v1/visitor-count-app/count
```
Each time you access this URL, the hit count will be incremented.

#### Showing the Hit Count for a Specific User
To show the hit count for a specific user, access the following URL in your web browser or a tool like Postman:
```
http://localhost:8080/api/v1/visitor-count-app/username/{userName}/count
```
Replace {userName} with the actual username you want to check the hit count for. For example:
```
http://localhost:8080/api/v1/visitor-count-app/username/Ajinkya/count
``` 
This will return a JSON object with the hit count for the specified user:

```
{
  "username": "Ajinkya",
  "hitcount": 12
}
```

## Author

👤 **Ajinkya Padule**

* GitHub: [AjinkyaPersonal](https://github.com/AjinkyaPersonal)

* LinkedIn: [Ajinkya Padule](https://www.linkedin.com/in/ajinkya-padule-04b8541a6/)
    
---

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page]("url").
    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
    
## 📝 License

Copyright © 2023 [Ajinkya Padule](https://github.com/AjinkyaPersonal).<br />

This project is [MIT]("url") licensed.
    
---

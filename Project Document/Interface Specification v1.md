# Interface Specification

[TOC]



## frontend-database

##### Interface1	frontend::Login ==> database::Login 

~~~json
{
     "UserName": "a string",
     "PassWord": "a string"
}
~~~

##### Interface2	database::Location ==> frontend::Location

~~~json
{
     "CurrentLocation": "an instance of the Location type"
}
~~~

##### Interface3	frontend::Store ==> database::Store

~~~json
{
     "StoreName": "a string",
     "StoreDescription": "a string"
}
~~~

##### Interface4	frontend::HuntedItem ==> database::HuntedItem

```json
{
     "Item": "an instance of the Item type"
}
```

##### Interface5	database::HuntedItem ==> frontend::HuntedItem

```json
{
     "Item": "an instance of the Item type"
}
```

##### Interface6	database::Item ==> frontend::Item

```json
{
     "Item": "an instance of the Item type"
}
```

##### Interface7	database::Map ==> frontend::Map

```json
{
    "StoreName": "a string",
    "StoreLocation": "an instance of the Location type",
    "StoreDescription": "a string",
    "ItemsList": "a list of instances of the Item type",
	"HuntedItemList": "a list of instances of the HuntedItem type"
}
```

##### Interface8	frontend::Feedback ==> database::Feedback

```json
{
    "Item": "an instance of the Item type",
	"comment": "a string",
	"rating": "an int",
	"UserName": "a string"
}
```

##### Interface9	frontend::Customer ==> database:: Customer

```json
{
   " Username": "a string",
    "Password": "a string",
    "Birthday": "a string",
    "Interests": "a list of strings",
    "CurrentLocation": "an instance of the Location type" 
}
```

##### Interface10	database::Customer ==> frontend:: Customer

```json
{
	"Username": "a string",
	"Password": "a string",
	"Birthday": "a string",
	"Interests": "a list of strings",
	"CurrentLocation": "an instance of Location type"
}
```

##### Interface11	frontend::Registration ==> database::Registration

~~~json
{
    "UserName": "a string",
    "PassWord": "a string"
}
~~~

##### Interface12	database::Registration ==> frontend::Registration

~~~json
{
    "UserName": "a string",
    "PassWord": "a string"
}
~~~



---



## algorithm-database

##### Interface1	database::Store ==> algorithm::Store

~~~json
{
    "type": "a list of strings",
	"items": "a list of instances from Item type",
	"Location": "an instance of Location type"
}
~~~

##### Interface2	database::Customer ==> algorithm::user

~~~json
{
    "UserData": "a list of instances from Customer type",
}
~~~

##### Interface3	database::Item ==> algorithm::recommendation algorithm

~~~json
{
    "ItemData": "a list of instances from Item type",
}
~~~

##### Interface4	algorithm::recommendation algorithm ==> database:: HuntedList

~~~json
{
    "Items": "a list of instances from Item type"
}
~~~



---



## web-database

##### Interface1	web::Registration ==> database::Registration

~~~json
{
    "userName" : "a string",
"hashedPassoword" : "a string",
}
~~~

##### Interface2	database::Registration ==> web::Registration

~~~json
{
    "userName": "a string",
	"hashedPassoword": "a string",
}
~~~

##### Interface3	database::Login ==> web::Login

~~~json
{
    "userName": "a string",
	"hashedPassoword": "a string",
}
~~~

<font color='red'>Warning: In interface 4/5, database::Administrator cannot provide complete information</font>

##### Interface4	web::Management ==> database::Administrator

~~~json
{
    "userData" : "an instance of User datatype",
	"storeInfo" : "an instance of StoreInfo type"
}
~~~

##### Interface5	database::Administrator ==> web::Management

~~~json
{
    userData : User
	storeInfo : "an instance of StoreInfo type"
}
~~~

##### Interface6	database::Analytics ==> web::Analytics

~~~json
{
    "appUsageData": "",
    "userEngagementData": "",
    "performanceData":"",
}
~~~

<font color='red'>Warning: this datatype is not defined.</font>

##### Interface7	database::Store ==> web::StoreOwner

~~~json
{
    "statistics": "an instance of Statistics type"
}
~~~

##### Interface8	 web::StoreOwner ==> database::Store

~~~json
{
    "storeInfo": "an instance of StoreInfo type"
}
~~~

##### Interface9	web::StoreInfo ==> database::Store

~~~json
{
    "storeName": "a string",
	"location" : "an instance of Location type",
    "Items": "a list of instances of the Item type"
}
~~~

<font color='red'>Warning: The store owner’s account and password should be saved in the Store class of the database.</font>

##### Interface10	web::User ==> database::Store

~~~json
{
    "UserName": "a string",
    "HashedPassword": "a string",
}
~~~

##### Interface11	database::Store ==> web::User

~~~json
{
    "UserName": "a string",
    "HashedPassword": "a string",
}
~~~

##### Interface12	database::Feedback ==> web::Feedback

~~~json
{
    "feedback": "an instance of Feedback type"
}
~~~

##### Interface13	database::Item ==> web::Item

~~~json
{
  "item": "an instance of Item type" 
}
~~~

##### Interface14	web::Item ==> database::Item

~~~json
{
    "item": "an instance of Item type" 
}
~~~

##### Interface15	database::Store ==> web::Location

~~~json
{
    "Location": "an instance of Location type" 
}
~~~

##### Interface16 database::Item ==> web::Statistics

~~~json
{
 	"customerVisits": "an int", 
	"feedbacks": "a list of instances of Feedback type"
}
~~~



## Appendix:

##### Location Datatype

~~~json
{
    "latitude": "a double",
	"longitude":"a double",
	"country" : "a string",
	"state" : "a string",
	"city": "a string",
	"street": "a string",
	"number": "a string",
	"floor": "a string",
	"zipcode": "a string",
}
~~~

##### Item Datatype

~~~json
{
    "ItemName": "a string",
	"ItemPrice": "a double",
	"ItemDescription": "a string",
	"ItemImage": "a base64 file",  
	"ItemStoreName": "a string",
    "customerVisits": "an int" 
}
~~~

##### StoreInfo Datatype

~~~json
{
	"storeName": "a string",
	"location": "an instance of Location Type",
	"items": "a list of instances of Item Type",
}
~~~

##### Feedback Datatype

~~~json
{
	"Item": "an instance of Item Type",
	"comment": "a string",
	"rating": "an int",
	"UserName" "a string", 
}
~~~

##### User Datatype

~~~json
{
	"userId": "an int", 
	"UserEmail": "a string",
	"UserName": "a string",
	"HashedPassword": "a string",
}
~~~

##### Statistics Datatype

	{
		"customerVisits": "an int", 
		"feedbacks": "a list of instances of Feedback Type",
	}


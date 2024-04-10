# Interface Specification

[TOC]



## frontend-database

##### Interface1	frontend::Login ==> database::Login 

~~~json
{
	"InterfaceId":"an int", 
    "CurrentUser": "a string",
    "UserName": "a string",
    "PassWord": "a string"
}

return with
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "match_token": "a bool",
}
~~~

+ Description1 : InterfaceId means the id of interface that we use the identify the interface index and json content.
+ Description2: CurrentUser is None if this is a anonymous visiting, otherwise it is the UserName.
+ The above two rules are for all interfaces of Android and Wechat.

##### Interface2	database::Location ==> frontend::Location

~~~json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string", 
    "CurrentLocation": "an instance of the Location type"
}
~~~

##### Interface3	frontend::Store ==> database::Store

~~~json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "StoreName": "a string"
}

return with

{
    "InterfaceId":"an int", 
    "CurrentUser": "a string", 
	"StoreList": "a list of instances of Store Type"
}
~~~

+ Description: This provides the function of querying the store information given the store name. 

##### Interface4	frontend::HuntedItem ==> database::HuntedItem

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string", 
    "HuntedItemList": "a list of instances of the HuntedItem type"
}
```

+ HuntedList is like a "Favorites".
+ This is for updating HuntedList.

##### Interface5	database::HuntedItem ==> frontend::HuntedItem

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string", 
    "HuntedItemList": "a list of instances of the HuntedItem type"
}
```

+ This is for displaying the HuntedList.

##### Interface6	frontend::Item ==> database:Item

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "ItemName": "a string"
}

return with
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string", 
    "Item": "an instance of the Item type"
}
```

+ Description: This provides the function of querying the item information given the item name. 

##### Interface7	frontend::Map ==> database::Map

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "MyLocation": "an instance of LocationType",
    "RequestType": "an int",
}

return with

{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
	"StoreList": "a list of instances of Store Type"
}
```

+ Description: RequestType=1 means this a request searching for nearby stores provided with "MyLocation".   RequestType=2 means this is a request for a list recommended stores. 

##### Interface8	frontend::Feedback ==> database::Feedback

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "StoreId": "an int",
	"comment": "a string",
	"rating": "an int",
}
```

Description: "rating" should be a positive integer from 1 to 100.

##### Interface9	frontend::Feedback ==> database::Feedback

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "ItemId": "an instance of the Item type",
	"comment": "a string",
	"rating": "an int"
}
```

##### Interface10	frontend::Customer ==> database:: Customer

+ Description: This is used to update customer information stored in the database. 

```json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "Username": "a string",
    "Password": "a string",
    "Birthday": "a string",
    "Interests": "a list of strings",
    "CurrentLocation": "an instance of the Location type" 
}
```

##### Interface11	database::Customer ==> frontend:: Customer

+ Description: This is used to show the customer information on the screen. Password should be set to "None".

```json
{
	"InterfaceId":"an int", 
    "CurrentUser": "a string",
    "Username": "a string",
	"Password": "a string",
	"Birthday": "a string",
	"Interests": "a list of strings",
	"CurrentLocation": "an instance of Location type"
}
```

##### Interface12 frontend::Registration ==> database::Registration

+ Description: this is used for registration and to check whether the UserName is unique.

~~~json
{
    "InterfaceId":"an int", 
    "CurrentUser": "a string",
    "UserName": "a string",
    "PassWord": "a string"
}

return with
{
	"InterfaceId":"an int", 
    "CurrentUser": "a string",
    "successful_token": "bool"
}

~~~

---



## algorithm-database

##### Interface1	database::Store ==> algorithm::Store

// changed

~~~json
{
    "storeId": "an int",
    "type": "a list of strings",
	"items": "a list of instances from Item type",
	"Location": "an instance of Location type"
}
~~~

##### Interface2	database::Customer ==> algorithm::user

// changed

~~~json
{
    "UserId": "an int", 
    "UserData": "a list of instances from Customer type",
}
~~~

##### Interface3	database::Item ==> algorithm::recommendation algorithm

~~~json
{
    "ItemData": "a list of instances from Item type",
}
~~~

##### Interface4	lgorithm::recommendation algorithm ==> database:: HuntedList

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
    "ItemId": "an int",
    "ItemName": "a string",
	"ItemPrice": "a double",
	"ItemDescription": "a string",
	"ItemImage": "a base64 file",  
	"ItemStoreId": "an int",
    "ItemStoreName": "a string",
    "customerVisits": "an int" 
}
~~~

+ Description: Same items in different stores have different ItemId, which means ItemId is unique.

##### StoreInfo Datatype

~~~json
{
	"storeId": "an int",
    "storeName": "a string",
	"location": "an instance of Location Type",
	"items": "a list of instances of Item Type",
    "StoreDescription": "a string"
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


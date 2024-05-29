## Interface 1

5.27(UTF+8)

Login successfully.

First Login not tested yet. (our code needs update)

## Interface 3

5.27(UTF+8)

successful

I did not receive  'customerVisits' in item object.(It seems that we do not need this)

## Interface 4

5.29(UTF+8)

I can visit now, but the history was still not updated by this interface

---

5.28(UTF+8)

I send

```json
{"InterfaceId":2,"CurrentUser":"Henry3","History":[{"StoreId":2,"VisitTime":"2024-05-28 14:51:48"}]}

```

but get error code 500.

------

5.27(UTF+8)

successful

but the history was not updated by this interface

## Interface 5

5.27(UTF+8)

successful

## Interface 6

5.29(UTF+8)

Can not get the picture of item now.

----

5.28(UTF+8)



I get 

```json
{"InterfaceId":6,"CurrentUser":null,"ItemList":[{"ItemId":3,"ItemName":"test1","ItemPrice":4.5,"ItemDescription":"GENERICO","ItemImage":"Tm90IEZvdW5k","ItemStoreId":2},{"ItemId":5,"ItemName":"test1","ItemPrice":4.5,"ItemDescription":"GENERICO","ItemImage":"Tm90IEZvdW5k","ItemStoreId":2}]}
```

ItemStoreName is missed

------

5.27(UTF+8)

can not search any item



## Interface 7

5.29(UTF+8)

Type 1 successful. There is a warning that if information such as country is in Chinese, it will report a 500 error, so I have put them all in meaningless information.



----

5.27(UTF+8)

I send

```json
{"InterfaceId":7,"CurrentUser":"","MyLocation":{"latitude":43.813872,"longitude":125.268134,"country":"中国","state":"吉林省","city":"长春市","street":"飞跃路","number":"","floor":""},"RequestType":2}

```

but get error code 500.

## Interface 8

5.28(UTF+8)

get successful token

---

5.27(UTF+8)

successful, but I can not confirm whether it works 

## Interface 9

5.28(UTF+8)

get successful token

---

5.27(UTF+8)

successful, but I can not confirm whether it works 

## Interface 10

5.27(UTF+8)

I send 

```json
{"InterfaceId":10,"CurrentUser":"Henry2","UserName":"Henry2","PassWord":"ooooooo","Interests":"food"}
```

but get error code 500.

It seems that this situation happens when the user already set the interests(not sure).

## Interface 11

5.29(UTF+8)

Can visit this interface now, but the content is not updated by interface 10.



---

5.27(UTF+8)

I send

```json
{"InterfaceId":11,"CurrentUser":"Henry2"}
```

but get error code 404.

## Interface 12

5.27(UTF+8)

```json
return with
{
	"InterfaceId":{
        "type":"integer",
        "minimum": 1,
        "maximum": 33
    },
    "CurrentUser": {
        "type": "string",
        "minLength": 1
    },
    "successful_token": {"type": "boolean"}
}
```

I get 'SuccessToken' instead of 'successful_token'.




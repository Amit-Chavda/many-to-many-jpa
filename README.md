# many-to-many-jpa

## ER Model
![M2M](https://user-images.githubusercontent.com/47694676/182286869-16682fd2-25ed-4e72-b3f2-7ea5ba4813d1.png)

## POST : http://localhost:9090/save
```
{
    "course": {
        "name": "CS"
    },
    "student": {
        "name": "Mark"
    },
    "otherFields": "Others"
}
```

## Response 200 OK

```
{
    "id": 2,
    "student": {
        "id": 2,
        "name": "Mark"
    },
    "course": {
        "id": 2,
        "name": "CS"
    },
    "otherFields": "Others"
}
```
## GET : http://localhost:9090/findAll
## Response 200 OK
```
[
    {
        "id": 1,
        "student": {
            "id": 1,
            "name": "Tony"
        },
        "course": {
            "id": 1,
            "name": "CS"
        },
        "otherFields": "Others"
    },
    {
        "id": 2,
        "student": {
            "id": 2,
            "name": "Mark"
        },
        "course": {
            "id": 2,
            "name": "CS"
        },
        "otherFields": "Others"
    }
]
```


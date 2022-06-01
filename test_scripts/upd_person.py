import json

import requests


def update_person(id):
    url = "http://localhost:8080/person/" + str(id)

    payload = json.dumps({
        "name": "John",
        "age": 30,
        "email": "John@aol.com"
    })
    headers = {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }

    response = requests.request("PUT", url, headers=headers, data=payload)

    print(response.text)


if __name__ == "__main__":
    update_person(2)

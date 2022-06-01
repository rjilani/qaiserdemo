import json
import requests


def read_data():
    with open('./payload.json', 'r') as f:
        data = json.load(f)
    return data


def create_person(person):
    url = "http://localhost:8080/person"
    headers = {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
    }
    response = requests.request("POST", url, headers=headers, data=json.dumps(person))
    print(response.text)


if __name__ == "__main__":
    data = read_data()
    for p in data:
        print(f'createing person {p}')
        create_person(p)

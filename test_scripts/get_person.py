import requests


def get_person_by_id(id):
    url = "http://localhost:8080/person/" + str(id)

    headers = {}

    response = requests.request("GET", url, headers=headers)

    print(response.text)


if __name__ == "__main__":
    lst = [1, 2]
    for i in lst:
        get_person_by_id(i)

import requests


def delete_person_by_id(id):
    url = "http://localhost:8080/person/" + str(id)

    headers = {}

    response = requests.request("DELETE", url, headers=headers)

    print(response.text)


if __name__ == "__main__":
    lst = [1]
    for i in lst:
        delete_person_by_id(i)

import requests


def list_persons():
    url = "http://localhost:8080/persons"

    payload = ""
    headers = {}

    response = requests.request("GET", url, headers=headers, data=payload)

    print(response.text)


if __name__ == "__main__":
    list_persons()

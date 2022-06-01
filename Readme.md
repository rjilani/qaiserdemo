## How to build application

`mvn clean package`

## How to run application

`java -jar target/qaiserdemo-0.0.1-SNAPSHOT.jar`

## How to test the scripts
# There are 2 ways to test the script
1. Manual testing can be done by importing **demo-app.postman_collection.json** into postman

# Or

2. Using python scripts under folder tst_scripts

## How to run python test scripts

`cd test_scripts`

# create persons
`python crt_person.py'

# get list of all persons
`python lst_persons.py'

# get person by id
`python get_person.py'

# update person
`python upd_person.py'

# delete person
`python del-person.py'
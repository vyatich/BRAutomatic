**Spring boot project with h2 database, freemarker, lombok.**


For run application use

Build jar file 
    
    `mvn clean package`
    
Execute jar file

    `java -jar BR-1.0-SNAPSHOT.jar`

Endpoints in browser:

/auth - for authentication user
/registration/ - for registration users

/disk/all - get all free disks
/disk/add - add new disk for people
/disk/take/{id} - take disk by id

/disk/taken - get all taken disks
/disk/taken/given - get all given disks
/disk/taken/give/{id} - give back taken disk


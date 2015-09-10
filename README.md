importUsers2OpenLM
==================

Import users CSV file into OpenLM Server.

The purpose of the software is to import new users or update users details from a CSV file to OpenLM server. The software works with OpenLM License Management software  - www.openlm.com

This is a Java software that uses the OpenLM API in order to upload/synchronize users between CSV file and the OpenLM server.

####How to build:####
Java 8 and Maven are required to build it.
```
mvn clean package
```

####How does it work:####
1. The program reads settings from config.properties file
2. CSV file is scanned for groups, projects and user names
3. Existing users, groups and projects are loaded from OpenLM server
4. If allow.to.add.entities is true the new groups and projects are added to OpenLM
5. The programs scans the CSV file again to import user details to OpenLM line by line
6. If merge.user.details.on.update is true the empty fields from CSV are replaced with values of same username from OpenLM
7. If allow.to.add.entities=true the tool creates new users as well as updates the ones existed in OpenLM

####Authentication:
There are two ways to provide user credentials if they are required by OpenLM server
1. Edit config.properties file to specify your account login and password
```
login=
password=
```
2. If you care about securing of your password, you can leave those fields empty. The import tool captures login and password from the command line too. Make sure to use java.exe not javaw.exe to run import in this case.


####Input CSV file format:####
The software expects to get a file in CSV format with the list of the user.
```
UserName,FirstName,LastName,DisplayName,Title,Department,PhoneNumber,Description,Office,Email,Enabled,Groups,DefaultGroup,Projects,DefaultProject
john.smith,John,Smith,John Smith,Mr.,Dept,(555)-555-55-55,Description,Office,john@gmail.com,true,group1|group2,group1,project1|project2,project1
```
Make sure your CSV file includes exactly the same heading line.

####Java config.properties file format:####
The config.properties file specify the following information

|Information|tag|
|-----------|---|
|OpenLM username - relevant only when authentication is required|login =|
|OpenLM password - relevant only when authentication is required|password =|
|OpenLM server URL|xml.api.url=|
|Allow to add new users, groups and projects to OpenLM|allow.to.add.entities=true/false|
|Merge CSV file data with existing user details|merge.user.details.on.update=true/false|

Example:
```
login=
password=
xml.api.url=http://localhost:7014/OpenLMServer
allow.to.add.entities=true
merge.user.details.on.update=true
```

####Usage - how to run (Using Jar file):####
Java 8 or higher is required to run it.
```
java -jar userimport-2.0-all.jar <csv file name or full path>
```

####Notes on the code####
The project code is located in com.openlm.userimport package.
All other packages are JAX-WS generated code to communicated to OpenLM with SOAP protocol
com.openlm.userimport.api.soap.WebServiceAPI is incomplete. It servers for demonstration purposes of OpenLM SOAP capabilities
If you want to generate JAX-WS client for Java make sure to run OpenLM on .NET 4.5 or higher. This way you could use AdminAPI?singleWsdl for wsimport tool
OpenLM License management and monitoring
==================
OpenLM is a comprehensive tool for software license management and monitoring. It interfaces a wide variety of license server types (e.g. Flexera Flexnet Publisher, DSLS) and provides
* Real-time license usage information,
* License usage reports according to user names, user groups, projects and hosts, 
* Historical license usage statistics and patterns.

OpenLM benefits all Software Asset Management (SAM) role players in the organization by
* Maintaining license inventory,
* Boosting license usage efficiency and availability, and
* Keeping license administrators ready for software audits at all times.

##importUsers2OpenLM##
importUsers2OpenLM is a free, open-source software tool that was implemented according to OpenLM’s customers’ requests. It makes use of the OpenLM open APIs to easily introduce new users, user groups and projects from a CSV file into the OpenLM database. 

##Download and installation##
importUsers2OpenLM is [published for free use on the github site](https://github.com/orengabay/importUsers2OpenLM/releases/tag/2.0.1). Simply download the openlm-userimport-2.0.1-full.zip file to your computer, and unzip it. Copy the unzipped folder to the OpenLM Server machine, adjacent the OpenLM Server installation folder, e.g.:
C:\Program Files (x86)\OpenLM.
You will need to have Java 8 installed on the OpenLM Server machine in order to run the tool. 

##Configuration files##
###1. config.properties###
Use Notepad to open the config.properties file:  
C:\Program Files (x86)\OpenLM\importUsers2OpenLM-version2.0\etc-resources\config.properties  
Edit the content of this file to change the importUsers2OpenLM settings:

* Login, Password (Optional fields):  
  Type in an optional login name and password.   
* xml.api.url (Default - http://localhost:7014/OpenLMServer):  
  Hostname and port number of the OpenLM Server.   
* allow.to.add.entities (Default - True):
  * True: Create new groups, projects and users from CSV file.
  * False: Update existing user details only
* merge.user.details.on.update (Default - True):
  * True: Empty CSV fields are merged with values from existing users’ records.
  * False: Empty CSV fields override values from existing users’ records.
* csv.format.delimiter (Default - comma (,))
  * You may want to change it to semicolon (;) if you produced CSV file from MS Excel

###2. datasource.csv###
Open the datasource.csv file:  
C:\Program Files (x86)\OpenLM\importUsers2OpenLM-version2.0\etc-resources\datasource.csv  
Edit the file to reflect the information that needs to be imported to the OpenLM database.  
By default, the datasource.csv file already contains a single user (John Smith) as an example.

UserName|FirstName|LastName|DisplayName|Title|Department|PhoneNumber|Description|Office|Email|Enabled|Groups|DefaultGroup|Projects|DefaultProject
--------|---------|--------|-----------|-----|----------|-----------|-----------|------|-----|-------|------|------------|--------|-------------
john.smith|John|Smith|John Smith|Mr.|Dept|(555)-555-55-55|Description|Office|john@gmail.com|true|group1&#124;group2|group1|project1&#124;project2|project1

Notes:  
1. __CSV format__  
   Some spreadsheet editors may add additional delimiters to the file (e.g. Tabs) during save. Take care to save the CSV file as a valid Comma separated file.  
2. __The conditional OR symbol (‘|’)__      
   Introduce multiple string values, in the ‘Groups’ and ‘Projects’ membership categories.  
3. __Default group:__      
   Group License usage data will only be accumulated and attributed to the user’s Default group. When a user has no default group is assigned to them, their group usage will attributed to the default OpenLM_Everyone group.  
4. __Default Project:__      
   Project license usage will be attributed to this project by default. License usage may be dynamically routed to other projects in which the user is a member of. [Read more about this here](https://www.openlm.com/application-notes-v3-0/monitoring-app-usage-v3-0-2/license-usage-monitoring-according-to-projects-an4030/).


###3. groups.csv###
Open the groups.csv file, and edit it to reflect the group hierarchy, e.g.: 


Id|Name|ParentId
--------|---------|--------
1|group1
2|group2|1

This table reflects a hierarchical structure, with group1 at the top, and group2 as a subsidiary to group1.

##Running importUsers2OpenLM##
* Make sure that the csv.format.delimiter is set correctly.
* Type the following string on a cmd line prompt to run the importUsers2OpenLM tool:  
  java -jar userimport-2.0.1-all.jar <csv file name or full path>   e.g:
  * java -jar userimport-2.0.1-all.jar groups.csv
  * java -jar userimport-2.0.1-all.jar datasource.csv

##Example##
On a clean OpenLM database I have defined: 
* Two group (G1, G2)
* Two users (U1, U2)
* User U2 is a member of group G1, and already has first & last name attributes .

![Image00](/images/image00.png)

I ran the tool with the following CSV content:

UserName|FirstName|LastName| ... |Groups|DefaultGroup
-----|-----|-----|-----|-----|-----
U1|U1_first|U1_last| ... |G1|G1
U2|U2_first| | ... | G1&#124;G2|G2

As a result of running the importUsers2OpenLM tool, the group membership and users’ attributes has changed as follows:
![Image01](/images/image01.png) 
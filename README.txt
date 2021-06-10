This project was created from the archetype "wildfly-jakartaee-webapp-archetype".

To deploy it:
Run the maven goals "install wildfly:deploy"

To undeploy it:
Run the maven goals "wildfly:undeploy"

Author: Fernando NAVARRO
Target audience: University of Luxembourg. (Professor Volker MÜLLER)

Goal of application
===================
Web Application grabbing information in XML format (manually downloaded from https://statistiques.public.lu/stat/TableViewer/tableView.aspx?ReportId=12949&IF_Language=eng&MainTheme=2&FldrName=3 and copied in xml format into /opt/jboss inside the application server)
and presented in json format either in screen output or a downloadable file. 
Years range is chosen from a drop down component in the form.

Composition of the project
==========================
index.xhtml -> web entry point where user can define what years to consult and the output mode.
XMLBean.java -> Java Bean handling the requests:
CreateJsonFromXml -> EJB creating a JSON file with the input from XML file + chosen years by users.

Requirements
===========
xml file containing information has to be copied to /opt/jboss with name statec.xml, otherwise application will fail.

 
CloudRadio
========================================================================================================================
Cloud base music portal
========================================================================================================================
 @Guide:

 - Install gradle buildtool from  http://www.gradle.org/downloads
 - You will find the following Gradle tasks handy:
       -  ~$ gradlew tasks: to list all the possible tasks which are available
       -  ~$ gradlew classes: to compile your Java/Groovy sources in the folders src/main/java and src/main/groovy and have them placed in WEB-INF/classes
       -  ~$ gradlew test: to compile and run your tests from src/test/java and src/test/groovy
       -  ~$ gradlew gaeFunctionalTest: to run the Spock and Geb-powered functional tests from src/functionalTest/groovy
       -  ~$ gradlew gaeRun: to run your application locally
       -  ~$ gradlew gaeStop: to stop your locally running application
       -  ~$ gradlew gaeUpload: to upload your application to production
       -  ~$ gradlew gaelykInstallPlugin: to install a plugin provided by the command line property (-P) plugin
       -  ~$ gradlew gaelykUninstallPlugin: to uninstall a plugin provided by the command line property (-P) plugin
       -  ~$ gradlew gaelykListInstalledPlugins: to show the installed plugins
       -  ~$ gradlew gaelykCreateController<ControllerName>: to create a Groovlet with the specified name
       -  ~$ gradlew gaelykCreateView<ViewName>: to create a Groovy template with the specified name
       -  ~$ gradlew cleanEclipse eclipse: to generate Eclipse project files
       -  ~$ gradlew cleanIdea idea: to generate IntelliJ project files

 - Directory layout <br>
            /<br>
            +-- gradlew       // gradle script<br>
            +-- build.gradle  // gradle build file<br>
            +-- src<br>
                |<br>
                +-- main<br>
                |   |<br>
                |   +-- groovy<br>
                |   +-- java<br>
                |   +-- webapp<br>
                |       |<br>
                |       +-- index.gtpl<br>
                |       +-- css<br>
                |       +-- images<br>
                |       +-- js<br>
                |       +-- WEB-INF<br>
                |           |<br>
                |           +-- appengine-web.xml<br>
                |           +-- web.xml<br>
                |           +-- plugins.groovy      // if you use plugins<br>
                |           +-- routes.groovy       // if you use the URL mapping system<br>
                |           +-- classes<br>
                |           |<br>
                |           +-- groovy<br>
                |           |    |<br>
                |           |    +-- controller.groovy    // groovy controller classes<br>
                |           |<br>
                |           +-- pages<br>
                |           |    |<br>
                |           |    +-- view.gtpl           // pages which contains web layout<br>
                |           |<br>
                |           +-- includes<br>
                |           |    |<br>
                |           |    +-- footer.gtpl         // templates<br>
                |           |<br>
                |           +-- lib                      // library<br>
                |               |<br>
                |               +-- appengine-api-1.0-sdk-x.y.z.jar<br>
                |               +-- appengine-api-labs-x.y.z.jar<br>
                |               +-- gaelyk-x.y.z.jar<br>
                |               +-- groovy-all-x.y.z.jar<br>
                |<br>
                +-- test<br>
                    |<br>
                    +-- groovy<br>
                    +-- java<br>
<br>
========================================================================================================================
License: GPL v3  (Open Source)

This document is for guidance purposes only and is not a legal document and is not legally binding.
We encourage you to read the GPL v3 and the Quick Guide to the GPLv3 in their entirety and consult legal counsel if you require additional advice.


© 2012 ssxenon01@gmail.com. All rights reserved.
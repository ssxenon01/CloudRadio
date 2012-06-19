CloudRadio
========================================================================================================================
Cloud base music portal
========================================================================================================================
 @Guide:

 - Install gradle buildtool from  http://www.gradle.org/downloads
 - You will find the following Gradle tasks handy:
         ~$ gradlew tasks: to list all the possible tasks which are available
         ~$ gradlew classes: to compile your Java/Groovy sources in the folders src/main/java and src/main/groovy and have them placed in WEB-INF/classes
         ~$ gradlew test: to compile and run your tests from src/test/java and src/test/groovy
         ~$ gradlew gaeFunctionalTest: to run the Spock and Geb-powered functional tests from src/functionalTest/groovy
         ~$ gradlew gaeRun: to run your application locally
         ~$ gradlew gaeStop: to stop your locally running application
         ~$ gradlew gaeUpload: to upload your application to production
         ~$ gradlew gaelykInstallPlugin: to install a plugin provided by the command line property (-P) plugin
         ~$ gradlew gaelykUninstallPlugin: to uninstall a plugin provided by the command line property (-P) plugin
         ~$ gradlew gaelykListInstalledPlugins: to show the installed plugins
         ~$ gradlew gaelykCreateController<ControllerName>: to create a Groovlet with the specified name
         ~$ gradlew gaelykCreateView<ViewName>: to create a Groovy template with the specified name
         ~$ gradlew cleanEclipse eclipse: to generate Eclipse project files
         ~$ gradlew cleanIdea idea: to generate IntelliJ project files

 - Directory layout
            /
            +-- gradlew       // gradle script
            +-- build.gradle  // gradle build file
            +-- src
                |
                +-- main
                |   |
                |   +-- groovy
                |   +-- java
                |   +-- webapp
                |       |
                |       +-- index.gtpl
                |       +-- css
                |       +-- images
                |       +-- js
                |       +-- WEB-INF
                |           |
                |           +-- appengine-web.xml
                |           +-- web.xml
                |           +-- plugins.groovy      // if you use plugins
                |           +-- routes.groovy       // if you use the URL mapping system
                |           +-- classes
                |           |
                |           +-- groovy
                |           |    |
                |           |    +-- controller.groovy    // groovy controller classes
                |           |
                |           +-- pages
                |           |    |
                |           |    +-- view.gtpl           // pages which contains web layout
                |           |
                |           +-- includes
                |           |    |
                |           |    +-- footer.gtpl         // templates
                |           |
                |           +-- lib                      // library
                |               |
                |               +-- appengine-api-1.0-sdk-x.y.z.jar
                |               +-- appengine-api-labs-x.y.z.jar
                |               +-- gaelyk-x.y.z.jar
                |               +-- groovy-all-x.y.z.jar
                |
                +-- test
                    |
                    +-- groovy
                    +-- java

========================================================================================================================
License: GPL v3  (Open Source)

This document is for guidance purposes only and is not a legal document and is not legally binding.
We encourage you to read the GPL v3 and the Quick Guide to the GPLv3 in their entirety and consult legal counsel if you require additional advice.


© 2012 ssxenon01@gmail.com. All rights reserved.
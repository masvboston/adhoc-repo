Test URL is:  http://localhost:8080/webapptest/webresources/myresource/test10


1) Execute gradle clean tomcatRun in a terminal
  1.1) Open the browser window and check the link
2) Open another terminal to the same project location
3) Change the class src/main/java/webapptest/MyResource.java.getTest10() method to return a different response
4) Be sure to save the changes to the file
5) Execute gradle compileJava
6) Wait for tomcat to indicate it picked up the changes, I waited 3 minutes
7) Open a new browser and check the link

There will be no change if the bug is still in place.


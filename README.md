# TikTakToeGame
TikTakToe using dependency injection, GUI, Runnable and ActionListener interfaces.

  This TikTakToe is the cleanest writen one that I have seen, great example of the SOLID principles, loosely coupled, using getters/ setters, constructors, GUI and Dependency Injection properly. The project has a coverage of 100% in classes, 95% of methods and 75% in lines. 
  Each class has a specific job to do and not even a single one can access other classes methods or functionality. If some information has to be recieved from one class to another this is done with getters or by the constructors.
  
  However, some of the issues that my program face is the slow genaration of objects, because of the loosely coupled components due to DI. Also, only one spot does not use DI, because I need to genarate nine independent JButtons at ones. If I want to use DI 100% in my program I need to pass in the constructor parameters nine individual JButtons and assign them one by one in the GameButtons class!

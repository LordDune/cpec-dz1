Windows PowerShell
(C) Корпорация Майкрософт (Microsoft Corporation). Все права защищены.

Попробуйте новую кроссплатформенную оболочку PowerShell (https://aka.ms/pscore6)
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> ls



Mode                 LastWriteTime         Length Name                                                                                                                     
----                 -------------         ------ ----                                                                                                                     
d-----        02.09.2023     21:09                java                                                                                                                     
-a----        02.09.2023     22:10            177 dockerfile


PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> javac -sourcepath ./java -d out java/main/Main.java    
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> java -classpath ./out main.Main    
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> docker build . -t calcapp:v1.1
[+] Building 3.1s (9/9) FINISHED                                                                                                                            docker:default
 => [internal] load build definition from dockerfile                                                                                                                  0.1s
 => => transferring dockerfile: 210B                                                                                                                                  0.0s 
 => [internal] load .dockerignore                                                                                                                                     0.1s
 => => transferring context: 2B                                                                                                                                       0.0s 
 => [internal] load build context                                                                                                                                     0.1s 
 => => transferring context: 2.54kB                                                                                                                                   0.0s 
 => [1/4] FROM docker.io/bellsoft/liberica-openjdk-alpine                                                                                                             0.1s 
 => [3/4] RUN mkdir ./out                                                                                                                                             0.4s 
 => [4/4] RUN javac -sourcepath ./javal -d out javal/main/Main.java                                                                                                   2.2s 
 => exporting to image                                                                                                                                                0.1s 
 => => exporting layers                                                                                                                                               0.1s 
 => => writing image sha256:c6b6b964511a50b64d13d45db804430b9c4092c8409cb6ad476ad98c4dc88bbd                                                                          0.0s 
 => => naming to docker.io/library/calcapp:v1.1                                                                                                                       0.0s 

What's Next?
  View summary of image vulnerabilities and recommendations → docker scout quickview
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> docker images
REPOSITORY                         TAG       IMAGE ID       CREATED              SIZE
calcapp                            v1.1      c6b6b964511a   About a minute ago   132MB
bellsoft/liberica-openjdk-alpine   latest    db3813295a88   6 weeks ago          132MB
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> docker run calcapp:v1.1
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main>
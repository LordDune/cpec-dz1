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
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> javadoc -d docs -sourcepath ./java -cp ./out -subpackages main over
Loading source files for package over...
Loading source files for package main...
Constructing Javadoc information...
Building index for all the packages and classes...
Standard Doclet version 20.0.2+9-78
Building tree for all the packages and classes...
Generating docs\main\Main.html...
.\java\main\Main.java:14: warning: no @param for args
    public static void main(String[] args) {
                       ^
.\java\main\Main.java:9: warning: use of default constructor, which does not provide a comment
public class Main {
       ^
Generating docs\over\OverClass.html...
.\java\over\OverClass.java:13: warning: no @return
    public static double sum (double a, double b) {
                         ^
.\java\over\OverClass.java:21: warning: no @return
    public static double dif (double a, double b) {
                         ^
.\java\over\OverClass.java:29: warning: no @return
    public static double mult (double a, double b) {
                         ^
.\java\over\OverClass.java:37: warning: no @return
    public static double div (double a, double b) {
                         ^
.\java\over\OverClass.java:7: warning: use of default constructor, which does not provide a comment
public class OverClass {
       ^
Generating docs\over\View.html...
.\java\over\View.java:7: warning: no @param for a
    public static String view (double a, String op, double b){
                         ^
.\java\over\View.java:7: warning: no @param for op
    public static String view (double a, String op, double b){
                         ^
.\java\over\View.java:7: warning: no @param for b
    public static String view (double a, String op, double b){
                         ^
.\java\over\View.java:7: warning: no @return
    public static String view (double a, String op, double b){
                         ^
.\java\over\View.java:3: warning: no comment
public class View {
       ^
.\java\over\View.java:3: warning: use of default constructor, which does not provide a comment
public class View {
       ^
Generating docs\main\package-summary.html...
Generating docs\main\package-tree.html...
Generating docs\over\package-summary.html...
Generating docs\over\package-tree.html...
Generating docs\overview-tree.html...
Generating docs\index.html...
Building index for all classes...
Generating docs\allclasses-index.html...
Generating docs\allpackages-index.html...
Generating docs\index-all.html...
Generating docs\search.html...
Generating docs\overview-summary.html...
Generating docs\help-doc.html...
13 warnings
PS D:\Docs\Programming\Code\Java\Cpec\1\dz1\src\main> 
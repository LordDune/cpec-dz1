FROM bellsoft/liberica-openjdk-alpine
COPY ./java ./javal
RUN mkdir ./out
RUN javac -sourcepath ./javal -d out javal/main/Main.java
CMD java -classpath ./out main/Main
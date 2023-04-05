FROM openjdk:17
WORKDIR /usr/src/tasklist
COPY ./target/taskList-*.jar .
CMD java -jar < find taskList-*.jar
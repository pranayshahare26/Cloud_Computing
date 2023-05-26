FROM openjdk:12-alpine

COPY . /usr/src/myjavaapp

WORKDIR /usr/src/myjavaapp

RUN javac EvenOddChecker.java

CMD ["java", "EvenOddChecker"]


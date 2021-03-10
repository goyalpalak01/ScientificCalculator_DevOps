FROM openjdk:8
MAINTAINER Palak Goyal palak.goyal@iiitb.org
COPY ./target/ScientificCalculator_DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar","ScientificCalculator_DevOps-1.0-SNAPSHOT-jar-with-dependencies.jar"]

<<<<<<< HEAD
FROM ubuntu:latest

RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/PDMS.war pdms_docker.war

EXPOSE 8055

CMD java -jar pdms_docker.war
=======
FROM ubuntu


RUN apt-get update 
RUN apt-get install openjdk-8-jdk
RUN docker push /PDMS/PDMS/target/*war
>>>>>>> ff83030392364c421dec30830c8cde37b1a4c398

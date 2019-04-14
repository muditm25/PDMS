FROM ubuntu:latest

RUN \
# Update
apt-get update -y && \
# Install Java
apt-get install default-jre -y

ADD ./target/PDMS.war pdms_docker.war

EXPOSE 8055

CMD java -jar pdms_docker.war


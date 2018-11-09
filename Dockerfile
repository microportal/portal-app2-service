FROM openjdk:11-jre-slim

ADD target/portal-app2-service.jar /opt/
WORKDIR /opt

ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom \
    -jar portal-app2-service.jar
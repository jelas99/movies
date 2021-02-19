
FROM openjdk

VOLUME /tmp

ADD target/store-service-discovery-0.0.1-SNAPSHOT.jar eureka.jar
RUN sh -c 'touch /eureka.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka.jar"] 

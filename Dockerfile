#FROM tomcat:latest
#ADD target/docker-spring-boot.war /usr/local/tomcat/webapps/
#EXPOSE 8080
#CMD ["catalina.sh", "run"]

#From tomcat:8.0.51-jre8-alpine
#CMD ["catalina.sh","run"]

From tomcat:8.0.51-jre8-alpine
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/docker-spring-boot.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh","run"]

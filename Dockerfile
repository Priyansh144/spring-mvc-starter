FROM tomcat:9-jdk8-slim
EXPOSE  8080
WORKDIR "/usr/local/tomcat/"
RUN rm -r webapps/*
ADD target/spring-mvc.war webapps/ROOT.war
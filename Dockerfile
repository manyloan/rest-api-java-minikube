FROM openjdk:21-jdk-slim

# Argumento para o JAR file
ARG JAR_FILE=java-minikube/target/*.jar

# Copie o JAR file para o container
COPY ${JAR_FILE} app.jar

# Exponha a porta que a aplicação roda
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java","-jar","/app.jar"]
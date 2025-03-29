FROM amazoncorretto:17

# Set app as current working directory
WORKDIR /app

COPY pulsebackend/target/*.jar app.jar

USER 1001

ENV JAVA_OPTS=""
ENV SERVER_PORT=8080

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app/app.jar"]

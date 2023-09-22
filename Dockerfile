FROM eclipse-temurin:17
COPY target/dockerfile.jar dockerfile.jar
CMD ["java","-jar","dockerfile.jar"]
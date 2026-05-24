FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copiar archivos
COPY . .

# Dar permisos y compilar
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Imagen final más ligera
FROM eclipse-temurin:21-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
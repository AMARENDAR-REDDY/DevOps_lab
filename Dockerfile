FROM openjdk:latest
WORKDIR /app
COPY . /app
RUN javac helloo.java
CMD ["java","helloo"]


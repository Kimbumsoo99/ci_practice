# Java 21 기반 OpenJDK 이미지를 사용
FROM openjdk:21-jdk-slim

# 워킹 디렉토리 생성 및 설정
WORKDIR /app

# Gradle 캐시를 미리 생성하여 종속성 다운로드 시간 절약
COPY gradle /app/gradle
COPY gradlew /app/gradlew
COPY build.gradle /app/build.gradle
COPY settings.gradle /app/settings.gradle

# 필요한 모든 소스 코드와 설정 파일을 컨테이너로 복사
COPY . /app

# Gradle 빌드 명령 실행 (Gradle wrapper 사용)
RUN ./gradlew clean build --no-daemon

# 컨테이너 실행 시 빌드된 JAR 파일 실행
CMD ["java", "-jar", "build/libs/demo-server.jar"]

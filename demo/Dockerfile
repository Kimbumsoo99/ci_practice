# OpenJDK 11을 기반으로 하는 이미지 사용
FROM openjdk:11-jdk-slim

# 워킹 디렉토리 생성 및 설정
WORKDIR /app

# 현재 디렉토리의 모든 파일을 컨테이너의 /app 디렉토리로 복사
COPY . /app

# Maven 빌드 및 JAR 파일 생성 (Maven이 이미 프로젝트 내에 존재한다고 가정)
RUN ./mvnw clean package

# 컨테이너 실행 시 JAR 파일을 실행
CMD ["java", "-jar", "target/demo-server.jar"]

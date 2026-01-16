# Sample Java Repository

이 repository는 GitHub Actions reusable workflows를 사용하는 Java 프로젝트 예제입니다.

## 🏗️ 프로젝트 구조

```
sample-java-repo/
├── .github/
│   └── workflows/
│       └── ci.yml                  # CI workflow
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── Main.java   # 메인 애플리케이션
└── pom.xml                         # Maven 설정
```

## 🚀 빌드 방법

### 로컬 빌드

```bash
# Maven으로 빌드
mvn clean package

# JAR 실행
java -jar target/sample-java-app-1.0.0.jar
```

### CI/CD

이 프로젝트의 CI workflow는 다음을 수행합니다:

1. **Build-and-Upload job**: Java 17로 빌드 및 아티팩트 업로드
2. **Test-Matrix job**: Java 11, 17, 21에서 빌드 테스트

## 🔄 Reusable Workflows 사용

`central-workflows` repository를 GitHub에 push한 후 다음과 같이 사용:

```yaml
jobs:
  compile:
    uses: your-org/central-workflows/.github/workflows/compile-java.yml@main
    with:
      java-version: '17'
      build-tool: maven
      build-command: "mvn clean package -DskipTests"
      env-vars: '{"MAVEN_OPTS":"-Xmx2048m"}'
```

## 📝 환경 변수 커스터마이징

각 프로젝트별로 다른 Java 버전이나 빌드 옵션 사용 가능:

```yaml
with:
  java-version: '21'
  build-tool: gradle  # Maven 대신 Gradle 사용
  env-vars: '{
    "MAVEN_OPTS": "-Xmx4096m",
    "JAVA_TOOL_OPTIONS": "-Dfile.encoding=UTF-8"
  }'
```

# Java Streams Enhancements in v 9
This sample code supports the presentation at 
[https://www.slideshare.net/CorneilduPlessis/enhancements-in-java-9-streams](https://www.slideshare.net/CorneilduPlessis/enhancements-in-java-9-streams)

## Build
You will need Java 9 to build.

```bash
./gradlew build
```

If you want to compare Java 8 and Java 9 performance.
Set you path for the specific JVM.

```bash
./gradlew :java8:jmh
```

In order to run both:
Set path for Java 9.

```bash
./gradlew run
```

In order to run Java 8 only:
Set path for Java 8
```bash
./gradlew :java8:run
```

In order to run Java 9 only:
```bash
./gradlew :java9:run
```
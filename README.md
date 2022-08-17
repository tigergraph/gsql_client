# GSQL Client
GSQL client here is to access TigerGraph **programmatically**. If you simply want to access TigerGraph remotely, please refer to [Using a Remote GSQL Client](https://docs.tigergraph.com/dev/using-a-remote-gsql-client) for more information.

Please check out the [Package](https://github.com/tigergraph/gsql_client/packages/805501) to look up the dependency you want.

## Authentication
GitHub Packages require authentication to access a package. To authenticate, you will need a personal access token (PAT) with `read:packages` scope.

### Maven
You can authenticate to GitHub Packages by editing your `~/.m2/settings.xml`. Create a new one if it doesn't exist.

Here's an example `~/.m2/settings.xml`:
```xml
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/tigergraph/gsql_client</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>USERNAME</username>
      <password>TOKEN</password>
    </server>
  </servers>
</settings>
```
In the `server` tag under `servers`, replace `USERNAME` with your GitHub username, and `TOKEN` with your PAT.

For more information, please refer to [Working with the Apache Maven registry](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-with-a-personal-access-token).

### Gradle
You can authenticate to GitHub Packages by editing `repositories` configuration in your `build.gradle` (Gradle Groovy) or `build.gradle.kts` (Kotlin DSL).

Here's an example `repositories` configuration in `build.gradle` (Gradle Groovy):
```groovy
repositories {
  mavenCentral()
  maven {
    url 'https://maven.pkg.github.com/tigergraph/gsql_client'
    credentials {
      username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
      password = project.findProperty("gpr.key") ?: System.getenv("TOKEN")
    }
  }
}
```
You can either pass the project properties `gpr.user` and `gpr.key` with your GitHub username and PAT respectively, e.g.
```sh
./gradlew build -Pgpr.user=USERNAME -Pgpr.key=TOKEN
```
or set environment variables `USERNAME` and `TOKEN` as your GitHub username and PAT respectively.

For more information, please refer to [Working with the Gradle registry](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry#authenticating-to-github-packages).

## Older Releases

> :warning: Due to the critical security vulnerabilities discovered in Log4j, we highly recommend you to use the latest version of this library which is packed with the latest version of `log4j-core`.

Please visit [Maven Repository](https://mvnrepository.com/artifact/com.tigergraph.client/gsql_client) for older releases.

## Version Compatibility
| GSQL Client | Server |
| :---------- | :--------- |
| `3.6.2`     | `<= 3.6.*` |
| `3.6.0`     | `<= 3.6.1` |
| `3.5.3`     | `<= 3.5.*` |
| `3.5.0`     | `<= 3.5.2` |
| `3.4.0`     | `<= 3.4.0` |
| `3.2.3`     | `<= 3.2.*` |
| `3.2.0`     | `<= 3.2.2` |
| `3.1.2`     | `<= 3.1.*` |
| `3.1.0`     | `<= 3.1.0` |
| `3.0.5`     | `<= 3.0.6` |
| `3.0.0`     | `<= 3.0.0` |
| `2.6.2`     | `<= 2.6.6` |
| `2.6.0`     | `<= 2.6.1` |
| `2.5.2`     | `<= 2.5.4` |
| `2.5.0`     | `<= 2.5.0` |

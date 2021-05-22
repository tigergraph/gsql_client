# GSQL Client
GSQL client here is to access TigerGraph **programmatically**. If you simply want to access TigerGraph remotely, please refer to [Using a Remote GSQL Client](https://docs.tigergraph.com/dev/using-a-remote-gsql-client) for more information.

## Usage
Please check out [Packages](https://github.com/tigergraph/gsql_client/packages) to look up the dependency.
### Maven
1. Add the following under `<repositories>` in `~/.m2/settings.xml`:
```xml
<repository>
  <id>github</id>
  <url>https://maven.pkg.github.com/tigergraph/gsql_client</url>
  <snapshots>
    <enabled>true</enabled>
  </snapshots>
</repository>
```
2. Add the dependency found in [Packages](https://github.com/tigergraph/gsql_client/packages) to `pom.xml`

Please refer to [Working with the Apache Maven registry
](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry) for more information.

### Gradle

Please refer to [Working with the Gradle registry
](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry) for more information.
## Older Releases
Please visit [Maven Repository](https://mvnrepository.com/artifact/com.tigergraph.client/gsql_client) for older releases.

## Version Compatibility
| GSQL Client | Server |
| :---------- | :--------- |
| `3.1.2`     | `<= 3.1.2` |
| `3.1.0`     | `<= 3.1.0` |
| `3.0.5`     | `<= 3.0.6` |
| `3.0.0`     | `<= 3.0.0` |
| `2.6.2`     | `<= 2.6.6` |
| `2.6.0`     | `<= 2.6.1` |
| `2.5.2`     | `<= 2.5.4` |
| `2.5.0`     | `<= 2.5.0` |

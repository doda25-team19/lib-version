# lib-version

A shared Maven library that provides version awareness capabilities for the DODA application components.

## Features
- **VersionUtil:** A utility class that allows the application to inspect its own version at runtime.
- **Resource Filtering:** Automatically injects Maven project versions into the artifact during the build process.

## Usage
Add this dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.doda.team19</groupId>
    <artifactId>lib-version</artifactId>
    <version>${lib-version.version}</version>
</dependency>

package org.doda25.team19.libversion;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Utility class to retrieve the version of the library at runtime.
 * This class reads the version information from a {@code version.properties} file
 * which is filtered by Maven during the build. This allows the
 * runtime version to always match the project metadata defined in {@code pom.xml}.
 */
public class VersionUtil {

    /**
     * Retrieves the current version of the library.
     *
     * @return the version string defined in {@code pom.xml} (e.g., "1.0.0" or "1.0.0-SNAPSHOT"),
     *         or "unknown" if the version metadata cannot be found.
     */
    public String getVersion() {
        
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("version.properties")) {

            if (input == null) {
                return "unknown";
            }

            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty("version", "unknown");

        } catch (IOException ex) {
            return "unknown";
        }
    }
}
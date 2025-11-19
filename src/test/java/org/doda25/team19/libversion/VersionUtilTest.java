package org.doda25.team19.libversion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VersionUtilTest {

    @Test
    public void testGetVersion() {
        VersionUtil util = new VersionUtil();
        String version = util.getVersion();
        
        System.out.println("Detected Version: " + version);
        
        assertNotNull(version, "Version should never be null");
        assertNotEquals("unknown", version, "Version should be found in properties file");
        assertFalse(version.isEmpty(), "Version string should not be empty");
    }
}
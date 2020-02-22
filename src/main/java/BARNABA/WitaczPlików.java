package BARNABA;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class WitaczPlików {

    public void powitajPlik(Path path) throws IOException {
        Files.write(path, "Cześć".getBytes(StandardCharsets.UTF_8));
    }

}
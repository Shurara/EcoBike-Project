package ui;

import java.nio.file.Path;

public class FilePathGetter {
    private final String stringPath = "src/ecobike.txt";
    private Path path;

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public String getUserFilePath() {
        return DataChecker.getStringValue(str -> str == null || str.trim().isEmpty(), "String must be not empty. Input brand");
    }


}

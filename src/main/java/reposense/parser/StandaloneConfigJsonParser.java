package reposense.parser;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;

import com.google.gson.reflect.TypeToken;

import reposense.model.StandaloneConfig;

/**
 * Parses json file from {@link Path} and creates a new {@link StandaloneConfig} object.
 */
public class StandaloneConfigJsonParser extends JsonParser<StandaloneConfig> {

    /**
     * Gets the type of {@link StandaloneConfig} for json conversion.
     */
    @Override
    public Type getType() {
        return new TypeToken<StandaloneConfig>(){}.getType();
    }

    /**
     * Converts json file from the given {@code path} and returns a {@link StandaloneConfig} object.
     *
     * @throws IOException if {@code path} is invalid.
     */
    @Override
    public StandaloneConfig parse(Path path) throws IOException {
        return fromJson(path);
    }
}

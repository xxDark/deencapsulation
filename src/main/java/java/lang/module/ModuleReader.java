package java.lang.module;

import java.io.Closeable;
import java.io.IOException;
import java.util.stream.Stream;

public interface ModuleReader extends Closeable {
    Stream<String> list() throws IOException;
    @Override
    void close() throws IOException;
}

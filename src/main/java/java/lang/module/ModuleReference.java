package java.lang.module;

import java.io.IOException;

public abstract class ModuleReference {
    public abstract ModuleReader open() throws IOException;
}

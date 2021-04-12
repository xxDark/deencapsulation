package java.lang.module;

import java.util.Set;

public interface ModuleFinder {
    static ModuleFinder ofSystem() {
        throw new UnsupportedOperationException();
    }
    Set<ModuleReference> findAll();
}

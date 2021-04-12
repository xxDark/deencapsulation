package java.lang;

import java.util.Set;

public abstract class ModuleLayer {
  public Set<Module> modules() {
    throw new UnsupportedOperationException();
  }
  public static ModuleLayer boot() {
    throw new UnsupportedOperationException();
  }
}

package java.lang;

import java.util.Set;
public abstract class Module {
  public ModuleLayer getLayer() { throw new UnsupportedOperationException(); }
  public Set<String> getPackages() { throw new UnsupportedOperationException(); }
}

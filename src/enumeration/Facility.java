package enumeration;

public enum Facility {
    ALPHA("завод","альфа"),
    BETA("завод","бета"),

    DELTA("завод","дельта"),
;

    final String name;
    final String type;
    Facility(String type, String name) {
        this.type=type;
        this.name=name;
    }


  @Override
  public String toString() {
      return  type + ' ' + name ;
  }
}
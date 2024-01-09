package abstractClass;

public abstract class RocketPart {
    private String name;
    private double weight;

    public RocketPart(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void assemble(String fasilityname);
}
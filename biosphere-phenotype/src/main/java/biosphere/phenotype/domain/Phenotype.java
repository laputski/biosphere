package biosphere.phenotype.domain;

public class Phenotype {

    private Long id;
    private Float xPosition;
    private Float yPosition;

    public Phenotype() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getxPosition() {
        return xPosition;
    }

    public void setxPosition(Float xPosition) {
        this.xPosition = xPosition;
    }

    public Float getyPosition() {
        return yPosition;
    }

    public void setyPosition(Float yPosition) {
        this.yPosition = yPosition;
    }
}

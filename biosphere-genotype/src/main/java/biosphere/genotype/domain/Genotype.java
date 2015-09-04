package biosphere.genotype.domain;

public class Genotype {

    private Long id;
    private Long chromosome;

    public Genotype() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChromosome() {
        return chromosome;
    }

    public void setChromosome(Long chromosome) {
        this.chromosome = chromosome;
    }
}

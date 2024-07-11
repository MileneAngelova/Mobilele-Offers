package bg.softuni.mobileleoffers.models.entities;

import bg.softuni.mobileleoffers.models.enums.EngineEnum;
import bg.softuni.mobileleoffers.models.enums.TransmissionEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    private EngineEnum engine;

    @Column(nullable = false)
    @Positive
    private int mileage;

    @Positive
    @NotNull(message = "This field can not be empty")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmission;

    public Offer() {
    }

    public Long getId() {
        return id;
    }

    public Offer setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Offer setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public Offer setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public Offer setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public Offer setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }
}

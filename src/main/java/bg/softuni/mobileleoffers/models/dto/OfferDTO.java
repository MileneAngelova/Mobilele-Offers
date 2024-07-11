package bg.softuni.mobileleoffers.models.dto;

import bg.softuni.mobileleoffers.models.enums.EngineEnum;
import bg.softuni.mobileleoffers.models.enums.TransmissionEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class OfferDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String description;

    @NotNull(message = "This field can not be empty")
    private EngineEnum engine;

    @Positive
    private int mileage;

    @Positive
    @NotNull(message = "This field can not be empty")
    private BigDecimal price;

    @NotNull(message = "This field can not be empty")
    private TransmissionEnum transmission;


    public OfferDTO() {
    }

    public OfferDTO(Long id, String description, Integer mileage, BigDecimal price, EngineEnum engine, TransmissionEnum transmission) {

    }

    public Long getId() {
        return id;
    }

    public OfferDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public OfferDTO setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public Integer getMileage() {
        return mileage;
    }

    public OfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public OfferDTO setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }
}

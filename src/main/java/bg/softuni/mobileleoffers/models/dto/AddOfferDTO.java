package bg.softuni.mobileleoffers.models.dto;

import bg.softuni.mobileleoffers.models.enums.EngineEnum;
import bg.softuni.mobileleoffers.models.enums.TransmissionEnum;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class AddOfferDTO {
    private String description;

    @NotNull(message = "This field can not be empty")
    private EngineEnum engine;

    @Positive
    private int mileage;

    @Positive
    @NotNull(message = "This field can not be empty")
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransmissionEnum transmission;


    public AddOfferDTO() {
    }

    public BigDecimal getPrice() {
        return price;
    }

    public AddOfferDTO setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public AddOfferDTO setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public AddOfferDTO setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AddOfferDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public AddOfferDTO setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public AddOfferDTO setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public String toString() {
        return "AddOfferDTO{" +
                "description='" + description + '\'' +
                ", engine=" + engine +
                ", mileage=" + mileage +
                ", price=" + price +
                ", transmission=" + transmission +
                '}';
    }
}

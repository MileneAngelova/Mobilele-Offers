package bg.softuni.mobileleoffers.web;

import bg.softuni.mobileleoffers.models.dto.AddOfferDTO;
import bg.softuni.mobileleoffers.models.dto.OfferDTO;
import bg.softuni.mobileleoffers.services.OfferService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offers")
public class OfferController {
    private final Logger LOGGER = LoggerFactory.getLogger(OfferController.class);
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping()
    public ResponseEntity<List<OfferDTO>> getAllOffers() {
        return ResponseEntity.ok(offerService.getAllOffers());
    }

    @PostMapping
    public ResponseEntity<OfferDTO> createOffer(@RequestBody AddOfferDTO addOfferDTO) {
        LOGGER.info("Going to create an offer {}", addOfferDTO);
        offerService.createOffer(addOfferDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OfferDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(this.offerService.getOfferById(id));

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<OfferDTO> deleteById(@PathVariable Long id) {
        this.offerService.deleteOffer(id);
        return ResponseEntity.ok().build();
    }
}

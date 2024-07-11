package bg.softuni.mobileleoffers.services;

import bg.softuni.mobileleoffers.models.dto.AddOfferDTO;
import bg.softuni.mobileleoffers.models.dto.OfferDTO;
import bg.softuni.mobileleoffers.models.entities.Offer;
import bg.softuni.mobileleoffers.repositories.OfferRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OfferService {
    private final OfferRepository offerRepository;
    private final ModelMapper modelMapper;

    public OfferService(OfferRepository offerRepository, ModelMapper modelMapper) {
        this.offerRepository = offerRepository;
        this.modelMapper = modelMapper;
    }

    public void createOffer(AddOfferDTO addOfferDTO) {
        offerRepository.save(this.modelMapper.map(addOfferDTO, Offer.class));
    }

    public List<OfferDTO> getAllOffers() {
        return offerRepository
                .findAll()
                .stream()
                .map(offer -> this.modelMapper.map(offer, OfferDTO.class))
                .toList();
    }

    public void deleteOffer(Long offerId) {
        this.offerRepository.deleteById(offerId);
    }

    public OfferDTO getOfferById(Long offerId) {
        return offerRepository.findById(offerId)
                .map(offer -> this.modelMapper.map(offer, OfferDTO.class))
                .orElseThrow(() -> new IllegalArgumentException("Offer not found!"));
    }
}

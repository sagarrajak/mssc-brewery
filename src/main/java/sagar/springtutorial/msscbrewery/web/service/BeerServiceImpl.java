package sagar.springtutorial.msscbrewery.web.service;

import org.springframework.stereotype.Service;
import sagar.springtutorial.msscbrewery.web.model.BeerDto;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().beerName("sdsds").id(id).beerStyle("dfsdfdfdf").build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return new BeerDto(beerDto);
    }
}

package sagar.springtutorial.msscbrewery.web.service;

import sagar.springtutorial.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    public BeerDto getBeerById(UUID id);

    BeerDto saveBeer(BeerDto beerDto);
}

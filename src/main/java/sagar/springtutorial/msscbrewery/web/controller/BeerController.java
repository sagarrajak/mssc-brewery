package sagar.springtutorial.msscbrewery.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sagar.springtutorial.msscbrewery.web.model.BeerDto;
import sagar.springtutorial.msscbrewery.web.service.BeerService;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
@Slf4j
public class BeerController {
    BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity createBeer(@RequestBody  BeerDto beerDto) {
        BeerDto savedDto = this.beerService.saveBeer(beerDto);
        return new ResponseEntity(savedDto, HttpStatus.CREATED);
    }


    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeer(@RequestBody BeerDto beerDto, @PathVariable("beerId") UUID beerId) {
        BeerDto beerDto1 = this.beerService.updateBeer(beerId, beerDto);
        log.debug(beerDto1.toString());
        return new ResponseEntity(beerDto1, HttpStatus.OK);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeer(@PathVariable UUID beerId) {
        this.beerService.deleteBeer(beerId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}

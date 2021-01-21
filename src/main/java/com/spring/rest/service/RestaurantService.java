package com.spring.rest.service;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.rest.model.Restaurant;
import com.spring.rest.repository.RestaurantRepository;

@Service
public class RestaurantService {

  @Autowired
  private RestaurantRepository repository;

  Logger logger = LoggerFactory.getLogger(RestaurantService.class);

  LocalTime time = LocalTime.now();
  String lastUpdatedTime = time.toString();

  public List<Restaurant> getAllRestaurants() {
    List<Restaurant> list = (List<Restaurant>) repository.findAll();
    return list;
  }

  public Optional<Restaurant> getRestaurantById(int id) {
    Optional<Restaurant> restaurant = repository.findById(id);
    return restaurant;
  }

  public Restaurant addRestaurant(Restaurant restaurant) {
    restaurant.setLastModifiedTime(lastUpdatedTime);
    Restaurant result = repository.save(restaurant);
    logger.info(lastUpdatedTime);
    return result;
  }


  public void updateRestaurantById(Restaurant restaurant, int id) {
    restaurant.setLastModifiedTime(lastUpdatedTime);
    restaurant.setId(id);
    repository.save(restaurant);
  }


  public void deleteRestaurantById(int id) {
    repository.deleteById(id);
  }


}

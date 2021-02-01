package com.epam.esm.service;

import com.epam.esm.dto.PaginationParameter;
import com.epam.esm.dto.TagDto;
import com.epam.esm.dto.UserDto;
import com.epam.esm.dto.UserDtoWithOrders;

import java.util.List;

/** The interface User service. */
public interface UserService {

  /**
   * Read user dto with orders.
   *
   * @param id the id
   * @return the user dto with orders
   */
  UserDtoWithOrders read(long id);

  /**
   * Read all list.
   *
   * @param parameter the parameter
   * @return the list
   */
  List<UserDto> readAll(PaginationParameter parameter);

  /**
   * Take most widely tag from user with highest cost orders tag dto.
   *
   * @return the tag dto
   */
  TagDto takeMostWidelyTagFromUserWithHighestCostOrders();
}

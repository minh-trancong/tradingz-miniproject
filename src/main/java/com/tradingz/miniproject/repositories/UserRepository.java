package com.tradingz.miniproject.repositories;

import org.springframework.data.repository.CrudRepository;
import com.tradingz.miniproject.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

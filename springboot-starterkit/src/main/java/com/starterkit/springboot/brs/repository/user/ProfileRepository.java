package com.starterkit.springboot.brs.repository.user;

import com.starterkit.springboot.brs.model.user.User;
import com.starterkit.springboot.brs.model.user.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

/**
 * Created by Arpit Khandelwal.
 */
public interface ProfileRepository extends MongoRepository<UserProfile, String> {


    // convention over configuration

    //findBy
    Optional<UserProfile> findByName(String rpofileIdentifier);



}

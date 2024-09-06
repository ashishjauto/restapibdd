package com.app.auto.payload;

import com.github.javafaker.Faker;

public class PetStoreUserSimulate {


    private static  Faker fakePetStoreUserDetails= new Faker();
    private static PetStoreUser petStoreUser = new PetStoreUser();
    public static PetStoreUser userCreation(){

        petStoreUser.setId(fakePetStoreUserDetails.idNumber().hashCode());
        petStoreUser.setUserName(fakePetStoreUserDetails.name().username());
        petStoreUser.setFirstName(fakePetStoreUserDetails.name().firstName());
        petStoreUser.setLastName(fakePetStoreUserDetails.name().lastName());
        petStoreUser.setEmail(fakePetStoreUserDetails.internet().emailAddress());
        petStoreUser.setPassword(fakePetStoreUserDetails.internet().password(5,10));
        petStoreUser.setPhone(fakePetStoreUserDetails.phoneNumber().cellPhone());


        return petStoreUser;
    }


}

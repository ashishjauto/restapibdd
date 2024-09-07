package com.app.auto.payload;

import com.github.javafaker.Faker;

public class PetStoreUserSimulate {


    private static  Faker fakePetStoreUserDetails= new Faker();
    private static PetStoreUser petStoreUser = new PetStoreUser();

    private  PetStoreUser petStoreUserAdd = new PetStoreUser();
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
    public  PetStoreUser userCreationAdd(){

        petStoreUserAdd.setId(new Faker().idNumber().hashCode());
        petStoreUserAdd.setUserName(new Faker().name().username());
        petStoreUserAdd.setFirstName(new Faker().name().firstName());
        petStoreUserAdd.setLastName(new Faker().name().lastName());
        petStoreUserAdd.setEmail(new Faker().internet().emailAddress());
        petStoreUserAdd.setPassword(new Faker().internet().password(5,10));
        petStoreUserAdd.setPhone(new Faker().phoneNumber().cellPhone());


        return petStoreUserAdd;
    }

}

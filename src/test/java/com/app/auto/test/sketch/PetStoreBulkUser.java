package com.app.auto.test.junk;

import com.app.auto.payload.PetStoreUser;
import com.app.auto.utilities.BulkPetStoreUser;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class PetStoreBulkUser {


    public static void main(String[] args) {

        BulkPetStoreUser bulkPetStoreUser = new BulkPetStoreUser();

        ArrayList<PetStoreUser> petStoreUserList = bulkPetStoreUser.bulkUserCreation();


        Iterator<PetStoreUser> petStoreUserIterator = petStoreUserList.listIterator();


        petStoreUserList.forEach(new Consumer<PetStoreUser>() {
            @Override
            public void accept(PetStoreUser petStoreUser) {
                System.out.println(petStoreUser.getId() + " " + petStoreUser.getUserstatus()+ " "+petStoreUser.getUserName()+" "+
                        petStoreUser.getFirstName()+" "+petStoreUser.getLastName()+ " "+ petStoreUser.getEmail()+" "+petStoreUser.getPhone());
            }
        });

        /*

        petStoreUserList.forEach(petStoreUser-> System.out.println(petStoreUser.getId() + " " + petStoreUser.getUserstatus()+ " "+petStoreUser.getUserName()+" "+
                petStoreUser.getFirstName()+" "+petStoreUser.getLastName()+ " "+ petStoreUser.getEmail()+" "+petStoreUser.getPhone()));

*/




        }
    }


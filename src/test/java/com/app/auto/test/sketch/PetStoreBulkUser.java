package com.app.auto.test.sketch;

import com.app.auto.payload.PetStoreUser;
import com.app.auto.utilities.BulkPetStoreUser;
import org.apache.groovy.internal.util.Function;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

public class PetStoreBulkUser {


    public static void main(String[] args) {

        BulkPetStoreUser bulkPetStoreUser = new BulkPetStoreUser();

        ArrayList<PetStoreUser> petStoreUserList = bulkPetStoreUser.bulkUserCreation();


        Iterator<PetStoreUser> petStoreUserIterator = petStoreUserList.listIterator();



        Function<Integer, Boolean> text = n->( n<5);


        System.out.println( text.apply( 3));






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


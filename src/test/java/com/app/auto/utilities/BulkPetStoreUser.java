package com.app.auto.utilities;

import com.app.auto.payload.PetStoreUser;
import com.app.auto.payload.PetStoreUserSimulate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BulkPetStoreUser {



    public BulkPetStoreUser(){}



    public ArrayList<PetStoreUser> bulkUserCreation (){

        ArrayList<PetStoreUser> bulkUserCreation = new ArrayList<>();





        for(int i =0; i<50;i++){
            bulkUserCreation.add(new PetStoreUserSimulate().userCreationAdd());
        }


        return bulkUserCreation;
    }
}

package org.erika.erikapetclinic.services;

import org.erika.erikapetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLatName (String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();


}

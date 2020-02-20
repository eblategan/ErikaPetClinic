package org.erika.erikapetclinic.services;

import org.erika.erikapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLatName (String lastName);

}

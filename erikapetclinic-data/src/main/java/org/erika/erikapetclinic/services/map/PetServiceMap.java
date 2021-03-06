package org.erika.erikapetclinic.services.map;

import org.erika.erikapetclinic.model.Pet;
import org.erika.erikapetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService <Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }


}


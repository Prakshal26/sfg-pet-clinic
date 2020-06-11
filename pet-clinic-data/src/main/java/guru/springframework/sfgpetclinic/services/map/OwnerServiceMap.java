/*
This Class is extending AbstractMapService which has generic defination of all the methons.
Here it will pass it's own object to the methods of base class using super keyword and
operation will be performed based in it.
 */

package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CurdService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CurdService<Owner,Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);

    }
}

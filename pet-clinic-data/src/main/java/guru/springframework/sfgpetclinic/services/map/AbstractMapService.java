/*
This Class will create a Map to store the data for us. This is kind of Genreic map
Like we are just Gving type T and a ID. Based on the object of that Type 'T' it is performing
operations like find all ,delete etc etc.
If you see this : protected Map<ID, T> map =new HashMap<>();
it will create the Map for any Type T we will pass and for that T it will perform operations.
Sp we have created VET,PET, Owner service map class that will have this abstract class
as it's base class and will override the method based on it's own object .

Here Map and Set is inbuilt java classes which allow us to store data based on key,value pair.

 */

package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map =new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }
    T findById (ID id) {
        return map.get(id);
    }
    T save(ID id,T object) {
        map.put(id, object);

        return object;
    }

    void deleteByid(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }
}


package com.Tienda.Repository;

import com.Tienda.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasRepository extends CrudRepository<Persona, Long>{
    
}

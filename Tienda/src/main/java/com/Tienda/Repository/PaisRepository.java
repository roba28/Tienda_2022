
package com.Tienda.Repository;

import com.Tienda.Entity.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PaisRepository extends CrudRepository<Pais, Long>{
    
}

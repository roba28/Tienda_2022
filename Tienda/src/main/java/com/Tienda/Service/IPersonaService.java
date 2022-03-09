
package com.Tienda.Service;

import com.Tienda.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getAlPerson();
    public void savePerson(Persona persona);
    public Persona getPersonbyID(long id);
    public void delete(long id);
    public void deletePersona(Persona persona);
    
}

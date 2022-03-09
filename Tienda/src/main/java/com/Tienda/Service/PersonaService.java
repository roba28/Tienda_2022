
package com.Tienda.Service;

import com.Tienda.Entity.Persona;
import com.Tienda.Repository.PersonasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonasRepository personarepository;

    @Override
    public List<Persona> getAlPerson() {
        return (List<Persona>)personarepository.findAll();
    }

    @Override
    public void savePerson(Persona persona) {
        personarepository.save(persona);
    }

    @Override
    public Persona getPersonbyID(long id) {
        Persona person = new Persona();
            return personarepository.findById(id).get();
    }

    @Override
    public void delete(long id) {
        personarepository.deleteById(id);
    }
    
      
    public void deletePersona(Persona persona) {
        personarepository.delete(persona);
    }
    
    
}

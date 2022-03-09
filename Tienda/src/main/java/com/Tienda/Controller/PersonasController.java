
package com.Tienda.Controller;

import com.Tienda.Entity.Persona;
import com.Tienda.Service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonasController {
    @Autowired
    private IPersonaService personaService;
    
    @GetMapping("/Persona")
    public String index(Model model){
    List<Persona> listapersonas=personaService.getAlPerson();
    model.addAttribute("Titulo","Persona");
    model.addAttribute("personas",listapersonas);
    return "personas";
    }
    
    @GetMapping("/nuevapersona")
    public String nuevaPersona(Model model,Persona persona){
    model.addAttribute("Titulo","Nueva Persona");
    return "NuevaPersona";
    }
    
    @PostMapping("guardarPersona")
    public String guardarPersona(Persona persona){
    personaService.savePerson(persona);
    return "redirect:/Persona";
    }
    
    @GetMapping("/eliminarPersona/{id}")
    public String eliminarPersona(Persona persona){
    personaService.deletePersona(persona);
    
    return "redirect:/Persona";
    }
    
}

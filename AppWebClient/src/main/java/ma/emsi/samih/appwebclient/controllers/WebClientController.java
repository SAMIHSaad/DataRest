package ma.emsi.samih.appwebclient.controllers;

import ma.emsi.samih.appwebclient.services.EtudiantWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class WebClientController {
    @Autowired
    EtudiantWebClient etudiantWebClient;

    @GetMapping("/all")
    public Map getEtudiants(){
        return etudiantWebClient.getEtudiants();
    }

    @GetMapping("/{id}")
    public Map getEtudiantById(@PathVariable("id") long id) {
        return etudiantWebClient.getEtudiantById(id);
    }

    @DeleteMapping("/supp/{p}") //http://localhost:8081/etudiants/supp/2
    public String suppEtudiant(@PathVariable("p") long id){
        return etudiantWebClient.deleteEtudiant(id);
    }

    @PostMapping("/add")
    public Map<String, Object> addEtudiant(@RequestBody Map<String, Object> etudiant) {
        return etudiantWebClient.addEtudiant(etudiant);
    }

    @PutMapping("/update/{id}")
    public Map<String, Object> updateEtudiant(@PathVariable("id") long id, @RequestBody Map<String, Object> etudiant) {
        return etudiantWebClient.updateEtudiant(id, etudiant);
    }
}
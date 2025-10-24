package ma.emsi.samih.datarest;

import ma.emsi.samih.datarest.enums.Genre;
import ma.emsi.samih.datarest.model.Etudiant;
import ma.emsi.samih.datarest.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class DataRestApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DataRestApplication.class, args);
    }
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Override
    public void run(String... args) throws Exception {
        Etudiant et1=Etudiant.builder()
                .nom("Adnani")
                .prenom("Said")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);
        Etudiant et2=Etudiant.builder()
                .nom("Rami")
                .prenom("Omar")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et2);
        Etudiant et3=Etudiant.builder()
                .nom("Raji")
                .prenom("Sanaa")
                .genre(Genre.Femme)
                .build();
        etudiantRepository.save(et3);

    }
}
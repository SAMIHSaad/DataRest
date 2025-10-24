package ma.emsi.samih.datarest.repository;

import ma.emsi.samih.datarest.model.Centre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path="centre")
public interface CentreRepository extends JpaRepository<Centre,Long> {
}
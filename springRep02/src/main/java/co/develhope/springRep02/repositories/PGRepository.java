package co.develhope.springRep02.repositories;

import co.develhope.springRep02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = " repo-prog-languages", collectionResourceDescription = @Description("this is the description"))
public interface PGRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}

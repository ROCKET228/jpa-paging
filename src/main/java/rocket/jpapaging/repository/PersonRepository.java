package rocket.jpapaging.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import rocket.jpapaging.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Page<Person> findAll(Pageable pageable);
}

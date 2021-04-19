package carmanagement.cockpit.car;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;


public interface CarRepository extends JpaRepository<Car, Long> {

    Set<Car> findAllByUserId(Long id);
}

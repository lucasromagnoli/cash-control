package br.com.lucasromagnoli.cashcontrol.movimentation;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentationRepository extends JpaRepository<Movimentation, Integer> {
    
}

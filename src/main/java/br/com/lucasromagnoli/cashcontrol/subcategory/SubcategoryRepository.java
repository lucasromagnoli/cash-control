package br.com.lucasromagnoli.cashcontrol.subcategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SubcategoryRepository extends JpaRepository<Subcategory, Integer> {
    
}

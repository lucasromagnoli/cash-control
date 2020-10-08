package br.com.lucasromagnoli.cashcontrol.subcategory;

import br.com.lucasromagnoli.cashcontrol.category.Category;
import br.com.lucasromagnoli.cashcontrol.expense.Expense;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@Table(name = "subcategory")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Subcategory {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    
}

package assignment.sesi13.belajar_rest_api.repository;

import assignment.sesi13.belajar_rest_api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

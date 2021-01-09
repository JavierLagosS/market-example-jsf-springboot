package cl.example.entities.domain.repositories;

import cl.example.entities.domain.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    ProductEntity findByIdAndClient_Id(int productId, int clientId);

    void deleteByIdAndClient_Id(int productId, int clientId);

}

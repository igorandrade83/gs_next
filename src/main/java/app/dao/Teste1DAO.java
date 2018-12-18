package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("Teste1DAO")
@Transactional(transactionManager="app-TransactionManager")
public interface Teste1DAO extends JpaRepository<Teste1, java.lang.String> {

  /**
   * Obtém a instância de Teste1 utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Teste1 entity WHERE entity.id = :id")
  public Teste1 findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Teste1 utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Teste1 entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Teste1 entity WHERE entity.string like concat('%',coalesce(:search,''),'%')")
  public Page<Teste1> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Teste1 entity WHERE (:data is null OR entity.data = :data) AND (:string is null OR entity.string like concat('%',:string,'%')) AND (:bool is null OR entity.bool = :bool)")
  public Page<Teste1> specificSearch(@Param(value="data") java.util.Date data, @Param(value="string") java.lang.String string, @Param(value="bool") java.lang.Boolean bool, Pageable pageable);
  
}

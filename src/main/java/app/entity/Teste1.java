package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.CronapiSearchable;


/**
 * Classe que representa a tabela TESTE1
 * @generated
 */
@Entity
@Table(name = "\"TESTE1\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Teste1")
public class Teste1 implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "Data", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "String", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.String string;

  /**
  * @generated
  */
  @Column(name = "bool", nullable = true, unique = false, insertable=true, updatable=true)
  @CronapiSearchable
  
  private java.lang.Boolean bool;

  /**
   * Construtor
   * @generated
   */
  public Teste1(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Teste1 setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Teste1 setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém string
   * return string
   * @generated
   */
  
  public java.lang.String getString(){
    return this.string;
  }

  /**
   * Define string
   * @param string string
   * @generated
   */
  public Teste1 setString(java.lang.String string){
    this.string = string;
    return this;
  }

  /**
   * Obtém bool
   * return bool
   * @generated
   */
  
  public java.lang.Boolean getBool(){
    return this.bool;
  }

  /**
   * Define bool
   * @param bool bool
   * @generated
   */
  public Teste1 setBool(java.lang.Boolean bool){
    this.bool = bool;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Teste1 object = (Teste1)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}

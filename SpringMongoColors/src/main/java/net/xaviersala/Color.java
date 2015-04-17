package net.xaviersala;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Color {

  @Id
  private String id;
  
  protected String catala;
  protected String castella;
  protected String frances;
  protected String angles;
  
  public Color() {
    
  }
  
  public Color(String string, String string2, String string3, String string4) {
    catala = string;
    castella = string2;
    frances = string3;
    angles = string4;
  }
  
  public String getId()
  {
     return this.id;
  }

  public void setId(final String id)
  {
     this.id = id;
  } 
  
  /**
   * @return the catala
   */
  public String getCatala() {
    return catala;
  }
  /**
   * @param catala the catala to set
   */
  public void setCatala(String catala) {
    this.catala = catala;
  }
  /**
   * @return the castella
   */
  public String getCastella() {
    return castella;
  }
  /**
   * @param castella the castella to set
   */
  public void setCastella(String castella) {
    this.castella = castella;
  }
  /**
   * @return the frances
   */
  public String getFrances() {
    return frances;
  }
  /**
   * @param frances the frances to set
   */
  public void setFrances(String frances) {
    this.frances = frances;
  }
  /**
   * @return the angles
   */
  public String getAngles() {
    return angles;
  }
  /**
   * @param angles the angles to set
   */
  public void setAngles(String angles) {
    this.angles = angles;
  }
  
  public String toString() {
    return catala + " " + castella + " " + frances + " " + angles;
  }
  
}

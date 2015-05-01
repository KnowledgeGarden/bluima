

/* First created by JCasGen Thu Aug 28 22:01:53 CEST 2014 */
package neuroner.NeuroNER;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Type defined in neuroner.NeuroNER
 * Updated by JCasGen Fri May 01 14:09:39 CEST 2015
 * XML source: /Users/richarde/dev/bluebrain/git/Bluima/modules/bluima_typesystem/src/main/resources/typeSystem/ruta/neuroNER/NeuroNERTypeSystem.xml
 * @generated */
public class Species extends NeuronProperty {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Species.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Species() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Species(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Species(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Species(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: name

  /** getter for name - gets name
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (Species_Type.featOkTst && ((Species_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "neuroner.NeuroNER.Species");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Species_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets name 
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Species_Type.featOkTst && ((Species_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "neuroner.NeuroNER.Species");
    jcasType.ll_cas.ll_setStringValue(addr, ((Species_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: ontologyId

  /** getter for ontologyId - gets ontologyId
   * @generated
   * @return value of the feature 
   */
  public String getOntologyId() {
    if (Species_Type.featOkTst && ((Species_Type)jcasType).casFeat_ontologyId == null)
      jcasType.jcas.throwFeatMissing("ontologyId", "neuroner.NeuroNER.Species");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Species_Type)jcasType).casFeatCode_ontologyId);}
    
  /** setter for ontologyId - sets ontologyId 
   * @generated
   * @param v value to set into the feature 
   */
  public void setOntologyId(String v) {
    if (Species_Type.featOkTst && ((Species_Type)jcasType).casFeat_ontologyId == null)
      jcasType.jcas.throwFeatMissing("ontologyId", "neuroner.NeuroNER.Species");
    jcasType.ll_cas.ll_setStringValue(addr, ((Species_Type)jcasType).casFeatCode_ontologyId, v);}    
  }

    
package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameterization extends js.Object {
  /**
    * Find parameter by name
    * @param sName Parameter name
    * @returns The parameter object with         this name or null if it does not exist
    */
  def findParameterByName(sName: String): Parameter
  /**
    * Get the names of all parameters part of the parameterization
    * @returns List of all parameter names
    */
  def getAllParameterNames(): js.Array[String]
  /**
    * Get all parameters included in this parameterization
    * @returns An object with individual JS properties for each         parameter included in the query
    * result. The JS object properties         all are objects of type odata4analytics.Parameter. The     
    *    names of the JS object properties are given by the OData entity         type property names
    * representing the parameter keys.
    */
  def getAllParameters(): js.Any
  /**
    * Get the entity set representing this query result in the OData model
    * @returns The OData entity set         representing this query result
    */
  def getEntitySet(): EntitySet
  /**
    * Get the entity type defining the type of this query result in the ODatamodel
    * @returns The OData entity type for         this query result
    */
  def getEntityType(): EntityType
  /**
    * Get the name of the parameter
    * @returns The name of the parameterization, which is identical         with the name of the entity
    * set representing the         parameterization in the OData service
    */
  def getName(): String
  /**
    * Get navigation property to query result
    * @returns The parameter object with         this name or null if it does not exist
    */
  def getNavigationPropertyToQueryResult(): QueryResult
}

object Parameterization {
  @scala.inline
  def apply(
    findParameterByName: String => Parameter,
    getAllParameterNames: () => js.Array[String],
    getAllParameters: () => js.Any,
    getEntitySet: () => EntitySet,
    getEntityType: () => EntityType,
    getName: () => String,
    getNavigationPropertyToQueryResult: () => QueryResult
  ): Parameterization = {
    val __obj = js.Dynamic.literal(findParameterByName = js.Any.fromFunction1(findParameterByName), getAllParameterNames = js.Any.fromFunction0(getAllParameterNames), getAllParameters = js.Any.fromFunction0(getAllParameters), getEntitySet = js.Any.fromFunction0(getEntitySet), getEntityType = js.Any.fromFunction0(getEntityType), getName = js.Any.fromFunction0(getName), getNavigationPropertyToQueryResult = js.Any.fromFunction0(getNavigationPropertyToQueryResult))
    __obj.asInstanceOf[Parameterization]
  }
}


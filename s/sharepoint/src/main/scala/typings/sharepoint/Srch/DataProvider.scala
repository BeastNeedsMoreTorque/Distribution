package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider extends ClientControl {
  def add_queryIssuing(value: js.Any): Unit
  def add_queryStateChanged(value: js.Any): Unit
  def add_resultReady(value: js.Any): Unit
  def displayControlMessages(): Unit
  def displayControl_QueryReady(sender: js.Any, e: js.Any): Unit
  def getSortName(): String
  def getSortRankName(): String
  def get_active(): Boolean
  def get_availableSorts(): js.Any
  def get_batched(): Boolean
  def get_bypassResultTypes(): Boolean
  def get_clientType(): String
  def get_collapseSpecification(): String
  def get_contextualScopeUrl(): String
  def get_currentQueryState(): js.Any
  def get_desiredSnippetLength(): Double
  def get_effectiveQueryLanguage(): js.Any
  def get_enableInterleaving(): Boolean
  def get_enableNicknames(): Boolean
  def get_enableOrderingHitHighlightedProperty(): Boolean
  def get_enablePhonetic(): Boolean
  def get_enableQueryRules(): Boolean
  def get_enableStemming(): Boolean
  def get_entityInfo(): js.Any
  def get_fallbackLanguage(): js.Any
  def get_fallbackRankingModelID(): String
  def get_fallbackRefinementFilters(): js.Any
  def get_fallbackSort(): js.Any
  def get_hitHighlightedMultivaluePropertyLimit(): Double
  def get_hitHighlightedProperties(): js.Any
  def get_initialQueryState(): js.Any
  def get_initialResult(): String
  def get_initialResultObject(): js.Any
  def get_initialResultRef(): js.Any
  def get_maxPagesAfterCurrent(): Double
  def get_parentImpressionID(): js.Any
  def get_personalizedQuery(): Boolean
  def get_processBestBets(): Boolean
  def get_processPersonalFavorites(): Boolean
  def get_properties(): js.Any
  def get_queryCount(): Double
  def get_queryGroupName(): String
  def get_queryPropertiesTemplateUrl(): String
  def get_queryTemplate(): js.Any
  def get_rankRules(): js.Any
  def get_refinementInfo(): StringDictionary[js.Array[RefinementInfo]]
  /** Number of results displayed per page. 10 by default */
  def get_resultsPerPage(): Double
  def get_resultsUrl(): js.Any
  def get_rowCount(): Double
  def get_selectedProperties(): js.Any
  def get_selectedRefiners(): js.Any
  def get_sourceID(): String
  def get_sourceLevel(): String
  def get_sourceName(): String
  def get_summaryLength(): Double
  def get_totalRows(): Double
  def get_trimDuplicates(): Boolean
  def get_upScopeUrl(): js.Any
  def get_updateAjaxNavigate(): Boolean
  def get_userAction(): js.Any
  def issueQuery(): Unit
  def processInitial(): Unit
  def raiseEmptyResultReadyEvent(): Unit
  def raiseQueryIssuingEvent(arg: js.Any): Unit
  def raiseQueryStateChangedEvent(arg: js.Any): Unit
  def raiseResultReadyEvent(arg: js.Any): Unit
  def remove_queryIssuing(value: js.Any): Unit
  def remove_resultReady(value: js.Any): Unit
  def searchBox_BatchQueryIssuing(sender: js.Any, e: js.Any): Unit
  def searchBox_BatchResultReady(sender: js.Any, e: js.Any): Unit
  def searchBox_QueryReady(sender: js.Any, e: js.Any): Unit
  def set_active(value: Boolean): Boolean
  def set_availableSorts(value: js.Any): js.Any
  def set_batched(value: Boolean): Boolean
  def set_bypassResultTypes(value: Boolean): Boolean
  def set_clientType(value: String): String
  def set_collapseSpecification(value: String): String
  def set_contextualScopeUrl(value: String): String
  def set_desiredSnippetLength(value: Double): Double
  def set_enableInterleaving(value: Boolean): Boolean
  def set_enableNicknames(value: Boolean): Boolean
  def set_enableOrderingHitHighlightedProperty(value: Boolean): Boolean
  def set_enablePhonetic(value: Boolean): Boolean
  def set_enableQueryRules(value: Boolean): Boolean
  def set_enableStemming(value: Boolean): Boolean
  def set_fallbackLanguage(value: js.Any): js.Any
  def set_fallbackRankingModelID(value: String): String
  def set_fallbackRefinementFilters(value: js.Any): js.Any
  def set_fallbackSort(value: js.Any): js.Any
  def set_hitHighlightedMultivaluePropertyLimit(value: Double): Double
  def set_hitHighlightedProperties(value: js.Any): js.Any
  def set_initialQueryState(value: js.Any): js.Any
  def set_initialResult(value: String): String
  def set_initialResultRef(value: js.Any): js.Any
  def set_maxPagesAfterCurrent(value: Double): Double
  def set_parentImpressionID(value: js.Any): js.Any
  def set_personalizedQuery(value: Boolean): Boolean
  def set_processBestBets(value: Boolean): Boolean
  def set_processPersonalFavorites(value: Boolean): Boolean
  def set_properties(value: js.Any): js.Any
  def set_queryCount(value: Double): Double
  def set_queryGroupName(value: String): String
  def set_queryPropertiesTemplateUrl(value: String): String
  def set_queryTemplate(value: js.Any): js.Any
  def set_rankRules(value: js.Any): js.Any
  /** Number of results displayed per page. 10 by default */
  def set_resultsPerPage(value: Double): Double
  def set_resultsUrl(value: js.Any): js.Any
  def set_rowCount(value: Double): Double
  def set_selectedProperties(value: js.Any): js.Any
  def set_selectedRefiners(value: js.Any): js.Any
  def set_sourceID(value: String): String
  def set_sourceLevel(value: String): String
  def set_sourceName(value: String): String
  def set_summaryLength(value: Double): Double
  def set_totalRows(value: Double): Double
  def set_trimDuplicates(value: Boolean): Boolean
  def set_updateAjaxNavigate(value: Boolean): Boolean
  def set_userAction(value: js.Any): js.Any
}

object DataProvider {
  @scala.inline
  def apply(
    addCssClass: String => Unit,
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    add_queryIssuing: js.Any => Unit,
    add_queryStateChanged: js.Any => Unit,
    add_resultReady: js.Any => Unit,
    alternateRenderContext: js.Any,
    alternateRenderer: js.Any,
    beginUpdate: () => Unit,
    clickHandler: Event => js.Any,
    displayControlMessages: () => Unit,
    displayControl_QueryReady: (js.Any, js.Any) => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    getSortName: () => String,
    getSortRankName: () => String,
    get_active: () => Boolean,
    get_alternateErrorMessage: () => String,
    get_availableSorts: () => js.Any,
    get_batched: () => Boolean,
    get_bypassResultTypes: () => Boolean,
    get_clientType: () => String,
    get_collapseSpecification: () => String,
    get_contextualScopeUrl: () => String,
    get_currentQueryState: () => js.Any,
    get_delayLoadTemplateScripts: () => Boolean,
    get_desiredSnippetLength: () => Double,
    get_effectiveQueryLanguage: () => js.Any,
    get_element: () => HTMLElement,
    get_enableInterleaving: () => Boolean,
    get_enableNicknames: () => Boolean,
    get_enableOrderingHitHighlightedProperty: () => Boolean,
    get_enablePhonetic: () => Boolean,
    get_enableQueryRules: () => Boolean,
    get_enableStemming: () => Boolean,
    get_entityInfo: () => js.Any,
    get_events: () => js.Any,
    get_fallbackLanguage: () => js.Any,
    get_fallbackRankingModelID: () => String,
    get_fallbackRefinementFilters: () => js.Any,
    get_fallbackSort: () => js.Any,
    get_hitHighlightedMultivaluePropertyLimit: () => Double,
    get_hitHighlightedProperties: () => js.Any,
    get_id: () => String,
    get_initialQueryState: () => js.Any,
    get_initialResult: () => String,
    get_initialResultObject: () => js.Any,
    get_initialResultRef: () => js.Any,
    get_isInitialLoad: () => Boolean,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_maxPagesAfterCurrent: () => Double,
    get_messages: () => js.Array[_],
    get_nextUniqueId: () => String,
    get_parentImpressionID: () => js.Any,
    get_personalizedQuery: () => Boolean,
    get_processBestBets: () => Boolean,
    get_processPersonalFavorites: () => Boolean,
    get_properties: () => js.Any,
    get_queryCount: () => Double,
    get_queryGroupName: () => String,
    get_queryPropertiesTemplateUrl: () => String,
    get_queryTemplate: () => js.Any,
    get_rankRules: () => js.Any,
    get_refinementInfo: () => StringDictionary[js.Array[RefinementInfo]],
    get_renderTemplateId: () => String,
    get_resultsPerPage: () => Double,
    get_resultsUrl: () => js.Any,
    get_rowCount: () => Double,
    get_selectedProperties: () => js.Any,
    get_selectedRefiners: () => js.Any,
    get_showDataErrors: () => Boolean,
    get_sourceID: () => String,
    get_sourceLevel: () => String,
    get_sourceName: () => String,
    get_states: () => js.Any,
    get_summaryLength: () => Double,
    get_totalRows: () => Double,
    get_trimDuplicates: () => Boolean,
    get_upScopeUrl: () => js.Any,
    get_updateAjaxNavigate: () => Boolean,
    get_userAction: () => js.Any,
    hasMessages: () => js.Any,
    initialize: () => Unit,
    invokeAlternateRender: (js.Any, js.Any, js.Any) => js.Any,
    invokeClientRenderer: (js.Any, js.Any) => js.Any,
    issueQuery: () => Unit,
    loadRenderTemplateScripts: (js.Any, js.Any, js.Any, js.Any, js.Any) => Boolean,
    loadServerTemplateScripts: () => Unit,
    loaded: Boolean,
    onBubbleEvent: (js.Any, js.Any) => Boolean,
    processDataErrorMessages: js.Any => js.Any,
    processDataProviderErrors: js.Any => Unit,
    processInitial: () => Unit,
    processRenderingErrorMessages: js.Any => js.Any,
    raiseBubbleEvent: (js.Any, js.Any) => Unit,
    raiseEmptyResultReadyEvent: () => Unit,
    raisePropertyChanged: String => Unit,
    raiseQueryIssuingEvent: js.Any => Unit,
    raiseQueryStateChangedEvent: js.Any => Unit,
    raiseResultReadyEvent: js.Any => Unit,
    removeCssClass: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    remove_queryIssuing: js.Any => Unit,
    remove_resultReady: js.Any => Unit,
    renderControl: (js.Any, js.Any) => Unit,
    scriptApplication_Load: (js.Any, js.Any) => Unit,
    scriptApplication_PostLoad: (js.Any, js.Any) => Unit,
    scriptApplication_PreLoad: (js.Any, js.Any) => Unit,
    searchBox_BatchQueryIssuing: (js.Any, js.Any) => Unit,
    searchBox_BatchResultReady: (js.Any, js.Any) => Unit,
    searchBox_QueryReady: (js.Any, js.Any) => Unit,
    serverTemplateScriptsCallback: () => Unit,
    serverTemplateScriptsToLoad: js.Array[_],
    setControlElementVisibility: Boolean => js.Any,
    set_active: Boolean => Boolean,
    set_alternateErrorMessage: String => String,
    set_availableSorts: js.Any => js.Any,
    set_batched: Boolean => Boolean,
    set_bypassResultTypes: Boolean => Boolean,
    set_clientType: String => String,
    set_collapseSpecification: String => String,
    set_contextualScopeUrl: String => String,
    set_delayLoadTemplateScripts: Boolean => Boolean,
    set_desiredSnippetLength: Double => Double,
    set_enableInterleaving: Boolean => Boolean,
    set_enableNicknames: Boolean => Boolean,
    set_enableOrderingHitHighlightedProperty: Boolean => Boolean,
    set_enablePhonetic: Boolean => Boolean,
    set_enableQueryRules: Boolean => Boolean,
    set_enableStemming: Boolean => Boolean,
    set_fallbackLanguage: js.Any => js.Any,
    set_fallbackRankingModelID: String => String,
    set_fallbackRefinementFilters: js.Any => js.Any,
    set_fallbackSort: js.Any => js.Any,
    set_hitHighlightedMultivaluePropertyLimit: Double => Double,
    set_hitHighlightedProperties: js.Any => js.Any,
    set_id: String => Unit,
    set_initialQueryState: js.Any => js.Any,
    set_initialResult: String => String,
    set_initialResultRef: js.Any => js.Any,
    set_maxPagesAfterCurrent: Double => Double,
    set_messages: js.Array[_] => js.Array[_],
    set_parentImpressionID: js.Any => js.Any,
    set_personalizedQuery: Boolean => Boolean,
    set_processBestBets: Boolean => Boolean,
    set_processPersonalFavorites: Boolean => Boolean,
    set_properties: js.Any => js.Any,
    set_queryCount: Double => Double,
    set_queryGroupName: String => String,
    set_queryPropertiesTemplateUrl: String => String,
    set_queryTemplate: js.Any => js.Any,
    set_rankRules: js.Any => js.Any,
    set_renderTemplateId: String => String,
    set_resultsPerPage: Double => Double,
    set_resultsUrl: js.Any => js.Any,
    set_rowCount: Double => Double,
    set_selectedProperties: js.Any => js.Any,
    set_selectedRefiners: js.Any => js.Any,
    set_showDataErrors: Boolean => Boolean,
    set_sourceID: String => String,
    set_sourceLevel: String => String,
    set_sourceName: String => String,
    set_states: js.Any => js.Any,
    set_summaryLength: Double => Double,
    set_totalRows: Double => Double,
    set_trimDuplicates: Boolean => Boolean,
    set_updateAjaxNavigate: Boolean => Boolean,
    set_userAction: js.Any => js.Any,
    toggleCssClass: String => Unit,
    updateDisplayControlWithNewMessages: () => js.Any,
    updated: () => Unit
  ): DataProvider = {
    val __obj = js.Dynamic.literal(addCssClass = js.Any.fromFunction1(addCssClass), add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), add_queryIssuing = js.Any.fromFunction1(add_queryIssuing), add_queryStateChanged = js.Any.fromFunction1(add_queryStateChanged), add_resultReady = js.Any.fromFunction1(add_resultReady), alternateRenderContext = alternateRenderContext.asInstanceOf[js.Any], alternateRenderer = alternateRenderer.asInstanceOf[js.Any], beginUpdate = js.Any.fromFunction0(beginUpdate), clickHandler = js.Any.fromFunction1(clickHandler), displayControlMessages = js.Any.fromFunction0(displayControlMessages), displayControl_QueryReady = js.Any.fromFunction2(displayControl_QueryReady), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), getSortName = js.Any.fromFunction0(getSortName), getSortRankName = js.Any.fromFunction0(getSortRankName), get_active = js.Any.fromFunction0(get_active), get_alternateErrorMessage = js.Any.fromFunction0(get_alternateErrorMessage), get_availableSorts = js.Any.fromFunction0(get_availableSorts), get_batched = js.Any.fromFunction0(get_batched), get_bypassResultTypes = js.Any.fromFunction0(get_bypassResultTypes), get_clientType = js.Any.fromFunction0(get_clientType), get_collapseSpecification = js.Any.fromFunction0(get_collapseSpecification), get_contextualScopeUrl = js.Any.fromFunction0(get_contextualScopeUrl), get_currentQueryState = js.Any.fromFunction0(get_currentQueryState), get_delayLoadTemplateScripts = js.Any.fromFunction0(get_delayLoadTemplateScripts), get_desiredSnippetLength = js.Any.fromFunction0(get_desiredSnippetLength), get_effectiveQueryLanguage = js.Any.fromFunction0(get_effectiveQueryLanguage), get_element = js.Any.fromFunction0(get_element), get_enableInterleaving = js.Any.fromFunction0(get_enableInterleaving), get_enableNicknames = js.Any.fromFunction0(get_enableNicknames), get_enableOrderingHitHighlightedProperty = js.Any.fromFunction0(get_enableOrderingHitHighlightedProperty), get_enablePhonetic = js.Any.fromFunction0(get_enablePhonetic), get_enableQueryRules = js.Any.fromFunction0(get_enableQueryRules), get_enableStemming = js.Any.fromFunction0(get_enableStemming), get_entityInfo = js.Any.fromFunction0(get_entityInfo), get_events = js.Any.fromFunction0(get_events), get_fallbackLanguage = js.Any.fromFunction0(get_fallbackLanguage), get_fallbackRankingModelID = js.Any.fromFunction0(get_fallbackRankingModelID), get_fallbackRefinementFilters = js.Any.fromFunction0(get_fallbackRefinementFilters), get_fallbackSort = js.Any.fromFunction0(get_fallbackSort), get_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction0(get_hitHighlightedMultivaluePropertyLimit), get_hitHighlightedProperties = js.Any.fromFunction0(get_hitHighlightedProperties), get_id = js.Any.fromFunction0(get_id), get_initialQueryState = js.Any.fromFunction0(get_initialQueryState), get_initialResult = js.Any.fromFunction0(get_initialResult), get_initialResultObject = js.Any.fromFunction0(get_initialResultObject), get_initialResultRef = js.Any.fromFunction0(get_initialResultRef), get_isInitialLoad = js.Any.fromFunction0(get_isInitialLoad), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_maxPagesAfterCurrent = js.Any.fromFunction0(get_maxPagesAfterCurrent), get_messages = js.Any.fromFunction0(get_messages), get_nextUniqueId = js.Any.fromFunction0(get_nextUniqueId), get_parentImpressionID = js.Any.fromFunction0(get_parentImpressionID), get_personalizedQuery = js.Any.fromFunction0(get_personalizedQuery), get_processBestBets = js.Any.fromFunction0(get_processBestBets), get_processPersonalFavorites = js.Any.fromFunction0(get_processPersonalFavorites), get_properties = js.Any.fromFunction0(get_properties), get_queryCount = js.Any.fromFunction0(get_queryCount), get_queryGroupName = js.Any.fromFunction0(get_queryGroupName), get_queryPropertiesTemplateUrl = js.Any.fromFunction0(get_queryPropertiesTemplateUrl), get_queryTemplate = js.Any.fromFunction0(get_queryTemplate), get_rankRules = js.Any.fromFunction0(get_rankRules), get_refinementInfo = js.Any.fromFunction0(get_refinementInfo), get_renderTemplateId = js.Any.fromFunction0(get_renderTemplateId), get_resultsPerPage = js.Any.fromFunction0(get_resultsPerPage), get_resultsUrl = js.Any.fromFunction0(get_resultsUrl), get_rowCount = js.Any.fromFunction0(get_rowCount), get_selectedProperties = js.Any.fromFunction0(get_selectedProperties), get_selectedRefiners = js.Any.fromFunction0(get_selectedRefiners), get_showDataErrors = js.Any.fromFunction0(get_showDataErrors), get_sourceID = js.Any.fromFunction0(get_sourceID), get_sourceLevel = js.Any.fromFunction0(get_sourceLevel), get_sourceName = js.Any.fromFunction0(get_sourceName), get_states = js.Any.fromFunction0(get_states), get_summaryLength = js.Any.fromFunction0(get_summaryLength), get_totalRows = js.Any.fromFunction0(get_totalRows), get_trimDuplicates = js.Any.fromFunction0(get_trimDuplicates), get_upScopeUrl = js.Any.fromFunction0(get_upScopeUrl), get_updateAjaxNavigate = js.Any.fromFunction0(get_updateAjaxNavigate), get_userAction = js.Any.fromFunction0(get_userAction), hasMessages = js.Any.fromFunction0(hasMessages), initialize = js.Any.fromFunction0(initialize), invokeAlternateRender = js.Any.fromFunction3(invokeAlternateRender), invokeClientRenderer = js.Any.fromFunction2(invokeClientRenderer), issueQuery = js.Any.fromFunction0(issueQuery), loadRenderTemplateScripts = js.Any.fromFunction5(loadRenderTemplateScripts), loadServerTemplateScripts = js.Any.fromFunction0(loadServerTemplateScripts), loaded = loaded.asInstanceOf[js.Any], onBubbleEvent = js.Any.fromFunction2(onBubbleEvent), processDataErrorMessages = js.Any.fromFunction1(processDataErrorMessages), processDataProviderErrors = js.Any.fromFunction1(processDataProviderErrors), processInitial = js.Any.fromFunction0(processInitial), processRenderingErrorMessages = js.Any.fromFunction1(processRenderingErrorMessages), raiseBubbleEvent = js.Any.fromFunction2(raiseBubbleEvent), raiseEmptyResultReadyEvent = js.Any.fromFunction0(raiseEmptyResultReadyEvent), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), raiseQueryIssuingEvent = js.Any.fromFunction1(raiseQueryIssuingEvent), raiseQueryStateChangedEvent = js.Any.fromFunction1(raiseQueryStateChangedEvent), raiseResultReadyEvent = js.Any.fromFunction1(raiseResultReadyEvent), removeCssClass = js.Any.fromFunction1(removeCssClass), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), remove_queryIssuing = js.Any.fromFunction1(remove_queryIssuing), remove_resultReady = js.Any.fromFunction1(remove_resultReady), renderControl = js.Any.fromFunction2(renderControl), scriptApplication_Load = js.Any.fromFunction2(scriptApplication_Load), scriptApplication_PostLoad = js.Any.fromFunction2(scriptApplication_PostLoad), scriptApplication_PreLoad = js.Any.fromFunction2(scriptApplication_PreLoad), searchBox_BatchQueryIssuing = js.Any.fromFunction2(searchBox_BatchQueryIssuing), searchBox_BatchResultReady = js.Any.fromFunction2(searchBox_BatchResultReady), searchBox_QueryReady = js.Any.fromFunction2(searchBox_QueryReady), serverTemplateScriptsCallback = js.Any.fromFunction0(serverTemplateScriptsCallback), serverTemplateScriptsToLoad = serverTemplateScriptsToLoad.asInstanceOf[js.Any], setControlElementVisibility = js.Any.fromFunction1(setControlElementVisibility), set_active = js.Any.fromFunction1(set_active), set_alternateErrorMessage = js.Any.fromFunction1(set_alternateErrorMessage), set_availableSorts = js.Any.fromFunction1(set_availableSorts), set_batched = js.Any.fromFunction1(set_batched), set_bypassResultTypes = js.Any.fromFunction1(set_bypassResultTypes), set_clientType = js.Any.fromFunction1(set_clientType), set_collapseSpecification = js.Any.fromFunction1(set_collapseSpecification), set_contextualScopeUrl = js.Any.fromFunction1(set_contextualScopeUrl), set_delayLoadTemplateScripts = js.Any.fromFunction1(set_delayLoadTemplateScripts), set_desiredSnippetLength = js.Any.fromFunction1(set_desiredSnippetLength), set_enableInterleaving = js.Any.fromFunction1(set_enableInterleaving), set_enableNicknames = js.Any.fromFunction1(set_enableNicknames), set_enableOrderingHitHighlightedProperty = js.Any.fromFunction1(set_enableOrderingHitHighlightedProperty), set_enablePhonetic = js.Any.fromFunction1(set_enablePhonetic), set_enableQueryRules = js.Any.fromFunction1(set_enableQueryRules), set_enableStemming = js.Any.fromFunction1(set_enableStemming), set_fallbackLanguage = js.Any.fromFunction1(set_fallbackLanguage), set_fallbackRankingModelID = js.Any.fromFunction1(set_fallbackRankingModelID), set_fallbackRefinementFilters = js.Any.fromFunction1(set_fallbackRefinementFilters), set_fallbackSort = js.Any.fromFunction1(set_fallbackSort), set_hitHighlightedMultivaluePropertyLimit = js.Any.fromFunction1(set_hitHighlightedMultivaluePropertyLimit), set_hitHighlightedProperties = js.Any.fromFunction1(set_hitHighlightedProperties), set_id = js.Any.fromFunction1(set_id), set_initialQueryState = js.Any.fromFunction1(set_initialQueryState), set_initialResult = js.Any.fromFunction1(set_initialResult), set_initialResultRef = js.Any.fromFunction1(set_initialResultRef), set_maxPagesAfterCurrent = js.Any.fromFunction1(set_maxPagesAfterCurrent), set_messages = js.Any.fromFunction1(set_messages), set_parentImpressionID = js.Any.fromFunction1(set_parentImpressionID), set_personalizedQuery = js.Any.fromFunction1(set_personalizedQuery), set_processBestBets = js.Any.fromFunction1(set_processBestBets), set_processPersonalFavorites = js.Any.fromFunction1(set_processPersonalFavorites), set_properties = js.Any.fromFunction1(set_properties), set_queryCount = js.Any.fromFunction1(set_queryCount), set_queryGroupName = js.Any.fromFunction1(set_queryGroupName), set_queryPropertiesTemplateUrl = js.Any.fromFunction1(set_queryPropertiesTemplateUrl), set_queryTemplate = js.Any.fromFunction1(set_queryTemplate), set_rankRules = js.Any.fromFunction1(set_rankRules), set_renderTemplateId = js.Any.fromFunction1(set_renderTemplateId), set_resultsPerPage = js.Any.fromFunction1(set_resultsPerPage), set_resultsUrl = js.Any.fromFunction1(set_resultsUrl), set_rowCount = js.Any.fromFunction1(set_rowCount), set_selectedProperties = js.Any.fromFunction1(set_selectedProperties), set_selectedRefiners = js.Any.fromFunction1(set_selectedRefiners), set_showDataErrors = js.Any.fromFunction1(set_showDataErrors), set_sourceID = js.Any.fromFunction1(set_sourceID), set_sourceLevel = js.Any.fromFunction1(set_sourceLevel), set_sourceName = js.Any.fromFunction1(set_sourceName), set_states = js.Any.fromFunction1(set_states), set_summaryLength = js.Any.fromFunction1(set_summaryLength), set_totalRows = js.Any.fromFunction1(set_totalRows), set_trimDuplicates = js.Any.fromFunction1(set_trimDuplicates), set_updateAjaxNavigate = js.Any.fromFunction1(set_updateAjaxNavigate), set_userAction = js.Any.fromFunction1(set_userAction), toggleCssClass = js.Any.fromFunction1(toggleCssClass), updateDisplayControlWithNewMessages = js.Any.fromFunction0(updateDisplayControlWithNewMessages), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[DataProvider]
  }
}


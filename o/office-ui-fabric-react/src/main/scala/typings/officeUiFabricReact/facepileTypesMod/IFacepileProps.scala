package typings.officeUiFabricReact.facepileTypesMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import typings.officeUiFabricReact.facepileBaseMod.FacepileBase
import typings.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typings.officeUiFabricReact.personaTypesMod.PersonaSize
import typings.react.mod.ClassAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFacepileProps extends ClassAttributes[FacepileBase] {
  /** Button properties for the add face button */
  var addButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /** ARIA label for persona list */
  var ariaDescription: js.UndefOr[String] = js.undefined
  /**
    * Defines the aria label that the screen readers use when focus goes on a list of personas.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated at v0.70, use `overflowButtonProps` instead.
    * @deprecated Use `overflowButtonProps` instead.
    */
  var chevronButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Additional css class to apply to the Facepile
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IFacepile interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFacepile]] = js.undefined
  /** Method to access properties on the underlying Persona control */
  var getPersonaProps: js.UndefOr[js.Function1[/* persona */ IFacepilePersona, IPersonaSharedProps]] = js.undefined
  /** Maximum number of personas to show */
  var maxDisplayablePersonas: js.UndefOr[Double] = js.undefined
  /** Optional custom renderer for the persona, gets called when there is one persona in personas array*/
  var onRenderPersona: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.undefined
  /** Optional custom renderer for the persona coins, gets called when there are multiple persona in personas array*/
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.undefined
  /** Properties for the overflow icon */
  var overflowButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /** Type of overflow icon to use */
  var overflowButtonType: js.UndefOr[OverflowButtonType] = js.undefined
  /**
    * Personas to place in the overflow
    */
  var overflowPersonas: js.UndefOr[js.Array[IFacepilePersona]] = js.undefined
  /** Size to display the personas */
  var personaSize: js.UndefOr[PersonaSize] = js.undefined
  /**
    * Array of IPersonaProps that define each Persona.
    */
  var personas: js.Array[IFacepilePersona]
  /** Show add person button */
  var showAddButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IFacepileProps {
  @scala.inline
  def apply(
    personas: js.Array[IFacepilePersona],
    addButtonProps: IButtonProps = null,
    ariaDescription: String = null,
    ariaLabel: String = null,
    chevronButtonProps: IButtonProps = null,
    className: String = null,
    componentRef: IRefObject[IFacepile] = null,
    getPersonaProps: /* persona */ IFacepilePersona => IPersonaSharedProps = null,
    key: Key = null,
    maxDisplayablePersonas: js.UndefOr[Double] = js.undefined,
    onRenderPersona: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null = null,
    overflowButtonProps: IButtonProps = null,
    overflowButtonType: OverflowButtonType = null,
    overflowPersonas: js.Array[IFacepilePersona] = null,
    personaSize: PersonaSize = null,
    ref: js.UndefOr[Null | LegacyRef[FacepileBase]] = js.undefined,
    showAddButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles] = null,
    theme: ITheme = null
  ): IFacepileProps = {
    val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    if (addButtonProps != null) __obj.updateDynamic("addButtonProps")(addButtonProps.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (chevronButtonProps != null) __obj.updateDynamic("chevronButtonProps")(chevronButtonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getPersonaProps != null) __obj.updateDynamic("getPersonaProps")(js.Any.fromFunction1(getPersonaProps))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDisplayablePersonas)) __obj.updateDynamic("maxDisplayablePersonas")(maxDisplayablePersonas.get.asInstanceOf[js.Any])
    if (onRenderPersona != null) __obj.updateDynamic("onRenderPersona")(js.Any.fromFunction2(onRenderPersona))
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2(onRenderPersonaCoin))
    if (overflowButtonProps != null) __obj.updateDynamic("overflowButtonProps")(overflowButtonProps.asInstanceOf[js.Any])
    if (overflowButtonType != null) __obj.updateDynamic("overflowButtonType")(overflowButtonType.asInstanceOf[js.Any])
    if (overflowPersonas != null) __obj.updateDynamic("overflowPersonas")(overflowPersonas.asInstanceOf[js.Any])
    if (personaSize != null) __obj.updateDynamic("personaSize")(personaSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddButton)) __obj.updateDynamic("showAddButton")(showAddButton.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileProps]
  }
}


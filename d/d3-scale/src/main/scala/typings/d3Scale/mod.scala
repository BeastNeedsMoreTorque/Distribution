package typings.d3Scale

import typings.d3Scale.anon.Name
import typings.d3Scale.anon.ToString
import typings.d3Scale.anon.ValueOf
import typings.d3Scale.d3ScaleStrings.`implicit`
import typings.d3Time.mod.CountableTimeInterval
import typings.d3Time.mod.TimeInterval_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-scale", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ScaleBand_[Domain /* <: ToString */] extends js.Object {
    /**
      * Given a value in the input domain, returns the start of the corresponding band derived from the output range.
      * If the given value is not in the scale’s domain, returns undefined.
      *
      * @param x  A value from the domain.
      */
    def apply(x: Domain): js.UndefOr[Double] = js.native
    /**
      * Returns the current alignment which defaults to 0.5.
      */
    def align(): Double = js.native
    /**
      * Sets the alignment to the specified value which must be in the range [0, 1].
      *
      * The default is 0.5.
      *
      * The alignment determines how any leftover unused space in the range is distributed.
      * A value of 0.5 indicates that the leftover space should be equally distributed before the first band and after the last band;
      * i.e., the bands should be centered within the range. A value of 0 or 1 may be used to shift the bands to one side, say to position them adjacent to an axis.
      *
      * @param align Value for alignment setting in [0, 1] interval.
      */
    def align(align: Double): this.type = js.native
    /**
      * Returns the width of each band.
      */
    def bandwidth(): Double = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns to scale's current domain
      */
    def domain(): js.Array[Domain] = js.native
    /**
      * Sets the domain to the specified array of values. The first element in domain will be mapped to the first band, the second domain value to the second band, and so on.
      * Domain values are stored internally in a map from stringified value to index; the resulting index is then used to determine the band.
      * Thus, a band scale’s values must be coercible to a string, and the stringified version of the domain value uniquely identifies the corresponding band.
      *
      * @param domain Array of domain values.
      */
    def domain(domain: js.Array[Domain]): this.type = js.native
    /**
      * Returns the inner padding.
      */
    def padding(): Double = js.native
    /**
      * A convenience method for setting the inner and outer padding to the same padding value.
      *
      * @param padding Value for inner and outer padding in [0, 1] interval.
      */
    def padding(padding: Double): this.type = js.native
    /**
      * Returns the current inner padding which defaults to 0.
      */
    def paddingInner(): Double = js.native
    /**
      * Sets the inner padding to the specified value which must be in the range [0, 1].
      * The inner padding determines the ratio of the range that is reserved for blank space between bands.
      *
      * The default setting is 0.
      *
      * @param padding Value for inner padding in [0, 1] interval.
      */
    def paddingInner(padding: Double): this.type = js.native
    /**
      * Returns the current outer padding which defaults to 0.
      */
    def paddingOuter(): Double = js.native
    /**
      * Sets the outer padding to the specified value which must be in the range [0, 1].
      * The outer padding determines the ratio of the range that is reserved for blank space before the first band and after the last band.
      *
      * The default setting is 0.
      *
      * @param padding Value for outer padding in [0, 1] interval.
      */
    def paddingOuter(padding: Double): this.type = js.native
    /**
      * Returns the scale’s current range, which defaults to [0, 1].
      */
    def range(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the scale’s range to the specified two-element array of numbers. If the elements in the given array are not numbers, they will be coerced to numbers.
      * The default range is [0, 1].
      *
      * @param range A two-element array of numeric values.
      */
    def range(range: js.Tuple2[Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Sets the scale’s range to the specified two-element array of numbers while also enabling rounding.
      * If the elements in the given array are not numbers, they will be coerced to numbers.
      *
      * Rounding is sometimes useful for avoiding antialiasing artifacts, though also consider the shape-rendering “crispEdges” styles.
      *
      * @param range A two-element array of numeric values.
      */
    def rangeRound(range: js.Tuple2[Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Returns the current rounding status for the scale: enabled (= true) or disabled (= false).
      */
    def round(): Boolean = js.native
    /**
      * Enables or disables rounding accordingly. If rounding is enabled, the start and stop of each band will be integers.
      * Rounding is sometimes useful for avoiding antialiasing artifacts, though also consider the shape-rendering “crispEdges” styles.
      * Note that if the width of the domain is not a multiple of the cardinality of the range, there may be leftover unused space, even without padding!
      * Use band.align to specify how the leftover space is distributed.
      *
      * @param round Enable rounding (= true), disable rounding (= false).
      */
    def round(round: Boolean): this.type = js.native
    /**
      * Returns the distance between the starts of adjacent bands.
      */
    def step(): Double = js.native
  }
  
  @js.native
  trait ScaleContinuousNumeric[Range, Output] extends js.Object {
    /**
      * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
      *
      * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
      *
      * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
      *
      * @param value A numeric value from the domain.
      */
    def apply(value: Double): Output = js.native
    def apply(value: ValueOf): Output = js.native
    /**
      * Returns whether or not the scale currently clamps values to within the range.
      */
    def clamp(): Boolean = js.native
    /**
      * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
      * the scale may return a value outside the range through extrapolation.
      *
      * If clamping is enabled, the return value of the scale is always within the scale’s range. Clamping similarly applies to the "invert" method.
      *
      * @param clamp A flag to enable (true) or disable (false) clamping.
      */
    def clamp(clamp: Boolean): this.type = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns a copy of the scale’s current domain.
      */
    def domain(): js.Array[Double] = js.native
    /**
      * Sets the scale’s domain to the specified array of numbers. The array must contain two or more elements.
      * If the elements in the given array are not numbers, they will be coerced to numbers
      *
      * Although continuous scales typically have two values each in their domain and range, specifying more than two values produces a piecewise scale.
      *
      * Internally, a piecewise scale performs a binary search for the range interpolator corresponding to the given domain value.
      * Thus, the domain must be in ascending or descending order. If the domain and range have different lengths N and M, only the first min(N,M) elements in each are observed.
      *
      * @param domain Array of numeric domain values.
      */
    def domain(domain: js.Array[Double | ValueOf]): this.type = js.native
    /**
      * Given a value from the range, returns the corresponding value from the domain. Inversion is useful for interaction,
      * say to determine the data value corresponding to the position of the mouse.
      *
      * If the given value is outside the range, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the domain.
      *
      * IMPORTANT: This method is only supported if the range is numeric. If the range is not numeric, returns NaN.
      *
      * For a valid value y in the range, continuous(continuous.invert(y)) approximately equals y;
      * similarly, for a valid value x in the domain, continuous.invert(continuous(x)) approximately equals x.
      * The scale and its inverse may not be exact due to the limitations of floating point precision.
      *
      * @param value A numeric value from the range.
      */
    def invert(value: Double): Double = js.native
    def invert(value: ValueOf): Double = js.native
    /**
      * Extends the domain so that it starts and ends on nice round values.
      * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
      * An optional tick count argument allows greater control over the step size used to extend the bounds,
      * guaranteeing that the returned ticks will exactly cover the domain.
      * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
      * For example, for a domain of [0.201479…, 0.996679…], a nice domain might be [0.2, 1.0].
      * If the domain has more than two values, nicing the domain only affects the first and last value.
      *
      * Nicing a scale only modifies the current domain; it does not automatically nice domains that are subsequently set using continuous.domain.
      * You must re-nice the scale after setting the new domain, if desired.
      *
      * @param count An optional number of ticks expected to be used.
      */
    def nice(): this.type = js.native
    def nice(count: Double): this.type = js.native
    /**
      * Returns a copy of the scale’s current range.
      */
    def range(): js.Array[Range] = js.native
    /**
      * Sets the scale’s range to the specified array of values.
      *
      * The array must contain two or more elements. Unlike the domain, elements in the given array need not be numbers;
      * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Range]): this.type = js.native
    /**
      * Sets the scale’s range to the specified array of values while also setting the scale’s interpolator to interpolateRound.
      *
      * The rounding interpolator is sometimes useful for avoiding antialiasing artifacts,
      * though also consider the shape-rendering “crispEdges” styles. Note that this interpolator can only be used with numeric ranges.
      *
      * The array must contain two or more elements. Unlike the domain, elements in the given array need not be numbers;
      * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
      *
      * @param range Array of range values.
      */
    def rangeRound(range: js.Array[Double | ValueOf]): this.type = js.native
    /**
      * Returns a number format function suitable for displaying a tick value, automatically computing the appropriate precision based on the fixed interval between tick values.
      * The specified count should have the same value as the count that is used to generate the tick values.
      *
      * @param count Approximate number of ticks to be used when calculating precision for the number format function.
      * @param specifier An optional valid format specifier string which allows a custom format where the precision of the format is automatically set by the scale as appropriate for the tick interval.
      * If specifier uses the format type "s", the scale will return a SI-prefix format based on the largest value in the domain.
      * If the specifier already specifies a precision, this method is equivalent to locale.format.
      */
    def tickFormat(): js.Function1[/* d */ Double | ValueOf, String] = js.native
    def tickFormat(count: Double): js.Function1[/* d */ Double | ValueOf, String] = js.native
    def tickFormat(count: Double, specifier: String): js.Function1[/* d */ Double | ValueOf, String] = js.native
    /**
      * Returns approximately count representative values from the scale’s domain.
      *
      * If count is not specified, it defaults to 10.
      *
      * The returned tick values are uniformly spaced, have human-readable values (such as multiples of powers of 10),
      * and are guaranteed to be within the extent of the domain. Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
      * The specified count is only a hint; the scale may return more or fewer values depending on the domain. See also d3-array’s ticks.
      *
      * @param count Optional approximate number of ticks to be returned. If count is not specified, it defaults to 10.
      */
    def ticks(): js.Array[Double] = js.native
    def ticks(count: Double): js.Array[Double] = js.native
  }
  
  @js.native
  trait ScaleDiverging_[Output] extends js.Object {
    /**
      * Given a value from the domain, returns the corresponding value subject to interpolation.
      *
      * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
      *
      * @param value A numeric value from the domain.
      */
    def apply(value: Double): Output = js.native
    def apply(value: ValueOf): Output = js.native
    /**
      * Returns whether or not the scale currently clamps values to within the range.
      */
    def clamp(): Boolean = js.native
    /**
      * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
      * the scale may return a value outside the range through extrapolation.
      *
      * If clamping is enabled, the return value of the scale is always within the interpolator scale’s range.
      *
      * @param clamp A flag to enable (true) or disable (false) clamping.
      */
    def clamp(clamp: Boolean): this.type = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns a copy of the scale’s current domain.
      */
    def domain(): js.Tuple3[Double, Double, Double] = js.native
    /**
      * Sets the scale’s domain to the specified array of numbers.
      * The domain must be numeric and must contain exactly three values. The default domain is [0, 0.5, 1].
      * If the elements in the given array are not numbers, they will be coerced to numbers
      *
      * @param domain Array of three numeric domain values.
      */
    def domain(domain: js.Tuple3[Double | ValueOf, Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Returns the scale’s current interpolator.
      */
    def interpolator(): js.Function1[/* t */ Double, Output] = js.native
    def interpolator(interpolator: js.Function1[/* t */ Double, Output]): this.type = js.native
    /**
      * Sets the scale’s interpolator to the specified function.
      *
      * @param interpolator The scale’s interpolator.
      */
    @JSName("interpolator")
    def interpolator_This(): this.type = js.native
  }
  
  @js.native
  trait ScaleIdentity_ extends js.Object {
    /**
      * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
      *
      * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
      *
      * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
      *
      * @param value A numeric value from the domain.
      */
    def apply(value: Double): Double = js.native
    def apply(value: ValueOf): Double = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): ScaleIdentity_ = js.native
    /**
      * Returns a copy of the scale’s current domain.
      */
    def domain(): js.Array[Double] = js.native
    /**
      * Sets the scale’s domain to the specified array of numbers. The array must contain two or more elements.
      * If the elements in the given array are not numbers, they will be coerced to numbers
      *
      * Although continuous scales typically have two values each in their domain and range, specifying more than two values produces a piecewise scale.
      *
      * Internally, a piecewise scale performs a binary search for the range interpolator corresponding to the given domain value.
      * Thus, the domain must be in ascending or descending order. If the domain and range have different lengths N and M, only the first min(N,M) elements in each are observed.
      *
      * @param domain Array of numeric domain values.
      */
    def domain(domain: js.Array[Double | ValueOf]): this.type = js.native
    /**
      * Given a value from the range, returns the corresponding value from the domain. Inversion is useful for interaction,
      * say to determine the data value corresponding to the position of the mouse.
      *
      * If the given value is outside the range, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the domain.
      *
      * IMPORTANT: This method is only supported if the range is numeric. If the range is not numeric, returns NaN.
      *
      * For a valid value y in the range, continuous(continuous.invert(y)) approximately equals y;
      * similarly, for a valid value x in the domain, continuous.invert(continuous(x)) approximately equals x.
      * The scale and its inverse may not be exact due to the limitations of floating point precision.
      *
      * @param value A numeric value from the range.
      */
    def invert(value: Double): Double = js.native
    def invert(value: ValueOf): Double = js.native
    /**
      * Extends the domain so that it starts and ends on nice round values.
      * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
      * An optional tick count argument allows greater control over the step size used to extend the bounds,
      * guaranteeing that the returned ticks will exactly cover the domain.
      * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
      * For example, for a domain of [0.201479…, 0.996679…], a nice domain might be [0.2, 1.0].
      * If the domain has more than two values, nicing the domain only affects the first and last value.
      *
      * Nicing a scale only modifies the current domain; it does not automatically nice domains that are subsequently set using continuous.domain.
      * You must re-nice the scale after setting the new domain, if desired.
      *
      * @param count An optional number of ticks expected to be used.
      */
    def nice(): this.type = js.native
    def nice(count: Double): this.type = js.native
    /**
      * Returns a copy of the scale’s current range.
      */
    def range(): js.Array[Double] = js.native
    /**
      * Sets the scale’s range to the specified array of values.
      *
      * The array must contain two or more elements. Unlike the domain, elements in the given array need not be numbers;
      * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Double | ValueOf]): this.type = js.native
    /**
      * Returns a number format function suitable for displaying a tick value, automatically computing the appropriate precision based on the fixed interval between tick values.
      * The specified count should have the same value as the count that is used to generate the tick values.
      *
      * @param count Approximate number of ticks to be used when calculating precision for the number format function.
      * @param specifier An optional valid format specifier string which allows a custom format where the precision of the format is automatically set by the scale as appropriate for the tick interval.
      * If specifier uses the format type "s", the scale will return a SI-prefix format based on the largest value in the domain.
      * If the specifier already specifies a precision, this method is equivalent to locale.format.
      */
    def tickFormat(): js.Function1[/* d */ Double | ValueOf, String] = js.native
    def tickFormat(count: Double): js.Function1[/* d */ Double | ValueOf, String] = js.native
    def tickFormat(count: Double, specifier: String): js.Function1[/* d */ Double | ValueOf, String] = js.native
    /**
      * Returns approximately count representative values from the scale’s domain.
      *
      * If count is not specified, it defaults to 10.
      *
      * The returned tick values are uniformly spaced, have human-readable values (such as multiples of powers of 10),
      * and are guaranteed to be within the extent of the domain. Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
      * The specified count is only a hint; the scale may return more or fewer values depending on the domain. See also d3-array’s ticks.
      *
      * @param count Optional approximate number of ticks to be returned. If count is not specified, it defaults to 10.
      */
    def ticks(): js.Array[Double] = js.native
    def ticks(count: Double): js.Array[Double] = js.native
  }
  
  @js.native
  trait ScaleLinear_[Range, Output] extends ScaleContinuousNumeric[Range, Output] {
    /**
      * Returns the scale’s current interpolator factory, which defaults to interpolate.
      */
    def interpolate(): InterpolatorFactory[_, _] = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    def interpolate(interpolate: InterpolatorFactory[Range, Output]): this.type = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * The generic "NewOutput" can be used to change the scale to have a different output element type corresponding to the new interpolation factory.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    @JSName("interpolate")
    def interpolate_NewOutput_ScaleLinear_[NewOutput](interpolate: InterpolatorFactory[Range, NewOutput]): ScaleLinear_[Range, NewOutput] = js.native
  }
  
  @js.native
  trait ScaleLogarithmic[Range, Output] extends ScaleContinuousNumeric[Range, Output] {
    /**
      * Returns the current base, which defaults to 10.
      */
    def base(): Double = js.native
    /**
      * Sets the base for this logarithmic scale to the specified value.
      */
    def base(base: Double): this.type = js.native
    /**
      * Returns the scale’s current interpolator factory, which defaults to interpolate.
      */
    def interpolate(): InterpolatorFactory[_, _] = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    def interpolate(interpolate: InterpolatorFactory[Range, Output]): this.type = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * The generic "NewOutput" can be used to change the scale to have a different output element type corresponding to the new interpolation factory.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    @JSName("interpolate")
    def interpolate_NewOutput_ScaleLogarithmic[NewOutput](interpolate: InterpolatorFactory[Range, NewOutput]): ScaleLogarithmic[Range, NewOutput] = js.native
  }
  
  @js.native
  trait ScaleOrdinal_[Domain /* <: ToString */, Range] extends js.Object {
    /**
      * Given a value in the input domain, returns the corresponding value in the output range.
      * If the given value is not in the scale’s domain, returns the unknown; or, if the unknown value is implicit (the default),
      * then the value is implicitly added to the domain and the next-available value in the range is assigned to value,
      * such that this and subsequent invocations of the scale given the same input value return the same output value.
      *
      * @param x A value from the domain.
      */
    def apply(x: Domain): Range = js.native
    /**
      * Returns an exact copy of this ordinal scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns the scale's current domain.
      */
    def domain(): js.Array[Domain] = js.native
    /**
      * Sets the domain to the specified array of values.
      *
      * The first element in domain will be mapped to the first element in the range,
      * the second domain value to the second range value, and so on.
      *
      * Domain values are stored internally in a map from stringified value to index; the resulting index is then used to retrieve a value from the range.
      * Thus, an ordinal scale’s values must be coercible to a string, and the stringified version of the domain value uniquely identifies the corresponding range value.
      *
      * Setting the domain on an ordinal scale is optional if the unknown value is implicit (the default).
      * In this case, the domain will be inferred implicitly from usage by assigning each unique value passed to the scale a new value from the range.
      * Note that an explicit domain is recommended to ensure deterministic behavior, as inferring the domain from usage will be dependent on ordering.
      *
      * @param domain Array of domain values.
      */
    def domain(domain: js.Array[Domain]): this.type = js.native
    /**
      * Returns the scale's current range.
      */
    def range(): js.Array[Range] = js.native
    /**
      * Sets the range of the ordinal scale to the specified array of values.
      *
      * The first element in the domain will be mapped to the first element in range, the second domain value to the second range value, and so on.
      *
      * If there are fewer elements in the range than in the domain, the scale will reuse values from the start of the range.
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Range]): this.type = js.native
    /**
      * Returns the current unknown value, which defaults to "implicit".
      */
    def unknown(): Range | Name = js.native
    /**
      * Sets the output value of the scale for unknown input values and returns this scale.
      * The implicit value enables implicit domain construction. scaleImplicit can be used as a convenience to set the implicit value.
      *
      * @param value Unknown value to be used or scaleImplicit to set implicit scale generation.
      */
    def unknown(value: Range): this.type = js.native
    def unknown(value: Name): this.type = js.native
  }
  
  @js.native
  trait ScalePoint_[Domain /* <: ToString */] extends js.Object {
    /**
      * Given a value in the input domain, returns the corresponding point derived from the output range.
      * If the given value is not in the scale’s domain, returns undefined.
      *
      * @param x  A value from the domain.
      */
    def apply(x: Domain): js.UndefOr[Double] = js.native
    /**
      * Returns the current alignment which defaults to 0.5.
      */
    def align(): Double = js.native
    /**
      * Sets the alignment to the specified value which must be in the range [0, 1].
      *
      * The alignment determines how any leftover unused space in the range is distributed.
      * A value of 0.5 indicates that the leftover space should be equally distributed before the first point and after the last point;
      * i.e., the points should be centered within the range. A value of 0 or 1 may be used to shift the points to one side, say to position them adjacent to an axis.
      *
      * The default value is 0.5.
      *
      * @param align Value for alignment setting in [0, 1] interval.
      */
    def align(align: Double): this.type = js.native
    /**
      * Return 0.
      */
    def bandwidth(): Double = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns the scale's current domain.
      */
    def domain(): js.Array[Domain] = js.native
    /**
      * Sets the domain to the specified array of values. The first element in domain will be mapped to the first point, the second domain value to the second point, and so on.
      * Domain values are stored internally in a map from stringified value to index; the resulting index is then used to determine the point.
      * Thus, a point scale’s values must be coercible to a string, and the stringified version of the domain value uniquely identifies the corresponding point.
      *
      * @param domain Array of domain values.
      */
    def domain(domain: js.Array[Domain]): this.type = js.native
    /**
      * Returns the current outer padding which defaults to 0.
      * The outer padding determines the ratio of the range that is reserved for blank space
      * before the first point and after the last point.
      *
      */
    def padding(): Double = js.native
    /**
      * Sets the outer padding to the specified value which must be in the range [0, 1].
      * The outer padding determines the ratio of the range that is reserved for blank space
      * before the first point and after the last point.
      *
      * The default is 0.
      *
      * @param padding Value for outer padding in [0, 1] interval.
      */
    def padding(padding: Double): this.type = js.native
    /**
      * Returns the scale’s current range, which defaults to [0, 1].
      */
    def range(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the scale’s range to the specified two-element array of numbers.
      * If the elements in the given array are not numbers, they will be coerced to numbers.
      * The default range is [0, 1].
      *
      * @param range A two-element array of numeric values.
      */
    def range(range: js.Tuple2[Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Sets the scale’s range to the specified two-element array of numbers while also enabling rounding.
      * If the elements in the given array are not numbers, they will be coerced to numbers.
      *
      * Rounding is sometimes useful for avoiding antialiasing artifacts, though also consider the shape-rendering “crispEdges” styles.
      *
      * @param range A two-element array of numeric values.
      */
    def rangeRound(range: js.Tuple2[Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Returns the current rounding status for the scale: enabled (= true) or disabled (= false).
      */
    def round(): Boolean = js.native
    /**
      * Enables or disables rounding accordingly. If rounding is enabled, the position of each point will be integers.
      * Rounding is sometimes useful for avoiding antialiasing artifacts, though also consider the shape-rendering “crispEdges” styles.
      * Note that if the width of the domain is not a multiple of the cardinality of the range, there may be leftover unused space, even without padding!
      * Use point.align to specify how the leftover space is distributed.
      *
      * @param round Enable rounding (= true), disable rounding (= false).
      */
    def round(round: Boolean): this.type = js.native
    /**
      * Returns the distance between the starts of adjacent points.
      */
    def step(): Double = js.native
  }
  
  @js.native
  trait ScalePower[Range, Output] extends ScaleContinuousNumeric[Range, Output] {
    /**
      * If exponent is not specified, returns the current exponent, which defaults to 1.
      * (Note that this is effectively a linear scale until you set a different exponent.)
      */
    def exponent(): Double = js.native
    /**
      * Sets the current exponent to the given numeric value.
      * (Note that this is effectively a linear scale until you set a different exponent.)
      */
    def exponent(exponent: Double): this.type = js.native
    /**
      * Returns the scale’s current interpolator factory, which defaults to interpolate.
      */
    def interpolate(): InterpolatorFactory[_, _] = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    def interpolate(interpolate: InterpolatorFactory[Range, Output]): this.type = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * The generic "NewOutput" can be used to change the scale to have a different output element type corresponding to the new interpolation factory.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    @JSName("interpolate")
    def interpolate_NewOutput_ScalePower[NewOutput](interpolate: InterpolatorFactory[Range, NewOutput]): ScalePower[Range, NewOutput] = js.native
  }
  
  @js.native
  trait ScaleQuantile_[Range] extends js.Object {
    /**
      * Given a value in the input domain, returns the corresponding value in the output range.
      *
      * @param value A numeric value in the input domain.
      */
    def apply(value: Double): Range = js.native
    def apply(value: ValueOf): Range = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns the scale’s current domain.
      */
    def domain(): js.Array[Double] = js.native
    /**
      * Sets the domain of the quantile scale to the specified set of discrete numeric values.
      * The array must not be empty, and must contain at least one numeric value; NaN, null and undefined values are ignored and not considered part of the sample population.
      *
      * If the elements in the given array are not numbers, they will be coerced to numbers. A copy of the input array is sorted and stored internally.
      *
      * @param domain Array of domain values.
      */
    def domain(domain: js.Array[js.UndefOr[Double | ValueOf | Null]]): this.type = js.native
    /**
      * Returns the extent of values in the domain [x0, x1] for the corresponding value in the range: the inverse of quantile.
      * This method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
      *
      * @param value A value from the range.
      */
    def invertExtent(value: Range): js.Tuple2[Double, Double] = js.native
    /**
      * Returns the quantile thresholds. If the range contains n discrete values, the returned array will contain n - 1 thresholds.
      * Values less than the first threshold are considered in the first quantile;
      * values greater than or equal to the first threshold but less than the second threshold are in the second quantile, and so on.
      * Internally, the thresholds array is used with bisect to find the output quantile associated with the given input value.
      */
    def quantiles(): js.Array[Double] = js.native
    /**
      * Returns the current range.
      */
    def range(): js.Array[Range] = js.native
    /**
      * Sets the discrete values in the range. The array must not be empty.
      * The number of values in (the cardinality, or length, of) the range array determines the number of quantiles that are computed.
      *
      * For example, to compute quartiles, range must be an array of four elements such as [0, 1, 2, 3].
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Range]): this.type = js.native
  }
  
  @js.native
  trait ScaleQuantize_[Range] extends js.Object {
    /**
      * Given a value in the input domain, returns the corresponding value in the output range.
      */
    def apply(value: Double): Range = js.native
    def apply(value: ValueOf): Range = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns the scale’s current domain.
      */
    def domain(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the scale’s domain to the specified two-element array of numbers.
      * If the elements in the given array are not numbers, they will be coerced to numbers.
      *
      * @param domain A two-element array of numeric values defining the domain.
      */
    def domain(domain: js.Tuple2[Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Returns the extent of values in the domain [x0, x1] for the corresponding value in the range: the inverse of quantize.
      * This method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
      *
      * If an invalid range value is entered, returns [NaN, NaN].
      *
      * @param value A value from the range.
      */
    def invertExtent(value: Range): js.Tuple2[Double, Double] = js.native
    /**
      * Extends the domain so that it starts and ends on nice round values.
      * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
      *
      * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
      * For example, for a domain of [0.201479…, 0.996679…], a nice domain might be [0.2, 1.0].
      *
      * Nicing a scale only modifies the current domain; it does not automatically nice domains that are subsequently set using continuous.domain.
      * You must re-nice the scale after setting the new domain, if desired.
      *
      * @param count An optional number of ticks expected to be used.
      */
    def nice(): this.type = js.native
    def nice(count: Double): this.type = js.native
    /**
      * Returns the scale’s current range.
      */
    def range(): js.Array[Range] = js.native
    /**
      * Sets the scale’s range to the specified array of values. The array may contain any number of discrete values.
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Range]): this.type = js.native
    /**
      * Returns a number format function suitable for displaying a tick value, automatically computing the appropriate precision based on the fixed interval between tick values.
      * The specified count should have the same value as the count that is used to generate the tick values.
      *
      * @param count Approximate number of ticks to be used when calculating precision for the number format function.
      * @param specifier An optional valid format specifier string which allows a custom format where the precision of the format is automatically set by the scale as appropriate for the tick interval.
      * If specifier uses the format type "s", the scale will return a SI-prefix format based on the largest value in the domain.
      * If the specifier already specifies a precision, this method is equivalent to locale.format.
      */
    def tickFormat(): js.Function1[/* d */ Double | ValueOf, String] = js.native
    def tickFormat(count: Double): js.Function1[/* d */ Double | ValueOf, String] = js.native
    def tickFormat(count: Double, specifier: String): js.Function1[/* d */ Double | ValueOf, String] = js.native
    /**
      * Returns approximately count representative values from the scale’s domain.
      *
      * If count is not specified, it defaults to 10.
      *
      * The returned tick values are uniformly spaced, have human-readable values (such as multiples of powers of 10),
      * and are guaranteed to be within the extent of the domain. Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
      * The specified count is only a hint; the scale may return more or fewer values depending on the domain. See also d3-array’s ticks.
      *
      * @param count Optional approximate number of ticks to be returned. If count is not specified, it defaults to 10.
      */
    def ticks(): js.Array[Double] = js.native
    def ticks(count: Double): js.Array[Double] = js.native
  }
  
  @js.native
  trait ScaleSequential_[Output] extends js.Object {
    /**
      * Given a value from the domain, returns the corresponding value from the output range, subject to interpolation.
      *
      * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
      *
      * @param value A numeric value from the domain.
      */
    def apply(value: Double): Output = js.native
    def apply(value: ValueOf): Output = js.native
    /**
      * Returns whether or not the scale currently clamps values to within the range.
      */
    def clamp(): Boolean = js.native
    /**
      * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
      * the scale may return a value outside the range through extrapolation.
      *
      * If clamping is enabled, the return value of the scale is always within the scale’s range. Clamping similarly applies to the "invert" method.
      *
      * @param clamp A flag to enable (true) or disable (false) clamping.
      */
    def clamp(clamp: Boolean): this.type = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): ScaleSequential_[Output] = js.native
    /**
      * Returns a copy of the scale’s current domain.
      */
    def domain(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the scale’s domain to the specified array of numbers. The array must contain exactly two elements.
      * If the elements in the given array are not numbers, they will be coerced to numbers
      *
      * @param domain A two-element array of numeric domain values.
      */
    def domain(domain: js.Tuple2[Double | ValueOf, Double | ValueOf]): this.type = js.native
    /**
      * Returns the current interpolator underlying the scale.
      */
    def interpolator(): js.Function1[/* t */ Double, Output] = js.native
    /**
      * Sets the scale’s interpolator to the specified function.
      *
      * @param interpolator An interpolator function mapping a value from the [0, 1] interval to an output value.
      */
    def interpolator(interpolator: js.Function1[/* t */ Double, Output]): this.type = js.native
    /**
      * Sets the scale’s interpolator to the specified function.
      *
      * The generic corresponds to a the new output type of the scale. The output type of the scale is determined by the output type of the interpolator function.
      *
      * @param interpolator An interpolator function mapping a value from the [0, 1] interval to an output value.
      */
    @JSName("interpolator")
    def interpolator_NewOutput_ScaleSequential_[NewOutput](interpolator: js.Function1[/* t */ Double, NewOutput]): ScaleSequential_[NewOutput] = js.native
  }
  
  @js.native
  trait ScaleSymLog_[Range, Output] extends ScaleContinuousNumeric[Range, Output] {
    /**
      * Returns the current constant, which defaults to 1.
      */
    def constant(): Double = js.native
    /**
      * Sets the symlog constant to the specified number and returns this scale;
      * otherwise returns the current value of the symlog constant, which defaults to 1. See “A bi-symmetric log transformation for wide-range data” by Webber for more.
      */
    def constant(constant: Double): this.type = js.native
  }
  
  @js.native
  trait ScaleThreshold_[Domain /* <: Double | String | Date */, Range] extends js.Object {
    /**
      * Given a value in the input domain, returns the corresponding value in the output range.
      *
      * @param value A domain value.
      */
    def apply(value: Domain): Range = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns the scale’s current domain.
      */
    def domain(): js.Array[Domain] = js.native
    /**
      * Sets the scale’s domain to the specified array of values. The values must be in sorted ascending order, or the behavior of the scale is undefined.
      * The values are typically numbers, but any naturally ordered values (such as strings) will work; a threshold scale can be used to encode any type that is ordered.
      * If the number of values in the scale’s range is N+1, the number of values in the scale’s domain must be N.
      * If there are fewer than N elements in the domain, the additional values in the range are ignored.
      * If there are more than N elements in the domain, the scale may return undefined for some inputs.
      *
      * @param domain Array of domain values.
      */
    def domain(domain: js.Array[Domain]): this.type = js.native
    /**
      * Returns the extent of values in the domain [x0, x1] for the corresponding value in the range, representing the inverse mapping from range to domain.
      * This method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
      *
      * @param value A range value.
      */
    def invertExtent(value: Range): js.Tuple2[js.UndefOr[Domain], js.UndefOr[Domain]] = js.native
    /**
      * Returns the scale’s current range.
      */
    def range(): js.Array[Range] = js.native
    /**
      * Sets the scale’s range to the specified array of values. If the number of values in the scale’s domain is N, the number of values in the scale’s range must be N+1.
      * If there are fewer than N+1 elements in the range, the scale may return undefined for some inputs.
      * If there are more than N+1 elements in the range, the additional values are ignored.
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Range]): this.type = js.native
  }
  
  @js.native
  trait ScaleTime_[Range, Output] extends js.Object {
    def apply(value: Double): Output = js.native
    def apply(value: ValueOf): Output = js.native
    /**
      * Given a value from the domain, returns the corresponding value from the range, subject to interpolation, if any.
      *
      * If the given value is outside the domain, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the range.
      *
      * Note: The interpolation function applied by the scale may change the output type from the range type as part of the interpolation.
      *
      * @param value A temporal value from the domain. If the value is not a Date, it will be coerced to Date.
      */
    def apply(value: Date): Output = js.native
    /**
      * Returns whether or not the scale currently clamps values to within the range.
      */
    def clamp(): Boolean = js.native
    /**
      * Enables or disables clamping, respectively. If clamping is disabled and the scale is passed a value outside the domain,
      * the scale may return a value outside the range through extrapolation.
      *
      * If clamping is enabled, the return value of the scale is always within the scale’s range. Clamping similarly applies to the "invert" method.
      *
      * @param clamp A flag to enable (true) or disable (false) clamping.
      */
    def clamp(clamp: Boolean): this.type = js.native
    /**
      * Returns an exact copy of this scale. Changes to this scale will not affect the returned scale, and vice versa.
      */
    def copy(): this.type = js.native
    /**
      * Returns a copy of the scale’s current domain.
      */
    def domain(): js.Array[Date] = js.native
    /**
      * Sets the scale’s domain to the specified array of temporal domain values. The array must contain two or more elements.
      * If the elements in the given array are not dates, they will be coerced to dates.
      *
      * Although continuous scales typically have two values each in their domain and range, specifying more than two values produces a piecewise scale.
      *
      * Internally, a piecewise scale performs a binary search for the range interpolator corresponding to the given domain value.
      * Thus, the domain must be in ascending or descending order. If the domain and range have different lengths N and M, only the first min(N,M) elements in each are observed.
      *
      * @param domain Array of temporal domain values. Numeric values will be coerced to dates.
      */
    def domain(domain: js.Array[Date | Double | ValueOf]): this.type = js.native
    /**
      * Returns the scale’s current interpolator factory, which defaults to interpolate.
      */
    def interpolate(): InterpolatorFactory[_, _] = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    def interpolate(interpolate: InterpolatorFactory[Range, Output]): this.type = js.native
    /**
      * Sets the scale’s range interpolator factory. This interpolator factory is used to create interpolators for each adjacent pair of values from the range;
      * these interpolators then map a normalized domain parameter t in [0, 1] to the corresponding value in the range.
      *
      * Note: the default interpolator may reuse return values. For example, if the range values are objects, then the value interpolator always returns the same object, modifying it in-place.
      * If the scale is used to set an attribute or style, this is typically acceptable (and desirable for performance);
      * however, if you need to store the scale’s return value, you must specify your own interpolator or make a copy as appropriate.
      *
      * As part of the interpolation process the interpolated value from the range may be converted to a corresponding output value.
      *
      * The generic "NewOutput" can be used to change the scale to have a different output element type corresponding to the new interpolation factory.
      *
      * @param interpolate An interpolation factory. The generics for Range and Output of the scale must correspond to the interpolation factory applied to the scale.
      */
    @JSName("interpolate")
    def interpolate_NewOutput_ScaleTime_[NewOutput](interpolate: InterpolatorFactory[Range, NewOutput]): ScaleTime_[Range, NewOutput] = js.native
    /**
      * Given a value from the range, returns the corresponding value from the domain. Inversion is useful for interaction,
      * say to determine the data value corresponding to the position of the mouse.
      *
      * If the given value is outside the range, and clamping is not enabled, the mapping may be extrapolated such that the returned value is outside the domain.
      *
      * IMPORTANT: This method is only supported if the range is numeric. If the range is not numeric, returns Invalid Date.
      *
      * For a valid value y in the range, time(time.invert(y)) equals y; similarly, for a valid value x in the domain, time.invert(time(x)) equals x.
      * The invert method is useful for interaction, say to determine the value in the domain that corresponds to the pixel location under the mouse.
      *
      * @param value A numeric value from the range.
      */
    def invert(value: Double): Date = js.native
    def invert(value: ValueOf): Date = js.native
    /**
      * Extends the domain so that it starts and ends on nice round values.
      * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
      *
      * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
      * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
      * If the domain has more than two values, nicing the domain only affects the first and last value.
      */
    def nice(): this.type = js.native
    /**
      * Extends the domain so that it starts and ends on nice round values.
      * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
      *
      * A tick count argument allows greater control over the step size used to extend the bounds, guaranteeing that the returned ticks will exactly cover the domain.
      *
      * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
      * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
      * If the domain has more than two values, nicing the domain only affects the first and last value.
      *
      * @param count Expected number of ticks.
      */
    def nice(count: Double): this.type = js.native
    /**
      * Extends the domain so that it starts and ends on nice round values.
      * This method typically modifies the scale’s domain, and may only extend the bounds to the nearest round value.
      *
      * a time interval may be specified to explicitly set the ticks. If an interval is specified, an optional step may also be specified to skip some ticks.
      * For example, time.nice(d3.timeSecond, 10) will extend the domain to an even ten seconds (0, 10, 20, etc.).
      *
      * Nicing is useful if the domain is computed from data, say using extent, and may be irregular.
      * For example, for a domain of [2009-07-13T00:02, 2009-07-13T23:48], the nice domain is [2009-07-13, 2009-07-14].
      * If the domain has more than two values, nicing the domain only affects the first and last value.
      *
      * @param interval A time interval to specify the expected ticks.
      * @param step An optional step number to be applied to the time interval when considering ticks.
      */
    def nice(interval: CountableTimeInterval): this.type = js.native
    def nice(interval: CountableTimeInterval, step: Double): this.type = js.native
    /**
      * Returns a copy of the scale’s current range.
      */
    def range(): js.Array[Range] = js.native
    /**
      * Sets the scale’s range to the specified array of values.
      *
      * The array must contain two or more elements. Unlike the domain, elements in the given array need not be temporal domain values;
      * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
      *
      * @param range Array of range values.
      */
    def range(range: js.Array[Range]): this.type = js.native
    /**
      * Sets the scale’s range to the specified array of values while also setting the scale’s interpolator to interpolateRound.
      *
      * The rounding interpolator is sometimes useful for avoiding antialiasing artifacts,
      * though also consider the shape-rendering “crispEdges” styles. Note that this interpolator can only be used with numeric ranges.
      *
      * The array must contain two or more elements. Unlike the domain, elements in the given array need not be temporal domain values;
      * any value that is supported by the underlying interpolator will work, though note that numeric ranges are required for invert.
      *
      * @param range Array of range values.
      */
    def rangeRound(range: js.Array[Double | ValueOf]): this.type = js.native
    /**
      * Returns a time format function suitable for displaying tick values.
      *
      * The default multi-scale time format chooses a human-readable representation based on the specified date as follows:
      *
      *  - %Y - for year boundaries, such as 2011.
      *  - %B - for month boundaries, such as February.
      *  - %b %d - for week boundaries, such as Feb 06.
      *  - %a %d - for day boundaries, such as Mon 07.
      *  - %I %p - for hour boundaries, such as 01 AM.
      *  - %I:%M - for minute boundaries, such as 01:23.
      *  - :%S - for second boundaries, such as :45.
      *  - .%L - milliseconds for all other times, such as .012.
      *
      * Although somewhat unusual, this default behavior has the benefit of providing both local and global context:
      * for example, formatting a sequence of ticks as [11 PM, Mon 07, 01 AM] reveals information about hours, dates, and day simultaneously,
      * rather than just the hours [11 PM, 12 AM, 01 AM].
      */
    def tickFormat(): js.Function1[/* d */ Date, String] = js.native
    /**
      * Returns a time format function suitable for displaying tick values.
      *
      * The specified count is currently ignored, but is accepted for consistency with other scales such as continuous.tickFormat.
      *
      * @param count Expected number of ticks. (Currently ignored)
      * @param specifier An optional valid date format specifier string (see d3-time-format).
      */
    def tickFormat(count: Double): js.Function1[/* d */ Date, String] = js.native
    def tickFormat(count: Double, specifier: String): js.Function1[/* d */ Date, String] = js.native
    /**
      * Returns a time format function suitable for displaying tick values.
      *
      * The specified time interval is currently ignored, but is accepted for consistency with other scales such as continuous.tickFormat.
      *
      * @param interval A time interval to specify the expected ticks. (Currently ignored)
      * @param specifier An optional valid date format specifier string (see d3-time-format).
      */
    def tickFormat(interval: TimeInterval_): js.Function1[/* d */ Date, String] = js.native
    def tickFormat(interval: TimeInterval_, specifier: String): js.Function1[/* d */ Date, String] = js.native
    /**
      * Returns representative dates from the scale’s domain. The returned tick values are uniformly-spaced (mostly),
      * have sensible values (such as every day at midnight), and are guaranteed to be within the extent of the domain.
      * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
      *
      * Without specifying a count or time interval to control the number of ticks returned, a default count of 10 is used.
      * The specified count is only a hint; the scale may return more or fewer values depending on the domain.
      */
    def ticks(): js.Array[Date] = js.native
    /**
      * Returns representative dates from the scale’s domain. The returned tick values are uniformly-spaced (mostly),
      * have sensible values (such as every day at midnight), and are guaranteed to be within the extent of the domain.
      * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
      *
      * The specified count controls the number of ticks to be returned. The specified count is only a hint;
      * the scale may return more or fewer values depending on the domain.
      *
      * @param count Expected number of ticks.
      */
    def ticks(count: Double): js.Array[Date] = js.native
    /**
      * Returns representative dates from the scale’s domain. The returned tick values are uniformly-spaced (mostly),
      * have sensible values (such as every day at midnight), and are guaranteed to be within the extent of the domain.
      * Ticks are often used to display reference lines, or tick marks, in conjunction with the visualized data.
      *
      * The specified time interval controls the ticks generated and returned. To prune the generated ticks for a given time interval,
      * use interval.every(...) or interval.filter(...).
      *
      * @param interval A time interval to specify the expected ticks.
      */
    def ticks(interval: TimeInterval_): js.Array[Date] = js.native
  }
  
  def scaleBand(): ScaleBand_[String] = js.native
  @JSName("scaleBand")
  def scaleBand_Domain_ToString[Domain /* <: ToString */](): ScaleBand_[Domain] = js.native
  def scaleDiverging[T](interpolator: js.Function1[/* t */ Double, T]): ScaleDiverging_[T] = js.native
  def scaleIdentity(): ScaleIdentity_ = js.native
  def scaleLinear(): ScaleLinear_[Double, Double] = js.native
  @JSName("scaleLinear")
  def scaleLinear_Output[Output](): ScaleLinear_[Output, Output] = js.native
  @JSName("scaleLinear")
  def scaleLinear_RangeOutput[Range, Output](): ScaleLinear_[Range, Output] = js.native
  def scaleLog(): ScaleLogarithmic[Double, Double] = js.native
  @JSName("scaleLog")
  def scaleLog_Output[Output](): ScaleLogarithmic[Output, Output] = js.native
  @JSName("scaleLog")
  def scaleLog_RangeOutput[Range, Output](): ScaleLogarithmic[Range, Output] = js.native
  def scaleOrdinal[Range](): ScaleOrdinal_[String, Range] = js.native
  def scaleOrdinal[Range](range: js.Array[Range]): ScaleOrdinal_[String, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_Domain_ToStringRange[Domain /* <: ToString */, Range](): ScaleOrdinal_[Domain, Range] = js.native
  @JSName("scaleOrdinal")
  def scaleOrdinal_Domain_ToStringRange[Domain /* <: ToString */, Range](range: js.Array[Range]): ScaleOrdinal_[Domain, Range] = js.native
  def scalePoint(): ScalePoint_[String] = js.native
  @JSName("scalePoint")
  def scalePoint_Domain_ToString[Domain /* <: ToString */](): ScalePoint_[Domain] = js.native
  def scalePow(): ScalePower[Double, Double] = js.native
  @JSName("scalePow")
  def scalePow_Output[Output](): ScalePower[Output, Output] = js.native
  @JSName("scalePow")
  def scalePow_RangeOutput[Range, Output](): ScalePower[Range, Output] = js.native
  def scaleQuantile(): ScaleQuantile_[Double] = js.native
  @JSName("scaleQuantile")
  def scaleQuantile_Range[Range](): ScaleQuantile_[Range] = js.native
  def scaleQuantize(): ScaleQuantize_[Double] = js.native
  @JSName("scaleQuantize")
  def scaleQuantize_Range[Range](): ScaleQuantize_[Range] = js.native
  def scaleSequential[Output](interpolator: js.Function1[/* t */ Double, Output]): ScaleSequential_[Output] = js.native
  def scaleSqrt(): ScalePower[Double, Double] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_Output[Output](): ScalePower[Output, Output] = js.native
  @JSName("scaleSqrt")
  def scaleSqrt_RangeOutput[Range, Output](): ScalePower[Range, Output] = js.native
  def scaleSymlog(): ScaleSymLog_[Double, Double] = js.native
  @JSName("scaleSymlog")
  def scaleSymlog_Output[Output](): ScaleSymLog_[Output, Output] = js.native
  @JSName("scaleSymlog")
  def scaleSymlog_RangeOutput[Range, Output](): ScaleSymLog_[Range, Output] = js.native
  def scaleThreshold(): ScaleThreshold_[Double, Double] = js.native
  @JSName("scaleThreshold")
  def scaleThreshold_Domain_UnionDoubleStringDateRange[Domain /* <: Double | String | Date */, Range](): ScaleThreshold_[Domain, Range] = js.native
  def scaleTime(): ScaleTime_[Double, Double] = js.native
  @JSName("scaleTime")
  def scaleTime_Output[Output](): ScaleTime_[Output, Output] = js.native
  @JSName("scaleTime")
  def scaleTime_RangeOutput[Range, Output](): ScaleTime_[Range, Output] = js.native
  def scaleUtc(): ScaleTime_[Double, Double] = js.native
  @JSName("scaleUtc")
  def scaleUtc_Output[Output](): ScaleTime_[Output, Output] = js.native
  @JSName("scaleUtc")
  def scaleUtc_RangeOutput[Range, Output](): ScaleTime_[Range, Output] = js.native
  @js.native
  object scaleImplicit extends js.Object {
    var name: `implicit` = js.native
  }
  
  type InterpolatorFactory[T, U] = js.Function2[/* a */ T, /* b */ T, js.Function1[/* t */ Double, U]]
}


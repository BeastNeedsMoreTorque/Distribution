package typings.d3Shape.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arc_[This, Datum] extends js.Object {
  /**
    * Generates an arc for the given arguments.
    *
    * IMPORTANT: If the rendering context of the arc generator is null,
    * then the arc is returned as a path data string.
    *
    * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
    * All arguments passed into this function, will be passed to the accessor functions of the generator.
    *
    * @param d The datum for which the arc is to be generated.
    */
  def apply(d: Datum, args: js.Any*): String | Null = js.native
  /**
    * Computes the midpoint [x, y] of the center line of the arc that would be generated by the given arguments.
    *
    * To be consistent with the generated arc, the accessors must be deterministic, i.e., return the same value given the same arguments.
    * The midpoint is defined as (startAngle + endAngle) / 2 and (innerRadius + outerRadius) / 2.
    *
    * Note that this is not the geometric center of the arc, which may be outside the arc;
    * this method is merely a convenience for positioning labels.
    *
    * The method is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that are passed into the arc generator.
    *
    * @param d The datum for which the arc is to be generated.
    */
  def centroid(d: Datum, args: js.Any*): js.Tuple2[Double, Double] = js.native
  /**
    * Sets the rendering context to null and returns this arc generator.
    *
    * A path data string representing the generated arc will be returned when the generator is invoked with data.
    *
    * @param context null, to remove rendering context.
    */
  def context(): this.type = js.native
  /**
    * Sets the rendering context and returns this arc generator.
    *
    * If the context is not null, then the generated arc is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  /**
    * Returns the current rendering context, which defaults to null.
    */
  @JSName("context")
  def context_Union(): CanvasRenderingContext2D | Null = js.native
  /**
    * Returns the current corner radius accessor, which defaults to a function returning a constant value of zero.
    */
  def cornerRadius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the corner radius to the specified function and returns this arc generator.
    *
    * The corner radius may not be larger than (outerRadius - innerRadius) / 2.
    * In addition, for arcs whose angular span is less than π, the corner radius may be reduced as two adjacent rounded corners intersect.
    * This is occurs more often with the inner corners.
    *
    * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def cornerRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the corner radius to the specified number and returns this arc generator.
    *
    * If the corner radius is greater than zero, the corners of the arc are rounded using circles of the given radius.
    * For a circular sector, the two outer corners are rounded; for an annular sector, all four corners are rounded.
    *
    * The corner radius may not be larger than (outerRadius - innerRadius) / 2.
    * In addition, for arcs whose angular span is less than π, the corner radius may be reduced as two adjacent rounded corners intersect.
    * This is occurs more often with the inner corners.
    *
    * @param radius Constant radius.
    */
  def cornerRadius(radius: Double): this.type = js.native
  /**
    * Returns the current end angle accessor, which defaults to a function returning the endAngle property
    * of the first argument passed into it.
    */
  def endAngle(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the end angle to the specified function and returns this arc generator.
    *
    * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
    *
    * @param angle An accessor function returning a number in radians to be used as an angle. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def endAngle(angle: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the end angle to the specified number and returns this arc generator.
    *
    * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
    *
    * @param angle Constant angle in radians.
    */
  def endAngle(angle: Double): this.type = js.native
  /**
    * Returns the current inner radius accessor, which defaults to a function returning the innerRadius property
    * of the first argument passed into it.
    */
  def innerRadius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the inner radius to the specified function and returns this arc generator.
    *
    * Specifying the inner radius as a function is useful for constructing a stacked polar bar chart, often in conjunction with a sqrt scale.
    * More commonly, a constant inner radius is used for a donut or pie chart. If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
    * A negative value is treated as zero.
    *
    * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def innerRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the inner radius to the specified number and returns this arc generator.
    *
    * Specifying the inner radius as a function is useful for constructing a stacked polar bar chart, often in conjunction with a sqrt scale.
    * More commonly, a constant inner radius is used for a donut or pie chart. If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
    * A negative value is treated as zero.
    *
    * @param radius Constant radius.
    */
  def innerRadius(radius: Double): this.type = js.native
  /**
    * Returns the current outer radius accessor, which defaults to a function returning the outerRadius property
    * of the first argument passed into it.
    */
  def outerRadius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the outer radius to the specified function and returns this arc generator.
    *
    * Specifying the outer radius as a function is useful for constructing a coxcomb or polar bar chart,
    * often in conjunction with a sqrt scale. More commonly, a constant outer radius is used for a pie or donut chart.
    * If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
    * A negative value is treated as zero.
    *
    * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def outerRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the outer radius to the specified number and returns this arc generator.
    *
    * Specifying the outer radius as a function is useful for constructing a coxcomb or polar bar chart,
    * often in conjunction with a sqrt scale. More commonly, a constant outer radius is used for a pie or donut chart.
    * If the outer radius is smaller than the inner radius, the inner and outer radii are swapped.
    * A negative value is treated as zero.
    *
    * @param radius Constant radius.
    */
  def outerRadius(radius: Double): this.type = js.native
  /**
    * Sets the pad angle to the specified number and returns this arc generator.
    *
    * The pad angle is converted to a fixed linear distance separating adjacent arcs, defined as padRadius * padAngle. This distance is subtracted equally from the start and end of the arc.
    * If the arc forms a complete circle or annulus, as when |endAngle - startAngle| ≥ τ, the pad angle is ignored. If the inner radius or angular span is small relative to the pad angle,
    * it may not be possible to maintain parallel edges between adjacent arcs. In this case, the inner edge of the arc may collapse to a point, similar to a circular sector.
    * For this reason, padding is typically only applied to annular sectors (i.e., when innerRadius is positive).
    *
    * The recommended minimum inner radius when using padding is outerRadius * padAngle / sin(θ), where θ is the angular span of the smallest arc before padding.
    * For example, if the outer radius is 200 pixels and the pad angle is 0.02 radians, a reasonable θ is 0.04 radians, and a reasonable inner radius is 100 pixels.
    *
    * Often, the pad angle is not set directly on the arc generator, but is instead computed by the pie generator so as to ensure that the area of padded arcs is proportional to their value;
    * see pie.padAngle. See the pie padding animation for illustration.
    * If you apply a constant pad angle to the arc generator directly, it tends to subtract disproportionately from smaller arcs, introducing distortion.
    *
    * @param angle Constant angle in radians.
    */
  def padAngle(): this.type = js.native
  /**
    * Sets the pad angle to the specified function and returns this arc generator.
    *
    * The pad angle is converted to a fixed linear distance separating adjacent arcs, defined as padRadius * padAngle. This distance is subtracted equally from the start and end of the arc.
    * If the arc forms a complete circle or annulus, as when |endAngle - startAngle| ≥ τ, the pad angle is ignored. If the inner radius or angular span is small relative to the pad angle,
    * it may not be possible to maintain parallel edges between adjacent arcs. In this case, the inner edge of the arc may collapse to a point, similar to a circular sector.
    * For this reason, padding is typically only applied to annular sectors (i.e., when innerRadius is positive).
    *
    * The recommended minimum inner radius when using padding is outerRadius * padAngle / sin(θ), where θ is the angular span of the smallest arc before padding.
    * For example, if the outer radius is 200 pixels and the pad angle is 0.02 radians, a reasonable θ is 0.04 radians, and a reasonable inner radius is 100 pixels.
    *
    * Often, the pad angle is not set directly on the arc generator, but is instead computed by the pie generator so as to ensure that the area of padded arcs is proportional to their value;
    * see pie.padAngle. See the pie padding animation for illustration.
    * If you apply a constant pad angle to the arc generator directly, it tends to subtract disproportionately from smaller arcs, introducing distortion.
    *
    * @param angle An accessor function returning a number in radians to be used as an angle. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def padAngle(angle: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, js.UndefOr[Double]]): this.type = js.native
  def padAngle(angle: Double): this.type = js.native
  /**
    * Returns the current pad angle accessor, which defaults to a function returning the padAngle property
    * of the first argument passed into it, or false if no data are passed in or the property is not defined.
    */
  @JSName("padAngle")
  def padAngle_ThisFunction2(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, js.UndefOr[Double]] = js.native
  /**
    * Sets the pad radius to null indicating that the pad radius should be automatically computed as sqrt(innerRadius * innerRadius + outerRadius * outerRadius), and returns this arc generator.
    *
    * The pad radius determines the fixed linear distance separating adjacent arcs, defined as padRadius * padAngle.
    *
    * @param radius null to set automatic pad radius calculation.
    */
  def padRadius(): this.type = js.native
  /*
    * Sets the pad radius to the specified function, and returns this arc generator.
    *
    * @param radius An accessor function returning a number to be used as a radius. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def padRadius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the pad radius to the specified number, and returns this arc generator.
    *
    * The pad radius determines the fixed linear distance separating adjacent arcs, defined as padRadius * padAngle.
    *
    * @param radius A constant radius.
    */
  def padRadius(radius: Double): this.type = js.native
  /**
    * Returns the current pad radius accessor, which defaults to null, indicating that the pad radius should be automatically computed as sqrt(innerRadius * innerRadius + outerRadius * outerRadius).
    */
  @JSName("padRadius")
  def padRadius_Union(): (js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]) | Null = js.native
  /**
    * Returns the current start angle accessor, which defaults to a function returning the startAngle property
    * of the first argument passed into it.
    */
  def startAngle(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the start angle to the specified function and returns this arc generator.
    *
    * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
    *
    * @param angle An accessor function returning a number in radians to be used as an angle. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the arc generator.
    */
  def startAngle(angle: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ js.Any, Double]): this.type = js.native
  /**
    * Sets the start angle to the specified number and returns this arc generator.
    *
    * The angle is specified in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    * If |endAngle - startAngle| ≥ τ, a complete circle or annulus is generated rather than a sector.
    *
    * @param angle Constant angle in radians.
    */
  def startAngle(angle: Double): this.type = js.native
}


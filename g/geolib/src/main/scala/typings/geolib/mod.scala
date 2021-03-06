package typings.geolib

import typings.geolib.anon.Altitude
import typings.geolib.anon.AltitudeLatitude
import typings.geolib.anon.Latitude
import typings.geolib.anon.Longitude
import typings.geolib.constantsMod.unitObject
import typings.geolib.geolibBooleans.`false`
import typings.geolib.geolibStrings.E
import typings.geolib.geolibStrings.ENE
import typings.geolib.geolibStrings.ESE
import typings.geolib.geolibStrings.N
import typings.geolib.geolibStrings.NE
import typings.geolib.geolibStrings.NNE
import typings.geolib.geolibStrings.NNW
import typings.geolib.geolibStrings.NW
import typings.geolib.geolibStrings.S
import typings.geolib.geolibStrings.SE
import typings.geolib.geolibStrings.SSE
import typings.geolib.geolibStrings.SSW
import typings.geolib.geolibStrings.SW
import typings.geolib.geolibStrings.W
import typings.geolib.geolibStrings.WNW
import typings.geolib.geolibStrings.WSW
import typings.geolib.getCompassDirectionMod.BearingFunction
import typings.geolib.getPathLengthMod.DistanceFn
import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.GeolibDistanceFn
import typings.geolib.typesMod.GeolibInputCoordinates
import typings.geolib.typesMod.GeolibInputCoordinatesWithTime
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val MAXLAT: /* 90 */ Double = js.native
  val MAXLON: /* 180 */ Double = js.native
  val MINLAT: /* -90 */ Double = js.native
  val MINLON: /* -180 */ Double = js.native
  val altitudeKeys: js.Array[AltitudeKeys] = js.native
  val areaConversion: unitObject = js.native
  val distanceConversion: unitObject = js.native
  val earthRadius: /* 6378137 */ Double = js.native
  val latitudeKeys: js.Array[LatitudeKeys] = js.native
  val longitudeKeys: js.Array[LongitudeKeys] = js.native
  val sexagesimalPattern: RegExp = js.native
  val timeConversion: unitObject = js.native
  def computeDestinationPoint(start: GeolibInputCoordinates, distance: Double, bearing: Double): Latitude = js.native
  def computeDestinationPoint(start: GeolibInputCoordinates, distance: Double, bearing: Double, radius: Double): Latitude = js.native
  def convertArea(squareMeters: Double): Double = js.native
  def convertArea(squareMeters: Double, targetUnit: String): Double = js.native
  def convertDistance(meters: Double): Double = js.native
  def convertDistance(meters: Double, targetUnit: String): Double = js.native
  def convertSpeed(metersPerSecond: Double): Double = js.native
  def convertSpeed(metersPerSecond: Double, targetUnit: String): Double = js.native
  def decimalToSexagesimal(decimal: Double): String = js.native
  def findNearest(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): GeolibInputCoordinates = js.native
  def getAreaOfPolygon(points: js.Array[GeolibInputCoordinates]): Double = js.native
  def getBounds(points: js.Array[_]): js.Any = js.native
  def getBoundsOfDistance(point: GeolibInputCoordinates, distance: Double): js.Array[Latitude] = js.native
  def getCenter(points: js.Array[GeolibInputCoordinates]): `false` | Longitude = js.native
  def getCenterOfBounds(coords: js.Array[GeolibInputCoordinates]): Latitude = js.native
  def getCompassDirection(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  def getCompassDirection(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates, bearingFn: BearingFunction): S | W | NNE | NE | ENE | E | ESE | SE | SSE | SSW | SW | WSW | WNW | NW | NNW | N = js.native
  def getCoordinateKey[Keys](point: GeolibInputCoordinates, keysToLookup: js.Array[Keys]): js.UndefOr[Keys] = js.native
  def getCoordinateKeys(point: GeolibInputCoordinates): AltitudeLatitude = js.native
  def getCoordinateKeys(point: GeolibInputCoordinates, keysToLookup: Altitude): AltitudeLatitude = js.native
  def getDistance(from: GeolibInputCoordinates, to: GeolibInputCoordinates): Double = js.native
  def getDistance(from: GeolibInputCoordinates, to: GeolibInputCoordinates, accuracy: Double): Double = js.native
  def getDistanceFromLine(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Double = js.native
  /**
    * Gets great circle bearing of two points. See description of getRhumbLineBearing for more information
    */
  def getGreatCircleBearing(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = js.native
  def getLatitude(point: GeolibInputCoordinates): js.Any = js.native
  def getLatitude(point: GeolibInputCoordinates, raw: Boolean): js.Any = js.native
  def getLongitude(point: GeolibInputCoordinates): js.Any = js.native
  def getLongitude(point: GeolibInputCoordinates, raw: Boolean): js.Any = js.native
  def getPathLength(points: js.Array[GeolibInputCoordinates]): Double = js.native
  def getPathLength(points: js.Array[GeolibInputCoordinates], distanceFn: DistanceFn): Double = js.native
  def getPreciseDistance(start: GeolibInputCoordinates, end: GeolibInputCoordinates): Double = js.native
  def getPreciseDistance(start: GeolibInputCoordinates, end: GeolibInputCoordinates, accuracy: Double): Double = js.native
  /**
    * Gets rhumb line bearing of two points. Find out about the difference between rhumb line and
    * great circle bearing on Wikipedia. It's quite complicated. Rhumb line should be fine in most cases:
    *
    * http://en.wikipedia.org/wiki/Rhumb_line#General_and_mathematical_description
    *
    * Function heavily based on Doug Vanderweide's great PHP version (licensed under GPL 3.0)
    * http://www.dougv.com/2009/07/13/calculating-the-bearing-and-compass-rose-direction-between-two-latitude-longitude-coordinates-in-php/
    */
  def getRhumbLineBearing(origin: GeolibInputCoordinates, dest: GeolibInputCoordinates): Double = js.native
  def getRoughCompassDirection(exact: String): js.UndefOr[S | W | E | N] = js.native
  def getSpeed(start: GeolibInputCoordinatesWithTime, end: GeolibInputCoordinatesWithTime): Double = js.native
  def getSpeed(
    start: GeolibInputCoordinatesWithTime,
    end: GeolibInputCoordinatesWithTime,
    distanceFn: GeolibDistanceFn
  ): Double = js.native
  def isDecimal(value: js.Any): Boolean = js.native
  def isPointInLine(point: GeolibInputCoordinates, lineStart: GeolibInputCoordinates, lineEnd: GeolibInputCoordinates): Boolean = js.native
  def isPointInPolygon(point: GeolibInputCoordinates, polygon: js.Array[GeolibInputCoordinates]): Boolean = js.native
  def isPointNearLine(
    point: GeolibInputCoordinates,
    start: GeolibInputCoordinates,
    end: GeolibInputCoordinates,
    distance: Double
  ): Boolean = js.native
  def isPointWithinRadius(point: GeolibInputCoordinates, center: GeolibInputCoordinates, radius: Double): Boolean = js.native
  def isSexagesimal(value: js.Any): Boolean = js.native
  def isValidCoordinate(point: GeolibInputCoordinates): Boolean = js.native
  def isValidLatitude(value: js.Any): Boolean = js.native
  def isValidLongitude(value: js.Any): Boolean = js.native
  def orderByDistance(point: GeolibInputCoordinates, coords: js.Array[GeolibInputCoordinates]): js.Array[GeolibInputCoordinates] = js.native
  def orderByDistance(
    point: GeolibInputCoordinates,
    coords: js.Array[GeolibInputCoordinates],
    distanceFn: typings.geolib.orderByDistanceMod.DistanceFn
  ): js.Array[GeolibInputCoordinates] = js.native
  def sexagesimalToDecimal(sexagesimal: js.Any): Double = js.native
  def toDecimal(value: js.Any): js.Any = js.native
  def toDeg(value: Double): Double = js.native
  def toRad(value: Double): Double = js.native
  def wktToPolygon(wkt: String): js.Array[Longitude] = js.native
}


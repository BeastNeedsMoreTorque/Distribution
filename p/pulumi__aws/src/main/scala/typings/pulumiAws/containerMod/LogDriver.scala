package typings.pulumiAws.containerMod

import typings.pulumiAws.pulumiAwsStrings.syslog_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pulumiAws.pulumiAwsStrings.`json-file`
  - typings.pulumiAws.pulumiAwsStrings.syslog_
  - typings.pulumiAws.pulumiAwsStrings.journald
  - typings.pulumiAws.pulumiAwsStrings.gelf
  - typings.pulumiAws.pulumiAwsStrings.fluentd
  - typings.pulumiAws.pulumiAwsStrings.awslogs
  - typings.pulumiAws.pulumiAwsStrings.splunk
  - typings.pulumiAws.pulumiAwsStrings.awsfirelens
*/
trait LogDriver extends js.Object

object LogDriver {
  @scala.inline
  def awsfirelens: typings.pulumiAws.pulumiAwsStrings.awsfirelens = "awsfirelens".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.awsfirelens]
  @scala.inline
  def awslogs: typings.pulumiAws.pulumiAwsStrings.awslogs = "awslogs".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.awslogs]
  @scala.inline
  def fluentd: typings.pulumiAws.pulumiAwsStrings.fluentd = "fluentd".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.fluentd]
  @scala.inline
  def gelf: typings.pulumiAws.pulumiAwsStrings.gelf = "gelf".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.gelf]
  @scala.inline
  def journald: typings.pulumiAws.pulumiAwsStrings.journald = "journald".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.journald]
  @scala.inline
  def `json-file`: typings.pulumiAws.pulumiAwsStrings.`json-file` = "json-file".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.`json-file`]
  @scala.inline
  def splunk: typings.pulumiAws.pulumiAwsStrings.splunk = "splunk".asInstanceOf[typings.pulumiAws.pulumiAwsStrings.splunk]
  @scala.inline
  def syslog: syslog_ = "syslog".asInstanceOf[syslog_]
}


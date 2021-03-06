package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents job info for a contact. */
trait ContactJobInfo extends js.Object {
  /** Gets and sets the company address of the job info for a contact. The maximum string length for the company address is 1024 characters. */
  var companyAddress: String
  /** Gets and sets the company name of the job info for a contact. The maximum string length for the company name is 64 characters. */
  var companyName: String
  /** Gets and sets the company Yomi (phonetic Japanese equivalent) name of the job info for a contact. The maximum string length for the company Yomi name is 200 characters. */
  var companyYomiName: String
  /** Gets and sets the department of the job info for a contact. The maximum string length for the department is 100 characters. */
  var department: String
  /** Gets and sets the description of the job info for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  /** Gets and sets the manager of the job info for a contact. The maximum string length for the manager is 1024 characters. */
  var manager: String
  /** Gets and sets the office of the job info for a contact. The maximum string length for the office is 40 characters. */
  var office: String
  /** Gets and sets the title of the job info for a contact. The maximum string length for the title is 1024 characters. */
  var title: String
}

object ContactJobInfo {
  @scala.inline
  def apply(
    companyAddress: String,
    companyName: String,
    companyYomiName: String,
    department: String,
    description: String,
    manager: String,
    office: String,
    title: String
  ): ContactJobInfo = {
    val __obj = js.Dynamic.literal(companyAddress = companyAddress.asInstanceOf[js.Any], companyName = companyName.asInstanceOf[js.Any], companyYomiName = companyYomiName.asInstanceOf[js.Any], department = department.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], manager = manager.asInstanceOf[js.Any], office = office.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactJobInfo]
  }
}


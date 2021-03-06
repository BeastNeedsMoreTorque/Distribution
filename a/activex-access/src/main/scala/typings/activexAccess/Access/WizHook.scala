package typings.activexAccess.Access

import typings.activexDao.DAO.Database
import typings.activexDao.DAO.Workspace
import typings.activexVbide.VBIDE.VBProject
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizHook extends js.Object {
  @JSName("Access.WizHook_typekey")
  var AccessDotWizHook_typekey: WizHook
  val DbcVbProject: VBProject
  val Key: Double
  def AccessUserDataDir(): String
  def AccessWizFilePath(bstrWhich: String): String
  def AdpUIDPwd(pbstrUID: String, pbstrPwd: String): Boolean
  def AnalyzeQuery(Workspace: Workspace, Database: Database, Query: String, Results: String): Double
  def AnalyzeTable(Workspace: Workspace, Database: Database, Table: String, ReturnDebugInfo: Boolean, Results: String): Double
  def ArgsOfActid(Actid: Double): Double
  def BracketString(String: String, flags: Double): Boolean
  def CacheStatus(bstrStatus: String): Unit
  def CloseCurrentDatabase(): Boolean
  def CreateDataPageControl(
    DpName: String,
    CtlName: String,
    Typ: Double,
    Section: String,
    SectionType: Double,
    AppletCode: String,
    X: Double,
    Y: Double,
    dx: Double,
    dy: Double
  ): Unit
  def CurrentLangID(): Double
  def EmbedFileOnDataPage(DpName: String, FileToInsert: String): String
  def EnglishPictToLocal(In: String, Out: String): Boolean
  def ExecuteTempImexSpec(bstrSpecXML: String): Unit
  def FCacheStatus(): Boolean
  def FCreateNameMap(objtyp: Double, bstrObjName: String): Boolean
  def FGetMSDE(fBlockKeys: Boolean): Boolean
  def FIsFEWch(wch: Double): Boolean
  def FIsPublishedXasTable(bstrObjectName: String): Boolean
  def FIsValidXasObjectName(bstrObjectName: String, iobjtyp: AcObjectType): Boolean
  def FIsXasDb(): Boolean
  def FileExists(File: String): Boolean
  def FirstDbcDataObject(Name: String, ObjType: AcObjectType, Attribs: Double): Boolean
  def FullPath(RelativePath: String, FullPath: String): Double
  def GetAccWizRCPath(): String
  def GetAdeRegistryPath(): String
  def GetColumns(bstrBase: String): String
  def GetCurrentView(bstrTableName: String): Double
  def GetDisabledExtensions(): String
  def GetFileName(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean
  ): Double
  def GetFileName2(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean,
    fFileSystem: js.Any
  ): Double
  def GetFileOdso(bstrExt: String, bstrFilename: String): Double
  def GetImexTblName(): String
  def GetInfoForColumns(bstrBase: String): String
  def GetLinkedListProperty(bstrTableName: String, bstrPropertyName: String, fServer: Boolean): String
  def GetObjPubOption(bstrObjectName: String, iobjtyp: AcObjectType, fTablesAsClient: Boolean): Double
  def GetScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean
  def GetWizGlob(lWhich: Double): js.Any
  def GlobalProcExists(Name: String): Boolean
  def HideDates(): Boolean
  def IsMatchToDbcConnectString(bstrConnectionString: String): Boolean
  def IsMemberSafe(dispid: Double): Boolean
  def IsValidIdent(Identifier: String): Boolean
  def KeyboardLangID(): Double
  def KnownWizLeaks(fStart: Boolean): Unit
  def LoadImexSpecSolution(bstrFilename: String): Unit
  def LocalFont(): String
  def NameFromActid(Actid: Double): String
  def ObjTypOfRecordSource(RecordSource: String): Double
  def OfficeAddInDir(): String
  def OpenEmScript(pProperty: AccessProperty, OpenMode: Double, Extra: Double, Version: Double): Double
  def OpenPictureFile(File: String, Cancelled: Boolean): Boolean
  def OpenScript(Script: String, Label: String, OpenMode: Double, Extra: Double, Version: Double): Double
  def ReportLeaksToFile(fRptToFile: Boolean, bstrFileOut: String): Unit
  def SaveObject(bstrName: String, objtyp: Double): Unit
  def SaveScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean
  def SetDefaultSpecName(bstrSpecName: String): Unit
  def SetDpBlockKeyInput(fBlockKeys: Boolean): Unit
  def SetVbaPassword(bstrDbName: String, bstrConnect: String, bstrPasswd: String): Boolean
  def SetWizGlob(lWhich: Double, vValue: js.Any): Unit
  def SortStringArray(Array: SafeArray[String]): Unit
  def SplitPath(Path: String, Drive: String, Dir: String, File: String, Ext: String): Unit
  def TableFieldHasUniqueIndex(Table: String, Columns: String): Boolean
  def TranslateExpression(In: String, Out: String, ParseFlags: Double, TranslateFlags: Double): Boolean
  def TwipsFromFont(
    FontName: String,
    Size: Double,
    Weight: Double,
    Italic: Boolean,
    Underline: Boolean,
    Cch: Double,
    Caption: String,
    MaxWidthCch: Double,
    dx: Double,
    dy: Double
  ): Boolean
  def WizCopyCmdbars(bstrADPName: String): Unit
  def WizHelp(HelpFile: String, wCmd: Double, ContextID: Double): Boolean
  def WizMsgBox(bstrText: String, bstrCaption: String, wStyle: Double, idHelpID: Double, bstrHelpFileName: String): Double
}

object WizHook {
  @scala.inline
  def apply(
    AccessDotWizHook_typekey: WizHook,
    AccessUserDataDir: () => String,
    AccessWizFilePath: String => String,
    AdpUIDPwd: (String, String) => Boolean,
    AnalyzeQuery: (Workspace, Database, String, String) => Double,
    AnalyzeTable: (Workspace, Database, String, Boolean, String) => Double,
    ArgsOfActid: Double => Double,
    BracketString: (String, Double) => Boolean,
    CacheStatus: String => Unit,
    CloseCurrentDatabase: () => Boolean,
    CreateDataPageControl: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Unit,
    CurrentLangID: () => Double,
    DbcVbProject: VBProject,
    EmbedFileOnDataPage: (String, String) => String,
    EnglishPictToLocal: (String, String) => Boolean,
    ExecuteTempImexSpec: String => Unit,
    FCacheStatus: () => Boolean,
    FCreateNameMap: (Double, String) => Boolean,
    FGetMSDE: Boolean => Boolean,
    FIsFEWch: Double => Boolean,
    FIsPublishedXasTable: String => Boolean,
    FIsValidXasObjectName: (String, AcObjectType) => Boolean,
    FIsXasDb: () => Boolean,
    FileExists: String => Boolean,
    FirstDbcDataObject: (String, AcObjectType, Double) => Boolean,
    FullPath: (String, String) => Double,
    GetAccWizRCPath: () => String,
    GetAdeRegistryPath: () => String,
    GetColumns: String => String,
    GetCurrentView: String => Double,
    GetDisabledExtensions: () => String,
    GetFileName: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double,
    GetFileName2: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, js.Any) => Double,
    GetFileOdso: (String, String) => Double,
    GetImexTblName: () => String,
    GetInfoForColumns: String => String,
    GetLinkedListProperty: (String, String, Boolean) => String,
    GetObjPubOption: (String, AcObjectType, Boolean) => Double,
    GetScriptString: (Double, Double, String) => Boolean,
    GetWizGlob: Double => js.Any,
    GlobalProcExists: String => Boolean,
    HideDates: () => Boolean,
    IsMatchToDbcConnectString: String => Boolean,
    IsMemberSafe: Double => Boolean,
    IsValidIdent: String => Boolean,
    Key: Double,
    KeyboardLangID: () => Double,
    KnownWizLeaks: Boolean => Unit,
    LoadImexSpecSolution: String => Unit,
    LocalFont: () => String,
    NameFromActid: Double => String,
    ObjTypOfRecordSource: String => Double,
    OfficeAddInDir: () => String,
    OpenEmScript: (AccessProperty, Double, Double, Double) => Double,
    OpenPictureFile: (String, Boolean) => Boolean,
    OpenScript: (String, String, Double, Double, Double) => Double,
    ReportLeaksToFile: (Boolean, String) => Unit,
    SaveObject: (String, Double) => Unit,
    SaveScriptString: (Double, Double, String) => Boolean,
    SetDefaultSpecName: String => Unit,
    SetDpBlockKeyInput: Boolean => Unit,
    SetVbaPassword: (String, String, String) => Boolean,
    SetWizGlob: (Double, js.Any) => Unit,
    SortStringArray: SafeArray[String] => Unit,
    SplitPath: (String, String, String, String, String) => Unit,
    TableFieldHasUniqueIndex: (String, String) => Boolean,
    TranslateExpression: (String, String, Double, Double) => Boolean,
    TwipsFromFont: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean,
    WizCopyCmdbars: String => Unit,
    WizHelp: (String, Double, Double) => Boolean,
    WizMsgBox: (String, String, Double, Double, String) => Double
  ): WizHook = {
    val __obj = js.Dynamic.literal(AccessUserDataDir = js.Any.fromFunction0(AccessUserDataDir), AccessWizFilePath = js.Any.fromFunction1(AccessWizFilePath), AdpUIDPwd = js.Any.fromFunction2(AdpUIDPwd), AnalyzeQuery = js.Any.fromFunction4(AnalyzeQuery), AnalyzeTable = js.Any.fromFunction5(AnalyzeTable), ArgsOfActid = js.Any.fromFunction1(ArgsOfActid), BracketString = js.Any.fromFunction2(BracketString), CacheStatus = js.Any.fromFunction1(CacheStatus), CloseCurrentDatabase = js.Any.fromFunction0(CloseCurrentDatabase), CreateDataPageControl = js.Any.fromFunction10(CreateDataPageControl), CurrentLangID = js.Any.fromFunction0(CurrentLangID), DbcVbProject = DbcVbProject.asInstanceOf[js.Any], EmbedFileOnDataPage = js.Any.fromFunction2(EmbedFileOnDataPage), EnglishPictToLocal = js.Any.fromFunction2(EnglishPictToLocal), ExecuteTempImexSpec = js.Any.fromFunction1(ExecuteTempImexSpec), FCacheStatus = js.Any.fromFunction0(FCacheStatus), FCreateNameMap = js.Any.fromFunction2(FCreateNameMap), FGetMSDE = js.Any.fromFunction1(FGetMSDE), FIsFEWch = js.Any.fromFunction1(FIsFEWch), FIsPublishedXasTable = js.Any.fromFunction1(FIsPublishedXasTable), FIsValidXasObjectName = js.Any.fromFunction2(FIsValidXasObjectName), FIsXasDb = js.Any.fromFunction0(FIsXasDb), FileExists = js.Any.fromFunction1(FileExists), FirstDbcDataObject = js.Any.fromFunction3(FirstDbcDataObject), FullPath = js.Any.fromFunction2(FullPath), GetAccWizRCPath = js.Any.fromFunction0(GetAccWizRCPath), GetAdeRegistryPath = js.Any.fromFunction0(GetAdeRegistryPath), GetColumns = js.Any.fromFunction1(GetColumns), GetCurrentView = js.Any.fromFunction1(GetCurrentView), GetDisabledExtensions = js.Any.fromFunction0(GetDisabledExtensions), GetFileName = js.Any.fromFunction11(GetFileName), GetFileName2 = js.Any.fromFunction12(GetFileName2), GetFileOdso = js.Any.fromFunction2(GetFileOdso), GetImexTblName = js.Any.fromFunction0(GetImexTblName), GetInfoForColumns = js.Any.fromFunction1(GetInfoForColumns), GetLinkedListProperty = js.Any.fromFunction3(GetLinkedListProperty), GetObjPubOption = js.Any.fromFunction3(GetObjPubOption), GetScriptString = js.Any.fromFunction3(GetScriptString), GetWizGlob = js.Any.fromFunction1(GetWizGlob), GlobalProcExists = js.Any.fromFunction1(GlobalProcExists), HideDates = js.Any.fromFunction0(HideDates), IsMatchToDbcConnectString = js.Any.fromFunction1(IsMatchToDbcConnectString), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), IsValidIdent = js.Any.fromFunction1(IsValidIdent), Key = Key.asInstanceOf[js.Any], KeyboardLangID = js.Any.fromFunction0(KeyboardLangID), KnownWizLeaks = js.Any.fromFunction1(KnownWizLeaks), LoadImexSpecSolution = js.Any.fromFunction1(LoadImexSpecSolution), LocalFont = js.Any.fromFunction0(LocalFont), NameFromActid = js.Any.fromFunction1(NameFromActid), ObjTypOfRecordSource = js.Any.fromFunction1(ObjTypOfRecordSource), OfficeAddInDir = js.Any.fromFunction0(OfficeAddInDir), OpenEmScript = js.Any.fromFunction4(OpenEmScript), OpenPictureFile = js.Any.fromFunction2(OpenPictureFile), OpenScript = js.Any.fromFunction5(OpenScript), ReportLeaksToFile = js.Any.fromFunction2(ReportLeaksToFile), SaveObject = js.Any.fromFunction2(SaveObject), SaveScriptString = js.Any.fromFunction3(SaveScriptString), SetDefaultSpecName = js.Any.fromFunction1(SetDefaultSpecName), SetDpBlockKeyInput = js.Any.fromFunction1(SetDpBlockKeyInput), SetVbaPassword = js.Any.fromFunction3(SetVbaPassword), SetWizGlob = js.Any.fromFunction2(SetWizGlob), SortStringArray = js.Any.fromFunction1(SortStringArray), SplitPath = js.Any.fromFunction5(SplitPath), TableFieldHasUniqueIndex = js.Any.fromFunction2(TableFieldHasUniqueIndex), TranslateExpression = js.Any.fromFunction4(TranslateExpression), TwipsFromFont = js.Any.fromFunction10(TwipsFromFont), WizCopyCmdbars = js.Any.fromFunction1(WizCopyCmdbars), WizHelp = js.Any.fromFunction3(WizHelp), WizMsgBox = js.Any.fromFunction5(WizMsgBox))
    __obj.updateDynamic("Access.WizHook_typekey")(AccessDotWizHook_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizHook]
  }
}


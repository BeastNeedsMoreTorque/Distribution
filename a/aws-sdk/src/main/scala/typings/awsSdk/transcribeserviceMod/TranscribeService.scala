package typings.awsSdk.transcribeserviceMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TranscribeService extends Service {
  @JSName("config")
  var config_TranscribeService: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio file.
    */
  def createMedicalVocabulary(): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  def createMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateMedicalVocabularyResponse, Unit]): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio file.
    */
  def createMedicalVocabulary(params: CreateMedicalVocabularyRequest): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  def createMedicalVocabulary(
    params: CreateMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMedicalVocabularyResponse, Unit]
  ): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(
    params: CreateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]
  ): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a transcription job.
    */
  def createVocabularyFilter(): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  def createVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyFilterResponse, Unit]): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a transcription job.
    */
  def createVocabularyFilter(params: CreateVocabularyFilterRequest): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  def createVocabularyFilter(
    params: CreateVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyFilterResponse, Unit]
  ): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
    */
  def deleteMedicalTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
    */
  def deleteMedicalTranscriptionJob(params: DeleteMedicalTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteMedicalTranscriptionJob(
    params: DeleteMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe Medical.
    */
  def deleteMedicalVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe Medical.
    */
  def deleteMedicalVocabulary(params: DeleteMedicalVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteMedicalVocabulary(
    params: DeleteMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(
    params: DeleteTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(
    params: DeleteVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Removes a vocabulary filter.
    */
  def deleteVocabularyFilter(): Request[js.Object, AWSError] = js.native
  def deleteVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a vocabulary filter.
    */
  def deleteVocabularyFilter(params: DeleteVocabularyFilterRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabularyFilter(
    params: DeleteVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You find the results of the completed job in the TranscriptFileUri field.
    */
  def getMedicalTranscriptionJob(): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  def getMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalTranscriptionJobResponse, Unit]): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You find the results of the completed job in the TranscriptFileUri field.
    */
  def getMedicalTranscriptionJob(params: GetMedicalTranscriptionJobRequest): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  def getMedicalTranscriptionJob(
    params: GetMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalTranscriptionJobResponse, Unit]
  ): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Retrieve information about a medical vocabulary.
    */
  def getMedicalVocabulary(): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  def getMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalVocabularyResponse, Unit]): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Retrieve information about a medical vocabulary.
    */
  def getMedicalVocabulary(params: GetMedicalVocabularyRequest): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  def getMedicalVocabulary(
    params: GetMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalVocabularyResponse, Unit]
  ): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri.
    */
  def getTranscriptionJob(): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]): Request[GetTranscriptionJobResponse, AWSError] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri.
    */
  def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(
    params: GetTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]
  ): Request[GetTranscriptionJobResponse, AWSError] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]): Request[GetVocabularyResponse, AWSError] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(
    params: GetVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]
  ): Request[GetVocabularyResponse, AWSError] = js.native
  /**
    * Returns information about a vocabulary filter.
    */
  def getVocabularyFilter(): Request[GetVocabularyFilterResponse, AWSError] = js.native
  def getVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyFilterResponse, Unit]): Request[GetVocabularyFilterResponse, AWSError] = js.native
  /**
    * Returns information about a vocabulary filter.
    */
  def getVocabularyFilter(params: GetVocabularyFilterRequest): Request[GetVocabularyFilterResponse, AWSError] = js.native
  def getVocabularyFilter(
    params: GetVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyFilterResponse, Unit]
  ): Request[GetVocabularyFilterResponse, AWSError] = js.native
  /**
    * Lists medical transcription jobs with a specified status or substring that matches their names.
    */
  def listMedicalTranscriptionJobs(): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  def listMedicalTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalTranscriptionJobsResponse, Unit]): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Lists medical transcription jobs with a specified status or substring that matches their names.
    */
  def listMedicalTranscriptionJobs(params: ListMedicalTranscriptionJobsRequest): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  def listMedicalTranscriptionJobs(
    params: ListMedicalTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalTranscriptionJobsResponse, Unit]
  ): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. You get the entire list of vocabularies if you don't enter a value in any of the request parameters.
    */
  def listMedicalVocabularies(): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  def listMedicalVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalVocabulariesResponse, Unit]): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. You get the entire list of vocabularies if you don't enter a value in any of the request parameters.
    */
  def listMedicalVocabularies(params: ListMedicalVocabulariesRequest): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  def listMedicalVocabularies(
    params: ListMedicalVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalVocabulariesResponse, Unit]
  ): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(
    params: ListTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]
  ): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]): Request[ListVocabulariesResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(
    params: ListVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]
  ): Request[ListVocabulariesResponse, AWSError] = js.native
  /**
    * Gets information about vocabulary filters.
    */
  def listVocabularyFilters(): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  def listVocabularyFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabularyFiltersResponse, Unit]): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  /**
    * Gets information about vocabulary filters.
    */
  def listVocabularyFilters(params: ListVocabularyFiltersRequest): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  def listVocabularyFilters(
    params: ListVocabularyFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabularyFiltersResponse, Unit]
  ): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  /**
    * Start a batch job to transcribe medical speech to text.
    */
  def startMedicalTranscriptionJob(): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  def startMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartMedicalTranscriptionJobResponse, Unit]): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Start a batch job to transcribe medical speech to text.
    */
  def startMedicalTranscriptionJob(params: StartMedicalTranscriptionJobRequest): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  def startMedicalTranscriptionJob(
    params: StartMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMedicalTranscriptionJobResponse, Unit]
  ): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]): Request[StartTranscriptionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(
    params: StartTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]
  ): Request[StartTranscriptionJobResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values in a different text file. The UpdateMedicalVocabulary operation overwrites all of the existing information with the values that you provide in the request.
    */
  def updateMedicalVocabulary(): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  def updateMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMedicalVocabularyResponse, Unit]): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values in a different text file. The UpdateMedicalVocabulary operation overwrites all of the existing information with the values that you provide in the request.
    */
  def updateMedicalVocabulary(params: UpdateMedicalVocabularyRequest): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  def updateMedicalVocabulary(
    params: UpdateMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMedicalVocabularyResponse, Unit]
  ): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]): Request[UpdateVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(
    params: UpdateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]
  ): Request[UpdateVocabularyResponse, AWSError] = js.native
  /**
    * Updates a vocabulary filter with a new list of filtered words.
    */
  def updateVocabularyFilter(): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  def updateVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyFilterResponse, Unit]): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Updates a vocabulary filter with a new list of filtered words.
    */
  def updateVocabularyFilter(params: UpdateVocabularyFilterRequest): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  def updateVocabularyFilter(
    params: UpdateVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyFilterResponse, Unit]
  ): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
}


package typings.fhirKitClient.mod

import typings.fhir.fhir.Account
import typings.fhir.fhir.ActivityDefinition
import typings.fhir.fhir.AdverseEvent
import typings.fhir.fhir.AllergyIntolerance
import typings.fhir.fhir.Appointment
import typings.fhir.fhir.AppointmentResponse
import typings.fhir.fhir.AuditEvent
import typings.fhir.fhir.Basic
import typings.fhir.fhir.Binary
import typings.fhir.fhir.BodySite
import typings.fhir.fhir.Bundle
import typings.fhir.fhir.CapabilityStatement
import typings.fhir.fhir.CarePlan
import typings.fhir.fhir.CareTeam
import typings.fhir.fhir.ChargeItem
import typings.fhir.fhir.Claim
import typings.fhir.fhir.ClaimResponse
import typings.fhir.fhir.ClinicalImpression
import typings.fhir.fhir.CodeSystem
import typings.fhir.fhir.Communication
import typings.fhir.fhir.CommunicationRequest
import typings.fhir.fhir.CompartmentDefinition
import typings.fhir.fhir.Composition
import typings.fhir.fhir.ConceptMap
import typings.fhir.fhir.Condition
import typings.fhir.fhir.Consent
import typings.fhir.fhir.Contract
import typings.fhir.fhir.Coverage
import typings.fhir.fhir.DataElement
import typings.fhir.fhir.DetectedIssue
import typings.fhir.fhir.Device
import typings.fhir.fhir.DeviceComponent
import typings.fhir.fhir.DeviceMetric
import typings.fhir.fhir.DeviceRequest
import typings.fhir.fhir.DeviceUseStatement
import typings.fhir.fhir.DiagnosticReport
import typings.fhir.fhir.DocumentManifest
import typings.fhir.fhir.DocumentReference
import typings.fhir.fhir.DomainResource
import typings.fhir.fhir.EligibilityRequest
import typings.fhir.fhir.EligibilityResponse
import typings.fhir.fhir.Encounter
import typings.fhir.fhir.Endpoint
import typings.fhir.fhir.EnrollmentRequest
import typings.fhir.fhir.EnrollmentResponse
import typings.fhir.fhir.EpisodeOfCare
import typings.fhir.fhir.ExpansionProfile
import typings.fhir.fhir.ExplanationOfBenefit
import typings.fhir.fhir.FamilyMemberHistory
import typings.fhir.fhir.Flag
import typings.fhir.fhir.Goal
import typings.fhir.fhir.GraphDefinition
import typings.fhir.fhir.Group
import typings.fhir.fhir.GuidanceResponse
import typings.fhir.fhir.HealthcareService
import typings.fhir.fhir.ImagingManifest
import typings.fhir.fhir.ImagingStudy
import typings.fhir.fhir.Immunization
import typings.fhir.fhir.ImmunizationRecommendation
import typings.fhir.fhir.ImplementationGuide
import typings.fhir.fhir.Library
import typings.fhir.fhir.Linkage
import typings.fhir.fhir.List
import typings.fhir.fhir.Location
import typings.fhir.fhir.Measure
import typings.fhir.fhir.MeasureReport
import typings.fhir.fhir.Media
import typings.fhir.fhir.Medication
import typings.fhir.fhir.MedicationAdministration
import typings.fhir.fhir.MedicationDispense
import typings.fhir.fhir.MedicationRequest
import typings.fhir.fhir.MedicationStatement
import typings.fhir.fhir.MessageDefinition
import typings.fhir.fhir.MessageHeader
import typings.fhir.fhir.NamingSystem
import typings.fhir.fhir.NutritionOrder
import typings.fhir.fhir.Observation
import typings.fhir.fhir.OperationDefinition
import typings.fhir.fhir.OperationOutcome
import typings.fhir.fhir.Organization
import typings.fhir.fhir.Parameters
import typings.fhir.fhir.Patient
import typings.fhir.fhir.PaymentNotice
import typings.fhir.fhir.PaymentReconciliation
import typings.fhir.fhir.Person
import typings.fhir.fhir.PlanDefinition
import typings.fhir.fhir.Practitioner
import typings.fhir.fhir.PractitionerRole
import typings.fhir.fhir.Procedure
import typings.fhir.fhir.ProcedureRequest
import typings.fhir.fhir.ProcessRequest
import typings.fhir.fhir.ProcessResponse
import typings.fhir.fhir.Provenance
import typings.fhir.fhir.Questionnaire
import typings.fhir.fhir.QuestionnaireResponse
import typings.fhir.fhir.ReferralRequest
import typings.fhir.fhir.RelatedPerson
import typings.fhir.fhir.RequestGroup
import typings.fhir.fhir.ResearchStudy
import typings.fhir.fhir.ResearchSubject
import typings.fhir.fhir.RiskAssessment
import typings.fhir.fhir.Schedule
import typings.fhir.fhir.SearchParameter
import typings.fhir.fhir.Sequence
import typings.fhir.fhir.ServiceDefinition
import typings.fhir.fhir.Slot
import typings.fhir.fhir.Specimen
import typings.fhir.fhir.StructureDefinition
import typings.fhir.fhir.StructureMap
import typings.fhir.fhir.Subscription
import typings.fhir.fhir.Substance
import typings.fhir.fhir.SupplyDelivery
import typings.fhir.fhir.SupplyRequest
import typings.fhir.fhir.Task
import typings.fhir.fhir.TestReport
import typings.fhir.fhir.TestScript
import typings.fhir.fhir.ValueSet
import typings.fhir.fhir.VisionPrescription
import typings.fhirKitClient.anon.Body
import typings.fhirKitClient.anon.BodyAllergyIntolerance
import typings.fhirKitClient.anon.BodyAppointment
import typings.fhirKitClient.anon.BodyAppointmentResponse
import typings.fhirKitClient.anon.BodyAuditEvent
import typings.fhirKitClient.anon.BodyAuditEventHeadersHeaders
import typings.fhirKitClient.anon.BodyBasic
import typings.fhirKitClient.anon.BodyBasicHeadersHeaders
import typings.fhirKitClient.anon.BodyBinary
import typings.fhirKitClient.anon.BodyBinaryHeadersHeaders
import typings.fhirKitClient.anon.BodyBodySite
import typings.fhirKitClient.anon.BodyBodySiteHeadersHeaders
import typings.fhirKitClient.anon.BodyBundle
import typings.fhirKitClient.anon.BodyBundleHeadersHeaders
import typings.fhirKitClient.anon.BodyBundletypebatch
import typings.fhirKitClient.anon.BodyBundletypetransaction
import typings.fhirKitClient.anon.BodyCapabilityStatement
import typings.fhirKitClient.anon.BodyCapabilityStatementHeadersHeaders
import typings.fhirKitClient.anon.BodyCarePlan
import typings.fhirKitClient.anon.BodyCarePlanHeadersHeaders
import typings.fhirKitClient.anon.BodyCareTeam
import typings.fhirKitClient.anon.BodyCareTeamHeadersHeaders
import typings.fhirKitClient.anon.BodyChargeItem
import typings.fhirKitClient.anon.BodyChargeItemHeadersHeaders
import typings.fhirKitClient.anon.BodyClaim
import typings.fhirKitClient.anon.BodyClaimHeadersHeaders
import typings.fhirKitClient.anon.BodyClaimResponse
import typings.fhirKitClient.anon.BodyClaimResponseHeadersHeaders
import typings.fhirKitClient.anon.BodyClinicalImpression
import typings.fhirKitClient.anon.BodyClinicalImpressionHeadersHeaders
import typings.fhirKitClient.anon.BodyCodeSystem
import typings.fhirKitClient.anon.BodyCodeSystemHeadersHeaders
import typings.fhirKitClient.anon.BodyCommunication
import typings.fhirKitClient.anon.BodyCommunicationHeadersHeaders
import typings.fhirKitClient.anon.BodyCommunicationRequest
import typings.fhirKitClient.anon.BodyCommunicationRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyCompartmentDefinition
import typings.fhirKitClient.anon.BodyCompartmentDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodyComposition
import typings.fhirKitClient.anon.BodyCompositionHeadersHeaders
import typings.fhirKitClient.anon.BodyConceptMap
import typings.fhirKitClient.anon.BodyConceptMapHeadersHeaders
import typings.fhirKitClient.anon.BodyCondition
import typings.fhirKitClient.anon.BodyConditionHeadersHeaders
import typings.fhirKitClient.anon.BodyConsent
import typings.fhirKitClient.anon.BodyConsentHeadersHeaders
import typings.fhirKitClient.anon.BodyContract
import typings.fhirKitClient.anon.BodyContractHeadersHeaders
import typings.fhirKitClient.anon.BodyCoverage
import typings.fhirKitClient.anon.BodyCoverageHeadersHeaders
import typings.fhirKitClient.anon.BodyDataElement
import typings.fhirKitClient.anon.BodyDataElementHeadersHeaders
import typings.fhirKitClient.anon.BodyDetectedIssue
import typings.fhirKitClient.anon.BodyDetectedIssueHeadersHeaders
import typings.fhirKitClient.anon.BodyDevice
import typings.fhirKitClient.anon.BodyDeviceComponent
import typings.fhirKitClient.anon.BodyDeviceComponentHeadersHeaders
import typings.fhirKitClient.anon.BodyDeviceHeadersHeaders
import typings.fhirKitClient.anon.BodyDeviceMetric
import typings.fhirKitClient.anon.BodyDeviceMetricHeadersHeaders
import typings.fhirKitClient.anon.BodyDeviceRequest
import typings.fhirKitClient.anon.BodyDeviceRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyDeviceUseStatement
import typings.fhirKitClient.anon.BodyDeviceUseStatementHeadersHeaders
import typings.fhirKitClient.anon.BodyDiagnosticReport
import typings.fhirKitClient.anon.BodyDiagnosticReportHeadersHeaders
import typings.fhirKitClient.anon.BodyDocumentManifest
import typings.fhirKitClient.anon.BodyDocumentManifestHeadersHeaders
import typings.fhirKitClient.anon.BodyDocumentReference
import typings.fhirKitClient.anon.BodyDocumentReferenceHeadersHeaders
import typings.fhirKitClient.anon.BodyDomainResource
import typings.fhirKitClient.anon.BodyDomainResourceHeadersHeaders
import typings.fhirKitClient.anon.BodyEligibilityRequest
import typings.fhirKitClient.anon.BodyEligibilityRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyEligibilityResponse
import typings.fhirKitClient.anon.BodyEligibilityResponseHeadersHeaders
import typings.fhirKitClient.anon.BodyEncounter
import typings.fhirKitClient.anon.BodyEncounterHeadersHeaders
import typings.fhirKitClient.anon.BodyEndpoint
import typings.fhirKitClient.anon.BodyEndpointHeadersHeaders
import typings.fhirKitClient.anon.BodyEnrollmentRequest
import typings.fhirKitClient.anon.BodyEnrollmentRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyEnrollmentResponse
import typings.fhirKitClient.anon.BodyEnrollmentResponseHeadersHeaders
import typings.fhirKitClient.anon.BodyEpisodeOfCare
import typings.fhirKitClient.anon.BodyEpisodeOfCareHeadersHeaders
import typings.fhirKitClient.anon.BodyExpansionProfile
import typings.fhirKitClient.anon.BodyExpansionProfileHeadersHeaders
import typings.fhirKitClient.anon.BodyExplanationOfBenefit
import typings.fhirKitClient.anon.BodyExplanationOfBenefitHeadersHeaders
import typings.fhirKitClient.anon.BodyFamilyMemberHistory
import typings.fhirKitClient.anon.BodyFamilyMemberHistoryHeadersHeaders
import typings.fhirKitClient.anon.BodyFlag
import typings.fhirKitClient.anon.BodyFlagHeadersHeaders
import typings.fhirKitClient.anon.BodyGoal
import typings.fhirKitClient.anon.BodyGoalHeadersHeaders
import typings.fhirKitClient.anon.BodyGraphDefinition
import typings.fhirKitClient.anon.BodyGraphDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodyGroup
import typings.fhirKitClient.anon.BodyGroupHeadersHeaders
import typings.fhirKitClient.anon.BodyGuidanceResponse
import typings.fhirKitClient.anon.BodyGuidanceResponseHeadersHeaders
import typings.fhirKitClient.anon.BodyHeaders
import typings.fhirKitClient.anon.BodyHeadersId
import typings.fhirKitClient.anon.BodyHeadersIdOptions
import typings.fhirKitClient.anon.BodyHeadersIdOptionsResourceType
import typings.fhirKitClient.anon.BodyHeadersOptions
import typings.fhirKitClient.anon.BodyHeadersOptionsResourceType
import typings.fhirKitClient.anon.BodyHealthcareService
import typings.fhirKitClient.anon.BodyHealthcareServiceHeadersHeaders
import typings.fhirKitClient.anon.BodyImagingManifest
import typings.fhirKitClient.anon.BodyImagingManifestHeadersHeaders
import typings.fhirKitClient.anon.BodyImagingStudy
import typings.fhirKitClient.anon.BodyImagingStudyHeadersHeaders
import typings.fhirKitClient.anon.BodyImmunization
import typings.fhirKitClient.anon.BodyImmunizationHeadersHeaders
import typings.fhirKitClient.anon.BodyImmunizationRecommendation
import typings.fhirKitClient.anon.BodyImmunizationRecommendationHeadersHeaders
import typings.fhirKitClient.anon.BodyImplementationGuide
import typings.fhirKitClient.anon.BodyImplementationGuideHeadersHeaders
import typings.fhirKitClient.anon.BodyLibrary
import typings.fhirKitClient.anon.BodyLibraryHeadersHeaders
import typings.fhirKitClient.anon.BodyLinkage
import typings.fhirKitClient.anon.BodyLinkageHeadersHeaders
import typings.fhirKitClient.anon.BodyList
import typings.fhirKitClient.anon.BodyListHeadersHeaders
import typings.fhirKitClient.anon.BodyLocation
import typings.fhirKitClient.anon.BodyLocationHeadersHeaders
import typings.fhirKitClient.anon.BodyMeasure
import typings.fhirKitClient.anon.BodyMeasureHeadersHeaders
import typings.fhirKitClient.anon.BodyMeasureReport
import typings.fhirKitClient.anon.BodyMeasureReportHeadersHeaders
import typings.fhirKitClient.anon.BodyMedia
import typings.fhirKitClient.anon.BodyMediaHeadersHeaders
import typings.fhirKitClient.anon.BodyMedication
import typings.fhirKitClient.anon.BodyMedicationAdministration
import typings.fhirKitClient.anon.BodyMedicationAdministrationHeadersHeaders
import typings.fhirKitClient.anon.BodyMedicationDispense
import typings.fhirKitClient.anon.BodyMedicationDispenseHeadersHeaders
import typings.fhirKitClient.anon.BodyMedicationHeadersHeaders
import typings.fhirKitClient.anon.BodyMedicationRequest
import typings.fhirKitClient.anon.BodyMedicationRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyMedicationStatement
import typings.fhirKitClient.anon.BodyMedicationStatementHeadersHeaders
import typings.fhirKitClient.anon.BodyMessageDefinition
import typings.fhirKitClient.anon.BodyMessageDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodyMessageHeader
import typings.fhirKitClient.anon.BodyMessageHeaderHeadersHeaders
import typings.fhirKitClient.anon.BodyNamingSystem
import typings.fhirKitClient.anon.BodyNamingSystemHeadersHeaders
import typings.fhirKitClient.anon.BodyNutritionOrder
import typings.fhirKitClient.anon.BodyNutritionOrderHeadersHeaders
import typings.fhirKitClient.anon.BodyObservation
import typings.fhirKitClient.anon.BodyObservationHeadersHeaders
import typings.fhirKitClient.anon.BodyOperationDefinition
import typings.fhirKitClient.anon.BodyOperationDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodyOperationOutcome
import typings.fhirKitClient.anon.BodyOperationOutcomeHeadersHeaders
import typings.fhirKitClient.anon.BodyOrganization
import typings.fhirKitClient.anon.BodyOrganizationHeadersHeaders
import typings.fhirKitClient.anon.BodyParameters
import typings.fhirKitClient.anon.BodyParametersHeadersHeaders
import typings.fhirKitClient.anon.BodyPatient
import typings.fhirKitClient.anon.BodyPatientHeadersHeaders
import typings.fhirKitClient.anon.BodyPaymentNotice
import typings.fhirKitClient.anon.BodyPaymentNoticeHeadersHeaders
import typings.fhirKitClient.anon.BodyPaymentReconciliation
import typings.fhirKitClient.anon.BodyPaymentReconciliationHeadersHeaders
import typings.fhirKitClient.anon.BodyPerson
import typings.fhirKitClient.anon.BodyPersonHeadersHeaders
import typings.fhirKitClient.anon.BodyPlanDefinition
import typings.fhirKitClient.anon.BodyPlanDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodyPractitioner
import typings.fhirKitClient.anon.BodyPractitionerHeadersHeaders
import typings.fhirKitClient.anon.BodyPractitionerRole
import typings.fhirKitClient.anon.BodyPractitionerRoleHeadersHeaders
import typings.fhirKitClient.anon.BodyProcedure
import typings.fhirKitClient.anon.BodyProcedureHeadersHeaders
import typings.fhirKitClient.anon.BodyProcedureRequest
import typings.fhirKitClient.anon.BodyProcedureRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyProcessRequest
import typings.fhirKitClient.anon.BodyProcessRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyProcessResponse
import typings.fhirKitClient.anon.BodyProcessResponseHeadersHeaders
import typings.fhirKitClient.anon.BodyProvenance
import typings.fhirKitClient.anon.BodyProvenanceHeadersHeaders
import typings.fhirKitClient.anon.BodyQuestionnaire
import typings.fhirKitClient.anon.BodyQuestionnaireHeadersHeaders
import typings.fhirKitClient.anon.BodyQuestionnaireResponse
import typings.fhirKitClient.anon.BodyQuestionnaireResponseHeadersHeaders
import typings.fhirKitClient.anon.BodyReferralRequest
import typings.fhirKitClient.anon.BodyReferralRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyRelatedPerson
import typings.fhirKitClient.anon.BodyRelatedPersonHeadersHeaders
import typings.fhirKitClient.anon.BodyRequestGroup
import typings.fhirKitClient.anon.BodyRequestGroupHeadersHeaders
import typings.fhirKitClient.anon.BodyResearchStudy
import typings.fhirKitClient.anon.BodyResearchStudyHeadersHeaders
import typings.fhirKitClient.anon.BodyResearchSubject
import typings.fhirKitClient.anon.BodyResearchSubjectHeadersHeaders
import typings.fhirKitClient.anon.BodyRiskAssessment
import typings.fhirKitClient.anon.BodyRiskAssessmentHeadersHeaders
import typings.fhirKitClient.anon.BodySchedule
import typings.fhirKitClient.anon.BodyScheduleHeadersHeaders
import typings.fhirKitClient.anon.BodySearchParameter
import typings.fhirKitClient.anon.BodySearchParameterHeadersHeaders
import typings.fhirKitClient.anon.BodySequence
import typings.fhirKitClient.anon.BodySequenceHeadersHeaders
import typings.fhirKitClient.anon.BodyServiceDefinition
import typings.fhirKitClient.anon.BodyServiceDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodySlot
import typings.fhirKitClient.anon.BodySlotHeadersHeaders
import typings.fhirKitClient.anon.BodySpecimen
import typings.fhirKitClient.anon.BodySpecimenHeadersHeaders
import typings.fhirKitClient.anon.BodyStructureDefinition
import typings.fhirKitClient.anon.BodyStructureDefinitionHeadersHeaders
import typings.fhirKitClient.anon.BodyStructureMap
import typings.fhirKitClient.anon.BodyStructureMapHeadersHeaders
import typings.fhirKitClient.anon.BodySubscription
import typings.fhirKitClient.anon.BodySubscriptionHeadersHeaders
import typings.fhirKitClient.anon.BodySubstance
import typings.fhirKitClient.anon.BodySubstanceHeadersHeaders
import typings.fhirKitClient.anon.BodySupplyDelivery
import typings.fhirKitClient.anon.BodySupplyDeliveryHeadersHeaders
import typings.fhirKitClient.anon.BodySupplyRequest
import typings.fhirKitClient.anon.BodySupplyRequestHeadersHeaders
import typings.fhirKitClient.anon.BodyT
import typings.fhirKitClient.anon.BodyTHeadersHeaders
import typings.fhirKitClient.anon.BodyTask
import typings.fhirKitClient.anon.BodyTaskHeadersHeaders
import typings.fhirKitClient.anon.BodyTestReport
import typings.fhirKitClient.anon.BodyTestReportHeadersHeaders
import typings.fhirKitClient.anon.BodyTestScript
import typings.fhirKitClient.anon.BodyTestScriptHeadersHeaders
import typings.fhirKitClient.anon.BodyValueSet
import typings.fhirKitClient.anon.BodyValueSetHeadersHeaders
import typings.fhirKitClient.anon.BodyVisionPrescription
import typings.fhirKitClient.anon.BodyVisionPrescriptionHeadersHeaders
import typings.fhirKitClient.anon.Bundletypebatchresponse
import typings.fhirKitClient.anon.Bundletypehistory
import typings.fhirKitClient.anon.Bundletypesearchset
import typings.fhirKitClient.anon.Bundletypetransactionresp
import typings.fhirKitClient.anon.CompartmentHeaders
import typings.fhirKitClient.anon.Context
import typings.fhirKitClient.anon.HeadersHeaders
import typings.fhirKitClient.anon.HeadersHeadersIdString
import typings.fhirKitClient.anon.HeadersHeadersIdStringJSONPatchArray
import typings.fhirKitClient.anon.HeadersHeadersIdStringJSONPatchArrayOptionsOptions
import typings.fhirKitClient.anon.HeadersHeadersIdStringJSONPatchArrayOptionsOptionsResourceType
import typings.fhirKitClient.anon.HeadersHeadersIdStringOptionsOptions
import typings.fhirKitClient.anon.HeadersHeadersIdStringOptionsOptionsResourceType
import typings.fhirKitClient.anon.HeadersHeadersIdStringOptionsOptionsResourceTypeVersionString
import typings.fhirKitClient.anon.HeadersHeadersOptionsOptions
import typings.fhirKitClient.anon.HeadersId
import typings.fhirKitClient.anon.HeadersIdJSONPatch
import typings.fhirKitClient.anon.HeadersIdJSONPatchOptions
import typings.fhirKitClient.anon.HeadersIdJSONPatchOptionsResourceType
import typings.fhirKitClient.anon.HeadersIdOptions
import typings.fhirKitClient.anon.HeadersIdOptionsResourceType
import typings.fhirKitClient.anon.HeadersIdOptionsResourceTypeVersion
import typings.fhirKitClient.anon.HeadersOptions
import typings.fhirKitClient.anon.HeadersOptionsResourceType
import typings.fhirKitClient.anon.Id
import typings.fhirKitClient.anon.IdJSONPatch
import typings.fhirKitClient.anon.IdJSONPatchOptions
import typings.fhirKitClient.anon.IdJSONPatchOptionsResourceType
import typings.fhirKitClient.anon.IdOptions
import typings.fhirKitClient.anon.IdOptionsResourceType
import typings.fhirKitClient.anon.IdOptionsResourceTypeVersion
import typings.fhirKitClient.anon.IdString
import typings.fhirKitClient.anon.IdStringJSONPatchArray
import typings.fhirKitClient.anon.IdStringJSONPatchArrayOptionsOptions
import typings.fhirKitClient.anon.IdStringJSONPatchArrayOptionsOptionsResourceType
import typings.fhirKitClient.anon.IdStringOptionsOptions
import typings.fhirKitClient.anon.IdStringOptionsOptionsResourceType
import typings.fhirKitClient.anon.IdStringOptionsOptionsResourceTypeVersionString
import typings.fhirKitClient.anon.JSONPatch
import typings.fhirKitClient.anon.JSONPatchArray
import typings.fhirKitClient.anon.JSONPatchArrayOptionsOptions
import typings.fhirKitClient.anon.JSONPatchArrayOptionsOptionsResourceType
import typings.fhirKitClient.anon.JSONPatchArrayOptionsOptionsResourceTypeCustomResourceType
import typings.fhirKitClient.anon.JSONPatchOptions
import typings.fhirKitClient.anon.JSONPatchOptionsResourceType
import typings.fhirKitClient.anon.Options
import typings.fhirKitClient.anon.OptionsOptions
import typings.fhirKitClient.anon.OptionsOptionsResourceType
import typings.fhirKitClient.anon.OptionsOptionsResourceTypeCustomResourceType
import typings.fhirKitClient.anon.OptionsOptionsResourceTypeResourceType
import typings.fhirKitClient.anon.OptionsOptionsResourceTypeVersionString
import typings.fhirKitClient.anon.OptionsResourceType
import typings.fhirKitClient.anon.OptionsResourceTypeVersion
import typings.fhirKitClient.anon.OptionsSearchParams
import typings.fhirKitClient.anon.ResourceTypeCustomResourceType
import typings.fhirKitClient.anon.ResourceTypeResourceType
import typings.fhirKitClient.anon.ResourceTypeVersion
import typings.fhirKitClient.anon.ResourceTypeVersionString
import typings.fhirKitClient.anon.Type
import typings.fhirKitClient.anon.Version
import typings.fhirKitClient.anon.VersionString
import typings.fhirKitClient.anon.`0`
import typings.fhirKitClient.anon.`100`
import typings.fhirKitClient.anon.`101`
import typings.fhirKitClient.anon.`102`
import typings.fhirKitClient.anon.`103`
import typings.fhirKitClient.anon.`104`
import typings.fhirKitClient.anon.`105`
import typings.fhirKitClient.anon.`106`
import typings.fhirKitClient.anon.`107`
import typings.fhirKitClient.anon.`108`
import typings.fhirKitClient.anon.`109`
import typings.fhirKitClient.anon.`10`
import typings.fhirKitClient.anon.`110`
import typings.fhirKitClient.anon.`111`
import typings.fhirKitClient.anon.`112`
import typings.fhirKitClient.anon.`113`
import typings.fhirKitClient.anon.`114`
import typings.fhirKitClient.anon.`115`
import typings.fhirKitClient.anon.`116`
import typings.fhirKitClient.anon.`117`
import typings.fhirKitClient.anon.`118`
import typings.fhirKitClient.anon.`119`
import typings.fhirKitClient.anon.`11`
import typings.fhirKitClient.anon.`120`
import typings.fhirKitClient.anon.`121`
import typings.fhirKitClient.anon.`122`
import typings.fhirKitClient.anon.`123`
import typings.fhirKitClient.anon.`124`
import typings.fhirKitClient.anon.`125`
import typings.fhirKitClient.anon.`126`
import typings.fhirKitClient.anon.`127`
import typings.fhirKitClient.anon.`128`
import typings.fhirKitClient.anon.`129`
import typings.fhirKitClient.anon.`12`
import typings.fhirKitClient.anon.`130`
import typings.fhirKitClient.anon.`131`
import typings.fhirKitClient.anon.`132`
import typings.fhirKitClient.anon.`133`
import typings.fhirKitClient.anon.`134`
import typings.fhirKitClient.anon.`135`
import typings.fhirKitClient.anon.`136`
import typings.fhirKitClient.anon.`137`
import typings.fhirKitClient.anon.`138`
import typings.fhirKitClient.anon.`139`
import typings.fhirKitClient.anon.`13`
import typings.fhirKitClient.anon.`140`
import typings.fhirKitClient.anon.`141`
import typings.fhirKitClient.anon.`142`
import typings.fhirKitClient.anon.`143`
import typings.fhirKitClient.anon.`144`
import typings.fhirKitClient.anon.`145`
import typings.fhirKitClient.anon.`146`
import typings.fhirKitClient.anon.`147`
import typings.fhirKitClient.anon.`148`
import typings.fhirKitClient.anon.`149`
import typings.fhirKitClient.anon.`14`
import typings.fhirKitClient.anon.`150`
import typings.fhirKitClient.anon.`151`
import typings.fhirKitClient.anon.`152`
import typings.fhirKitClient.anon.`153`
import typings.fhirKitClient.anon.`154`
import typings.fhirKitClient.anon.`155`
import typings.fhirKitClient.anon.`156`
import typings.fhirKitClient.anon.`157`
import typings.fhirKitClient.anon.`158`
import typings.fhirKitClient.anon.`159`
import typings.fhirKitClient.anon.`15`
import typings.fhirKitClient.anon.`160`
import typings.fhirKitClient.anon.`161`
import typings.fhirKitClient.anon.`162`
import typings.fhirKitClient.anon.`163`
import typings.fhirKitClient.anon.`164`
import typings.fhirKitClient.anon.`165`
import typings.fhirKitClient.anon.`166`
import typings.fhirKitClient.anon.`167`
import typings.fhirKitClient.anon.`168`
import typings.fhirKitClient.anon.`169`
import typings.fhirKitClient.anon.`16`
import typings.fhirKitClient.anon.`170`
import typings.fhirKitClient.anon.`171`
import typings.fhirKitClient.anon.`172`
import typings.fhirKitClient.anon.`173`
import typings.fhirKitClient.anon.`174`
import typings.fhirKitClient.anon.`175`
import typings.fhirKitClient.anon.`176`
import typings.fhirKitClient.anon.`177`
import typings.fhirKitClient.anon.`178`
import typings.fhirKitClient.anon.`179`
import typings.fhirKitClient.anon.`17`
import typings.fhirKitClient.anon.`180`
import typings.fhirKitClient.anon.`181`
import typings.fhirKitClient.anon.`182`
import typings.fhirKitClient.anon.`183`
import typings.fhirKitClient.anon.`184`
import typings.fhirKitClient.anon.`185`
import typings.fhirKitClient.anon.`186`
import typings.fhirKitClient.anon.`187`
import typings.fhirKitClient.anon.`188`
import typings.fhirKitClient.anon.`189`
import typings.fhirKitClient.anon.`18`
import typings.fhirKitClient.anon.`190`
import typings.fhirKitClient.anon.`191`
import typings.fhirKitClient.anon.`192`
import typings.fhirKitClient.anon.`193`
import typings.fhirKitClient.anon.`194`
import typings.fhirKitClient.anon.`195`
import typings.fhirKitClient.anon.`196`
import typings.fhirKitClient.anon.`197`
import typings.fhirKitClient.anon.`198`
import typings.fhirKitClient.anon.`199`
import typings.fhirKitClient.anon.`19`
import typings.fhirKitClient.anon.`1`
import typings.fhirKitClient.anon.`200`
import typings.fhirKitClient.anon.`201`
import typings.fhirKitClient.anon.`202`
import typings.fhirKitClient.anon.`203`
import typings.fhirKitClient.anon.`204`
import typings.fhirKitClient.anon.`205`
import typings.fhirKitClient.anon.`206`
import typings.fhirKitClient.anon.`207`
import typings.fhirKitClient.anon.`208`
import typings.fhirKitClient.anon.`209`
import typings.fhirKitClient.anon.`20`
import typings.fhirKitClient.anon.`210`
import typings.fhirKitClient.anon.`211`
import typings.fhirKitClient.anon.`212`
import typings.fhirKitClient.anon.`213`
import typings.fhirKitClient.anon.`214`
import typings.fhirKitClient.anon.`215`
import typings.fhirKitClient.anon.`216`
import typings.fhirKitClient.anon.`217`
import typings.fhirKitClient.anon.`218`
import typings.fhirKitClient.anon.`219`
import typings.fhirKitClient.anon.`21`
import typings.fhirKitClient.anon.`220`
import typings.fhirKitClient.anon.`221`
import typings.fhirKitClient.anon.`222`
import typings.fhirKitClient.anon.`223`
import typings.fhirKitClient.anon.`224`
import typings.fhirKitClient.anon.`225`
import typings.fhirKitClient.anon.`226`
import typings.fhirKitClient.anon.`227`
import typings.fhirKitClient.anon.`228`
import typings.fhirKitClient.anon.`229`
import typings.fhirKitClient.anon.`22`
import typings.fhirKitClient.anon.`230`
import typings.fhirKitClient.anon.`231`
import typings.fhirKitClient.anon.`232`
import typings.fhirKitClient.anon.`233`
import typings.fhirKitClient.anon.`234`
import typings.fhirKitClient.anon.`235`
import typings.fhirKitClient.anon.`236`
import typings.fhirKitClient.anon.`237`
import typings.fhirKitClient.anon.`238`
import typings.fhirKitClient.anon.`239`
import typings.fhirKitClient.anon.`23`
import typings.fhirKitClient.anon.`240`
import typings.fhirKitClient.anon.`241`
import typings.fhirKitClient.anon.`242`
import typings.fhirKitClient.anon.`243`
import typings.fhirKitClient.anon.`244`
import typings.fhirKitClient.anon.`245`
import typings.fhirKitClient.anon.`246`
import typings.fhirKitClient.anon.`247`
import typings.fhirKitClient.anon.`248`
import typings.fhirKitClient.anon.`249`
import typings.fhirKitClient.anon.`24`
import typings.fhirKitClient.anon.`250`
import typings.fhirKitClient.anon.`251`
import typings.fhirKitClient.anon.`252`
import typings.fhirKitClient.anon.`253`
import typings.fhirKitClient.anon.`254`
import typings.fhirKitClient.anon.`255`
import typings.fhirKitClient.anon.`256`
import typings.fhirKitClient.anon.`257`
import typings.fhirKitClient.anon.`258`
import typings.fhirKitClient.anon.`259`
import typings.fhirKitClient.anon.`25`
import typings.fhirKitClient.anon.`260`
import typings.fhirKitClient.anon.`261`
import typings.fhirKitClient.anon.`262`
import typings.fhirKitClient.anon.`263`
import typings.fhirKitClient.anon.`264`
import typings.fhirKitClient.anon.`265`
import typings.fhirKitClient.anon.`266`
import typings.fhirKitClient.anon.`267`
import typings.fhirKitClient.anon.`268`
import typings.fhirKitClient.anon.`269`
import typings.fhirKitClient.anon.`26`
import typings.fhirKitClient.anon.`270`
import typings.fhirKitClient.anon.`271`
import typings.fhirKitClient.anon.`272`
import typings.fhirKitClient.anon.`273`
import typings.fhirKitClient.anon.`274`
import typings.fhirKitClient.anon.`275`
import typings.fhirKitClient.anon.`276`
import typings.fhirKitClient.anon.`277`
import typings.fhirKitClient.anon.`278`
import typings.fhirKitClient.anon.`279`
import typings.fhirKitClient.anon.`27`
import typings.fhirKitClient.anon.`280`
import typings.fhirKitClient.anon.`281`
import typings.fhirKitClient.anon.`282`
import typings.fhirKitClient.anon.`283`
import typings.fhirKitClient.anon.`284`
import typings.fhirKitClient.anon.`285`
import typings.fhirKitClient.anon.`286`
import typings.fhirKitClient.anon.`287`
import typings.fhirKitClient.anon.`288`
import typings.fhirKitClient.anon.`289`
import typings.fhirKitClient.anon.`28`
import typings.fhirKitClient.anon.`290`
import typings.fhirKitClient.anon.`291`
import typings.fhirKitClient.anon.`292`
import typings.fhirKitClient.anon.`293`
import typings.fhirKitClient.anon.`294`
import typings.fhirKitClient.anon.`295`
import typings.fhirKitClient.anon.`296`
import typings.fhirKitClient.anon.`297`
import typings.fhirKitClient.anon.`298`
import typings.fhirKitClient.anon.`299`
import typings.fhirKitClient.anon.`29`
import typings.fhirKitClient.anon.`2`
import typings.fhirKitClient.anon.`300`
import typings.fhirKitClient.anon.`301`
import typings.fhirKitClient.anon.`302`
import typings.fhirKitClient.anon.`303`
import typings.fhirKitClient.anon.`304`
import typings.fhirKitClient.anon.`305`
import typings.fhirKitClient.anon.`306`
import typings.fhirKitClient.anon.`307`
import typings.fhirKitClient.anon.`30`
import typings.fhirKitClient.anon.`31`
import typings.fhirKitClient.anon.`32`
import typings.fhirKitClient.anon.`33`
import typings.fhirKitClient.anon.`34`
import typings.fhirKitClient.anon.`35`
import typings.fhirKitClient.anon.`36`
import typings.fhirKitClient.anon.`37`
import typings.fhirKitClient.anon.`38`
import typings.fhirKitClient.anon.`39`
import typings.fhirKitClient.anon.`3`
import typings.fhirKitClient.anon.`40`
import typings.fhirKitClient.anon.`41`
import typings.fhirKitClient.anon.`42`
import typings.fhirKitClient.anon.`43`
import typings.fhirKitClient.anon.`44`
import typings.fhirKitClient.anon.`45`
import typings.fhirKitClient.anon.`46`
import typings.fhirKitClient.anon.`47`
import typings.fhirKitClient.anon.`48`
import typings.fhirKitClient.anon.`49`
import typings.fhirKitClient.anon.`4`
import typings.fhirKitClient.anon.`50`
import typings.fhirKitClient.anon.`51`
import typings.fhirKitClient.anon.`52`
import typings.fhirKitClient.anon.`53`
import typings.fhirKitClient.anon.`54`
import typings.fhirKitClient.anon.`55`
import typings.fhirKitClient.anon.`56`
import typings.fhirKitClient.anon.`57`
import typings.fhirKitClient.anon.`58`
import typings.fhirKitClient.anon.`59`
import typings.fhirKitClient.anon.`5`
import typings.fhirKitClient.anon.`60`
import typings.fhirKitClient.anon.`61`
import typings.fhirKitClient.anon.`62`
import typings.fhirKitClient.anon.`63`
import typings.fhirKitClient.anon.`64`
import typings.fhirKitClient.anon.`65`
import typings.fhirKitClient.anon.`66`
import typings.fhirKitClient.anon.`67`
import typings.fhirKitClient.anon.`68`
import typings.fhirKitClient.anon.`69`
import typings.fhirKitClient.anon.`6`
import typings.fhirKitClient.anon.`70`
import typings.fhirKitClient.anon.`71`
import typings.fhirKitClient.anon.`72`
import typings.fhirKitClient.anon.`73`
import typings.fhirKitClient.anon.`74`
import typings.fhirKitClient.anon.`75`
import typings.fhirKitClient.anon.`76`
import typings.fhirKitClient.anon.`77`
import typings.fhirKitClient.anon.`78`
import typings.fhirKitClient.anon.`79`
import typings.fhirKitClient.anon.`7`
import typings.fhirKitClient.anon.`80`
import typings.fhirKitClient.anon.`81`
import typings.fhirKitClient.anon.`82`
import typings.fhirKitClient.anon.`83`
import typings.fhirKitClient.anon.`84`
import typings.fhirKitClient.anon.`85`
import typings.fhirKitClient.anon.`86`
import typings.fhirKitClient.anon.`87`
import typings.fhirKitClient.anon.`88`
import typings.fhirKitClient.anon.`89`
import typings.fhirKitClient.anon.`8`
import typings.fhirKitClient.anon.`90`
import typings.fhirKitClient.anon.`91`
import typings.fhirKitClient.anon.`92`
import typings.fhirKitClient.anon.`93`
import typings.fhirKitClient.anon.`94`
import typings.fhirKitClient.anon.`95`
import typings.fhirKitClient.anon.`96`
import typings.fhirKitClient.anon.`97`
import typings.fhirKitClient.anon.`98`
import typings.fhirKitClient.anon.`99`
import typings.fhirKitClient.anon.`9`
import typings.request.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var baseUrl: String = js.native
  var bearerToken: js.UndefOr[String] = js.native
  var customHeaders: Headers = js.native
  /**
    * Submit a set of actions to perform independently as a batch.
    *
    * Update, create or delete a set of resources in a single interaction.
    * There should be no interdependencies between entries in the bundle.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'batch',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.batch({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.batch({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.body - The request body with a type of 'batch'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def batch(params: BodyBundletypebatch): js.Promise[OperationOutcome | Bundletypebatchresponse] = js.native
  /**
    * Get the default capability statement.
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.capabilityStatement().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.capabilityStatement();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} capability statement FHIR resource.
    */
  def capabilityStatement(): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def capabilityStatement(params: typings.fhirKitClient.anon.Headers): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  /**
    * Search for FHIR resources within a compartment.
    * The resourceType and id must be specified.
    *
    * @example
    *
    * // Using promises
    * fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.compartment - The search compartment.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def compartmentSearch(params: CompartmentHeaders): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Create a resource.
    *
    * @example
    * const newPatient = {
    *   resourceType: 'Patient',
    *   active: true,
    *   name: [{ use: 'official', family: ['Coleman'], given: ['Lisa', 'P.'] }],
    *   gender: 'female',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * })
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The FHIR resource type.
    * @param {Response} params.body - The new resource data to create.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def create(params: Body): js.Promise[OperationOutcome | Account] = js.native
  def create(params: BodyAuditEvent): js.Promise[OperationOutcome | AuditEvent] = js.native
  def create(params: BodyBasic): js.Promise[OperationOutcome | Basic] = js.native
  def create(params: BodyBinary): js.Promise[OperationOutcome | Binary] = js.native
  def create(params: BodyBodySite): js.Promise[OperationOutcome | BodySite] = js.native
  def create(params: BodyBundle): js.Promise[OperationOutcome | Bundle] = js.native
  def create(params: BodyCapabilityStatement): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def create(params: BodyCarePlan): js.Promise[OperationOutcome | CarePlan] = js.native
  def create(params: BodyCareTeam): js.Promise[OperationOutcome | CareTeam] = js.native
  def create(params: BodyChargeItem): js.Promise[OperationOutcome | ChargeItem] = js.native
  def create(params: BodyClaim): js.Promise[OperationOutcome | Claim] = js.native
  def create(params: BodyClaimResponse): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def create(params: BodyClinicalImpression): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def create(params: BodyCodeSystem): js.Promise[OperationOutcome | CodeSystem] = js.native
  def create(params: BodyCommunication): js.Promise[OperationOutcome | Communication] = js.native
  def create(params: BodyCommunicationRequest): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def create(params: BodyCompartmentDefinition): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def create(params: BodyComposition): js.Promise[OperationOutcome | Composition] = js.native
  def create(params: BodyConceptMap): js.Promise[OperationOutcome | ConceptMap] = js.native
  def create(params: BodyCondition): js.Promise[OperationOutcome | Condition] = js.native
  def create(params: BodyConsent): js.Promise[OperationOutcome | Consent] = js.native
  def create(params: BodyContract): js.Promise[OperationOutcome | Contract] = js.native
  def create(params: BodyCoverage): js.Promise[OperationOutcome | Coverage] = js.native
  def create(params: BodyDataElement): js.Promise[OperationOutcome | DataElement] = js.native
  def create(params: BodyDetectedIssue): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def create(params: BodyDevice): js.Promise[OperationOutcome | Device] = js.native
  def create(params: BodyDeviceComponent): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def create(params: BodyDeviceMetric): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def create(params: BodyDeviceRequest): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def create(params: BodyDeviceUseStatement): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def create(params: BodyDiagnosticReport): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def create(params: BodyDocumentManifest): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def create(params: BodyDocumentReference): js.Promise[OperationOutcome | DocumentReference] = js.native
  def create(params: BodyDomainResource): js.Promise[OperationOutcome | DomainResource] = js.native
  def create(params: BodyEligibilityRequest): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def create(params: BodyEligibilityResponse): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def create(params: BodyEncounter): js.Promise[OperationOutcome | Encounter] = js.native
  def create(params: BodyEndpoint): js.Promise[OperationOutcome | Endpoint] = js.native
  def create(params: BodyEnrollmentRequest): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def create(params: BodyEnrollmentResponse): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def create(params: BodyEpisodeOfCare): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def create(params: BodyExpansionProfile): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def create(params: BodyExplanationOfBenefit): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def create(params: BodyFamilyMemberHistory): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def create(params: BodyFlag): js.Promise[OperationOutcome | Flag] = js.native
  def create(params: BodyGoal): js.Promise[OperationOutcome | Goal] = js.native
  def create(params: BodyGraphDefinition): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def create(params: BodyGroup): js.Promise[OperationOutcome | Group] = js.native
  def create(params: BodyGuidanceResponse): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def create(params: BodyHeaders): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def create(params: BodyHeadersOptions): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def create(params: BodyHeadersOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def create(params: BodyHealthcareService): js.Promise[OperationOutcome | HealthcareService] = js.native
  def create(params: BodyImagingManifest): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def create(params: BodyImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def create(params: BodyImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def create(params: BodyImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def create(params: BodyImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def create(params: BodyLibrary): js.Promise[OperationOutcome | Library] = js.native
  def create(params: BodyLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def create(params: BodyList): js.Promise[OperationOutcome | List] = js.native
  def create(params: BodyLocation): js.Promise[OperationOutcome | Location] = js.native
  def create(params: BodyMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def create(params: BodyMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def create(params: BodyMedia): js.Promise[OperationOutcome | Media] = js.native
  def create(params: BodyMedication): js.Promise[OperationOutcome | Medication] = js.native
  def create(params: BodyMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def create(params: BodyMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def create(params: BodyMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def create(params: BodyMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def create(params: BodyMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def create(params: BodyMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def create(params: BodyNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def create(params: BodyNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def create(params: BodyObservation): js.Promise[OperationOutcome | Observation] = js.native
  def create(params: BodyOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def create(params: BodyOperationOutcome): js.Promise[OperationOutcome] = js.native
  def create(params: BodyOrganization): js.Promise[OperationOutcome | Organization] = js.native
  def create(params: BodyParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def create(params: BodyPatient): js.Promise[OperationOutcome | Patient] = js.native
  def create(params: BodyPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def create(params: BodyPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def create(params: BodyPerson): js.Promise[OperationOutcome | Person] = js.native
  def create(params: BodyPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def create(params: BodyPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def create(params: BodyPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def create(params: BodyProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def create(params: BodyProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def create(params: BodyProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def create(params: BodyProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def create(params: BodyProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def create(params: BodyQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def create(params: BodyQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def create(params: BodyReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def create(params: BodyRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def create(params: BodyRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def create(params: BodyResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def create(params: BodyResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def create(params: BodyRiskAssessment): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def create(params: BodySchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def create(params: BodySearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def create(params: BodySequence): js.Promise[OperationOutcome | Sequence] = js.native
  def create(params: BodyServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def create(params: BodySlot): js.Promise[OperationOutcome | Slot] = js.native
  def create(params: BodySpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def create(params: BodyStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def create(params: BodyStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def create(params: BodySubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def create(params: BodySubstance): js.Promise[OperationOutcome | Substance] = js.native
  def create(params: BodySupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def create(params: BodySupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def create(params: BodyTask): js.Promise[OperationOutcome | Task] = js.native
  def create(params: BodyTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def create(params: BodyTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def create(params: BodyValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def create(params: BodyVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def create(params: HeadersOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def create(params: HeadersOptionsResourceType): js.Promise[OperationOutcome | Appointment] = js.native
  def create[T /* <: CustomResource */](params: BodyT[T]): js.Promise[OperationOutcome | T] = js.native
  /**
    * Delete a resource by FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.delete({
    *   resourceType: 'Patient',
    *   id: 12345,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.delete({ resourceType: 'Patient', id: 12345 });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient", "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} Operation Outcome FHIR resource
    */
  def delete(params: ResourceTypeResourceType): js.Promise[OperationOutcome] = js.native
  /**
    * Retrieve the change history for a FHIR resource id, a resource type or the
    * entire system
    *
    * @example
    *
    * // Using promises
    * fhirClient.history({ resourceType: 'Patient', id: '12345' });
    *   .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.history({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {string} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {string} [params.id] - The FHIR id for the resource, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def history(): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def history(params: OptionsOptionsResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Return the next page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def nextPage[T /* <: String */](params: typings.fhirKitClient.anon.Bundle[T]): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def nextPage[T /* <: String */](params: typings.fhirKitClient.anon.Bundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def patch(params: HeadersHeadersIdStringJSONPatchArray): js.Promise[OperationOutcome | CarePlan] = js.native
  def patch(params: HeadersHeadersIdStringJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | Claim] = js.native
  def patch(params: HeadersHeadersIdStringJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def patch(params: HeadersIdJSONPatch): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def patch(params: HeadersIdJSONPatchOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def patch(params: HeadersIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
  def patch(params: IdJSONPatch): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def patch(params: IdJSONPatchOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def patch(params: IdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def patch(params: IdStringJSONPatchArray): js.Promise[OperationOutcome | Bundle] = js.native
  def patch(params: IdStringJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | CareTeam] = js.native
  def patch(params: IdStringJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ClaimResponse] = js.native
  /**
    * Patch a resource by FHIR id.
    *
    * From http://hl7.org/fhir/STU3/http.html#patch:
    * Content-Type is 'application/json-patch+json'
    * Expects a JSON Patch document format, see http://jsonpatch.com/
    *
    * @example
    *
    * // JSON Patch document format from http://jsonpatch.com/
    * const JSONPatch = [{ op: 'replace', path: '/gender', value: 'male' }];
    *
    * // Using promises
    * fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Array} params.JSONPatch - A JSON Patch document containing an array
    *   of patch operations, formatted according to http://jsonpatch.com/.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def patch(params: JSONPatch): js.Promise[OperationOutcome | Account] = js.native
  def patch(params: JSONPatchArray): js.Promise[OperationOutcome | BodySite] = js.native
  def patch(params: JSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def patch(params: JSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  def patch(params: JSONPatchArrayOptionsOptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def patch(params: JSONPatchOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def patch(params: JSONPatchOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def patch(params: `208`): js.Promise[OperationOutcome | CodeSystem] = js.native
  def patch(params: `209`): js.Promise[OperationOutcome | Communication] = js.native
  def patch(params: `210`): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def patch(params: `211`): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def patch(params: `212`): js.Promise[OperationOutcome | Composition] = js.native
  def patch(params: `213`): js.Promise[OperationOutcome | ConceptMap] = js.native
  def patch(params: `214`): js.Promise[OperationOutcome | Condition] = js.native
  def patch(params: `215`): js.Promise[OperationOutcome | Consent] = js.native
  def patch(params: `216`): js.Promise[OperationOutcome | Contract] = js.native
  def patch(params: `217`): js.Promise[OperationOutcome | Coverage] = js.native
  def patch(params: `218`): js.Promise[OperationOutcome | DataElement] = js.native
  def patch(params: `219`): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def patch(params: `220`): js.Promise[OperationOutcome | Device] = js.native
  def patch(params: `221`): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def patch(params: `222`): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def patch(params: `223`): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def patch(params: `224`): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def patch(params: `225`): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def patch(params: `226`): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def patch(params: `227`): js.Promise[OperationOutcome | DocumentReference] = js.native
  def patch(params: `228`): js.Promise[OperationOutcome | DomainResource] = js.native
  def patch(params: `229`): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def patch(params: `230`): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def patch(params: `231`): js.Promise[OperationOutcome | Encounter] = js.native
  def patch(params: `232`): js.Promise[OperationOutcome | Endpoint] = js.native
  def patch(params: `233`): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def patch(params: `234`): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def patch(params: `235`): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def patch(params: `236`): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def patch(params: `237`): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def patch(params: `238`): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def patch(params: `239`): js.Promise[OperationOutcome | Flag] = js.native
  def patch(params: `240`): js.Promise[OperationOutcome | Goal] = js.native
  def patch(params: `241`): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def patch(params: `242`): js.Promise[OperationOutcome | Group] = js.native
  def patch(params: `243`): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def patch(params: `244`): js.Promise[OperationOutcome | HealthcareService] = js.native
  def patch(params: `245`): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def patch(params: `246`): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def patch(params: `247`): js.Promise[OperationOutcome | Immunization] = js.native
  def patch(params: `248`): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def patch(params: `249`): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def patch(params: `250`): js.Promise[OperationOutcome | Library] = js.native
  def patch(params: `251`): js.Promise[OperationOutcome | Linkage] = js.native
  def patch(params: `252`): js.Promise[OperationOutcome | List] = js.native
  def patch(params: `253`): js.Promise[OperationOutcome | Location] = js.native
  def patch(params: `254`): js.Promise[OperationOutcome | Measure] = js.native
  def patch(params: `255`): js.Promise[OperationOutcome | MeasureReport] = js.native
  def patch(params: `256`): js.Promise[OperationOutcome | Media] = js.native
  def patch(params: `257`): js.Promise[OperationOutcome | Medication] = js.native
  def patch(params: `258`): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def patch(params: `259`): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def patch(params: `260`): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def patch(params: `261`): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def patch(params: `262`): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def patch(params: `263`): js.Promise[OperationOutcome | MessageHeader] = js.native
  def patch(params: `264`): js.Promise[OperationOutcome | NamingSystem] = js.native
  def patch(params: `265`): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def patch(params: `266`): js.Promise[OperationOutcome | Observation] = js.native
  def patch(params: `267`): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def patch(params: `268`): js.Promise[OperationOutcome] = js.native
  def patch(params: `269`): js.Promise[OperationOutcome | Organization] = js.native
  def patch(params: `270`): js.Promise[OperationOutcome | Parameters] = js.native
  def patch(params: `271`): js.Promise[OperationOutcome | Patient] = js.native
  def patch(params: `272`): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def patch(params: `273`): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def patch(params: `274`): js.Promise[OperationOutcome | Person] = js.native
  def patch(params: `275`): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def patch(params: `276`): js.Promise[OperationOutcome | Practitioner] = js.native
  def patch(params: `277`): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def patch(params: `278`): js.Promise[OperationOutcome | Procedure] = js.native
  def patch(params: `279`): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def patch(params: `280`): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def patch(params: `281`): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def patch(params: `282`): js.Promise[OperationOutcome | Provenance] = js.native
  def patch(params: `283`): js.Promise[OperationOutcome | Questionnaire] = js.native
  def patch(params: `284`): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def patch(params: `285`): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def patch(params: `286`): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def patch(params: `287`): js.Promise[OperationOutcome | RequestGroup] = js.native
  def patch(params: `288`): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def patch(params: `289`): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def patch(params: `290`): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def patch(params: `291`): js.Promise[OperationOutcome | Schedule] = js.native
  def patch(params: `292`): js.Promise[OperationOutcome | SearchParameter] = js.native
  def patch(params: `293`): js.Promise[OperationOutcome | Sequence] = js.native
  def patch(params: `294`): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def patch(params: `295`): js.Promise[OperationOutcome | Slot] = js.native
  def patch(params: `296`): js.Promise[OperationOutcome | Specimen] = js.native
  def patch(params: `297`): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def patch(params: `298`): js.Promise[OperationOutcome | StructureMap] = js.native
  def patch(params: `299`): js.Promise[OperationOutcome | Subscription] = js.native
  def patch(params: `300`): js.Promise[OperationOutcome | Substance] = js.native
  def patch(params: `301`): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def patch(params: `302`): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def patch(params: `303`): js.Promise[OperationOutcome | Task] = js.native
  def patch(params: `304`): js.Promise[OperationOutcome | TestReport] = js.native
  def patch(params: `305`): js.Promise[OperationOutcome | TestScript] = js.native
  def patch(params: `306`): js.Promise[OperationOutcome | ValueSet] = js.native
  def patch(params: `307`): js.Promise[OperationOutcome | VisionPrescription] = js.native
  /**
    * Return the previous page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def prevPage[T /* <: String */](params: typings.fhirKitClient.anon.Bundle[T]): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def prevPage[T /* <: String */](params: typings.fhirKitClient.anon.Bundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def read(params: HeadersHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def read(params: HeadersHeadersIdString): js.Promise[OperationOutcome | CarePlan] = js.native
  def read(params: HeadersHeadersIdStringOptionsOptions): js.Promise[OperationOutcome | Claim] = js.native
  def read(params: HeadersHeadersIdStringOptionsOptionsResourceType): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def read(params: HeadersId): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def read(params: HeadersIdOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def read(params: HeadersIdOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
  /**
    * Get a resource by id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.read({
    *   resourceType: 'Patient',
    *   id: '12345',
    * }).then(data => console.log(data));
    *
    * // Using async
    * let response = await fhirClient.read({
    *   resourceType: 'Patient',
    *   id: '12345',
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def read(params: Id): js.Promise[OperationOutcome | Account] = js.native
  def read(params: IdOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def read(params: IdOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def read(params: IdString): js.Promise[OperationOutcome | Bundle] = js.native
  def read(params: IdStringOptionsOptions): js.Promise[OperationOutcome | CareTeam] = js.native
  def read(params: IdStringOptionsOptionsResourceType): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def read(params: Options): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def read(params: OptionsOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def read(params: OptionsOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  def read(params: OptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def read(params: typings.fhirKitClient.anon.ResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def read(params: ResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def read(params: `0`): js.Promise[OperationOutcome | CodeSystem] = js.native
  def read(params: `10`): js.Promise[OperationOutcome | DataElement] = js.native
  def read(params: `11`): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def read(params: `12`): js.Promise[OperationOutcome | Device] = js.native
  def read(params: `13`): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def read(params: `14`): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def read(params: `15`): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def read(params: `16`): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def read(params: `17`): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def read(params: `18`): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def read(params: `19`): js.Promise[OperationOutcome | DocumentReference] = js.native
  def read(params: `1`): js.Promise[OperationOutcome | Communication] = js.native
  def read(params: `20`): js.Promise[OperationOutcome | DomainResource] = js.native
  def read(params: `21`): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def read(params: `22`): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def read(params: `23`): js.Promise[OperationOutcome | Encounter] = js.native
  def read(params: `24`): js.Promise[OperationOutcome | Endpoint] = js.native
  def read(params: `25`): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def read(params: `26`): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def read(params: `27`): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def read(params: `28`): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def read(params: `29`): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def read(params: `2`): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def read(params: `30`): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def read(params: `31`): js.Promise[OperationOutcome | Flag] = js.native
  def read(params: `32`): js.Promise[OperationOutcome | Goal] = js.native
  def read(params: `33`): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def read(params: `34`): js.Promise[OperationOutcome | Group] = js.native
  def read(params: `35`): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def read(params: `36`): js.Promise[OperationOutcome | HealthcareService] = js.native
  def read(params: `37`): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def read(params: `38`): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def read(params: `39`): js.Promise[OperationOutcome | Immunization] = js.native
  def read(params: `3`): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def read(params: `40`): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def read(params: `41`): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def read(params: `42`): js.Promise[OperationOutcome | Library] = js.native
  def read(params: `43`): js.Promise[OperationOutcome | Linkage] = js.native
  def read(params: `44`): js.Promise[OperationOutcome | List] = js.native
  def read(params: `45`): js.Promise[OperationOutcome | Location] = js.native
  def read(params: `46`): js.Promise[OperationOutcome | Measure] = js.native
  def read(params: `47`): js.Promise[OperationOutcome | MeasureReport] = js.native
  def read(params: `48`): js.Promise[OperationOutcome | Media] = js.native
  def read(params: `49`): js.Promise[OperationOutcome | Medication] = js.native
  def read(params: `4`): js.Promise[OperationOutcome | Composition] = js.native
  def read(params: `50`): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def read(params: `51`): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def read(params: `52`): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def read(params: `53`): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def read(params: `54`): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def read(params: `55`): js.Promise[OperationOutcome | MessageHeader] = js.native
  def read(params: `56`): js.Promise[OperationOutcome | NamingSystem] = js.native
  def read(params: `57`): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def read(params: `58`): js.Promise[OperationOutcome | Observation] = js.native
  def read(params: `59`): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def read(params: `5`): js.Promise[OperationOutcome | ConceptMap] = js.native
  def read(params: `60`): js.Promise[OperationOutcome] = js.native
  def read(params: `61`): js.Promise[OperationOutcome | Organization] = js.native
  def read(params: `62`): js.Promise[OperationOutcome | Parameters] = js.native
  def read(params: `63`): js.Promise[OperationOutcome | Patient] = js.native
  def read(params: `64`): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def read(params: `65`): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def read(params: `66`): js.Promise[OperationOutcome | Person] = js.native
  def read(params: `67`): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def read(params: `68`): js.Promise[OperationOutcome | Practitioner] = js.native
  def read(params: `69`): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def read(params: `6`): js.Promise[OperationOutcome | Condition] = js.native
  def read(params: `70`): js.Promise[OperationOutcome | Procedure] = js.native
  def read(params: `71`): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def read(params: `72`): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def read(params: `73`): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def read(params: `74`): js.Promise[OperationOutcome | Provenance] = js.native
  def read(params: `75`): js.Promise[OperationOutcome | Questionnaire] = js.native
  def read(params: `76`): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def read(params: `77`): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def read(params: `78`): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def read(params: `79`): js.Promise[OperationOutcome | RequestGroup] = js.native
  def read(params: `7`): js.Promise[OperationOutcome | Consent] = js.native
  def read(params: `80`): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def read(params: `81`): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def read(params: `82`): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def read(params: `83`): js.Promise[OperationOutcome | Schedule] = js.native
  def read(params: `84`): js.Promise[OperationOutcome | SearchParameter] = js.native
  def read(params: `85`): js.Promise[OperationOutcome | Sequence] = js.native
  def read(params: `86`): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def read(params: `87`): js.Promise[OperationOutcome | Slot] = js.native
  def read(params: `88`): js.Promise[OperationOutcome | Specimen] = js.native
  def read(params: `89`): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def read(params: `8`): js.Promise[OperationOutcome | Contract] = js.native
  def read(params: `90`): js.Promise[OperationOutcome | StructureMap] = js.native
  def read(params: `91`): js.Promise[OperationOutcome | Subscription] = js.native
  def read(params: `92`): js.Promise[OperationOutcome | Substance] = js.native
  def read(params: `93`): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def read(params: `94`): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def read(params: `95`): js.Promise[OperationOutcome | Task] = js.native
  def read(params: `96`): js.Promise[OperationOutcome | TestReport] = js.native
  def read(params: `97`): js.Promise[OperationOutcome | TestScript] = js.native
  def read(params: `98`): js.Promise[OperationOutcome | ValueSet] = js.native
  def read(params: `99`): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def read(params: `9`): js.Promise[OperationOutcome | Coverage] = js.native
  /**
    * Resolve a reference and return FHIR resource
    *
    * From: http://hl7.org/fhir/STU3/references.html, a reference can be: 1)
    * absolute URL, 2) relative URL or 3) an internal fragement. In the case of
    * (2), there are rules on resolving references that are in a FHIR bundle.
    *
    * @async
    *
    * @example
    *
    * // Always does a new http request
    * client.resolve({ reference: 'http://test.com/fhir/Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Always does a new http request, using the client.baseUrl
    * client.resolve({ reference: 'Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Try to resolve a patient in the bundle, otherwise build request
    * // at client.baseUrl
    * client.resolve({ reference: 'Patient/1', context: bundle }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Resolve a patient contained in someResource (see:
    * // http://hl7.org/fhir/STU3/references.html#contained)
    * client.resolve({ reference: '#patient-1', context: someResource }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.reference - FHIR reference
    * @param {Object} [params.context] - Optional bundle with 'entry' array or FHIR resource with 'contained' array (if 'params.reference' starts with '#')
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def resolve(params: Context): js.Promise[FhirResource] = js.native
  /**
    * Retrieve the change history for a particular resource FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {string} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceHistory(params: ResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Search for a FHIR resource.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceSearch(params: typings.fhirKitClient.anon.SearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Search for a FHIR resource, with or without compartments, or the entire
    * system
    *
    * @example
    *
    * // Using promises
    * fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {Object} [params.compartment] - The search compartment, optional.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    *
    * @throws {Error} if neither searchParams nor resourceType are supplied
    */
  def search(params: typings.fhirKitClient.anon.Compartment): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Obtain the SMART OAuth URLs from the Capability Statement
    * http://docs.smarthealthit.org/authorization/conformance-statement/
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.smartAuthMetadata().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.smartAuthMetadata();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} contains the following SMART URIs: authorizeUrl,
    *   tokenUrl, registerUrl, manageUrl
    */
  def smartAuthMetadata(): js.Promise[SmartAuthMetadata] = js.native
  def smartAuthMetadata(params: typings.fhirKitClient.anon.Headers): js.Promise[SmartAuthMetadata] = js.native
  /**
    * Retrieve the change history for all resources.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemHistory();
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemHistory();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemHistory(): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def systemHistory(params: typings.fhirKitClient.anon.Headers): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Search across all FHIR resource types in the system.
    * Only the parameters defined for all resources can be used.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemSearch({
    *   searchParams: { name: 'smith' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemSearch({ searchParams: { name: 'smith' } });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemSearch(params: OptionsSearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Submit a set of actions to perform independently as a transaction.
    *
    * Update, create or delete a set of resources in a single interaction.
    * The entire set of changes should succeed or fail as a single entity.
    * Multiple actions on multiple resources different types may be submitted.
    * The outcome should not depend on the order of the resources loaded.
    * Order of processing actions: DELETE, POST, PUT, and GET.
    * The transaction fails if any resource overlap in DELETE, POST and PUT.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'transaction',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.transaction({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.transaction({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.body - The request body with a type of
    *   'transaction'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def transaction(params: BodyBundletypetransaction): js.Promise[OperationOutcome | Bundletypetransactionresp] = js.native
  /**
    * Retrieve the change history for a particular resource type.
    *
    * @example
    *
    * // Using promises
    * fhirClient.typeHistory({ resourceType: 'Patient' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.typeHistory({ resourceType: 'Patient' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def typeHistory(params: HeadersHeadersOptionsOptions): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def update(params: BodyAllergyIntolerance): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def update(params: BodyAppointment): js.Promise[OperationOutcome | Appointment] = js.native
  def update(params: BodyAppointmentResponse): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def update(params: BodyAuditEventHeadersHeaders): js.Promise[OperationOutcome | AuditEvent] = js.native
  def update(params: BodyBasicHeadersHeaders): js.Promise[OperationOutcome | Basic] = js.native
  def update(params: BodyBinaryHeadersHeaders): js.Promise[OperationOutcome | Binary] = js.native
  def update(params: BodyBodySiteHeadersHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def update(params: BodyBundleHeadersHeaders): js.Promise[OperationOutcome | Bundle] = js.native
  def update(params: BodyCapabilityStatementHeadersHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def update(params: BodyCarePlanHeadersHeaders): js.Promise[OperationOutcome | CarePlan] = js.native
  def update(params: BodyCareTeamHeadersHeaders): js.Promise[OperationOutcome | CareTeam] = js.native
  def update(params: BodyChargeItemHeadersHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def update(params: BodyClaimHeadersHeaders): js.Promise[OperationOutcome | Claim] = js.native
  def update(params: BodyClaimResponseHeadersHeaders): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def update(params: BodyClinicalImpressionHeadersHeaders): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def update(params: BodyCodeSystemHeadersHeaders): js.Promise[OperationOutcome | CodeSystem] = js.native
  def update(params: BodyCommunicationHeadersHeaders): js.Promise[OperationOutcome | Communication] = js.native
  def update(params: BodyCommunicationRequestHeadersHeaders): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def update(params: BodyCompartmentDefinitionHeadersHeaders): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def update(params: BodyCompositionHeadersHeaders): js.Promise[OperationOutcome | Composition] = js.native
  def update(params: BodyConceptMapHeadersHeaders): js.Promise[OperationOutcome | ConceptMap] = js.native
  def update(params: BodyConditionHeadersHeaders): js.Promise[OperationOutcome | Condition] = js.native
  def update(params: BodyConsentHeadersHeaders): js.Promise[OperationOutcome | Consent] = js.native
  def update(params: BodyContractHeadersHeaders): js.Promise[OperationOutcome | Contract] = js.native
  def update(params: BodyCoverageHeadersHeaders): js.Promise[OperationOutcome | Coverage] = js.native
  def update(params: BodyDataElementHeadersHeaders): js.Promise[OperationOutcome | DataElement] = js.native
  def update(params: BodyDetectedIssueHeadersHeaders): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def update(params: BodyDeviceComponentHeadersHeaders): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def update(params: BodyDeviceHeadersHeaders): js.Promise[OperationOutcome | Device] = js.native
  def update(params: BodyDeviceMetricHeadersHeaders): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def update(params: BodyDeviceRequestHeadersHeaders): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def update(params: BodyDeviceUseStatementHeadersHeaders): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def update(params: BodyDiagnosticReportHeadersHeaders): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def update(params: BodyDocumentManifestHeadersHeaders): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def update(params: BodyDocumentReferenceHeadersHeaders): js.Promise[OperationOutcome | DocumentReference] = js.native
  def update(params: BodyDomainResourceHeadersHeaders): js.Promise[OperationOutcome | DomainResource] = js.native
  def update(params: BodyEligibilityRequestHeadersHeaders): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def update(params: BodyEligibilityResponseHeadersHeaders): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def update(params: BodyEncounterHeadersHeaders): js.Promise[OperationOutcome | Encounter] = js.native
  def update(params: BodyEndpointHeadersHeaders): js.Promise[OperationOutcome | Endpoint] = js.native
  def update(params: BodyEnrollmentRequestHeadersHeaders): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def update(params: BodyEnrollmentResponseHeadersHeaders): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def update(params: BodyEpisodeOfCareHeadersHeaders): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def update(params: BodyExpansionProfileHeadersHeaders): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def update(params: BodyExplanationOfBenefitHeadersHeaders): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def update(params: BodyFamilyMemberHistoryHeadersHeaders): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def update(params: BodyFlagHeadersHeaders): js.Promise[OperationOutcome | Flag] = js.native
  def update(params: BodyGoalHeadersHeaders): js.Promise[OperationOutcome | Goal] = js.native
  def update(params: BodyGraphDefinitionHeadersHeaders): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def update(params: BodyGroupHeadersHeaders): js.Promise[OperationOutcome | Group] = js.native
  def update(params: BodyGuidanceResponseHeadersHeaders): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  /**
    * Update a resource by FHIR id.
    *
    * @example
    *
    * const updatedPatient = {
    *   resourceType: 'Patient',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.body - The resource to be updated.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def update(params: BodyHeadersId): js.Promise[OperationOutcome | Account] = js.native
  def update(params: BodyHeadersIdOptions): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def update(params: BodyHeadersIdOptionsResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def update(params: BodyHealthcareServiceHeadersHeaders): js.Promise[OperationOutcome | HealthcareService] = js.native
  def update(params: BodyImagingManifestHeadersHeaders): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def update(params: BodyImagingStudyHeadersHeaders): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def update(params: BodyImmunizationHeadersHeaders): js.Promise[OperationOutcome | Immunization] = js.native
  def update(params: BodyImmunizationRecommendationHeadersHeaders): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def update(params: BodyImplementationGuideHeadersHeaders): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def update(params: BodyLibraryHeadersHeaders): js.Promise[OperationOutcome | Library] = js.native
  def update(params: BodyLinkageHeadersHeaders): js.Promise[OperationOutcome | Linkage] = js.native
  def update(params: BodyListHeadersHeaders): js.Promise[OperationOutcome | List] = js.native
  def update(params: BodyLocationHeadersHeaders): js.Promise[OperationOutcome | Location] = js.native
  def update(params: BodyMeasureHeadersHeaders): js.Promise[OperationOutcome | Measure] = js.native
  def update(params: BodyMeasureReportHeadersHeaders): js.Promise[OperationOutcome | MeasureReport] = js.native
  def update(params: BodyMediaHeadersHeaders): js.Promise[OperationOutcome | Media] = js.native
  def update(params: BodyMedicationAdministrationHeadersHeaders): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def update(params: BodyMedicationDispenseHeadersHeaders): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def update(params: BodyMedicationHeadersHeaders): js.Promise[OperationOutcome | Medication] = js.native
  def update(params: BodyMedicationRequestHeadersHeaders): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def update(params: BodyMedicationStatementHeadersHeaders): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def update(params: BodyMessageDefinitionHeadersHeaders): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def update(params: BodyMessageHeaderHeadersHeaders): js.Promise[OperationOutcome | MessageHeader] = js.native
  def update(params: BodyNamingSystemHeadersHeaders): js.Promise[OperationOutcome | NamingSystem] = js.native
  def update(params: BodyNutritionOrderHeadersHeaders): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def update(params: BodyObservationHeadersHeaders): js.Promise[OperationOutcome | Observation] = js.native
  def update(params: BodyOperationDefinitionHeadersHeaders): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def update(params: BodyOperationOutcomeHeadersHeaders): js.Promise[OperationOutcome] = js.native
  def update(params: BodyOrganizationHeadersHeaders): js.Promise[OperationOutcome | Organization] = js.native
  def update(params: BodyParametersHeadersHeaders): js.Promise[OperationOutcome | Parameters] = js.native
  def update(params: BodyPatientHeadersHeaders): js.Promise[OperationOutcome | Patient] = js.native
  def update(params: BodyPaymentNoticeHeadersHeaders): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def update(params: BodyPaymentReconciliationHeadersHeaders): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def update(params: BodyPersonHeadersHeaders): js.Promise[OperationOutcome | Person] = js.native
  def update(params: BodyPlanDefinitionHeadersHeaders): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def update(params: BodyPractitionerHeadersHeaders): js.Promise[OperationOutcome | Practitioner] = js.native
  def update(params: BodyPractitionerRoleHeadersHeaders): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def update(params: BodyProcedureHeadersHeaders): js.Promise[OperationOutcome | Procedure] = js.native
  def update(params: BodyProcedureRequestHeadersHeaders): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def update(params: BodyProcessRequestHeadersHeaders): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def update(params: BodyProcessResponseHeadersHeaders): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def update(params: BodyProvenanceHeadersHeaders): js.Promise[OperationOutcome | Provenance] = js.native
  def update(params: BodyQuestionnaireHeadersHeaders): js.Promise[OperationOutcome | Questionnaire] = js.native
  def update(params: BodyQuestionnaireResponseHeadersHeaders): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def update(params: BodyReferralRequestHeadersHeaders): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def update(params: BodyRelatedPersonHeadersHeaders): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def update(params: BodyRequestGroupHeadersHeaders): js.Promise[OperationOutcome | RequestGroup] = js.native
  def update(params: BodyResearchStudyHeadersHeaders): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def update(params: BodyResearchSubjectHeadersHeaders): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def update(params: BodyRiskAssessmentHeadersHeaders): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def update(params: BodyScheduleHeadersHeaders): js.Promise[OperationOutcome | Schedule] = js.native
  def update(params: BodySearchParameterHeadersHeaders): js.Promise[OperationOutcome | SearchParameter] = js.native
  def update(params: BodySequenceHeadersHeaders): js.Promise[OperationOutcome | Sequence] = js.native
  def update(params: BodyServiceDefinitionHeadersHeaders): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def update(params: BodySlotHeadersHeaders): js.Promise[OperationOutcome | Slot] = js.native
  def update(params: BodySpecimenHeadersHeaders): js.Promise[OperationOutcome | Specimen] = js.native
  def update(params: BodyStructureDefinitionHeadersHeaders): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def update(params: BodyStructureMapHeadersHeaders): js.Promise[OperationOutcome | StructureMap] = js.native
  def update(params: BodySubscriptionHeadersHeaders): js.Promise[OperationOutcome | Subscription] = js.native
  def update(params: BodySubstanceHeadersHeaders): js.Promise[OperationOutcome | Substance] = js.native
  def update(params: BodySupplyDeliveryHeadersHeaders): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def update(params: BodySupplyRequestHeadersHeaders): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def update(params: BodyTaskHeadersHeaders): js.Promise[OperationOutcome | Task] = js.native
  def update(params: BodyTestReportHeadersHeaders): js.Promise[OperationOutcome | TestReport] = js.native
  def update(params: BodyTestScriptHeadersHeaders): js.Promise[OperationOutcome | TestScript] = js.native
  def update(params: BodyValueSetHeadersHeaders): js.Promise[OperationOutcome | ValueSet] = js.native
  def update(params: BodyVisionPrescriptionHeadersHeaders): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def update[T /* <: CustomResource */](params: BodyTHeadersHeaders[T]): js.Promise[OperationOutcome | T] = js.native
  def vread(params: HeadersHeadersIdStringOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | BodySite] = js.native
  def vread(params: HeadersIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | Appointment] = js.native
  def vread(params: IdOptionsResourceTypeVersion): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def vread(params: IdStringOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Binary] = js.native
  def vread(params: OptionsOptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def vread(params: OptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Basic] = js.native
  def vread(params: OptionsResourceTypeVersion): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def vread(params: ResourceTypeVersion): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def vread(params: ResourceTypeVersionString): js.Promise[OperationOutcome | AuditEvent] = js.native
  /**
    * Get a resource by id and version.
    *
    * @example
    *
    * // Using promises
    * fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * }).then(data => console.log(data));
    *
    * // Using async
    * let response = await fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.version - The version id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def vread(params: Version): js.Promise[OperationOutcome | Account] = js.native
  def vread(params: VersionString): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def vread(params: `100`): js.Promise[OperationOutcome | Bundle] = js.native
  def vread(params: `101`): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def vread(params: `102`): js.Promise[OperationOutcome | CarePlan] = js.native
  def vread(params: `103`): js.Promise[OperationOutcome | CareTeam] = js.native
  def vread(params: `104`): js.Promise[OperationOutcome | ChargeItem] = js.native
  def vread(params: `105`): js.Promise[OperationOutcome | Claim] = js.native
  def vread(params: `106`): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def vread(params: `107`): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def vread(params: `108`): js.Promise[OperationOutcome | CodeSystem] = js.native
  def vread(params: `109`): js.Promise[OperationOutcome | Communication] = js.native
  def vread(params: `110`): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def vread(params: `111`): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def vread(params: `112`): js.Promise[OperationOutcome | Composition] = js.native
  def vread(params: `113`): js.Promise[OperationOutcome | ConceptMap] = js.native
  def vread(params: `114`): js.Promise[OperationOutcome | Condition] = js.native
  def vread(params: `115`): js.Promise[OperationOutcome | Consent] = js.native
  def vread(params: `116`): js.Promise[OperationOutcome | Contract] = js.native
  def vread(params: `117`): js.Promise[OperationOutcome | Coverage] = js.native
  def vread(params: `118`): js.Promise[OperationOutcome | DataElement] = js.native
  def vread(params: `119`): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def vread(params: `120`): js.Promise[OperationOutcome | Device] = js.native
  def vread(params: `121`): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def vread(params: `122`): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def vread(params: `123`): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def vread(params: `124`): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def vread(params: `125`): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def vread(params: `126`): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def vread(params: `127`): js.Promise[OperationOutcome | DocumentReference] = js.native
  def vread(params: `128`): js.Promise[OperationOutcome | DomainResource] = js.native
  def vread(params: `129`): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def vread(params: `130`): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def vread(params: `131`): js.Promise[OperationOutcome | Encounter] = js.native
  def vread(params: `132`): js.Promise[OperationOutcome | Endpoint] = js.native
  def vread(params: `133`): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def vread(params: `134`): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def vread(params: `135`): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def vread(params: `136`): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def vread(params: `137`): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def vread(params: `138`): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def vread(params: `139`): js.Promise[OperationOutcome | Flag] = js.native
  def vread(params: `140`): js.Promise[OperationOutcome | Goal] = js.native
  def vread(params: `141`): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def vread(params: `142`): js.Promise[OperationOutcome | Group] = js.native
  def vread(params: `143`): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def vread(params: `144`): js.Promise[OperationOutcome | HealthcareService] = js.native
  def vread(params: `145`): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def vread(params: `146`): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def vread(params: `147`): js.Promise[OperationOutcome | Immunization] = js.native
  def vread(params: `148`): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def vread(params: `149`): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def vread(params: `150`): js.Promise[OperationOutcome | Library] = js.native
  def vread(params: `151`): js.Promise[OperationOutcome | Linkage] = js.native
  def vread(params: `152`): js.Promise[OperationOutcome | List] = js.native
  def vread(params: `153`): js.Promise[OperationOutcome | Location] = js.native
  def vread(params: `154`): js.Promise[OperationOutcome | Measure] = js.native
  def vread(params: `155`): js.Promise[OperationOutcome | MeasureReport] = js.native
  def vread(params: `156`): js.Promise[OperationOutcome | Media] = js.native
  def vread(params: `157`): js.Promise[OperationOutcome | Medication] = js.native
  def vread(params: `158`): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def vread(params: `159`): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def vread(params: `160`): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def vread(params: `161`): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def vread(params: `162`): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def vread(params: `163`): js.Promise[OperationOutcome | MessageHeader] = js.native
  def vread(params: `164`): js.Promise[OperationOutcome | NamingSystem] = js.native
  def vread(params: `165`): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def vread(params: `166`): js.Promise[OperationOutcome | Observation] = js.native
  def vread(params: `167`): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def vread(params: `168`): js.Promise[OperationOutcome] = js.native
  def vread(params: `169`): js.Promise[OperationOutcome | Organization] = js.native
  def vread(params: `170`): js.Promise[OperationOutcome | Parameters] = js.native
  def vread(params: `171`): js.Promise[OperationOutcome | Patient] = js.native
  def vread(params: `172`): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def vread(params: `173`): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def vread(params: `174`): js.Promise[OperationOutcome | Person] = js.native
  def vread(params: `175`): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def vread(params: `176`): js.Promise[OperationOutcome | Practitioner] = js.native
  def vread(params: `177`): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def vread(params: `178`): js.Promise[OperationOutcome | Procedure] = js.native
  def vread(params: `179`): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def vread(params: `180`): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def vread(params: `181`): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def vread(params: `182`): js.Promise[OperationOutcome | Provenance] = js.native
  def vread(params: `183`): js.Promise[OperationOutcome | Questionnaire] = js.native
  def vread(params: `184`): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def vread(params: `185`): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def vread(params: `186`): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def vread(params: `187`): js.Promise[OperationOutcome | RequestGroup] = js.native
  def vread(params: `188`): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def vread(params: `189`): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def vread(params: `190`): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def vread(params: `191`): js.Promise[OperationOutcome | Schedule] = js.native
  def vread(params: `192`): js.Promise[OperationOutcome | SearchParameter] = js.native
  def vread(params: `193`): js.Promise[OperationOutcome | Sequence] = js.native
  def vread(params: `194`): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def vread(params: `195`): js.Promise[OperationOutcome | Slot] = js.native
  def vread(params: `196`): js.Promise[OperationOutcome | Specimen] = js.native
  def vread(params: `197`): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def vread(params: `198`): js.Promise[OperationOutcome | StructureMap] = js.native
  def vread(params: `199`): js.Promise[OperationOutcome | Subscription] = js.native
  def vread(params: `200`): js.Promise[OperationOutcome | Substance] = js.native
  def vread(params: `201`): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def vread(params: `202`): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def vread(params: `203`): js.Promise[OperationOutcome | Task] = js.native
  def vread(params: `204`): js.Promise[OperationOutcome | TestReport] = js.native
  def vread(params: `205`): js.Promise[OperationOutcome | TestScript] = js.native
  def vread(params: `206`): js.Promise[OperationOutcome | ValueSet] = js.native
  def vread(params: `207`): js.Promise[OperationOutcome | VisionPrescription] = js.native
}


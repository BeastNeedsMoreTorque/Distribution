package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.bpmnModdle.mod.TypeDerived because Already inherited
- typings.bpmnModdle.mod.BaseElement because Already inherited
- typings.bpmnModdle.mod.Collaboration because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined name, isClosed, participants, messageFlows, artifacts, conversations, conversationAssociations, participantAssociations, messageFlowAssociations, correlationKeys, choreographyRef, conversationLinks */ trait GlobalChoreographyTask extends FlowElementsContainer {
  var artifacts: js.Array[Artifact]
  var choreographyRef: js.Array[Choreography]
  var conversationAssociations: js.Array[ConversationAssociation]
  var conversationLinks: js.Array[ConversationLink]
  var conversations: js.Array[ConversationNode]
  var correlationKeys: js.Array[CorrelationKey]
  var initiatingParticipantRef: Participant
  var isClosed: Boolean
  var messageFlowAssociations: js.Array[MessageFlowAssociation]
  var messageFlows: js.Array[MessageFlow]
  var name: String
  var participantAssociations: js.Array[ParticipantAssociation]
  var participants: js.Array[Participant]
}

object GlobalChoreographyTask {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    choreographyRef: js.Array[Choreography],
    conversationAssociations: js.Array[ConversationAssociation],
    conversationLinks: js.Array[ConversationLink],
    conversations: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    flowElements: js.Array[FlowElement],
    id: String,
    initiatingParticipantRef: Participant,
    isClosed: Boolean,
    laneSets: js.Array[LaneSet],
    messageFlowAssociations: js.Array[MessageFlowAssociation],
    messageFlows: js.Array[MessageFlow],
    name: String,
    participantAssociations: js.Array[ParticipantAssociation],
    participants: js.Array[Participant],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): GlobalChoreographyTask = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], choreographyRef = choreographyRef.asInstanceOf[js.Any], conversationAssociations = conversationAssociations.asInstanceOf[js.Any], conversationLinks = conversationLinks.asInstanceOf[js.Any], conversations = conversations.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], messageFlowAssociations = messageFlowAssociations.asInstanceOf[js.Any], messageFlows = messageFlows.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalChoreographyTask]
  }
}


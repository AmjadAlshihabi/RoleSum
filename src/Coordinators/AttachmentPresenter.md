# AttachmentPresenter
### This Coordinator is responsible for delegating work between the following objects: 
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) has a role type of Information Holder
* [Attachment](../InformationHolders/Attachment.md) has a role type of Information Holder
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [AttachmentViewInfo](../InformationHolders/AttachmentViewInfo.md) has a role type of Information Holder
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) has a role type of Information Holder
* [Attachment](../InformationHolders/Attachment.md) has a role type of Information Holder
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* [Attachment](../InformationHolders/Attachment.md) has a role type of Information Holder
### the loadNonInlineAttachments method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 


### the initAttachmentContentLoader method receives requests from:
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [Attachment](../InformationHolders/Attachment.md) 


### the addAttachment method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [AttachmentViewInfo](../InformationHolders/AttachmentViewInfo.md) 


### the processMessageToForward method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [MessageViewInfo](../InformationHolders/MessageViewInfo.md) 


### the initAttachmentInfoLoader method receives requests from:
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [Attachment](../InformationHolders/Attachment.md) 


### the onClickAddAttachment method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 


### the addAttachmentAndStartLoader method receives requests from:
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
### and delegate the request to: 
* [Attachment](../InformationHolders/Attachment.md) 



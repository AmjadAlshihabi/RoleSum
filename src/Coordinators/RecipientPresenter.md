# RecipientPresenter
### This Coordinator is responsible for delegating work between the following objects: 
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [Message](../Structurers/Message.md) has a role type of Structurer
* [RecipientType](../InformationHolders/RecipientType.md) has a role type of Information Holder
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [MailTo](../ServiceProviders/MailTo.md) has a role type of Service Provider
* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [Identity](../InformationHolders/Identity.md) has a role type of Information Holder
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [Message](../Structurers/Message.md) has a role type of Structurer
* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) has a role type of Service Provider
* [CryptoProviderState](../InformationHolders/CryptoProviderState.md) has a role type of Information Holder
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [SendErrorState](../InformationHolders/SendErrorState.md) has a role type of Information Holder
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) has a role type of Information Holder
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [Account](../InformationHolders/Account.md) has a role type of Information Holder
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
* [AttachErrorState](../InformationHolders/AttachErrorState.md) has a role type of Information Holder
* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* [RecipientType](../InformationHolders/RecipientType.md) has a role type of Information Holder
* [RecipientType](../InformationHolders/RecipientType.md) has a role type of Information Holder
* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* [CryptoMode](../InformationHolders/CryptoMode.md) has a role type of Information Holder
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* [Message](../Structurers/Message.md) has a role type of Structurer
* [Message](../Structurers/Message.md) has a role type of Structurer
### the initFromReplyToMessage method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 


### the addRecipientFromContactUri method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the initFromMailto method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [MailTo](../ServiceProviders/MailTo.md) 


### the addToAddresses method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Address](../ServiceProviders/Address.md) 


### the onSwitchIdentity method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Identity](../InformationHolders/Identity.md) 


### the initFromDraftMessage method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 


### the setCryptoProviderState method receives requests from:
* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoProviderState](../InformationHolders/CryptoProviderState.md) 


### the showPgpSendError method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [SendErrorState](../InformationHolders/SendErrorState.md) 


### the builderSetProperties method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* [ComposeCryptoStatus](../InformationHolders/ComposeCryptoStatus.md) 


### the onSwitchAccount method receives requests from:
* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Account](../InformationHolders/Account.md) 


### the showPgpAttachError method receives requests from:
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [AttachErrorState](../InformationHolders/AttachErrorState.md) 


### the addCcAddresses method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Address](../ServiceProviders/Address.md) 


### the recipientTypeToRequestCode method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the addRecipientsFromAddresses method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 
* [Address](../ServiceProviders/Address.md) 


### the onCryptoModeChanged method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [CryptoMode](../InformationHolders/CryptoMode.md) 


### the addBccAddresses method receives requests from:
* [MessageCompose](../Controllers/MessageCompose.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Address](../ServiceProviders/Address.md) 


### the initRecipientsFromDraftMessage method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 


### the initPgpInlineFromDraftMessage method receives requests from:
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 



# ComposeCryptoStatus
## This Information Holder is responsible for:
### providing and holding information about: 
* recipientAutocryptStatus
* recipientAddresses
* cryptoProviderState
* preferEncryptMutual
* enablePgpInline
* openPgpKeyId
* cryptoMode
### Providing information to the following objects 
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
* [AttachmentPresenter](../Coordinators/AttachmentPresenter.md) has a role type of Coordinator
* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) has a role type of Service Provider
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator

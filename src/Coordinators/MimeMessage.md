# MimeMessage
### This Coordinator is responsible for delegating work between the following objects: 
* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
* [RecipientSelectView](../Interfacers/RecipientSelectView.md) has a role type of Interfacer
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) has a role type of Service Provider
* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* [RecipientType](../InformationHolders/RecipientType.md) has a role type of Information Holder
* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) has a role type of Service Provider
* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) has a role type of Information Holder
* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
* [Preferences](../Structurers/Preferences.md) has a role type of Structurer
* [AttachmentController](../Controllers/AttachmentController.md) has a role type of Controller
* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) has a role type of Service Provider
* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
* [ConditionsTreeNode](../Structurers/ConditionsTreeNode.md) has a role type of Structurer
* [LocalSearch](../Structurers/LocalSearch.md) has a role type of Structurer
* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
* [StorageEditor](../Structurers/StorageEditor.md) has a role type of Structurer
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) has a role type of Service Provider
* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) has a role type of Service Provider
* [FileBackedBody](../InformationHolders/FileBackedBody.md) has a role type of Information Holder
* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) has a role type of Service Provider
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) has a role type of Interfacer
* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) has a role type of Service Provider
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* [Part](../ServiceProviders/Part.md) has a role type of Service Provider
* [Pop3Folder](../Controllers/Pop3Folder.md) has a role type of Controller
* [ImapFolder](../Structurers/ImapFolder.md) has a role type of Structurer
* [MimeBodyPart](../Structurers/MimeBodyPart.md) has a role type of Structurer
* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) has a role type of Structurer
* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) has a role type of Service Provider
* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) has a role type of Service Provider
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) has a role type of Service Provider
* [PartBuilder](../Structurers/PartBuilder.md) has a role type of Structurer
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [Body](../ServiceProviders/Body.md) has a role type of Service Provider
* [Address](../ServiceProviders/Address.md) has a role type of Service Provider
* [SmtpTransport](../ServiceProviders/SmtpTransport.md) has a role type of Service Provider
* [K9](../Controllers/K9.md) has a role type of Controller
* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) has a role type of Service Provider
* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) has a role type of Service Provider
* [TextQuoteCreator](../ServiceProviders/TextQuoteCreator.md) has a role type of Service Provider
* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
* [IdentityHelper](../ServiceProviders/IdentityHelper.md) has a role type of Service Provider
* [MessageHelper](../ServiceProviders/MessageHelper.md) has a role type of Service Provider
* [ReplyToParser](../ServiceProviders/ReplyToParser.md) has a role type of Service Provider
* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* [SendMessageTask](../ServiceProviders/SendMessageTask.md) has a role type of Service Provider
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* [RecipientType](../InformationHolders/RecipientType.md) has a role type of Information Holder
### the setRecipients method receives requests from:
* [Message](../Structurers/Message.md) 
* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* [MimeMessage](../Coordinators/MimeMessage.md) 
* [RecipientSelectView](../Interfacers/RecipientSelectView.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [LocalMessage](../InformationHolders/LocalMessage.md) 
* [ComposeCryptoStatusBuilder](../ServiceProviders/ComposeCryptoStatusBuilder.md) 
* [RecipientAdapter](../Interfacers/RecipientAdapter.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 


### the copy method receives requests from:
* [DefaultBodyFactory](../ServiceProviders/DefaultBodyFactory.md) 
* [Message](../Structurers/Message.md) 
* [BinaryTempFileBody](../InformationHolders/BinaryTempFileBody.md) 
* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) 
* [MimeMessage](../Coordinators/MimeMessage.md) 
* [Preferences](../Structurers/Preferences.md) 
* [AttachmentController](../Controllers/AttachmentController.md) 
* [DownloadImageTask](../ServiceProviders/DownloadImageTask.md) 
* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) 
* [ConditionsTreeNode](../Structurers/ConditionsTreeNode.md) 
* [LocalSearch](../Structurers/LocalSearch.md) 
* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) 
* [StorageEditor](../Structurers/StorageEditor.md) 
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* [BinaryAttachmentBody](../ServiceProviders/BinaryAttachmentBody.md) 
* [DeferredFileBody](../ServiceProviders/DeferredFileBody.md) 
* [FileBackedBody](../InformationHolders/FileBackedBody.md) 
* [LocalMessage](../InformationHolders/LocalMessage.md) 
* [PartBuilder](../Structurers/PartBuilder.md) 
* [MimePartStreamParser](../ServiceProviders/MimePartStreamParser.md) 
* [LocalFolder](../InformationHolders/LocalFolder.md) 
* [ActionModeCallback](../Interfacers/ActionModeCallback.md) 
* [MessageListFragment](../Interfacers/MessageListFragment.md) 
* [MessageList](../Interfacers/MessageList.md) 
* [AttachmentContentLoader](../ServiceProviders/AttachmentContentLoader.md) 
### and delegate the request to: 
* [MimeMessage](../Coordinators/MimeMessage.md) 


### the setFrom method receives requests from:
* [Message](../Structurers/Message.md) 
* [MimeMessage](../Coordinators/MimeMessage.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [LocalMessage](../InformationHolders/LocalMessage.md) 
### and delegate the request to: 
* [Address](../ServiceProviders/Address.md) 


### the setBody method receives requests from:
* [Message](../Structurers/Message.md) 
* [Part](../ServiceProviders/Part.md) 
* [Pop3Folder](../Controllers/Pop3Folder.md) 
* [ImapFolder](../Structurers/ImapFolder.md) 
* [MimeBodyPart](../Structurers/MimeBodyPart.md) 
* [MimeMessageBuilder](../Structurers/MimeMessageBuilder.md) 
* [MimeMessage](../Coordinators/MimeMessage.md) 
* [MimeMessageHelper](../ServiceProviders/MimeMessageHelper.md) 
* [IdentityHeaderBuilder](../ServiceProviders/IdentityHeaderBuilder.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
* [PgpMessageBuilder](../ServiceProviders/PgpMessageBuilder.md) 
* [PartBuilder](../Structurers/PartBuilder.md) 
* [LocalFolder](../InformationHolders/LocalFolder.md) 
### and delegate the request to: 
* [Body](../ServiceProviders/Body.md) 


### the setSender method receives requests from:
* [Message](../Structurers/Message.md) 
* [MimeMessage](../Coordinators/MimeMessage.md) 
### and delegate the request to: 
* [Address](../ServiceProviders/Address.md) 


### the getRecipients method receives requests from:
* [Message](../Structurers/Message.md) 
* [SmtpTransport](../ServiceProviders/SmtpTransport.md) 
* [MimeMessage](../Coordinators/MimeMessage.md) 
* [K9](../Controllers/K9.md) 
* [MessageHeader](../Interfacers/MessageHeader.md) 
* [NotificationContentCreator](../ServiceProviders/NotificationContentCreator.md) 
* [HtmlQuoteCreator](../ServiceProviders/HtmlQuoteCreator.md) 
* [TextQuoteCreator](../ServiceProviders/TextQuoteCreator.md) 
* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) 
* [LocalFolder](../InformationHolders/LocalFolder.md) 
* [IdentityHelper](../ServiceProviders/IdentityHelper.md) 
* [MessageHelper](../ServiceProviders/MessageHelper.md) 
* [ReplyToParser](../ServiceProviders/ReplyToParser.md) 
* [MessagingController](../Controllers/MessagingController.md) 
* [SendMessageTask](../ServiceProviders/SendMessageTask.md) 
* [RecipientPresenter](../Coordinators/RecipientPresenter.md) 
### and delegate the request to: 
* [RecipientType](../InformationHolders/RecipientType.md) 



# MessageExtractor
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* hasMissingParts(Part part)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* findViewablesAndAttachments(Part part,
                @Nullable List<Viewable> outputViewableParts, @Nullable List<Part> outputNonViewableParts)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [AttachmentCounter](../ServiceProviders/AttachmentCounter.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* getTextParts(Part part)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* collectAttachments(Message message)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* collectTextParts(Message message)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getMessageFromPart(Part part)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* findTextPart(Multipart multipart, boolean directChild)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* findHtmlPart(Multipart multipart, Set<Part> knownTextParts,
            @Nullable List<Part> outputNonViewableParts, boolean directChild)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* findAttachments(Multipart multipart, Set<Part> knownTextParts,
            @NonNull List<Part> attachments)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* getParts(List<Viewable> viewables)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* isPartTextualBody(Part part)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
* getContentDisposition(Part part)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* getTextFromPart(Part part, long textSizeLimit)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [MessageCryptoHelper](../ServiceProviders/MessageCryptoHelper.md) has a role type of Service Provider
	* [BodyTextExtractor](../Interfacers/BodyTextExtractor.md) has a role type of Interfacer
	* [MessageFulltextCreator](../ServiceProviders/MessageFulltextCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
	* [MessageCryptoStructureDetector](../ServiceProviders/MessageCryptoStructureDetector.md) has a role type of Service Provider
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
* getTextFromTextPart(Part part, Body body, String mimeType, long textSizeLimit)
	* [MessageExtractor](../ServiceProviders/MessageExtractor.md) has a role type of Service Provider

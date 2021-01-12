# AttachmentResolver
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* getAttachmentUriForContentId(String cid)
	* [K9WebViewClient](../Interfacers/K9WebViewClient.md) has a role type of Interfacer
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
* createFromPart(Part part)
	* [QuotedMessagePresenter](../Structurers/QuotedMessagePresenter.md) has a role type of Structurer
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
	* [MessageViewInfoExtractor](../Controllers/MessageViewInfoExtractor.md) has a role type of Controller
* buildCidToAttachmentUriMap(AttachmentInfoExtractor attachmentInfoExtractor,
            Part rootPart)
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider

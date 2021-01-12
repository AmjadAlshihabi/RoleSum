# PreviewTextExtractor
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* convertFromHtmlIfNecessary(Part textPart, String text)
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* extractPreview(@NonNull Part textPart)
	* [MessagePreviewCreator](../ServiceProviders/MessagePreviewCreator.md) has a role type of Service Provider
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider
* stripTextForPreview(String text)
	* [PreviewTextExtractor](../ServiceProviders/PreviewTextExtractor.md) has a role type of Service Provider

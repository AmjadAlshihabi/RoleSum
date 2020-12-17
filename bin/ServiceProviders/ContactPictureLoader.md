# ContactPictureLoader
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* loadContactPicture(Uri photoUri, final Address address, final ImageView imageView)
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* loadContactPicture(Uri photoUri, final Address address, final ImageView imageView)
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* loadFallbackPicture(Address address, ImageView imageView)
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
* loadContactPicture(Uri photoUri, final Address address, final ImageView imageView)
	* [MessageHeader](../Interfacers/MessageHeader.md) has a role type of Interfacer
	* [MessageListAdapter](../Interfacers/MessageListAdapter.md) has a role type of Interfacer
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
	* [RecipientAdapter](../Interfacers/RecipientAdapter.md) has a role type of Interfacer
* calcUnknownContactColor(Address address)
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
* drawTextAndBgColorOnBitmap(Bitmap bitmap, FallbackGlideParams params)
	* [FallbackGlideBitmapDecoder](../ServiceProviders/FallbackGlideBitmapDecoder.md) has a role type of Service Provider
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* calcUnknownContactLetter(Address address)
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider
* calcUnknownContactLetter(Address address)
	* [ContactPictureLoader](../ServiceProviders/ContactPictureLoader.md) has a role type of Service Provider

# MessageViewFragment
## this Interfacer is responsible for: 
### inheriting the following classes: 
* Fragment
### implementing the following interfaces:
* [ConfirmationDialogFragmentListener](../Interfacers/ConfirmationDialogFragmentListener.md) 
* [AttachmentViewCallback](../ServiceProviders/AttachmentViewCallback.md) 
* [OnClickShowCryptoKeyListener](../ServiceProviders/OnClickShowCryptoKeyListener.md) 
### managing system interaction with external APIs and users using the following objects: 
* Context
* Handler
* DownloadManager
### collaborating with the following objects: 
* Service Providers: 
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) 
	* [MessageViewFragmentListener](../ServiceProviders/MessageViewFragmentListener.md) 
	* [MessageCryptoMvpView](../ServiceProviders/MessageCryptoMvpView.md) 
* Interfacers: 
	* [MessageTopView](../Interfacers/MessageTopView.md) 
	* [MessageLoaderCallbacks](../Interfacers/MessageLoaderCallbacks.md) 
* Information Holders: 
	* [AttachmentViewInfo](../InformationHolders/AttachmentViewInfo.md) 
	* [MessageReference](../InformationHolders/MessageReference.md) 
	* [Account](../InformationHolders/Account.md) 
	* [LocalMessage](../InformationHolders/LocalMessage.md) 
* Controllers: 
	* [MessagingController](../Controllers/MessagingController.md) 
	* [MessageCryptoPresenter](../Controllers/MessageCryptoPresenter.md) 

# MessageContainerView
## this Interfacer is responsible for: 
### inheriting the following classes: 
* LinearLayout
### implementing the following interfaces:
* [OnLayoutChangedListener](../ServiceProviders/OnLayoutChangedListener.md) 
* OnCreateContextMenuListener
### managing system interaction with external APIs and users using the following objects: 
* Map<Uri, AttachmentViewInfo>
* LayoutInflater
* TextView
* Map<AttachmentViewInfo, AttachmentView>
* View
* LinearLayout
### collaborating with the following objects: 
* Service Providers: 
	* [AttachmentViewCallback](../ServiceProviders/AttachmentViewCallback.md) 
	* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) 
	* [ClipboardManager](../ServiceProviders/ClipboardManager.md) 
* Information Holders: 
	* [SavedState](../InformationHolders/SavedState.md) 
* Coordinators: 
	* [MessageWebView](../Coordinators/MessageWebView.md) 

# MessageWebView
### This Coordinator is responsible for delegating work between the following objects: 
* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
* [OnPageFinishedListener](../ServiceProviders/OnPageFinishedListener.md) has a role type of Service Provider
* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) has a role type of Interfacer
* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) has a role type of Service Provider
* [OnPageFinishedListener](../ServiceProviders/OnPageFinishedListener.md) has a role type of Service Provider
### the setWebViewClient method receives requests from:
* [MessageWebView](../Coordinators/MessageWebView.md) 
* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) 
### and delegate the request to: 
* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) 
* [OnPageFinishedListener](../ServiceProviders/OnPageFinishedListener.md) 


### the displayHtmlContentWithInlineAttachments method receives requests from:
* [MessageWebView](../Coordinators/MessageWebView.md) 
* [MessageContainerView](../Interfacers/MessageContainerView.md) 
* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) 
### and delegate the request to: 
* [AttachmentResolver](../ServiceProviders/AttachmentResolver.md) 
* [OnPageFinishedListener](../ServiceProviders/OnPageFinishedListener.md) 



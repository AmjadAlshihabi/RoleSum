# QuotedMessagePresenter
## This Structurer is responsible for:
### managing the relationships between the following objects as components:
* [QuotedTextMode](../InformationHolders/QuotedTextMode.md) 
* [SimpleMessageFormat](../InformationHolders/SimpleMessageFormat.md) 
* [QuotedMessageMvpView](../Interfacers/QuotedMessageMvpView.md) 
* [MessageCompose](../Controllers/MessageCompose.md) 
* [QuoteStyle](../InformationHolders/QuoteStyle.md) 
* [Account](../InformationHolders/Account.md) 
* [InsertableHtmlContent](../InformationHolders/InsertableHtmlContent.md) 
### Maintaining relatiohships between objects through the following methods: 
* builderSetProperties(MessageBuilder builder)
* processDraftMessage(MessageViewInfo messageViewInfo, Map<IdentityField, String> k9identity)

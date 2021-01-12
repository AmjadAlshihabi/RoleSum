# RemoteStore
## This Structurer is responsible for:
### inheriting the following classes:
* [Store](../InformationHolders/Store.md)
### managing the relationships between the following objects as components:
* [StoreConfig](../InformationHolders/StoreConfig.md) 
* [TrustedSocketFactory](../ServiceProviders/TrustedSocketFactory.md) 
### Maintaining relatiohships between objects through the following methods: 
* decodeStoreUri(String uri)
* createStoreUri(ServerSettings server)

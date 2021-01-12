# MessageIdGenerator
### This Coordinator is responsible for delegating work between the following objects: 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
* [Message](../Structurers/Message.md) has a role type of Structurer
### the generateMessageId method receives requests from:
* [MessageIdGenerator](../Coordinators/MessageIdGenerator.md) 
* [MessageBuilder](../ServiceProviders/MessageBuilder.md) 
### and delegate the request to: 
* [Message](../Structurers/Message.md) 



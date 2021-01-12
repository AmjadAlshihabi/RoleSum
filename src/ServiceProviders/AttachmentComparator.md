# AttachmentComparator
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* compare(Cursor cursor1, Cursor cursor2)
	* [ReverseDateComparator](../ServiceProviders/ReverseDateComparator.md) has a role type of Service Provider
	* [MergeCursor](../ServiceProviders/MergeCursor.md) has a role type of Service Provider
	* [ArrivalComparator](../ServiceProviders/ArrivalComparator.md) has a role type of Service Provider
	* [AttachmentComparator](../ServiceProviders/AttachmentComparator.md) has a role type of Service Provider
	* [ComparatorChain](../ServiceProviders/ComparatorChain.md) has a role type of Service Provider
	* [DateComparator](../ServiceProviders/DateComparator.md) has a role type of Service Provider
	* [FlaggedComparator](../ServiceProviders/FlaggedComparator.md) has a role type of Service Provider
	* [ReverseComparator](../Coordinators/ReverseComparator.md) has a role type of Coordinator
	* [ReverseIdComparator](../ServiceProviders/ReverseIdComparator.md) has a role type of Service Provider
	* [SenderComparator](../ServiceProviders/SenderComparator.md) has a role type of Service Provider
	* [SubjectComparator](../ServiceProviders/SubjectComparator.md) has a role type of Service Provider
	* [UnreadComparator](../ServiceProviders/UnreadComparator.md) has a role type of Service Provider
	* [UidReverseComparator](../ServiceProviders/UidReverseComparator.md) has a role type of Service Provider
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer

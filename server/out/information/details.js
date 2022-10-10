"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.details = void 0;
exports.details = {
    DomainError: `The domain error component helps you better organize the errors associated 
with the domain of your application by providing an understandable and easily modified template.`,
    ApplicationError: `The application error component helps you better organize the errors associated 
with the domain of your application by providing an understandable and easily modified template.`,
    DTO: `A Data Transfer Object (DTO) is used to carry data between independent parts of the system or even between different systems.
DTOs are simple objects that do not contain any business logic.`,
    Entity: `The entity component helps you better organize the entities associated
with the domain of your application by providing an understandable and easily modified template.`,
    GraphQLController: `GraphQL Controllers act like a resolver, while also defining their schema.
You define the operation input which must be a DTO declared inside the same module with the Controller.`,
    PackageAdapter: `The PackageAdapter component is a concrete implementation of the corresponding PackagePort.
Its name is inspired by the Hexagonal Architecture (or Ports and Adapters architecture).`,
    PackagePort: `The PackagePort component is a tool which will help you utilize external libraries of the target transpilation language.
It acts as an interface, in order to declare methods which will be later be implemented by the corresponding ServiceAdapter.
Its name and functionality is inspired by the Hexagonal Architecture (or Ports and Adapters architecture).`,
    RepoAdapter: `The RepoAdapter component is a tool which helps to declare the actual concretion of the RepoPort, in order to plug in different databases easily.
Its name and functionality is inspired by the Repository Pattern.
More information not available yet!`,
    RepoPort: `The RepoPort component is a tool which will help you declare an interface in order 
to plug in different databases easily (via RepositoryAdapter).
It acts as an interface, in order to declare methods which will be later be implemented by the corresponding RepoAdapter.`,
    Props: `Props are used to define the required (or optional) properties of a class (such as ValueObject, Entity, UseCase etc.)
 Props automatically generate a Struct with the same name but without the Props ending.`,
};
//# sourceMappingURL=details.js.map
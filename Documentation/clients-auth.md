#Authentication
By default, AutoRest generates clients that make unauthenticated HTTP requests. When the [-AddCredentials](cli.md) flag is set to `true`, the generated client will include a `Credentials` property of type [ServiceClientCredentials](../Microsoft.Rest/ClientRuntime/ServiceClientCredentials.cs). The Microsoft.Rest.ClientRuntime package includes two ServiceClientCredentials : 

 * [`TokenCredentials`](../Microsoft.Rest/ClientRuntime/TokenCredentials.cs) - used for OAuth authentication.
 * [`BasicAuthenticationCredentials`](../Microsoft.Rest/ClientRuntime/BasicAuthenticationCredentials.cs) - used for basic username/password authentication.

Custom authentication behaviors can be implemented by inheriting from [ServiceClientCredentials](../Microsoft.Rest/ClientRuntime/ServiceClientCredentials.cs). The `ProcessHttpRequestAsync()` method is invoked for each HTTP request.
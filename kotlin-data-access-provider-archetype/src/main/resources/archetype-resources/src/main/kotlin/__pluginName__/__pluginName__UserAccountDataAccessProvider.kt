package ${package}.${pluginName}

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import se.curity.identityserver.sdk.attribute.AccountAttributes
import se.curity.identityserver.sdk.attribute.scim.v2.ResourceAttributes
import se.curity.identityserver.sdk.attribute.scim.v2.extensions.LinkedAccount
import se.curity.identityserver.sdk.data.query.ResourceQuery
import se.curity.identityserver.sdk.data.query.ResourceQueryResult
import se.curity.identityserver.sdk.data.update.AttributeUpdate
import se.curity.identityserver.sdk.datasource.UserAccountDataAccessProvider

class ${pluginName}UserAccountDataAccessProvider(private val _configuration: ${pluginName}DataAccessProviderConfig): UserAccountDataAccessProvider
{
    override fun getByUserName(userName: String, attributesEnumeration: ResourceQuery.AttributesEnumeration): ResourceAttributes<*>
    {
        _logger.debug("Received request to get account by username : {}", userName)
        throw UnsupportedOperationException()
    }

    override fun getByEmail(email: String, attributesEnumeration: ResourceQuery.AttributesEnumeration): ResourceAttributes<*>
    {
        _logger.debug("Received request to get account by email : {}", email)
        throw UnsupportedOperationException()
    }

    override fun getByPhone(phone: String, attributesEnumeration: ResourceQuery.AttributesEnumeration): ResourceAttributes<*>
    {
        _logger.debug("Received request to get account by phone number : {}", phone)
        throw UnsupportedOperationException()
    }

    override fun create(accountAttributes: AccountAttributes): AccountAttributes
    {
        _logger.debug("Received request to create account with data : {}", accountAttributes)
        throw UnsupportedOperationException()
    }

    override fun update(accountAttributes: AccountAttributes,
                                        attributesEnumeration: ResourceQuery.AttributesEnumeration): ResourceAttributes<*>
    {
        _logger.debug("Received request to update account with data : {}", accountAttributes)
        throw UnsupportedOperationException()
    }

    override fun update(accountId: String, map: Map<String, Any>,
                                        attributesEnumeration: ResourceQuery.AttributesEnumeration): ResourceAttributes<*>
    {
        _logger.debug("Received request to update account with id:{} and  data : {}", accountId, map)
        throw UnsupportedOperationException()
    }

    override fun patch(accountId: String, attributeUpdate: AttributeUpdate,
                                            attributesEnumeration: ResourceQuery.AttributesEnumeration): ResourceAttributes<*>
    {
        _logger.debug("Received patch request with accountId:{} and  data : {}", accountId, attributeUpdate)
        throw UnsupportedOperationException()
    }

    override fun link(linkingAccountManager: String, localAccountId: String, foreignDomainName: String, foreignUserName: String)
    {
        throw UnsupportedOperationException()
    }

    override fun listLinks(linkingAccountManager: String, localAccountId: String): Collection<LinkedAccount>
    {
        throw UnsupportedOperationException()
    }

    override fun resolveLink(linkingAccountManager: String, foreignDomainName: String, foreignAccountId: String): AccountAttributes
    {
        throw UnsupportedOperationException()
    }

    override fun deleteLink(linkingAccountManager: String, localAccountId: String, foreignDomainName: String, foreignAccountId: String): Boolean
    {
        throw UnsupportedOperationException()
    }

    override fun delete(accountId: String)
    {
        _logger.debug("Received request to delete account with accountId: {}", accountId)
        throw UnsupportedOperationException()
    }

    override fun getAll(startIndex: Long, count: Long): ResourceQueryResult
    {
        _logger.debug("Received request to get all accounts with startIndex :{} and count: {}", startIndex, count)
        throw UnsupportedOperationException()
    }

    companion object
    {
        private val _logger: Logger = LoggerFactory.getLogger(${pluginName}CredentialDataAccessProvider::class.java)    
    }
}

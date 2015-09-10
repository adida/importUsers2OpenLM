
package org.datacontract.schemas._2004._07.openlm_server_services;

import com.microsoft.schemas._2003._10.serialization.arrays.*;
import org.datacontract.schemas._2004._07.openlm_licensemanager_shared.ArrayOfEffectiveLicenseFeature;
import org.datacontract.schemas._2004._07.openlm_server.*;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;
import org.datacontract.schemas._2004._07.openlm_shared_public.ArrayOfLicenseTypes;
import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfintstring;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_server_services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlertDescriptionRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertDescriptionRequest");
    private final static QName _LoginFormSettingsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LoginFormSettingsResponse");
    private final static QName _ArrayOfLicensePackageComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfLicensePackageComponent");
    private final static QName _OpenLMLicenseOverviewResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "OpenLMLicenseOverviewResponse");
    private final static QName _LDAPResetSyncResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LDAPResetSyncResponse");
    private final static QName _RequestBaseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "RequestBaseInfo");
    private final static QName _AlertRuleDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleDestination");
    private final static QName _LmFileForDownload_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LmFileForDownload");
    private final static QName _LicenseProcurementComponentsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseProcurementComponentsResponse");
    private final static QName _GetFileFetchConfigResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GetFileFetchConfigResponse");
    private final static QName _GetLmFilesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GetLmFilesRequest");
    private final static QName _DownloadLmFileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DownloadLmFileResponse");
    private final static QName _UpdateFileFetchConfigResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UpdateFileFetchConfigResponse");
    private final static QName _CurrentlyConsumedLicensesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "CurrentlyConsumedLicensesResponse");
    private final static QName _ArrayOfLicenseProcurement_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfLicenseProcurement");
    private final static QName _OptFileContentRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "OptFileContentRequest");
    private final static QName _UnmanagedProcessFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UnmanagedProcessFeature");
    private final static QName _SMSSettingsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SMSSettingsRequest");
    private final static QName _PackageLicensesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "PackageLicensesResponse");
    private final static QName _SetProjectToUsageSessionByProcessRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SetProjectToUsageSessionByProcessRequest");
    private final static QName _LogsUploadingBaseResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LogsUploadingBaseResponse");
    private final static QName _LicenseUsageReportResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseUsageReportResponse");
    private final static QName _SetFullLoggingRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SetFullLoggingRequest");
    private final static QName _AlertRuleConditionDefinitionsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleConditionDefinitionsResponse");
    private final static QName _AlertRuleCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleCondition");
    private final static QName _FeatureUsageStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FeatureUsageStatusRequest");
    private final static QName _ArrayOfKeyValueStringPair_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfKeyValueStringPair");
    private final static QName _UnmanagedVendor_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UnmanagedVendor");
    private final static QName _LogsUploadingBaseRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LogsUploadingBaseRequest");
    private final static QName _LicensePackageComponent_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicensePackageComponent");
    private final static QName _LicenseServersResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseServersResponse");
    private final static QName _BaseResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "BaseResponse");
    private final static QName _SetProjectToUsageSessionByFeatureRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SetProjectToUsageSessionByFeatureRequest");
    private final static QName _SetProjectToUsageSessionRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SetProjectToUsageSessionRequest");
    private final static QName _AgentProcedureTmplRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AgentProcedureTmplRequest");
    private final static QName _GetUnmanagedVendorRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GetUnmanagedVendorRequest");
    private final static QName _UserLocalSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UserLocalSettings");
    private final static QName _LicenseUsageReportType_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseUsageReportType");
    private final static QName _UpdateFileFetchConfigRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UpdateFileFetchConfigRequest");
    private final static QName _AlertRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRule");
    private final static QName _ArrayOfAlertRuleDestination_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfAlertRuleDestination");
    private final static QName _LogsUploadingStartResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LogsUploadingStartResponse");
    private final static QName _AgentProcedureTmpl_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AgentProcedureTmpl");
    private final static QName _GroupNamesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GroupNamesResponse");
    private final static QName _TestSmsSettingsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "TestSmsSettingsRequest");
    private final static QName _FileFetchStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FileFetchStatusResponse");
    private final static QName _AlertRuleComponentsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleComponentsResponse");
    private final static QName _FileFetchStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FileFetchStatusRequest");
    private final static QName _Error_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Error");
    private final static QName _FeatureUsageStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FeatureUsageStatusResponse");
    private final static QName _AlertRuleResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleResponse");
    private final static QName _ArrayOfUnmanagedVendor_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfUnmanagedVendor");
    private final static QName _SystemMessagesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SystemMessagesResponse");
    private final static QName _LicensesActivityResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicensesActivityResponse");
    private final static QName _LogsUploadingEndRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LogsUploadingEndRequest");
    private final static QName _LicensesProcurementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicensesProcurementResponse");
    private final static QName _LicensesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicensesResponse");
    private final static QName _UpdateAlertRuleComponentsDataRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UpdateAlertRuleComponentsDataRequest");
    private final static QName _LicenseUsageReportRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseUsageReportRequest");
    private final static QName _EmailSMSSettingsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailSMSSettingsResponse");
    private final static QName _User_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "User");
    private final static QName _LoginFormSettingsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LoginFormSettingsRequest");
    private final static QName _BaseRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "BaseRequest");
    private final static QName _TestEmailSettingsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "TestEmailSettingsRequest");
    private final static QName _UpdateEmailSMSSettingsDataRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UpdateEmailSMSSettingsDataRequest");
    private final static QName _AlertDescriptionResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertDescriptionResponse");
    private final static QName _KeyValueStringPair_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "KeyValueStringPair");
    private final static QName _DownloadLmFileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DownloadLmFileRequest");
    private final static QName _LMFilesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LMFilesResponse");
    private final static QName _MonitoredProcessesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "MonitoredProcessesResponse");
    private final static QName _ArrayOfAgentProcStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfAgentProcStep");
    private final static QName _ArrayOfAlertRuleCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfAlertRuleCondition");
    private final static QName _AddUnmanagedVendorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AddUnmanagedVendorResponse");
    private final static QName _UserAuthenticationResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UserAuthenticationResponse");
    private final static QName _GroupNamesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GroupNamesRequest");
    private final static QName _FetchStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FetchStatus");
    private final static QName _LogsUploadingKeepAliveRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LogsUploadingKeepAliveRequest");
    private final static QName _LicenseProcurement_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseProcurement");
    private final static QName _EmailSettingsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailSettingsRequest");
    private final static QName _UnmanagedProcessVendorRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UnmanagedProcessVendorRequest");
    private final static QName _AgentProcedureTmplResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AgentProcedureTmplResponse");
    private final static QName _ArrayOfLmFileForDownload_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfLmFileForDownload");
    private final static QName _GetUnmanagedVendorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GetUnmanagedVendorResponse");
    private final static QName _LicenseTypesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseTypesResponse");
    private final static QName _ArrayOfAlertRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfAlertRule");
    private final static QName _ArrayOfUnmanagedProcessFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfUnmanagedProcessFeature");
    private final static QName _AgentProcStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AgentProcStep");
    private final static QName _LogsUploadingStartRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LogsUploadingStartRequest");
    private final static QName _UserAuthenticationRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UserAuthenticationRequest");
    private final static QName _ArrayOfAgentProcedureTmpl_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfAgentProcedureTmpl");
    private final static QName _ArrayOfUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ArrayOfUser");
    private final static QName _AlertsRulesResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertsRulesResponse");
    private final static QName _AlertRuleComponentsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleComponentsRequest");
    private final static QName _AlertRuleRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleRequest");
    private final static QName _OptFileFeatureValidKeywordsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "OptFileFeatureValidKeywordsRequest");
    private final static QName _OptFileFeatureValidKeywordsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "OptFileFeatureValidKeywordsResponse");
    private final static QName _LDAPResetSyncRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LDAPResetSyncRequest");
    private final static QName _LicensesProcurementResponseLicensesProcurements_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicensesProcurements");
    private final static QName _LoginFormSettingsRequestOldSessionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "OldSessionID");
    private final static QName _PackageLicensesResponseLicenses_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Licenses");
    private final static QName _EmailSettingsRequestEmailPwd_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailPwd");
    private final static QName _EmailSettingsRequestEmailSmtpHost_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailSmtpHost");
    private final static QName _EmailSettingsRequestEmailUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailUsername");
    private final static QName _EmailSettingsRequestEmailSendingAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailSendingAddress");
    private final static QName _EmailSettingsRequestEmailSmtpPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailSmtpPort");
    private final static QName _AlertRuleFrequency_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Frequency");
    private final static QName _AlertRuleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Name");
    private final static QName _UserUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Username");
    private final static QName _LicenseProcurementVendorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "VendorInfo");
    private final static QName _LicenseProcurementStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "StartDate");
    private final static QName _LicenseProcurementIssuedDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "IssuedDate");
    private final static QName _LicenseProcurementVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Version");
    private final static QName _LicenseProcurementExpirationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ExpirationDate");
    private final static QName _LicenseProcurementNotice_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Notice");
    private final static QName _LicenseProcurementVendor_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Vendor");
    private final static QName _LicenseProcurementAssetInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AssetInfo");
    private final static QName _LicenseProcurementVendorString_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "VendorString");
    private final static QName _LicenseProcurementFeatureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FeatureName");
    private final static QName _LicenseProcurementHostIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "HostIDs");
    private final static QName _LicenseProcurementProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProductName");
    private final static QName _LicenseProcurementServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Server");
    private final static QName _AlertsRulesResponseRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Rules");
    private final static QName _TestEmailSettingsRequestEmailRecepientAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailRecepientAddress");
    private final static QName _SMSSettingsRequestSmsClickatellApiId_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SmsClickatellApiId");
    private final static QName _SMSSettingsRequestSmsServerUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SmsServerUrl");
    private final static QName _SMSSettingsRequestSmsUseUnicode_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SmsUseUnicode");
    private final static QName _SMSSettingsRequestSmsPwd_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SmsPwd");
    private final static QName _SMSSettingsRequestSmsUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SmsUsername");
    private final static QName _FeatureUsageStatusRequestFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Features");
    private final static QName _GroupNamesResponseGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Groups");
    private final static QName _FileFetchStatusResponseData_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Data");
    private final static QName _LicenseServersResponseServers_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Servers");
    private final static QName _UnmanagedVendorVendorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "VendorName");
    private final static QName _AgentProcedureTmplRequestTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Template");
    private final static QName _UserLocalSettingsTimezoneStandardName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "TimezoneStandardName");
    private final static QName _UserLocalSettingsThousandsSeparator_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ThousandsSeparator");
    private final static QName _UserLocalSettingsTimeFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "TimeFormat");
    private final static QName _UserLocalSettingsDecimalSeparator_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DecimalSeparator");
    private final static QName _LogsUploadingBaseRequestSendingHost_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SendingHost");
    private final static QName _SetProjectToUsageSessionByProcessRequestProcessName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProcessName");
    private final static QName _DownloadLmFileRequestFileToDownload_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FileToDownload");
    private final static QName _GetFileFetchConfigResponseFileFetchConfigSetting_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FileFetchConfigSetting");
    private final static QName _AlertRuleDestinationUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Users");
    private final static QName _AlertRuleDestinationIncludeInvolvedUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "IncludeInvolvedUsers");
    private final static QName _AlertRuleDestinationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Address");
    private final static QName _AlertRuleDestinationTimePattern_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "TimePattern");
    private final static QName _UnmanagedProcessVendorRequestProcessFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProcessFeatures");
    private final static QName _AlertRuleRequestRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Rule");
    private final static QName _LoginFormSettingsResponseSessionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SessionID");
    private final static QName _LoginFormSettingsResponseDefaultTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DefaultTimeZone");
    private final static QName _LoginFormSettingsResponseUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UserName");
    private final static QName _AlertRuleConditionAlertRuleConditionParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AlertRuleConditionParameters");
    private final static QName _AlertRuleConditionDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Description");
    private final static QName _UpdateFileFetchConfigRequestFileFetchSettingToUpdate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FileFetchSettingToUpdate");
    private final static QName _OpenLMLicenseOverviewResponseEffectiveFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EffectiveFeatures");
    private final static QName _OpenLMLicenseOverviewResponseLicenseManagerMacAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseManagerMacAddress");
    private final static QName _OpenLMLicenseOverviewResponseLicenseManagerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicenseManagerName");
    private final static QName _OpenLMLicenseOverviewResponseOpenLMLicExpirationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "OpenLMLicExpirationDate");
    private final static QName _AgentProcStepScriptInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ScriptInfo");
    private final static QName _AlertRuleConditionDefinitionsResponseRuleConditionDefinitions_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "RuleConditionDefinitions");
    private final static QName _KeyValueStringPairValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Value");
    private final static QName _KeyValueStringPairKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Key");
    private final static QName _LicenseUsageReportResponseAggregateSessionsDictionary_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AggregateSessionsDictionary");
    private final static QName _LicenseUsageReportResponseDateQuantitiesSessionsDictionary_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DateQuantitiesSessionsDictionary");
    private final static QName _LicenseUsageReportResponseTotals_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Totals");
    private final static QName _LicenseProcurementComponentsResponseComponents_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Components");
    private final static QName _AddUnmanagedVendorResponseFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "features");
    private final static QName _OptFileFeatureValidKeywordsResponseKeywords_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Keywords");
    private final static QName _GroupNamesRequestPrefix_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Prefix");
    private final static QName _FeatureUsageStatusResponseFeaturesUsageStatuses_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FeaturesUsageStatuses");
    private final static QName _EmailSMSSettingsResponseEmailSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EmailSettings");
    private final static QName _EmailSMSSettingsResponseSMSSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SMSSettings");
    private final static QName _LMFilesResponseLmFilesForDownload_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LmFilesForDownload");
    private final static QName _UnmanagedProcessFeatureProcName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProcName");
    private final static QName _UnmanagedProcessFeatureProcDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProcDesc");
    private final static QName _UnmanagedProcessFeatureProcedureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProcedureName");
    private final static QName _AgentProcedureTmplResponseTemplates_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Templates");
    private final static QName _AgentProcedureTmplSteps_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Steps");
    private final static QName _OptFileFeatureValidKeywordsRequestFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Feature");
    private final static QName _LmFileForDownloadFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "FileName");
    private final static QName _LmFileForDownloadPathOnServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "PathOnServer");
    private final static QName _BaseResponseExportString_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ExportString");
    private final static QName _BaseResponseSaasToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SaasToken");
    private final static QName _ErrorParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Parameters");
    private final static QName _ErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Message");
    private final static QName _AlertRuleComponentsResponseDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Destinations");
    private final static QName _AlertRuleComponentsResponseConditions_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Conditions");
    private final static QName _LicensesActivityResponseLicensesActivities_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "LicensesActivities");
    private final static QName _SetProjectToUsageSessionRequestProcessStartTimeUTC_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProcessStartTimeUTC");
    private final static QName _SetProjectToUsageSessionRequestWorkstation_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Workstation");
    private final static QName _RequestBaseInfoSessionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "SessionData");
    private final static QName _RequestBaseInfoCustomerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "CustomerId");
    private final static QName _RequestBaseInfoPagingData_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "PagingData");
    private final static QName _UpdateAlertRuleComponentsDataRequestAddedDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AddedDestinations");
    private final static QName _UpdateAlertRuleComponentsDataRequestUpdatedDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UpdatedDestinations");
    private final static QName _UpdateAlertRuleComponentsDataRequestDeletedConditions_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DeletedConditions");
    private final static QName _UpdateAlertRuleComponentsDataRequestAddedConditions_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "AddedConditions");
    private final static QName _UpdateAlertRuleComponentsDataRequestDeletedDestinations_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "DeletedDestinations");
    private final static QName _UpdateAlertRuleComponentsDataRequestUpdatedConditions_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UpdatedConditions");
    private final static QName _BaseRequestBaseInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "BaseInfo");
    private final static QName _SystemMessagesResponseMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Messages");
    private final static QName _MonitoredProcessesResponseProcesses_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Processes");
    private final static QName _TestSmsSettingsRequestRecepientPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "RecepientPhone");
    private final static QName _LicenseTypesResponseTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Types");
    private final static QName _UserAuthenticationRequestPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Password");
    private final static QName _LicenseUsageReportRequestProjectIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "ProjectIDs");
    private final static QName _LicenseUsageReportRequestStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "StartTime");
    private final static QName _LicenseUsageReportRequestResolution_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Resolution");
    private final static QName _LicenseUsageReportRequestUserIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "UserIDs");
    private final static QName _LicenseUsageReportRequestGroupIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "GroupIDs");
    private final static QName _LicenseUsageReportRequestEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "EndTime");
    private final static QName _GetUnmanagedVendorResponseVendors_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", "Vendors");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_server_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgentProcedureTmpl }
     * 
     */
    public AgentProcedureTmpl createAgentProcedureTmpl() {
        return new AgentProcedureTmpl();
    }

    /**
     * Create an instance of {@link GroupNamesResponse }
     * 
     */
    public GroupNamesResponse createGroupNamesResponse() {
        return new GroupNamesResponse();
    }

    /**
     * Create an instance of {@link LDAPResetSyncRequest }
     * 
     */
    public LDAPResetSyncRequest createLDAPResetSyncRequest() {
        return new LDAPResetSyncRequest();
    }

    /**
     * Create an instance of {@link LogsUploadingStartResponse }
     * 
     */
    public LogsUploadingStartResponse createLogsUploadingStartResponse() {
        return new LogsUploadingStartResponse();
    }

    /**
     * Create an instance of {@link OptFileFeatureValidKeywordsResponse }
     * 
     */
    public OptFileFeatureValidKeywordsResponse createOptFileFeatureValidKeywordsResponse() {
        return new OptFileFeatureValidKeywordsResponse();
    }

    /**
     * Create an instance of {@link OptFileFeatureValidKeywordsRequest }
     * 
     */
    public OptFileFeatureValidKeywordsRequest createOptFileFeatureValidKeywordsRequest() {
        return new OptFileFeatureValidKeywordsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAlertRuleDestination }
     * 
     */
    public ArrayOfAlertRuleDestination createArrayOfAlertRuleDestination() {
        return new ArrayOfAlertRuleDestination();
    }

    /**
     * Create an instance of {@link AlertRuleRequest }
     * 
     */
    public AlertRuleRequest createAlertRuleRequest() {
        return new AlertRuleRequest();
    }

    /**
     * Create an instance of {@link UpdateFileFetchConfigRequest }
     * 
     */
    public UpdateFileFetchConfigRequest createUpdateFileFetchConfigRequest() {
        return new UpdateFileFetchConfigRequest();
    }

    /**
     * Create an instance of {@link AlertRule }
     * 
     */
    public AlertRule createAlertRule() {
        return new AlertRule();
    }

    /**
     * Create an instance of {@link AlertsRulesResponse }
     * 
     */
    public AlertsRulesResponse createAlertsRulesResponse() {
        return new AlertsRulesResponse();
    }

    /**
     * Create an instance of {@link AlertRuleComponentsRequest }
     * 
     */
    public AlertRuleComponentsRequest createAlertRuleComponentsRequest() {
        return new AlertRuleComponentsRequest();
    }

    /**
     * Create an instance of {@link LogsUploadingStartRequest }
     * 
     */
    public LogsUploadingStartRequest createLogsUploadingStartRequest() {
        return new LogsUploadingStartRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAgentProcedureTmpl }
     * 
     */
    public ArrayOfAgentProcedureTmpl createArrayOfAgentProcedureTmpl() {
        return new ArrayOfAgentProcedureTmpl();
    }

    /**
     * Create an instance of {@link UserAuthenticationRequest }
     * 
     */
    public UserAuthenticationRequest createUserAuthenticationRequest() {
        return new UserAuthenticationRequest();
    }

    /**
     * Create an instance of {@link UserLocalSettings }
     * 
     */
    public UserLocalSettings createUserLocalSettings() {
        return new UserLocalSettings();
    }

    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }

    /**
     * Create an instance of {@link ArrayOfUnmanagedProcessFeature }
     * 
     */
    public ArrayOfUnmanagedProcessFeature createArrayOfUnmanagedProcessFeature() {
        return new ArrayOfUnmanagedProcessFeature();
    }

    /**
     * Create an instance of {@link AgentProcStep }
     * 
     */
    public AgentProcStep createAgentProcStep() {
        return new AgentProcStep();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplRequest }
     * 
     */
    public AgentProcedureTmplRequest createAgentProcedureTmplRequest() {
        return new AgentProcedureTmplRequest();
    }

    /**
     * Create an instance of {@link GetUnmanagedVendorRequest }
     * 
     */
    public GetUnmanagedVendorRequest createGetUnmanagedVendorRequest() {
        return new GetUnmanagedVendorRequest();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionRequest }
     * 
     */
    public SetProjectToUsageSessionRequest createSetProjectToUsageSessionRequest() {
        return new SetProjectToUsageSessionRequest();
    }

    /**
     * Create an instance of {@link BaseResponse }
     * 
     */
    public BaseResponse createBaseResponse() {
        return new BaseResponse();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionByFeatureRequest }
     * 
     */
    public SetProjectToUsageSessionByFeatureRequest createSetProjectToUsageSessionByFeatureRequest() {
        return new SetProjectToUsageSessionByFeatureRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAlertRule }
     * 
     */
    public ArrayOfAlertRule createArrayOfAlertRule() {
        return new ArrayOfAlertRule();
    }

    /**
     * Create an instance of {@link ArrayOfLmFileForDownload }
     * 
     */
    public ArrayOfLmFileForDownload createArrayOfLmFileForDownload() {
        return new ArrayOfLmFileForDownload();
    }

    /**
     * Create an instance of {@link GetUnmanagedVendorResponse }
     * 
     */
    public GetUnmanagedVendorResponse createGetUnmanagedVendorResponse() {
        return new GetUnmanagedVendorResponse();
    }

    /**
     * Create an instance of {@link LicenseTypesResponse }
     * 
     */
    public LicenseTypesResponse createLicenseTypesResponse() {
        return new LicenseTypesResponse();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplResponse }
     * 
     */
    public AgentProcedureTmplResponse createAgentProcedureTmplResponse() {
        return new AgentProcedureTmplResponse();
    }

    /**
     * Create an instance of {@link LicenseProcurement }
     * 
     */
    public LicenseProcurement createLicenseProcurement() {
        return new LicenseProcurement();
    }

    /**
     * Create an instance of {@link EmailSettingsRequest }
     * 
     */
    public EmailSettingsRequest createEmailSettingsRequest() {
        return new EmailSettingsRequest();
    }

    /**
     * Create an instance of {@link UnmanagedProcessVendorRequest }
     * 
     */
    public UnmanagedProcessVendorRequest createUnmanagedProcessVendorRequest() {
        return new UnmanagedProcessVendorRequest();
    }

    /**
     * Create an instance of {@link LicenseServersResponse }
     * 
     */
    public LicenseServersResponse createLicenseServersResponse() {
        return new LicenseServersResponse();
    }

    /**
     * Create an instance of {@link LogsUploadingKeepAliveRequest }
     * 
     */
    public LogsUploadingKeepAliveRequest createLogsUploadingKeepAliveRequest() {
        return new LogsUploadingKeepAliveRequest();
    }

    /**
     * Create an instance of {@link LogsUploadingBaseRequest }
     * 
     */
    public LogsUploadingBaseRequest createLogsUploadingBaseRequest() {
        return new LogsUploadingBaseRequest();
    }

    /**
     * Create an instance of {@link LicensePackageComponent }
     * 
     */
    public LicensePackageComponent createLicensePackageComponent() {
        return new LicensePackageComponent();
    }

    /**
     * Create an instance of {@link FeatureUsageStatusRequest }
     * 
     */
    public FeatureUsageStatusRequest createFeatureUsageStatusRequest() {
        return new FeatureUsageStatusRequest();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueStringPair }
     * 
     */
    public ArrayOfKeyValueStringPair createArrayOfKeyValueStringPair() {
        return new ArrayOfKeyValueStringPair();
    }

    /**
     * Create an instance of {@link UnmanagedVendor }
     * 
     */
    public UnmanagedVendor createUnmanagedVendor() {
        return new UnmanagedVendor();
    }

    /**
     * Create an instance of {@link UserAuthenticationResponse }
     * 
     */
    public UserAuthenticationResponse createUserAuthenticationResponse() {
        return new UserAuthenticationResponse();
    }

    /**
     * Create an instance of {@link GroupNamesRequest }
     * 
     */
    public GroupNamesRequest createGroupNamesRequest() {
        return new GroupNamesRequest();
    }

    /**
     * Create an instance of {@link AlertRuleCondition }
     * 
     */
    public AlertRuleCondition createAlertRuleCondition() {
        return new AlertRuleCondition();
    }

    /**
     * Create an instance of {@link AddUnmanagedVendorResponse }
     * 
     */
    public AddUnmanagedVendorResponse createAddUnmanagedVendorResponse() {
        return new AddUnmanagedVendorResponse();
    }

    /**
     * Create an instance of {@link LicenseUsageReportResponse }
     * 
     */
    public LicenseUsageReportResponse createLicenseUsageReportResponse() {
        return new LicenseUsageReportResponse();
    }

    /**
     * Create an instance of {@link SetFullLoggingRequest }
     * 
     */
    public SetFullLoggingRequest createSetFullLoggingRequest() {
        return new SetFullLoggingRequest();
    }

    /**
     * Create an instance of {@link ArrayOfAgentProcStep }
     * 
     */
    public ArrayOfAgentProcStep createArrayOfAgentProcStep() {
        return new ArrayOfAgentProcStep();
    }

    /**
     * Create an instance of {@link AlertRuleConditionDefinitionsResponse }
     * 
     */
    public AlertRuleConditionDefinitionsResponse createAlertRuleConditionDefinitionsResponse() {
        return new AlertRuleConditionDefinitionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAlertRuleCondition }
     * 
     */
    public ArrayOfAlertRuleCondition createArrayOfAlertRuleCondition() {
        return new ArrayOfAlertRuleCondition();
    }

    /**
     * Create an instance of {@link LMFilesResponse }
     * 
     */
    public LMFilesResponse createLMFilesResponse() {
        return new LMFilesResponse();
    }

    /**
     * Create an instance of {@link MonitoredProcessesResponse }
     * 
     */
    public MonitoredProcessesResponse createMonitoredProcessesResponse() {
        return new MonitoredProcessesResponse();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionByProcessRequest }
     * 
     */
    public SetProjectToUsageSessionByProcessRequest createSetProjectToUsageSessionByProcessRequest() {
        return new SetProjectToUsageSessionByProcessRequest();
    }

    /**
     * Create an instance of {@link PackageLicensesResponse }
     * 
     */
    public PackageLicensesResponse createPackageLicensesResponse() {
        return new PackageLicensesResponse();
    }

    /**
     * Create an instance of {@link LogsUploadingBaseResponse }
     * 
     */
    public LogsUploadingBaseResponse createLogsUploadingBaseResponse() {
        return new LogsUploadingBaseResponse();
    }

    /**
     * Create an instance of {@link DownloadLmFileRequest }
     * 
     */
    public DownloadLmFileRequest createDownloadLmFileRequest() {
        return new DownloadLmFileRequest();
    }

    /**
     * Create an instance of {@link UpdateEmailSMSSettingsDataRequest }
     * 
     */
    public UpdateEmailSMSSettingsDataRequest createUpdateEmailSMSSettingsDataRequest() {
        return new UpdateEmailSMSSettingsDataRequest();
    }

    /**
     * Create an instance of {@link KeyValueStringPair }
     * 
     */
    public KeyValueStringPair createKeyValueStringPair() {
        return new KeyValueStringPair();
    }

    /**
     * Create an instance of {@link AlertDescriptionResponse }
     * 
     */
    public AlertDescriptionResponse createAlertDescriptionResponse() {
        return new AlertDescriptionResponse();
    }

    /**
     * Create an instance of {@link TestEmailSettingsRequest }
     * 
     */
    public TestEmailSettingsRequest createTestEmailSettingsRequest() {
        return new TestEmailSettingsRequest();
    }

    /**
     * Create an instance of {@link SMSSettingsRequest }
     * 
     */
    public SMSSettingsRequest createSMSSettingsRequest() {
        return new SMSSettingsRequest();
    }

    /**
     * Create an instance of {@link BaseRequest }
     * 
     */
    public BaseRequest createBaseRequest() {
        return new BaseRequest();
    }

    /**
     * Create an instance of {@link UnmanagedProcessFeature }
     * 
     */
    public UnmanagedProcessFeature createUnmanagedProcessFeature() {
        return new UnmanagedProcessFeature();
    }

    /**
     * Create an instance of {@link EmailSMSSettingsResponse }
     * 
     */
    public EmailSMSSettingsResponse createEmailSMSSettingsResponse() {
        return new EmailSMSSettingsResponse();
    }

    /**
     * Create an instance of {@link UpdateAlertRuleComponentsDataRequest }
     * 
     */
    public UpdateAlertRuleComponentsDataRequest createUpdateAlertRuleComponentsDataRequest() {
        return new UpdateAlertRuleComponentsDataRequest();
    }

    /**
     * Create an instance of {@link LicenseUsageReportRequest }
     * 
     */
    public LicenseUsageReportRequest createLicenseUsageReportRequest() {
        return new LicenseUsageReportRequest();
    }

    /**
     * Create an instance of {@link UpdateFileFetchConfigResponse }
     * 
     */
    public UpdateFileFetchConfigResponse createUpdateFileFetchConfigResponse() {
        return new UpdateFileFetchConfigResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link DownloadLmFileResponse }
     * 
     */
    public DownloadLmFileResponse createDownloadLmFileResponse() {
        return new DownloadLmFileResponse();
    }

    /**
     * Create an instance of {@link CurrentlyConsumedLicensesResponse }
     * 
     */
    public CurrentlyConsumedLicensesResponse createCurrentlyConsumedLicensesResponse() {
        return new CurrentlyConsumedLicensesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfLicenseProcurement }
     * 
     */
    public ArrayOfLicenseProcurement createArrayOfLicenseProcurement() {
        return new ArrayOfLicenseProcurement();
    }

    /**
     * Create an instance of {@link LoginFormSettingsRequest }
     * 
     */
    public LoginFormSettingsRequest createLoginFormSettingsRequest() {
        return new LoginFormSettingsRequest();
    }

    /**
     * Create an instance of {@link OptFileContentRequest }
     * 
     */
    public OptFileContentRequest createOptFileContentRequest() {
        return new OptFileContentRequest();
    }

    /**
     * Create an instance of {@link LogsUploadingEndRequest }
     * 
     */
    public LogsUploadingEndRequest createLogsUploadingEndRequest() {
        return new LogsUploadingEndRequest();
    }

    /**
     * Create an instance of {@link GetFileFetchConfigResponse }
     * 
     */
    public GetFileFetchConfigResponse createGetFileFetchConfigResponse() {
        return new GetFileFetchConfigResponse();
    }

    /**
     * Create an instance of {@link LicensesResponse }
     * 
     */
    public LicensesResponse createLicensesResponse() {
        return new LicensesResponse();
    }

    /**
     * Create an instance of {@link GetLmFilesRequest }
     * 
     */
    public GetLmFilesRequest createGetLmFilesRequest() {
        return new GetLmFilesRequest();
    }

    /**
     * Create an instance of {@link LicensesProcurementResponse }
     * 
     */
    public LicensesProcurementResponse createLicensesProcurementResponse() {
        return new LicensesProcurementResponse();
    }

    /**
     * Create an instance of {@link LicensesActivityResponse }
     * 
     */
    public LicensesActivityResponse createLicensesActivityResponse() {
        return new LicensesActivityResponse();
    }

    /**
     * Create an instance of {@link LicenseProcurementComponentsResponse }
     * 
     */
    public LicenseProcurementComponentsResponse createLicenseProcurementComponentsResponse() {
        return new LicenseProcurementComponentsResponse();
    }

    /**
     * Create an instance of {@link LmFileForDownload }
     * 
     */
    public LmFileForDownload createLmFileForDownload() {
        return new LmFileForDownload();
    }

    /**
     * Create an instance of {@link AlertRuleDestination }
     * 
     */
    public AlertRuleDestination createAlertRuleDestination() {
        return new AlertRuleDestination();
    }

    /**
     * Create an instance of {@link AlertRuleResponse }
     * 
     */
    public AlertRuleResponse createAlertRuleResponse() {
        return new AlertRuleResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUnmanagedVendor }
     * 
     */
    public ArrayOfUnmanagedVendor createArrayOfUnmanagedVendor() {
        return new ArrayOfUnmanagedVendor();
    }

    /**
     * Create an instance of {@link SystemMessagesResponse }
     * 
     */
    public SystemMessagesResponse createSystemMessagesResponse() {
        return new SystemMessagesResponse();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link LDAPResetSyncResponse }
     * 
     */
    public LDAPResetSyncResponse createLDAPResetSyncResponse() {
        return new LDAPResetSyncResponse();
    }

    /**
     * Create an instance of {@link FeatureUsageStatusResponse }
     * 
     */
    public FeatureUsageStatusResponse createFeatureUsageStatusResponse() {
        return new FeatureUsageStatusResponse();
    }

    /**
     * Create an instance of {@link RequestBaseInfo }
     * 
     */
    public RequestBaseInfo createRequestBaseInfo() {
        return new RequestBaseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLicensePackageComponent }
     * 
     */
    public ArrayOfLicensePackageComponent createArrayOfLicensePackageComponent() {
        return new ArrayOfLicensePackageComponent();
    }

    /**
     * Create an instance of {@link OpenLMLicenseOverviewResponse }
     * 
     */
    public OpenLMLicenseOverviewResponse createOpenLMLicenseOverviewResponse() {
        return new OpenLMLicenseOverviewResponse();
    }

    /**
     * Create an instance of {@link TestSmsSettingsRequest }
     * 
     */
    public TestSmsSettingsRequest createTestSmsSettingsRequest() {
        return new TestSmsSettingsRequest();
    }

    /**
     * Create an instance of {@link AlertDescriptionRequest }
     * 
     */
    public AlertDescriptionRequest createAlertDescriptionRequest() {
        return new AlertDescriptionRequest();
    }

    /**
     * Create an instance of {@link AlertRuleComponentsResponse }
     * 
     */
    public AlertRuleComponentsResponse createAlertRuleComponentsResponse() {
        return new AlertRuleComponentsResponse();
    }

    /**
     * Create an instance of {@link FileFetchStatusResponse }
     * 
     */
    public FileFetchStatusResponse createFileFetchStatusResponse() {
        return new FileFetchStatusResponse();
    }

    /**
     * Create an instance of {@link LoginFormSettingsResponse }
     * 
     */
    public LoginFormSettingsResponse createLoginFormSettingsResponse() {
        return new LoginFormSettingsResponse();
    }

    /**
     * Create an instance of {@link FileFetchStatusRequest }
     * 
     */
    public FileFetchStatusRequest createFileFetchStatusRequest() {
        return new FileFetchStatusRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertDescriptionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertDescriptionRequest")
    public JAXBElement<AlertDescriptionRequest> createAlertDescriptionRequest(AlertDescriptionRequest value) {
        return new JAXBElement<AlertDescriptionRequest>(_AlertDescriptionRequest_QNAME, AlertDescriptionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFormSettingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LoginFormSettingsResponse")
    public JAXBElement<LoginFormSettingsResponse> createLoginFormSettingsResponse(LoginFormSettingsResponse value) {
        return new JAXBElement<LoginFormSettingsResponse>(_LoginFormSettingsResponse_QNAME, LoginFormSettingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicensePackageComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfLicensePackageComponent")
    public JAXBElement<ArrayOfLicensePackageComponent> createArrayOfLicensePackageComponent(ArrayOfLicensePackageComponent value) {
        return new JAXBElement<ArrayOfLicensePackageComponent>(_ArrayOfLicensePackageComponent_QNAME, ArrayOfLicensePackageComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenLMLicenseOverviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "OpenLMLicenseOverviewResponse")
    public JAXBElement<OpenLMLicenseOverviewResponse> createOpenLMLicenseOverviewResponse(OpenLMLicenseOverviewResponse value) {
        return new JAXBElement<OpenLMLicenseOverviewResponse>(_OpenLMLicenseOverviewResponse_QNAME, OpenLMLicenseOverviewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPResetSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LDAPResetSyncResponse")
    public JAXBElement<LDAPResetSyncResponse> createLDAPResetSyncResponse(LDAPResetSyncResponse value) {
        return new JAXBElement<LDAPResetSyncResponse>(_LDAPResetSyncResponse_QNAME, LDAPResetSyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "RequestBaseInfo")
    public JAXBElement<RequestBaseInfo> createRequestBaseInfo(RequestBaseInfo value) {
        return new JAXBElement<RequestBaseInfo>(_RequestBaseInfo_QNAME, RequestBaseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleDestination")
    public JAXBElement<AlertRuleDestination> createAlertRuleDestination(AlertRuleDestination value) {
        return new JAXBElement<AlertRuleDestination>(_AlertRuleDestination_QNAME, AlertRuleDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LmFileForDownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LmFileForDownload")
    public JAXBElement<LmFileForDownload> createLmFileForDownload(LmFileForDownload value) {
        return new JAXBElement<LmFileForDownload>(_LmFileForDownload_QNAME, LmFileForDownload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseProcurementComponentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseProcurementComponentsResponse")
    public JAXBElement<LicenseProcurementComponentsResponse> createLicenseProcurementComponentsResponse(LicenseProcurementComponentsResponse value) {
        return new JAXBElement<LicenseProcurementComponentsResponse>(_LicenseProcurementComponentsResponse_QNAME, LicenseProcurementComponentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFileFetchConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GetFileFetchConfigResponse")
    public JAXBElement<GetFileFetchConfigResponse> createGetFileFetchConfigResponse(GetFileFetchConfigResponse value) {
        return new JAXBElement<GetFileFetchConfigResponse>(_GetFileFetchConfigResponse_QNAME, GetFileFetchConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLmFilesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GetLmFilesRequest")
    public JAXBElement<GetLmFilesRequest> createGetLmFilesRequest(GetLmFilesRequest value) {
        return new JAXBElement<GetLmFilesRequest>(_GetLmFilesRequest_QNAME, GetLmFilesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadLmFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DownloadLmFileResponse")
    public JAXBElement<DownloadLmFileResponse> createDownloadLmFileResponse(DownloadLmFileResponse value) {
        return new JAXBElement<DownloadLmFileResponse>(_DownloadLmFileResponse_QNAME, DownloadLmFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFileFetchConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UpdateFileFetchConfigResponse")
    public JAXBElement<UpdateFileFetchConfigResponse> createUpdateFileFetchConfigResponse(UpdateFileFetchConfigResponse value) {
        return new JAXBElement<UpdateFileFetchConfigResponse>(_UpdateFileFetchConfigResponse_QNAME, UpdateFileFetchConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "CurrentlyConsumedLicensesResponse")
    public JAXBElement<CurrentlyConsumedLicensesResponse> createCurrentlyConsumedLicensesResponse(CurrentlyConsumedLicensesResponse value) {
        return new JAXBElement<CurrentlyConsumedLicensesResponse>(_CurrentlyConsumedLicensesResponse_QNAME, CurrentlyConsumedLicensesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseProcurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfLicenseProcurement")
    public JAXBElement<ArrayOfLicenseProcurement> createArrayOfLicenseProcurement(ArrayOfLicenseProcurement value) {
        return new JAXBElement<ArrayOfLicenseProcurement>(_ArrayOfLicenseProcurement_QNAME, ArrayOfLicenseProcurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptFileContentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "OptFileContentRequest")
    public JAXBElement<OptFileContentRequest> createOptFileContentRequest(OptFileContentRequest value) {
        return new JAXBElement<OptFileContentRequest>(_OptFileContentRequest_QNAME, OptFileContentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmanagedProcessFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UnmanagedProcessFeature")
    public JAXBElement<UnmanagedProcessFeature> createUnmanagedProcessFeature(UnmanagedProcessFeature value) {
        return new JAXBElement<UnmanagedProcessFeature>(_UnmanagedProcessFeature_QNAME, UnmanagedProcessFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SMSSettingsRequest")
    public JAXBElement<SMSSettingsRequest> createSMSSettingsRequest(SMSSettingsRequest value) {
        return new JAXBElement<SMSSettingsRequest>(_SMSSettingsRequest_QNAME, SMSSettingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageLicensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "PackageLicensesResponse")
    public JAXBElement<PackageLicensesResponse> createPackageLicensesResponse(PackageLicensesResponse value) {
        return new JAXBElement<PackageLicensesResponse>(_PackageLicensesResponse_QNAME, PackageLicensesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProjectToUsageSessionByProcessRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SetProjectToUsageSessionByProcessRequest")
    public JAXBElement<SetProjectToUsageSessionByProcessRequest> createSetProjectToUsageSessionByProcessRequest(SetProjectToUsageSessionByProcessRequest value) {
        return new JAXBElement<SetProjectToUsageSessionByProcessRequest>(_SetProjectToUsageSessionByProcessRequest_QNAME, SetProjectToUsageSessionByProcessRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LogsUploadingBaseResponse")
    public JAXBElement<LogsUploadingBaseResponse> createLogsUploadingBaseResponse(LogsUploadingBaseResponse value) {
        return new JAXBElement<LogsUploadingBaseResponse>(_LogsUploadingBaseResponse_QNAME, LogsUploadingBaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseUsageReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseUsageReportResponse")
    public JAXBElement<LicenseUsageReportResponse> createLicenseUsageReportResponse(LicenseUsageReportResponse value) {
        return new JAXBElement<LicenseUsageReportResponse>(_LicenseUsageReportResponse_QNAME, LicenseUsageReportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFullLoggingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SetFullLoggingRequest")
    public JAXBElement<SetFullLoggingRequest> createSetFullLoggingRequest(SetFullLoggingRequest value) {
        return new JAXBElement<SetFullLoggingRequest>(_SetFullLoggingRequest_QNAME, SetFullLoggingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleConditionDefinitionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleConditionDefinitionsResponse")
    public JAXBElement<AlertRuleConditionDefinitionsResponse> createAlertRuleConditionDefinitionsResponse(AlertRuleConditionDefinitionsResponse value) {
        return new JAXBElement<AlertRuleConditionDefinitionsResponse>(_AlertRuleConditionDefinitionsResponse_QNAME, AlertRuleConditionDefinitionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleCondition")
    public JAXBElement<AlertRuleCondition> createAlertRuleCondition(AlertRuleCondition value) {
        return new JAXBElement<AlertRuleCondition>(_AlertRuleCondition_QNAME, AlertRuleCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureUsageStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FeatureUsageStatusRequest")
    public JAXBElement<FeatureUsageStatusRequest> createFeatureUsageStatusRequest(FeatureUsageStatusRequest value) {
        return new JAXBElement<FeatureUsageStatusRequest>(_FeatureUsageStatusRequest_QNAME, FeatureUsageStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueStringPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfKeyValueStringPair")
    public JAXBElement<ArrayOfKeyValueStringPair> createArrayOfKeyValueStringPair(ArrayOfKeyValueStringPair value) {
        return new JAXBElement<ArrayOfKeyValueStringPair>(_ArrayOfKeyValueStringPair_QNAME, ArrayOfKeyValueStringPair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmanagedVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UnmanagedVendor")
    public JAXBElement<UnmanagedVendor> createUnmanagedVendor(UnmanagedVendor value) {
        return new JAXBElement<UnmanagedVendor>(_UnmanagedVendor_QNAME, UnmanagedVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingBaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LogsUploadingBaseRequest")
    public JAXBElement<LogsUploadingBaseRequest> createLogsUploadingBaseRequest(LogsUploadingBaseRequest value) {
        return new JAXBElement<LogsUploadingBaseRequest>(_LogsUploadingBaseRequest_QNAME, LogsUploadingBaseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensePackageComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicensePackageComponent")
    public JAXBElement<LicensePackageComponent> createLicensePackageComponent(LicensePackageComponent value) {
        return new JAXBElement<LicensePackageComponent>(_LicensePackageComponent_QNAME, LicensePackageComponent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseServersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseServersResponse")
    public JAXBElement<LicenseServersResponse> createLicenseServersResponse(LicenseServersResponse value) {
        return new JAXBElement<LicenseServersResponse>(_LicenseServersResponse_QNAME, LicenseServersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "BaseResponse")
    public JAXBElement<BaseResponse> createBaseResponse(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_BaseResponse_QNAME, BaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProjectToUsageSessionByFeatureRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SetProjectToUsageSessionByFeatureRequest")
    public JAXBElement<SetProjectToUsageSessionByFeatureRequest> createSetProjectToUsageSessionByFeatureRequest(SetProjectToUsageSessionByFeatureRequest value) {
        return new JAXBElement<SetProjectToUsageSessionByFeatureRequest>(_SetProjectToUsageSessionByFeatureRequest_QNAME, SetProjectToUsageSessionByFeatureRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProjectToUsageSessionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SetProjectToUsageSessionRequest")
    public JAXBElement<SetProjectToUsageSessionRequest> createSetProjectToUsageSessionRequest(SetProjectToUsageSessionRequest value) {
        return new JAXBElement<SetProjectToUsageSessionRequest>(_SetProjectToUsageSessionRequest_QNAME, SetProjectToUsageSessionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmplRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AgentProcedureTmplRequest")
    public JAXBElement<AgentProcedureTmplRequest> createAgentProcedureTmplRequest(AgentProcedureTmplRequest value) {
        return new JAXBElement<AgentProcedureTmplRequest>(_AgentProcedureTmplRequest_QNAME, AgentProcedureTmplRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnmanagedVendorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GetUnmanagedVendorRequest")
    public JAXBElement<GetUnmanagedVendorRequest> createGetUnmanagedVendorRequest(GetUnmanagedVendorRequest value) {
        return new JAXBElement<GetUnmanagedVendorRequest>(_GetUnmanagedVendorRequest_QNAME, GetUnmanagedVendorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocalSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserLocalSettings")
    public JAXBElement<UserLocalSettings> createUserLocalSettings(UserLocalSettings value) {
        return new JAXBElement<UserLocalSettings>(_UserLocalSettings_QNAME, UserLocalSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseUsageReportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseUsageReportType")
    public JAXBElement<LicenseUsageReportType> createLicenseUsageReportType(LicenseUsageReportType value) {
        return new JAXBElement<LicenseUsageReportType>(_LicenseUsageReportType_QNAME, LicenseUsageReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFileFetchConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UpdateFileFetchConfigRequest")
    public JAXBElement<UpdateFileFetchConfigRequest> createUpdateFileFetchConfigRequest(UpdateFileFetchConfigRequest value) {
        return new JAXBElement<UpdateFileFetchConfigRequest>(_UpdateFileFetchConfigRequest_QNAME, UpdateFileFetchConfigRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRule")
    public JAXBElement<AlertRule> createAlertRule(AlertRule value) {
        return new JAXBElement<AlertRule>(_AlertRule_QNAME, AlertRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfAlertRuleDestination")
    public JAXBElement<ArrayOfAlertRuleDestination> createArrayOfAlertRuleDestination(ArrayOfAlertRuleDestination value) {
        return new JAXBElement<ArrayOfAlertRuleDestination>(_ArrayOfAlertRuleDestination_QNAME, ArrayOfAlertRuleDestination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingStartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LogsUploadingStartResponse")
    public JAXBElement<LogsUploadingStartResponse> createLogsUploadingStartResponse(LogsUploadingStartResponse value) {
        return new JAXBElement<LogsUploadingStartResponse>(_LogsUploadingStartResponse_QNAME, LogsUploadingStartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AgentProcedureTmpl")
    public JAXBElement<AgentProcedureTmpl> createAgentProcedureTmpl(AgentProcedureTmpl value) {
        return new JAXBElement<AgentProcedureTmpl>(_AgentProcedureTmpl_QNAME, AgentProcedureTmpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GroupNamesResponse")
    public JAXBElement<GroupNamesResponse> createGroupNamesResponse(GroupNamesResponse value) {
        return new JAXBElement<GroupNamesResponse>(_GroupNamesResponse_QNAME, GroupNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSmsSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "TestSmsSettingsRequest")
    public JAXBElement<TestSmsSettingsRequest> createTestSmsSettingsRequest(TestSmsSettingsRequest value) {
        return new JAXBElement<TestSmsSettingsRequest>(_TestSmsSettingsRequest_QNAME, TestSmsSettingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FileFetchStatusResponse")
    public JAXBElement<FileFetchStatusResponse> createFileFetchStatusResponse(FileFetchStatusResponse value) {
        return new JAXBElement<FileFetchStatusResponse>(_FileFetchStatusResponse_QNAME, FileFetchStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleComponentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleComponentsResponse")
    public JAXBElement<AlertRuleComponentsResponse> createAlertRuleComponentsResponse(AlertRuleComponentsResponse value) {
        return new JAXBElement<AlertRuleComponentsResponse>(_AlertRuleComponentsResponse_QNAME, AlertRuleComponentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FileFetchStatusRequest")
    public JAXBElement<FileFetchStatusRequest> createFileFetchStatusRequest(FileFetchStatusRequest value) {
        return new JAXBElement<FileFetchStatusRequest>(_FileFetchStatusRequest_QNAME, FileFetchStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureUsageStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FeatureUsageStatusResponse")
    public JAXBElement<FeatureUsageStatusResponse> createFeatureUsageStatusResponse(FeatureUsageStatusResponse value) {
        return new JAXBElement<FeatureUsageStatusResponse>(_FeatureUsageStatusResponse_QNAME, FeatureUsageStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleResponse")
    public JAXBElement<AlertRuleResponse> createAlertRuleResponse(AlertRuleResponse value) {
        return new JAXBElement<AlertRuleResponse>(_AlertRuleResponse_QNAME, AlertRuleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfUnmanagedVendor")
    public JAXBElement<ArrayOfUnmanagedVendor> createArrayOfUnmanagedVendor(ArrayOfUnmanagedVendor value) {
        return new JAXBElement<ArrayOfUnmanagedVendor>(_ArrayOfUnmanagedVendor_QNAME, ArrayOfUnmanagedVendor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SystemMessagesResponse")
    public JAXBElement<SystemMessagesResponse> createSystemMessagesResponse(SystemMessagesResponse value) {
        return new JAXBElement<SystemMessagesResponse>(_SystemMessagesResponse_QNAME, SystemMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicensesActivityResponse")
    public JAXBElement<LicensesActivityResponse> createLicensesActivityResponse(LicensesActivityResponse value) {
        return new JAXBElement<LicensesActivityResponse>(_LicensesActivityResponse_QNAME, LicensesActivityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingEndRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LogsUploadingEndRequest")
    public JAXBElement<LogsUploadingEndRequest> createLogsUploadingEndRequest(LogsUploadingEndRequest value) {
        return new JAXBElement<LogsUploadingEndRequest>(_LogsUploadingEndRequest_QNAME, LogsUploadingEndRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesProcurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicensesProcurementResponse")
    public JAXBElement<LicensesProcurementResponse> createLicensesProcurementResponse(LicensesProcurementResponse value) {
        return new JAXBElement<LicensesProcurementResponse>(_LicensesProcurementResponse_QNAME, LicensesProcurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicensesResponse")
    public JAXBElement<LicensesResponse> createLicensesResponse(LicensesResponse value) {
        return new JAXBElement<LicensesResponse>(_LicensesResponse_QNAME, LicensesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAlertRuleComponentsDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UpdateAlertRuleComponentsDataRequest")
    public JAXBElement<UpdateAlertRuleComponentsDataRequest> createUpdateAlertRuleComponentsDataRequest(UpdateAlertRuleComponentsDataRequest value) {
        return new JAXBElement<UpdateAlertRuleComponentsDataRequest>(_UpdateAlertRuleComponentsDataRequest_QNAME, UpdateAlertRuleComponentsDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseUsageReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseUsageReportRequest")
    public JAXBElement<LicenseUsageReportRequest> createLicenseUsageReportRequest(LicenseUsageReportRequest value) {
        return new JAXBElement<LicenseUsageReportRequest>(_LicenseUsageReportRequest_QNAME, LicenseUsageReportRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSMSSettingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSMSSettingsResponse")
    public JAXBElement<EmailSMSSettingsResponse> createEmailSMSSettingsResponse(EmailSMSSettingsResponse value) {
        return new JAXBElement<EmailSMSSettingsResponse>(_EmailSMSSettingsResponse_QNAME, EmailSMSSettingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFormSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LoginFormSettingsRequest")
    public JAXBElement<LoginFormSettingsRequest> createLoginFormSettingsRequest(LoginFormSettingsRequest value) {
        return new JAXBElement<LoginFormSettingsRequest>(_LoginFormSettingsRequest_QNAME, LoginFormSettingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "BaseRequest")
    public JAXBElement<BaseRequest> createBaseRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_BaseRequest_QNAME, BaseRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestEmailSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "TestEmailSettingsRequest")
    public JAXBElement<TestEmailSettingsRequest> createTestEmailSettingsRequest(TestEmailSettingsRequest value) {
        return new JAXBElement<TestEmailSettingsRequest>(_TestEmailSettingsRequest_QNAME, TestEmailSettingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmailSMSSettingsDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UpdateEmailSMSSettingsDataRequest")
    public JAXBElement<UpdateEmailSMSSettingsDataRequest> createUpdateEmailSMSSettingsDataRequest(UpdateEmailSMSSettingsDataRequest value) {
        return new JAXBElement<UpdateEmailSMSSettingsDataRequest>(_UpdateEmailSMSSettingsDataRequest_QNAME, UpdateEmailSMSSettingsDataRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertDescriptionResponse")
    public JAXBElement<AlertDescriptionResponse> createAlertDescriptionResponse(AlertDescriptionResponse value) {
        return new JAXBElement<AlertDescriptionResponse>(_AlertDescriptionResponse_QNAME, AlertDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyValueStringPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "KeyValueStringPair")
    public JAXBElement<KeyValueStringPair> createKeyValueStringPair(KeyValueStringPair value) {
        return new JAXBElement<KeyValueStringPair>(_KeyValueStringPair_QNAME, KeyValueStringPair.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadLmFileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DownloadLmFileRequest")
    public JAXBElement<DownloadLmFileRequest> createDownloadLmFileRequest(DownloadLmFileRequest value) {
        return new JAXBElement<DownloadLmFileRequest>(_DownloadLmFileRequest_QNAME, DownloadLmFileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LMFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LMFilesResponse")
    public JAXBElement<LMFilesResponse> createLMFilesResponse(LMFilesResponse value) {
        return new JAXBElement<LMFilesResponse>(_LMFilesResponse_QNAME, LMFilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoredProcessesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "MonitoredProcessesResponse")
    public JAXBElement<MonitoredProcessesResponse> createMonitoredProcessesResponse(MonitoredProcessesResponse value) {
        return new JAXBElement<MonitoredProcessesResponse>(_MonitoredProcessesResponse_QNAME, MonitoredProcessesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgentProcStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfAgentProcStep")
    public JAXBElement<ArrayOfAgentProcStep> createArrayOfAgentProcStep(ArrayOfAgentProcStep value) {
        return new JAXBElement<ArrayOfAgentProcStep>(_ArrayOfAgentProcStep_QNAME, ArrayOfAgentProcStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfAlertRuleCondition")
    public JAXBElement<ArrayOfAlertRuleCondition> createArrayOfAlertRuleCondition(ArrayOfAlertRuleCondition value) {
        return new JAXBElement<ArrayOfAlertRuleCondition>(_ArrayOfAlertRuleCondition_QNAME, ArrayOfAlertRuleCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUnmanagedVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AddUnmanagedVendorResponse")
    public JAXBElement<AddUnmanagedVendorResponse> createAddUnmanagedVendorResponse(AddUnmanagedVendorResponse value) {
        return new JAXBElement<AddUnmanagedVendorResponse>(_AddUnmanagedVendorResponse_QNAME, AddUnmanagedVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserAuthenticationResponse")
    public JAXBElement<UserAuthenticationResponse> createUserAuthenticationResponse(UserAuthenticationResponse value) {
        return new JAXBElement<UserAuthenticationResponse>(_UserAuthenticationResponse_QNAME, UserAuthenticationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupNamesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GroupNamesRequest")
    public JAXBElement<GroupNamesRequest> createGroupNamesRequest(GroupNamesRequest value) {
        return new JAXBElement<GroupNamesRequest>(_GroupNamesRequest_QNAME, GroupNamesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FetchStatus")
    public JAXBElement<FetchStatus> createFetchStatus(FetchStatus value) {
        return new JAXBElement<FetchStatus>(_FetchStatus_QNAME, FetchStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingKeepAliveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LogsUploadingKeepAliveRequest")
    public JAXBElement<LogsUploadingKeepAliveRequest> createLogsUploadingKeepAliveRequest(LogsUploadingKeepAliveRequest value) {
        return new JAXBElement<LogsUploadingKeepAliveRequest>(_LogsUploadingKeepAliveRequest_QNAME, LogsUploadingKeepAliveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseProcurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseProcurement")
    public JAXBElement<LicenseProcurement> createLicenseProcurement(LicenseProcurement value) {
        return new JAXBElement<LicenseProcurement>(_LicenseProcurement_QNAME, LicenseProcurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSettingsRequest")
    public JAXBElement<EmailSettingsRequest> createEmailSettingsRequest(EmailSettingsRequest value) {
        return new JAXBElement<EmailSettingsRequest>(_EmailSettingsRequest_QNAME, EmailSettingsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmanagedProcessVendorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UnmanagedProcessVendorRequest")
    public JAXBElement<UnmanagedProcessVendorRequest> createUnmanagedProcessVendorRequest(UnmanagedProcessVendorRequest value) {
        return new JAXBElement<UnmanagedProcessVendorRequest>(_UnmanagedProcessVendorRequest_QNAME, UnmanagedProcessVendorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmplResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AgentProcedureTmplResponse")
    public JAXBElement<AgentProcedureTmplResponse> createAgentProcedureTmplResponse(AgentProcedureTmplResponse value) {
        return new JAXBElement<AgentProcedureTmplResponse>(_AgentProcedureTmplResponse_QNAME, AgentProcedureTmplResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLmFileForDownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfLmFileForDownload")
    public JAXBElement<ArrayOfLmFileForDownload> createArrayOfLmFileForDownload(ArrayOfLmFileForDownload value) {
        return new JAXBElement<ArrayOfLmFileForDownload>(_ArrayOfLmFileForDownload_QNAME, ArrayOfLmFileForDownload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnmanagedVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GetUnmanagedVendorResponse")
    public JAXBElement<GetUnmanagedVendorResponse> createGetUnmanagedVendorResponse(GetUnmanagedVendorResponse value) {
        return new JAXBElement<GetUnmanagedVendorResponse>(_GetUnmanagedVendorResponse_QNAME, GetUnmanagedVendorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseTypesResponse")
    public JAXBElement<LicenseTypesResponse> createLicenseTypesResponse(LicenseTypesResponse value) {
        return new JAXBElement<LicenseTypesResponse>(_LicenseTypesResponse_QNAME, LicenseTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfAlertRule")
    public JAXBElement<ArrayOfAlertRule> createArrayOfAlertRule(ArrayOfAlertRule value) {
        return new JAXBElement<ArrayOfAlertRule>(_ArrayOfAlertRule_QNAME, ArrayOfAlertRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedProcessFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfUnmanagedProcessFeature")
    public JAXBElement<ArrayOfUnmanagedProcessFeature> createArrayOfUnmanagedProcessFeature(ArrayOfUnmanagedProcessFeature value) {
        return new JAXBElement<ArrayOfUnmanagedProcessFeature>(_ArrayOfUnmanagedProcessFeature_QNAME, ArrayOfUnmanagedProcessFeature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AgentProcStep")
    public JAXBElement<AgentProcStep> createAgentProcStep(AgentProcStep value) {
        return new JAXBElement<AgentProcStep>(_AgentProcStep_QNAME, AgentProcStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingStartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LogsUploadingStartRequest")
    public JAXBElement<LogsUploadingStartRequest> createLogsUploadingStartRequest(LogsUploadingStartRequest value) {
        return new JAXBElement<LogsUploadingStartRequest>(_LogsUploadingStartRequest_QNAME, LogsUploadingStartRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserAuthenticationRequest")
    public JAXBElement<UserAuthenticationRequest> createUserAuthenticationRequest(UserAuthenticationRequest value) {
        return new JAXBElement<UserAuthenticationRequest>(_UserAuthenticationRequest_QNAME, UserAuthenticationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgentProcedureTmpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfAgentProcedureTmpl")
    public JAXBElement<ArrayOfAgentProcedureTmpl> createArrayOfAgentProcedureTmpl(ArrayOfAgentProcedureTmpl value) {
        return new JAXBElement<ArrayOfAgentProcedureTmpl>(_ArrayOfAgentProcedureTmpl_QNAME, ArrayOfAgentProcedureTmpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ArrayOfUser")
    public JAXBElement<ArrayOfUser> createArrayOfUser(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ArrayOfUser_QNAME, ArrayOfUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsRulesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertsRulesResponse")
    public JAXBElement<AlertsRulesResponse> createAlertsRulesResponse(AlertsRulesResponse value) {
        return new JAXBElement<AlertsRulesResponse>(_AlertsRulesResponse_QNAME, AlertsRulesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleComponentsRequest")
    public JAXBElement<AlertRuleComponentsRequest> createAlertRuleComponentsRequest(AlertRuleComponentsRequest value) {
        return new JAXBElement<AlertRuleComponentsRequest>(_AlertRuleComponentsRequest_QNAME, AlertRuleComponentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleRequest")
    public JAXBElement<AlertRuleRequest> createAlertRuleRequest(AlertRuleRequest value) {
        return new JAXBElement<AlertRuleRequest>(_AlertRuleRequest_QNAME, AlertRuleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptFileFeatureValidKeywordsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "OptFileFeatureValidKeywordsRequest")
    public JAXBElement<OptFileFeatureValidKeywordsRequest> createOptFileFeatureValidKeywordsRequest(OptFileFeatureValidKeywordsRequest value) {
        return new JAXBElement<OptFileFeatureValidKeywordsRequest>(_OptFileFeatureValidKeywordsRequest_QNAME, OptFileFeatureValidKeywordsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptFileFeatureValidKeywordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "OptFileFeatureValidKeywordsResponse")
    public JAXBElement<OptFileFeatureValidKeywordsResponse> createOptFileFeatureValidKeywordsResponse(OptFileFeatureValidKeywordsResponse value) {
        return new JAXBElement<OptFileFeatureValidKeywordsResponse>(_OptFileFeatureValidKeywordsResponse_QNAME, OptFileFeatureValidKeywordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPResetSyncRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LDAPResetSyncRequest")
    public JAXBElement<LDAPResetSyncRequest> createLDAPResetSyncRequest(LDAPResetSyncRequest value) {
        return new JAXBElement<LDAPResetSyncRequest>(_LDAPResetSyncRequest_QNAME, LDAPResetSyncRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseProcurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicensesProcurements", scope = LicensesProcurementResponse.class)
    public JAXBElement<ArrayOfLicenseProcurement> createLicensesProcurementResponseLicensesProcurements(ArrayOfLicenseProcurement value) {
        return new JAXBElement<ArrayOfLicenseProcurement>(_LicensesProcurementResponseLicensesProcurements_QNAME, ArrayOfLicenseProcurement.class, LicensesProcurementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "OldSessionID", scope = LoginFormSettingsRequest.class)
    public JAXBElement<String> createLoginFormSettingsRequestOldSessionID(String value) {
        return new JAXBElement<String>(_LoginFormSettingsRequestOldSessionID_QNAME, String.class, LoginFormSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Licenses", scope = PackageLicensesResponse.class)
    public JAXBElement<ArrayOfLicenseStatistics> createPackageLicensesResponseLicenses(ArrayOfLicenseStatistics value) {
        return new JAXBElement<ArrayOfLicenseStatistics>(_PackageLicensesResponseLicenses_QNAME, ArrayOfLicenseStatistics.class, PackageLicensesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailPwd", scope = EmailSettingsRequest.class)
    public JAXBElement<String> createEmailSettingsRequestEmailPwd(String value) {
        return new JAXBElement<String>(_EmailSettingsRequestEmailPwd_QNAME, String.class, EmailSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSmtpHost", scope = EmailSettingsRequest.class)
    public JAXBElement<String> createEmailSettingsRequestEmailSmtpHost(String value) {
        return new JAXBElement<String>(_EmailSettingsRequestEmailSmtpHost_QNAME, String.class, EmailSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailUsername", scope = EmailSettingsRequest.class)
    public JAXBElement<String> createEmailSettingsRequestEmailUsername(String value) {
        return new JAXBElement<String>(_EmailSettingsRequestEmailUsername_QNAME, String.class, EmailSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSendingAddress", scope = EmailSettingsRequest.class)
    public JAXBElement<String> createEmailSettingsRequestEmailSendingAddress(String value) {
        return new JAXBElement<String>(_EmailSettingsRequestEmailSendingAddress_QNAME, String.class, EmailSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSmtpPort", scope = EmailSettingsRequest.class)
    public JAXBElement<Integer> createEmailSettingsRequestEmailSmtpPort(Integer value) {
        return new JAXBElement<Integer>(_EmailSettingsRequestEmailSmtpPort_QNAME, Integer.class, EmailSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Frequency", scope = AlertRule.class)
    public JAXBElement<String> createAlertRuleFrequency(String value) {
        return new JAXBElement<String>(_AlertRuleFrequency_QNAME, String.class, AlertRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Name", scope = AlertRule.class)
    public JAXBElement<String> createAlertRuleName(String value) {
        return new JAXBElement<String>(_AlertRuleName_QNAME, String.class, AlertRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Username", scope = User.class)
    public JAXBElement<String> createUserUsername(String value) {
        return new JAXBElement<String>(_UserUsername_QNAME, String.class, User.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "VendorInfo", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementVendorInfo(String value) {
        return new JAXBElement<String>(_LicenseProcurementVendorInfo_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "StartDate", scope = LicenseProcurement.class)
    public JAXBElement<SlimDateTime> createLicenseProcurementStartDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicenseProcurementStartDate_QNAME, SlimDateTime.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "IssuedDate", scope = LicenseProcurement.class)
    public JAXBElement<SlimDateTime> createLicenseProcurementIssuedDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicenseProcurementIssuedDate_QNAME, SlimDateTime.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Version", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementVersion(String value) {
        return new JAXBElement<String>(_LicenseProcurementVersion_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ExpirationDate", scope = LicenseProcurement.class)
    public JAXBElement<SlimDateTime> createLicenseProcurementExpirationDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicenseProcurementExpirationDate_QNAME, SlimDateTime.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Notice", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementNotice(String value) {
        return new JAXBElement<String>(_LicenseProcurementNotice_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Vendor", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementVendor(String value) {
        return new JAXBElement<String>(_LicenseProcurementVendor_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AssetInfo", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementAssetInfo(String value) {
        return new JAXBElement<String>(_LicenseProcurementAssetInfo_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "VendorString", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementVendorString(String value) {
        return new JAXBElement<String>(_LicenseProcurementVendorString_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FeatureName", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementFeatureName(String value) {
        return new JAXBElement<String>(_LicenseProcurementFeatureName_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "HostIDs", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementHostIDs(String value) {
        return new JAXBElement<String>(_LicenseProcurementHostIDs_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProductName", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementProductName(String value) {
        return new JAXBElement<String>(_LicenseProcurementProductName_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Server", scope = LicenseProcurement.class)
    public JAXBElement<String> createLicenseProcurementServer(String value) {
        return new JAXBElement<String>(_LicenseProcurementServer_QNAME, String.class, LicenseProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Rules", scope = AlertsRulesResponse.class)
    public JAXBElement<ArrayOfAlertRule> createAlertsRulesResponseRules(ArrayOfAlertRule value) {
        return new JAXBElement<ArrayOfAlertRule>(_AlertsRulesResponseRules_QNAME, ArrayOfAlertRule.class, AlertsRulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailRecepientAddress", scope = TestEmailSettingsRequest.class)
    public JAXBElement<String> createTestEmailSettingsRequestEmailRecepientAddress(String value) {
        return new JAXBElement<String>(_TestEmailSettingsRequestEmailRecepientAddress_QNAME, String.class, TestEmailSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SmsClickatellApiId", scope = SMSSettingsRequest.class)
    public JAXBElement<String> createSMSSettingsRequestSmsClickatellApiId(String value) {
        return new JAXBElement<String>(_SMSSettingsRequestSmsClickatellApiId_QNAME, String.class, SMSSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SmsServerUrl", scope = SMSSettingsRequest.class)
    public JAXBElement<String> createSMSSettingsRequestSmsServerUrl(String value) {
        return new JAXBElement<String>(_SMSSettingsRequestSmsServerUrl_QNAME, String.class, SMSSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SmsUseUnicode", scope = SMSSettingsRequest.class)
    public JAXBElement<String> createSMSSettingsRequestSmsUseUnicode(String value) {
        return new JAXBElement<String>(_SMSSettingsRequestSmsUseUnicode_QNAME, String.class, SMSSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SmsPwd", scope = SMSSettingsRequest.class)
    public JAXBElement<String> createSMSSettingsRequestSmsPwd(String value) {
        return new JAXBElement<String>(_SMSSettingsRequestSmsPwd_QNAME, String.class, SMSSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SmsUsername", scope = SMSSettingsRequest.class)
    public JAXBElement<String> createSMSSettingsRequestSmsUsername(String value) {
        return new JAXBElement<String>(_SMSSettingsRequestSmsUsername_QNAME, String.class, SMSSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Features", scope = FeatureUsageStatusRequest.class)
    public JAXBElement<ArrayOfSelectedStatisticsRequest> createFeatureUsageStatusRequestFeatures(ArrayOfSelectedStatisticsRequest value) {
        return new JAXBElement<ArrayOfSelectedStatisticsRequest>(_FeatureUsageStatusRequestFeatures_QNAME, ArrayOfSelectedStatisticsRequest.class, FeatureUsageStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Groups", scope = GroupNamesResponse.class)
    public JAXBElement<ArrayOfKeyValuePairOfintstring> createGroupNamesResponseGroups(ArrayOfKeyValuePairOfintstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfintstring>(_GroupNamesResponseGroups_QNAME, ArrayOfKeyValuePairOfintstring.class, GroupNamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Data", scope = FileFetchStatusResponse.class)
    public JAXBElement<String> createFileFetchStatusResponseData(String value) {
        return new JAXBElement<String>(_FileFetchStatusResponseData_QNAME, String.class, FileFetchStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseServerStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Servers", scope = LicenseServersResponse.class)
    public JAXBElement<ArrayOfLicenseServerStatistics> createLicenseServersResponseServers(ArrayOfLicenseServerStatistics value) {
        return new JAXBElement<ArrayOfLicenseServerStatistics>(_LicenseServersResponseServers_QNAME, ArrayOfLicenseServerStatistics.class, LicenseServersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "VendorName", scope = UnmanagedVendor.class)
    public JAXBElement<String> createUnmanagedVendorVendorName(String value) {
        return new JAXBElement<String>(_UnmanagedVendorVendorName_QNAME, String.class, UnmanagedVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Name", scope = LicensePackageComponent.class)
    public JAXBElement<String> createLicensePackageComponentName(String value) {
        return new JAXBElement<String>(_AlertRuleName_QNAME, String.class, LicensePackageComponent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Template", scope = AgentProcedureTmplRequest.class)
    public JAXBElement<AgentProcedureTmpl> createAgentProcedureTmplRequestTemplate(AgentProcedureTmpl value) {
        return new JAXBElement<AgentProcedureTmpl>(_AgentProcedureTmplRequestTemplate_QNAME, AgentProcedureTmpl.class, AgentProcedureTmplRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "TimezoneStandardName", scope = UserLocalSettings.class)
    public JAXBElement<String> createUserLocalSettingsTimezoneStandardName(String value) {
        return new JAXBElement<String>(_UserLocalSettingsTimezoneStandardName_QNAME, String.class, UserLocalSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ThousandsSeparator", scope = UserLocalSettings.class)
    public JAXBElement<String> createUserLocalSettingsThousandsSeparator(String value) {
        return new JAXBElement<String>(_UserLocalSettingsThousandsSeparator_QNAME, String.class, UserLocalSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "TimeFormat", scope = UserLocalSettings.class)
    public JAXBElement<String> createUserLocalSettingsTimeFormat(String value) {
        return new JAXBElement<String>(_UserLocalSettingsTimeFormat_QNAME, String.class, UserLocalSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DecimalSeparator", scope = UserLocalSettings.class)
    public JAXBElement<String> createUserLocalSettingsDecimalSeparator(String value) {
        return new JAXBElement<String>(_UserLocalSettingsDecimalSeparator_QNAME, String.class, UserLocalSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SendingHost", scope = LogsUploadingBaseRequest.class)
    public JAXBElement<String> createLogsUploadingBaseRequestSendingHost(String value) {
        return new JAXBElement<String>(_LogsUploadingBaseRequestSendingHost_QNAME, String.class, LogsUploadingBaseRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProcessName", scope = SetProjectToUsageSessionByProcessRequest.class)
    public JAXBElement<String> createSetProjectToUsageSessionByProcessRequestProcessName(String value) {
        return new JAXBElement<String>(_SetProjectToUsageSessionByProcessRequestProcessName_QNAME, String.class, SetProjectToUsageSessionByProcessRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LmFileForDownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FileToDownload", scope = DownloadLmFileRequest.class)
    public JAXBElement<LmFileForDownload> createDownloadLmFileRequestFileToDownload(LmFileForDownload value) {
        return new JAXBElement<LmFileForDownload>(_DownloadLmFileRequestFileToDownload_QNAME, LmFileForDownload.class, DownloadLmFileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FileFetchConfigSetting", scope = GetFileFetchConfigResponse.class)
    public JAXBElement<FileFetchConfig> createGetFileFetchConfigResponseFileFetchConfigSetting(FileFetchConfig value) {
        return new JAXBElement<FileFetchConfig>(_GetFileFetchConfigResponseFileFetchConfigSetting_QNAME, FileFetchConfig.class, GetFileFetchConfigResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Users", scope = AlertRuleDestination.class)
    public JAXBElement<ArrayOfUser> createAlertRuleDestinationUsers(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_AlertRuleDestinationUsers_QNAME, ArrayOfUser.class, AlertRuleDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "IncludeInvolvedUsers", scope = AlertRuleDestination.class)
    public JAXBElement<Integer> createAlertRuleDestinationIncludeInvolvedUsers(Integer value) {
        return new JAXBElement<Integer>(_AlertRuleDestinationIncludeInvolvedUsers_QNAME, Integer.class, AlertRuleDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Address", scope = AlertRuleDestination.class)
    public JAXBElement<String> createAlertRuleDestinationAddress(String value) {
        return new JAXBElement<String>(_AlertRuleDestinationAddress_QNAME, String.class, AlertRuleDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "TimePattern", scope = AlertRuleDestination.class)
    public JAXBElement<String> createAlertRuleDestinationTimePattern(String value) {
        return new JAXBElement<String>(_AlertRuleDestinationTimePattern_QNAME, String.class, AlertRuleDestination.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedProcessFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProcessFeatures", scope = UnmanagedProcessVendorRequest.class)
    public JAXBElement<ArrayOfUnmanagedProcessFeature> createUnmanagedProcessVendorRequestProcessFeatures(ArrayOfUnmanagedProcessFeature value) {
        return new JAXBElement<ArrayOfUnmanagedProcessFeature>(_UnmanagedProcessVendorRequestProcessFeatures_QNAME, ArrayOfUnmanagedProcessFeature.class, UnmanagedProcessVendorRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "VendorName", scope = UnmanagedProcessVendorRequest.class)
    public JAXBElement<String> createUnmanagedProcessVendorRequestVendorName(String value) {
        return new JAXBElement<String>(_UnmanagedVendorVendorName_QNAME, String.class, UnmanagedProcessVendorRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Rule", scope = AlertRuleRequest.class)
    public JAXBElement<AlertRule> createAlertRuleRequestRule(AlertRule value) {
        return new JAXBElement<AlertRule>(_AlertRuleRequestRule_QNAME, AlertRule.class, AlertRuleRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SessionID", scope = LoginFormSettingsResponse.class)
    public JAXBElement<String> createLoginFormSettingsResponseSessionID(String value) {
        return new JAXBElement<String>(_LoginFormSettingsResponseSessionID_QNAME, String.class, LoginFormSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DefaultTimeZone", scope = LoginFormSettingsResponse.class)
    public JAXBElement<String> createLoginFormSettingsResponseDefaultTimeZone(String value) {
        return new JAXBElement<String>(_LoginFormSettingsResponseDefaultTimeZone_QNAME, String.class, LoginFormSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserName", scope = LoginFormSettingsResponse.class)
    public JAXBElement<String> createLoginFormSettingsResponseUserName(String value) {
        return new JAXBElement<String>(_LoginFormSettingsResponseUserName_QNAME, String.class, LoginFormSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleConditionParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AlertRuleConditionParameters", scope = AlertRuleCondition.class)
    public JAXBElement<AlertRuleConditionParameters> createAlertRuleConditionAlertRuleConditionParameters(AlertRuleConditionParameters value) {
        return new JAXBElement<AlertRuleConditionParameters>(_AlertRuleConditionAlertRuleConditionParameters_QNAME, AlertRuleConditionParameters.class, AlertRuleCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Description", scope = AlertRuleCondition.class)
    public JAXBElement<String> createAlertRuleConditionDescription(String value) {
        return new JAXBElement<String>(_AlertRuleConditionDescription_QNAME, String.class, AlertRuleCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FileFetchSettingToUpdate", scope = UpdateFileFetchConfigRequest.class)
    public JAXBElement<FileFetchConfig> createUpdateFileFetchConfigRequestFileFetchSettingToUpdate(FileFetchConfig value) {
        return new JAXBElement<FileFetchConfig>(_UpdateFileFetchConfigRequestFileFetchSettingToUpdate_QNAME, FileFetchConfig.class, UpdateFileFetchConfigRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEffectiveLicenseFeature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EffectiveFeatures", scope = OpenLMLicenseOverviewResponse.class)
    public JAXBElement<ArrayOfEffectiveLicenseFeature> createOpenLMLicenseOverviewResponseEffectiveFeatures(ArrayOfEffectiveLicenseFeature value) {
        return new JAXBElement<ArrayOfEffectiveLicenseFeature>(_OpenLMLicenseOverviewResponseEffectiveFeatures_QNAME, ArrayOfEffectiveLicenseFeature.class, OpenLMLicenseOverviewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseManagerMacAddress", scope = OpenLMLicenseOverviewResponse.class)
    public JAXBElement<String> createOpenLMLicenseOverviewResponseLicenseManagerMacAddress(String value) {
        return new JAXBElement<String>(_OpenLMLicenseOverviewResponseLicenseManagerMacAddress_QNAME, String.class, OpenLMLicenseOverviewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicenseManagerName", scope = OpenLMLicenseOverviewResponse.class)
    public JAXBElement<String> createOpenLMLicenseOverviewResponseLicenseManagerName(String value) {
        return new JAXBElement<String>(_OpenLMLicenseOverviewResponseLicenseManagerName_QNAME, String.class, OpenLMLicenseOverviewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "OpenLMLicExpirationDate", scope = OpenLMLicenseOverviewResponse.class)
    public JAXBElement<SlimDateTime> createOpenLMLicenseOverviewResponseOpenLMLicExpirationDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_OpenLMLicenseOverviewResponseOpenLMLicExpirationDate_QNAME, SlimDateTime.class, OpenLMLicenseOverviewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ScriptInfo", scope = AgentProcStep.class)
    public JAXBElement<String> createAgentProcStepScriptInfo(String value) {
        return new JAXBElement<String>(_AgentProcStepScriptInfo_QNAME, String.class, AgentProcStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleConditionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "RuleConditionDefinitions", scope = AlertRuleConditionDefinitionsResponse.class)
    public JAXBElement<ArrayOfAlertRuleConditionDefinition> createAlertRuleConditionDefinitionsResponseRuleConditionDefinitions(ArrayOfAlertRuleConditionDefinition value) {
        return new JAXBElement<ArrayOfAlertRuleConditionDefinition>(_AlertRuleConditionDefinitionsResponseRuleConditionDefinitions_QNAME, ArrayOfAlertRuleConditionDefinition.class, AlertRuleConditionDefinitionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Value", scope = KeyValueStringPair.class)
    public JAXBElement<String> createKeyValueStringPairValue(String value) {
        return new JAXBElement<String>(_KeyValueStringPairValue_QNAME, String.class, KeyValueStringPair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Key", scope = KeyValueStringPair.class)
    public JAXBElement<String> createKeyValueStringPairKey(String value) {
        return new JAXBElement<String>(_KeyValueStringPairKey_QNAME, String.class, KeyValueStringPair.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AggregateSessionsDictionary", scope = LicenseUsageReportResponse.class)
    public JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS> createLicenseUsageReportResponseAggregateSessionsDictionary(ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS value) {
        return new JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS>(_LicenseUsageReportResponseAggregateSessionsDictionary_QNAME, ArrayOfKeyValueOfFeatureVendorServerArrayOfSessionsAggregateiufBt9WS.class, LicenseUsageReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DateQuantitiesSessionsDictionary", scope = LicenseUsageReportResponse.class)
    public JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V> createLicenseUsageReportResponseDateQuantitiesSessionsDictionary(ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V value) {
        return new JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V>(_LicenseUsageReportResponseDateQuantitiesSessionsDictionary_QNAME, ArrayOfKeyValueOfFeatureVendorServerArrayOfKeyValuePairOfSlimDateTimeintbqsusEwPUdM6Eh4V.class, LicenseUsageReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Totals", scope = LicenseUsageReportResponse.class)
    public JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS> createLicenseUsageReportResponseTotals(ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS value) {
        return new JAXBElement<ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS>(_LicenseUsageReportResponseTotals_QNAME, ArrayOfKeyValueOfFeatureVendorServerArrayOfDateLeveliufBt9WS.class, LicenseUsageReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicensePackageComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Components", scope = LicenseProcurementComponentsResponse.class)
    public JAXBElement<ArrayOfLicensePackageComponent> createLicenseProcurementComponentsResponseComponents(ArrayOfLicensePackageComponent value) {
        return new JAXBElement<ArrayOfLicensePackageComponent>(_LicenseProcurementComponentsResponseComponents_QNAME, ArrayOfLicensePackageComponent.class, LicenseProcurementComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SessionID", scope = UserAuthenticationResponse.class)
    public JAXBElement<String> createUserAuthenticationResponseSessionID(String value) {
        return new JAXBElement<String>(_LoginFormSettingsResponseSessionID_QNAME, String.class, UserAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmanagedProcessVendorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "features", scope = AddUnmanagedVendorResponse.class)
    public JAXBElement<UnmanagedProcessVendorRequest> createAddUnmanagedVendorResponseFeatures(UnmanagedProcessVendorRequest value) {
        return new JAXBElement<UnmanagedProcessVendorRequest>(_AddUnmanagedVendorResponseFeatures_QNAME, UnmanagedProcessVendorRequest.class, AddUnmanagedVendorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Keywords", scope = OptFileFeatureValidKeywordsResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1> createOptFileFeatureValidKeywordsResponseKeywords(ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1>(_OptFileFeatureValidKeywordsResponseKeywords_QNAME, ArrayOfKeyValueOfstringArrayOfstringty7Ep6D1 .class, OptFileFeatureValidKeywordsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Prefix", scope = GroupNamesRequest.class)
    public JAXBElement<String> createGroupNamesRequestPrefix(String value) {
        return new JAXBElement<String>(_GroupNamesRequestPrefix_QNAME, String.class, GroupNamesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FeaturesUsageStatuses", scope = FeatureUsageStatusResponse.class)
    public JAXBElement<ArrayOfSelectedStatisticsResponse> createFeatureUsageStatusResponseFeaturesUsageStatuses(ArrayOfSelectedStatisticsResponse value) {
        return new JAXBElement<ArrayOfSelectedStatisticsResponse>(_FeatureUsageStatusResponseFeaturesUsageStatuses_QNAME, ArrayOfSelectedStatisticsResponse.class, FeatureUsageStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSettings", scope = EmailSMSSettingsResponse.class)
    public JAXBElement<EmailSettingsRequest> createEmailSMSSettingsResponseEmailSettings(EmailSettingsRequest value) {
        return new JAXBElement<EmailSettingsRequest>(_EmailSMSSettingsResponseEmailSettings_QNAME, EmailSettingsRequest.class, EmailSMSSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SMSSettings", scope = EmailSMSSettingsResponse.class)
    public JAXBElement<SMSSettingsRequest> createEmailSMSSettingsResponseSMSSettings(SMSSettingsRequest value) {
        return new JAXBElement<SMSSettingsRequest>(_EmailSMSSettingsResponseSMSSettings_QNAME, SMSSettingsRequest.class, EmailSMSSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLmFileForDownload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LmFilesForDownload", scope = LMFilesResponse.class)
    public JAXBElement<ArrayOfLmFileForDownload> createLMFilesResponseLmFilesForDownload(ArrayOfLmFileForDownload value) {
        return new JAXBElement<ArrayOfLmFileForDownload>(_LMFilesResponseLmFilesForDownload_QNAME, ArrayOfLmFileForDownload.class, LMFilesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FeatureName", scope = UnmanagedProcessFeature.class)
    public JAXBElement<String> createUnmanagedProcessFeatureFeatureName(String value) {
        return new JAXBElement<String>(_LicenseProcurementFeatureName_QNAME, String.class, UnmanagedProcessFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProcName", scope = UnmanagedProcessFeature.class)
    public JAXBElement<String> createUnmanagedProcessFeatureProcName(String value) {
        return new JAXBElement<String>(_UnmanagedProcessFeatureProcName_QNAME, String.class, UnmanagedProcessFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProcDesc", scope = UnmanagedProcessFeature.class)
    public JAXBElement<String> createUnmanagedProcessFeatureProcDesc(String value) {
        return new JAXBElement<String>(_UnmanagedProcessFeatureProcDesc_QNAME, String.class, UnmanagedProcessFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProcedureName", scope = UnmanagedProcessFeature.class)
    public JAXBElement<String> createUnmanagedProcessFeatureProcedureName(String value) {
        return new JAXBElement<String>(_UnmanagedProcessFeatureProcedureName_QNAME, String.class, UnmanagedProcessFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgentProcedureTmpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Templates", scope = AgentProcedureTmplResponse.class)
    public JAXBElement<ArrayOfAgentProcedureTmpl> createAgentProcedureTmplResponseTemplates(ArrayOfAgentProcedureTmpl value) {
        return new JAXBElement<ArrayOfAgentProcedureTmpl>(_AgentProcedureTmplResponseTemplates_QNAME, ArrayOfAgentProcedureTmpl.class, AgentProcedureTmplResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Name", scope = AgentProcedureTmpl.class)
    public JAXBElement<String> createAgentProcedureTmplName(String value) {
        return new JAXBElement<String>(_AlertRuleName_QNAME, String.class, AgentProcedureTmpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAgentProcStep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Steps", scope = AgentProcedureTmpl.class)
    public JAXBElement<ArrayOfAgentProcStep> createAgentProcedureTmplSteps(ArrayOfAgentProcStep value) {
        return new JAXBElement<ArrayOfAgentProcStep>(_AgentProcedureTmplSteps_QNAME, ArrayOfAgentProcStep.class, AgentProcedureTmpl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Feature", scope = OptFileFeatureValidKeywordsRequest.class)
    public JAXBElement<String> createOptFileFeatureValidKeywordsRequestFeature(String value) {
        return new JAXBElement<String>(_OptFileFeatureValidKeywordsRequestFeature_QNAME, String.class, OptFileFeatureValidKeywordsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FileName", scope = LmFileForDownload.class)
    public JAXBElement<String> createLmFileForDownloadFileName(String value) {
        return new JAXBElement<String>(_LmFileForDownloadFileName_QNAME, String.class, LmFileForDownload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "PathOnServer", scope = LmFileForDownload.class)
    public JAXBElement<String> createLmFileForDownloadPathOnServer(String value) {
        return new JAXBElement<String>(_LmFileForDownloadPathOnServer_QNAME, String.class, LmFileForDownload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Error", scope = BaseResponse.class)
    public JAXBElement<Error> createBaseResponseError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ExportString", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseExportString(String value) {
        return new JAXBElement<String>(_BaseResponseExportString_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SaasToken", scope = BaseResponse.class)
    public JAXBElement<String> createBaseResponseSaasToken(String value) {
        return new JAXBElement<String>(_BaseResponseSaasToken_QNAME, String.class, BaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Licenses", scope = LicensesResponse.class)
    public JAXBElement<ArrayOfLicenseStatistics> createLicensesResponseLicenses(ArrayOfLicenseStatistics value) {
        return new JAXBElement<ArrayOfLicenseStatistics>(_PackageLicensesResponseLicenses_QNAME, ArrayOfLicenseStatistics.class, LicensesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueStringPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Parameters", scope = Error.class)
    public JAXBElement<ArrayOfKeyValueStringPair> createErrorParameters(ArrayOfKeyValueStringPair value) {
        return new JAXBElement<ArrayOfKeyValueStringPair>(_ErrorParameters_QNAME, ArrayOfKeyValueStringPair.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Message", scope = Error.class)
    public JAXBElement<String> createErrorMessage(String value) {
        return new JAXBElement<String>(_ErrorMessage_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Destinations", scope = AlertRuleComponentsResponse.class)
    public JAXBElement<ArrayOfAlertRuleDestination> createAlertRuleComponentsResponseDestinations(ArrayOfAlertRuleDestination value) {
        return new JAXBElement<ArrayOfAlertRuleDestination>(_AlertRuleComponentsResponseDestinations_QNAME, ArrayOfAlertRuleDestination.class, AlertRuleComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Conditions", scope = AlertRuleComponentsResponse.class)
    public JAXBElement<ArrayOfAlertRuleCondition> createAlertRuleComponentsResponseConditions(ArrayOfAlertRuleCondition value) {
        return new JAXBElement<ArrayOfAlertRuleCondition>(_AlertRuleComponentsResponseConditions_QNAME, ArrayOfAlertRuleCondition.class, AlertRuleComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrentlyConsumedLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Licenses", scope = CurrentlyConsumedLicensesResponse.class)
    public JAXBElement<ArrayOfCurrentlyConsumedLicense> createCurrentlyConsumedLicensesResponseLicenses(ArrayOfCurrentlyConsumedLicense value) {
        return new JAXBElement<ArrayOfCurrentlyConsumedLicense>(_PackageLicensesResponseLicenses_QNAME, ArrayOfCurrentlyConsumedLicense.class, CurrentlyConsumedLicensesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "LicensesActivities", scope = LicensesActivityResponse.class)
    public JAXBElement<ArrayOfLicenseActivity> createLicensesActivityResponseLicensesActivities(ArrayOfLicenseActivity value) {
        return new JAXBElement<ArrayOfLicenseActivity>(_LicensesActivityResponseLicensesActivities_QNAME, ArrayOfLicenseActivity.class, LicensesActivityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProcessStartTimeUTC", scope = SetProjectToUsageSessionRequest.class)
    public JAXBElement<SlimDateTime> createSetProjectToUsageSessionRequestProcessStartTimeUTC(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_SetProjectToUsageSessionRequestProcessStartTimeUTC_QNAME, SlimDateTime.class, SetProjectToUsageSessionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Workstation", scope = SetProjectToUsageSessionRequest.class)
    public JAXBElement<String> createSetProjectToUsageSessionRequestWorkstation(String value) {
        return new JAXBElement<String>(_SetProjectToUsageSessionRequestWorkstation_QNAME, String.class, SetProjectToUsageSessionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Username", scope = SetProjectToUsageSessionRequest.class)
    public JAXBElement<String> createSetProjectToUsageSessionRequestUsername(String value) {
        return new JAXBElement<String>(_UserUsername_QNAME, String.class, SetProjectToUsageSessionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EmailSettings", scope = UpdateEmailSMSSettingsDataRequest.class)
    public JAXBElement<EmailSettingsRequest> createUpdateEmailSMSSettingsDataRequestEmailSettings(EmailSettingsRequest value) {
        return new JAXBElement<EmailSettingsRequest>(_EmailSMSSettingsResponseEmailSettings_QNAME, EmailSettingsRequest.class, UpdateEmailSMSSettingsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SMSSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SMSSettings", scope = UpdateEmailSMSSettingsDataRequest.class)
    public JAXBElement<SMSSettingsRequest> createUpdateEmailSMSSettingsDataRequestSMSSettings(SMSSettingsRequest value) {
        return new JAXBElement<SMSSettingsRequest>(_EmailSMSSettingsResponseSMSSettings_QNAME, SMSSettingsRequest.class, UpdateEmailSMSSettingsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionRefresh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SessionData", scope = RequestBaseInfo.class)
    public JAXBElement<SessionRefresh> createRequestBaseInfoSessionData(SessionRefresh value) {
        return new JAXBElement<SessionRefresh>(_RequestBaseInfoSessionData_QNAME, SessionRefresh.class, RequestBaseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "CustomerId", scope = RequestBaseInfo.class)
    public JAXBElement<String> createRequestBaseInfoCustomerId(String value) {
        return new JAXBElement<String>(_RequestBaseInfoCustomerId_QNAME, String.class, RequestBaseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserLocalSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserLocalSettings", scope = RequestBaseInfo.class)
    public JAXBElement<UserLocalSettings> createRequestBaseInfoUserLocalSettings(UserLocalSettings value) {
        return new JAXBElement<UserLocalSettings>(_UserLocalSettings_QNAME, UserLocalSettings.class, RequestBaseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "PagingData", scope = RequestBaseInfo.class)
    public JAXBElement<PagingData> createRequestBaseInfoPagingData(PagingData value) {
        return new JAXBElement<PagingData>(_RequestBaseInfoPagingData_QNAME, PagingData.class, RequestBaseInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AddedDestinations", scope = UpdateAlertRuleComponentsDataRequest.class)
    public JAXBElement<ArrayOfAlertRuleDestination> createUpdateAlertRuleComponentsDataRequestAddedDestinations(ArrayOfAlertRuleDestination value) {
        return new JAXBElement<ArrayOfAlertRuleDestination>(_UpdateAlertRuleComponentsDataRequestAddedDestinations_QNAME, ArrayOfAlertRuleDestination.class, UpdateAlertRuleComponentsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleDestination }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UpdatedDestinations", scope = UpdateAlertRuleComponentsDataRequest.class)
    public JAXBElement<ArrayOfAlertRuleDestination> createUpdateAlertRuleComponentsDataRequestUpdatedDestinations(ArrayOfAlertRuleDestination value) {
        return new JAXBElement<ArrayOfAlertRuleDestination>(_UpdateAlertRuleComponentsDataRequestUpdatedDestinations_QNAME, ArrayOfAlertRuleDestination.class, UpdateAlertRuleComponentsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DeletedConditions", scope = UpdateAlertRuleComponentsDataRequest.class)
    public JAXBElement<ArrayOfint> createUpdateAlertRuleComponentsDataRequestDeletedConditions(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_UpdateAlertRuleComponentsDataRequestDeletedConditions_QNAME, ArrayOfint.class, UpdateAlertRuleComponentsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "AddedConditions", scope = UpdateAlertRuleComponentsDataRequest.class)
    public JAXBElement<ArrayOfAlertRuleCondition> createUpdateAlertRuleComponentsDataRequestAddedConditions(ArrayOfAlertRuleCondition value) {
        return new JAXBElement<ArrayOfAlertRuleCondition>(_UpdateAlertRuleComponentsDataRequestAddedConditions_QNAME, ArrayOfAlertRuleCondition.class, UpdateAlertRuleComponentsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "DeletedDestinations", scope = UpdateAlertRuleComponentsDataRequest.class)
    public JAXBElement<ArrayOfint> createUpdateAlertRuleComponentsDataRequestDeletedDestinations(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_UpdateAlertRuleComponentsDataRequestDeletedDestinations_QNAME, ArrayOfint.class, UpdateAlertRuleComponentsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UpdatedConditions", scope = UpdateAlertRuleComponentsDataRequest.class)
    public JAXBElement<ArrayOfAlertRuleCondition> createUpdateAlertRuleComponentsDataRequestUpdatedConditions(ArrayOfAlertRuleCondition value) {
        return new JAXBElement<ArrayOfAlertRuleCondition>(_UpdateAlertRuleComponentsDataRequestUpdatedConditions_QNAME, ArrayOfAlertRuleCondition.class, UpdateAlertRuleComponentsDataRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Description", scope = AlertDescriptionResponse.class)
    public JAXBElement<String> createAlertDescriptionResponseDescription(String value) {
        return new JAXBElement<String>(_AlertRuleConditionDescription_QNAME, String.class, AlertDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "BaseInfo", scope = BaseRequest.class)
    public JAXBElement<RequestBaseInfo> createBaseRequestBaseInfo(RequestBaseInfo value) {
        return new JAXBElement<RequestBaseInfo>(_BaseRequestBaseInfo_QNAME, RequestBaseInfo.class, BaseRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "SaasToken", scope = BaseRequest.class)
    public JAXBElement<String> createBaseRequestSaasToken(String value) {
        return new JAXBElement<String>(_BaseResponseSaasToken_QNAME, String.class, BaseRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "FeatureName", scope = SetProjectToUsageSessionByFeatureRequest.class)
    public JAXBElement<String> createSetProjectToUsageSessionByFeatureRequestFeatureName(String value) {
        return new JAXBElement<String>(_LicenseProcurementFeatureName_QNAME, String.class, SetProjectToUsageSessionByFeatureRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Messages", scope = SystemMessagesResponse.class)
    public JAXBElement<ArrayOfstring> createSystemMessagesResponseMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SystemMessagesResponseMessages_QNAME, ArrayOfstring.class, SystemMessagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueStringPair }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Processes", scope = MonitoredProcessesResponse.class)
    public JAXBElement<ArrayOfKeyValueStringPair> createMonitoredProcessesResponseProcesses(ArrayOfKeyValueStringPair value) {
        return new JAXBElement<ArrayOfKeyValueStringPair>(_MonitoredProcessesResponseProcesses_QNAME, ArrayOfKeyValueStringPair.class, MonitoredProcessesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "RecepientPhone", scope = TestSmsSettingsRequest.class)
    public JAXBElement<String> createTestSmsSettingsRequestRecepientPhone(String value) {
        return new JAXBElement<String>(_TestSmsSettingsRequestRecepientPhone_QNAME, String.class, TestSmsSettingsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Types", scope = LicenseTypesResponse.class)
    public JAXBElement<ArrayOfLicenseTypes> createLicenseTypesResponseTypes(ArrayOfLicenseTypes value) {
        return new JAXBElement<ArrayOfLicenseTypes>(_LicenseTypesResponseTypes_QNAME, ArrayOfLicenseTypes.class, LicenseTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Password", scope = UserAuthenticationRequest.class)
    public JAXBElement<String> createUserAuthenticationRequestPassword(String value) {
        return new JAXBElement<String>(_UserAuthenticationRequestPassword_QNAME, String.class, UserAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserName", scope = UserAuthenticationRequest.class)
    public JAXBElement<String> createUserAuthenticationRequestUserName(String value) {
        return new JAXBElement<String>(_LoginFormSettingsResponseUserName_QNAME, String.class, UserAuthenticationRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "ProjectIDs", scope = LicenseUsageReportRequest.class)
    public JAXBElement<ArrayOfint> createLicenseUsageReportRequestProjectIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LicenseUsageReportRequestProjectIDs_QNAME, ArrayOfint.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "StartTime", scope = LicenseUsageReportRequest.class)
    public JAXBElement<SlimDateTime> createLicenseUsageReportRequestStartTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicenseUsageReportRequestStartTime_QNAME, SlimDateTime.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Features", scope = LicenseUsageReportRequest.class)
    public JAXBElement<ArrayOfFeatureVendorServer> createLicenseUsageReportRequestFeatures(ArrayOfFeatureVendorServer value) {
        return new JAXBElement<ArrayOfFeatureVendorServer>(_FeatureUsageStatusRequestFeatures_QNAME, ArrayOfFeatureVendorServer.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Resolution", scope = LicenseUsageReportRequest.class)
    public JAXBElement<String> createLicenseUsageReportRequestResolution(String value) {
        return new JAXBElement<String>(_LicenseUsageReportRequestResolution_QNAME, String.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "UserIDs", scope = LicenseUsageReportRequest.class)
    public JAXBElement<ArrayOfint> createLicenseUsageReportRequestUserIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LicenseUsageReportRequestUserIDs_QNAME, ArrayOfint.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "GroupIDs", scope = LicenseUsageReportRequest.class)
    public JAXBElement<ArrayOfint> createLicenseUsageReportRequestGroupIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LicenseUsageReportRequestGroupIDs_QNAME, ArrayOfint.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "EndTime", scope = LicenseUsageReportRequest.class)
    public JAXBElement<SlimDateTime> createLicenseUsageReportRequestEndTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicenseUsageReportRequestEndTime_QNAME, SlimDateTime.class, LicenseUsageReportRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnmanagedVendor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", name = "Vendors", scope = GetUnmanagedVendorResponse.class)
    public JAXBElement<ArrayOfUnmanagedVendor> createGetUnmanagedVendorResponseVendors(ArrayOfUnmanagedVendor value) {
        return new JAXBElement<ArrayOfUnmanagedVendor>(_GetUnmanagedVendorResponseVendors_QNAME, ArrayOfUnmanagedVendor.class, GetUnmanagedVendorResponse.class, value);
    }

}

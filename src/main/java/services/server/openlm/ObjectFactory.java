
package services.server.openlm;

import org.datacontract.schemas._2004._07.openlm_server.*;
import org.datacontract.schemas._2004._07.openlm_server_services.*;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services.server.openlm package. 
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

    private final static QName _GetAlertRuleComponentsRequest_QNAME = new QName("OpenLM.Server.Services", "request");
    private final static QName _GetRouterGroupsResponseGetRouterGroupsResult_QNAME = new QName("OpenLM.Server.Services", "GetRouterGroupsResult");
    private final static QName _FileFetchSpecificFileResponseFileFetchSpecificFileResult_QNAME = new QName("OpenLM.Server.Services", "FileFetchSpecificFileResult");
    private final static QName _GetLicenseServersResponseGetLicenseServersResult_QNAME = new QName("OpenLM.Server.Services", "GetLicenseServersResult");
    private final static QName _SetFullLoggingResponseSetFullLoggingResult_QNAME = new QName("OpenLM.Server.Services", "SetFullLoggingResult");
    private final static QName _LogsUploaderKeepAliveResponseLogsUploaderKeepAliveResult_QNAME = new QName("OpenLM.Server.Services", "LogsUploaderKeepAliveResult");
    private final static QName _GetCurrentlyConsumedLicensesResponseGetCurrentlyConsumedLicensesResult_QNAME = new QName("OpenLM.Server.Services", "GetCurrentlyConsumedLicensesResult");
    private final static QName _EndLogsUploadingResponseEndLogsUploadingResult_QNAME = new QName("OpenLM.Server.Services", "EndLogsUploadingResult");
    private final static QName _AgentProcedureTmplGetListResponseAgentProcedureTmplGetListResult_QNAME = new QName("OpenLM.Server.Services", "AgentProcedureTmplGetListResult");
    private final static QName _SetProjectToUsageSessionByFeatureResponseSetProjectToUsageSessionByFeatureResult_QNAME = new QName("OpenLM.Server.Services", "SetProjectToUsageSessionByFeatureResult");
    private final static QName _DeleteUnmanagedProcessVendorResponseDeleteUnmanagedProcessVendorResult_QNAME = new QName("OpenLM.Server.Services", "DeleteUnmanagedProcessVendorResult");
    private final static QName _AddUnmanagedVendorResponseAddUnmanagedVendorResult_QNAME = new QName("OpenLM.Server.Services", "AddUnmanagedVendorResult");
    private final static QName _AgentProcedureTmplUpdateResponseAgentProcedureTmplUpdateResult_QNAME = new QName("OpenLM.Server.Services", "AgentProcedureTmplUpdateResult");
    private final static QName _GetFileFetchConfigResponseGetFileFetchConfigResult_QNAME = new QName("OpenLM.Server.Services", "GetFileFetchConfigResult");
    private final static QName _StartLogsUploadingResponseStartLogsUploadingResult_QNAME = new QName("OpenLM.Server.Services", "StartLogsUploadingResult");
    private final static QName _DeleteAlertRuleResponseDeleteAlertRuleResult_QNAME = new QName("OpenLM.Server.Services", "DeleteAlertRuleResult");
    private final static QName _ImportRouteInstructionsResponseImportRouteInstructionsResult_QNAME = new QName("OpenLM.Server.Services", "ImportRouteInstructionsResult");
    private final static QName _GetAlertRuleConditionDefinitionsResponseGetAlertRuleConditionDefinitionsResult_QNAME = new QName("OpenLM.Server.Services", "GetAlertRuleConditionDefinitionsResult");
    private final static QName _GetLicensesProcurementResponseGetLicensesProcurementResult_QNAME = new QName("OpenLM.Server.Services", "GetLicensesProcurementResult");
    private final static QName _GetGroupsNamesResponseGetGroupsNamesResult_QNAME = new QName("OpenLM.Server.Services", "GetGroupsNamesResult");
    private final static QName _GetFileFetchAvailableLicenseManagerFilesResponseGetFileFetchAvailableLicenseManagerFilesResult_QNAME = new QName("OpenLM.Server.Services", "GetFileFetchAvailableLicenseManagerFilesResult");
    private final static QName _GetUnmanagedVendorResponseGetUnmanagedVendorResult_QNAME = new QName("OpenLM.Server.Services", "GetUnmanagedVendorResult");
    private final static QName _SetProjectToUsageSessionByProcessResponseSetProjectToUsageSessionByProcessResult_QNAME = new QName("OpenLM.Server.Services", "SetProjectToUsageSessionByProcessResult");
    private final static QName _UpdateAlertRuleComponentsResponseUpdateAlertRuleComponentsResult_QNAME = new QName("OpenLM.Server.Services", "UpdateAlertRuleComponentsResult");
    private final static QName _GetAlertRuleComponentsResponseGetAlertRuleComponentsResult_QNAME = new QName("OpenLM.Server.Services", "GetAlertRuleComponentsResult");
    private final static QName _MonitoredProcessGetNamesResponseMonitoredProcessGetNamesResult_QNAME = new QName("OpenLM.Server.Services", "MonitoredProcessGetNamesResult");
    private final static QName _AgentProcedureTmplDeleteResponseAgentProcedureTmplDeleteResult_QNAME = new QName("OpenLM.Server.Services", "AgentProcedureTmplDeleteResult");
    private final static QName _ExportRouteInstructionsResponseExportRouteInstructionsResult_QNAME = new QName("OpenLM.Server.Services", "ExportRouteInstructionsResult");
    private final static QName _GetLoginFormSettingsResponseGetLoginFormSettingsResult_QNAME = new QName("OpenLM.Server.Services", "GetLoginFormSettingsResult");
    private final static QName _GetLicensesActivityResponseGetLicensesActivityResult_QNAME = new QName("OpenLM.Server.Services", "GetLicensesActivityResult");
    private final static QName _PerformUserAuthenticationResponsePerformUserAuthenticationResult_QNAME = new QName("OpenLM.Server.Services", "PerformUserAuthenticationResult");
    private final static QName _GetFeatureUsageStatusResponseGetFeatureUsageStatusResult_QNAME = new QName("OpenLM.Server.Services", "GetFeatureUsageStatusResult");
    private final static QName _GetLicenseUsageReportResponseGetLicenseUsageReportResult_QNAME = new QName("OpenLM.Server.Services", "GetLicenseUsageReportResult");
    private final static QName _GetAlertDescriptionResponseGetAlertDescriptionResult_QNAME = new QName("OpenLM.Server.Services", "GetAlertDescriptionResult");
    private final static QName _UpdateAlertRuleResponseUpdateAlertRuleResult_QNAME = new QName("OpenLM.Server.Services", "UpdateAlertRuleResult");
    private final static QName _UpdateRouterGroupsAndComponentsResponseUpdateRouterGroupsAndComponentsResult_QNAME = new QName("OpenLM.Server.Services", "UpdateRouterGroupsAndComponentsResult");
    private final static QName _GetPackageLicensesResponseGetPackageLicensesResult_QNAME = new QName("OpenLM.Server.Services", "GetPackageLicensesResult");
    private final static QName _GetOptFileContentResponseGetOptFileContentResult_QNAME = new QName("OpenLM.Server.Services", "GetOptFileContentResult");
    private final static QName _AddAlertRuleResponseAddAlertRuleResult_QNAME = new QName("OpenLM.Server.Services", "AddAlertRuleResult");
    private final static QName _GetAlertsRulesResponseGetAlertsRulesResult_QNAME = new QName("OpenLM.Server.Services", "GetAlertsRulesResult");
    private final static QName _UpdateEmailSMSSettingsResponseUpdateEmailSMSSettingsResult_QNAME = new QName("OpenLM.Server.Services", "UpdateEmailSMSSettingsResult");
    private final static QName _LdapRestSyncResponseLdapRestSyncResult_QNAME = new QName("OpenLM.Server.Services", "LdapRestSyncResult");
    private final static QName _GetSystemMessagesResponseGetSystemMessagesResult_QNAME = new QName("OpenLM.Server.Services", "GetSystemMessagesResult");
    private final static QName _TestEmailSettingsResponseTestEmailSettingsResult_QNAME = new QName("OpenLM.Server.Services", "TestEmailSettingsResult");
    private final static QName _AgentProcedureTmplCreateResponseAgentProcedureTmplCreateResult_QNAME = new QName("OpenLM.Server.Services", "AgentProcedureTmplCreateResult");
    private final static QName _GetOpenLMLicenseOverviewResponseGetOpenLMLicenseOverviewResult_QNAME = new QName("OpenLM.Server.Services", "GetOpenLMLicenseOverviewResult");
    private final static QName _GetLicenseProcurementComponentsResponseGetLicenseProcurementComponentsResult_QNAME = new QName("OpenLM.Server.Services", "GetLicenseProcurementComponentsResult");
    private final static QName _UpdateFileFetchConfigResponseUpdateFileFetchConfigResult_QNAME = new QName("OpenLM.Server.Services", "UpdateFileFetchConfigResult");
    private final static QName _GetRouterMonitoringResponseGetRouterMonitoringResult_QNAME = new QName("OpenLM.Server.Services", "GetRouterMonitoringResult");
    private final static QName _GetOptFileFeatureValidKeywordsResponseGetOptFileFeatureValidKeywordsResult_QNAME = new QName("OpenLM.Server.Services", "GetOptFileFeatureValidKeywordsResult");
    private final static QName _TestSMSSettingsResponseTestSMSSettingsResult_QNAME = new QName("OpenLM.Server.Services", "TestSMSSettingsResult");
    private final static QName _GetEmailSMSSettingsResponseGetEmailSMSSettingsResult_QNAME = new QName("OpenLM.Server.Services", "GetEmailSMSSettingsResult");
    private final static QName _GetFileFetchFetchingStatusResponseGetFileFetchFetchingStatusResult_QNAME = new QName("OpenLM.Server.Services", "GetFileFetchFetchingStatusResult");
    private final static QName _GetLicensesResponseGetLicensesResult_QNAME = new QName("OpenLM.Server.Services", "GetLicensesResult");
    private final static QName _GetLicenseTypesResponseGetLicenseTypesResult_QNAME = new QName("OpenLM.Server.Services", "GetLicenseTypesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services.server.openlm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlertRuleConditionDefinitionsResponse }
     * 
     */
    public GetAlertRuleConditionDefinitionsResponse createGetAlertRuleConditionDefinitionsResponse() {
        return new GetAlertRuleConditionDefinitionsResponse();
    }

    /**
     * Create an instance of {@link GetLicenseTypes }
     * 
     */
    public GetLicenseTypes createGetLicenseTypes() {
        return new GetLicenseTypes();
    }

    /**
     * Create an instance of {@link GetUnmanagedVendor }
     * 
     */
    public GetUnmanagedVendor createGetUnmanagedVendor() {
        return new GetUnmanagedVendor();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionByFeatureResponse }
     * 
     */
    public SetProjectToUsageSessionByFeatureResponse createSetProjectToUsageSessionByFeatureResponse() {
        return new SetProjectToUsageSessionByFeatureResponse();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionByFeature }
     * 
     */
    public SetProjectToUsageSessionByFeature createSetProjectToUsageSessionByFeature() {
        return new SetProjectToUsageSessionByFeature();
    }

    /**
     * Create an instance of {@link GetAlertDescription }
     * 
     */
    public GetAlertDescription createGetAlertDescription() {
        return new GetAlertDescription();
    }

    /**
     * Create an instance of {@link UpdateEmailSMSSettings }
     * 
     */
    public UpdateEmailSMSSettings createUpdateEmailSMSSettings() {
        return new UpdateEmailSMSSettings();
    }

    /**
     * Create an instance of {@link LdapRestSyncResponse }
     * 
     */
    public LdapRestSyncResponse createLdapRestSyncResponse() {
        return new LdapRestSyncResponse();
    }

    /**
     * Create an instance of {@link TestSMSSettingsResponse }
     * 
     */
    public TestSMSSettingsResponse createTestSMSSettingsResponse() {
        return new TestSMSSettingsResponse();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplCreate }
     * 
     */
    public AgentProcedureTmplCreate createAgentProcedureTmplCreate() {
        return new AgentProcedureTmplCreate();
    }

    /**
     * Create an instance of {@link GetLoginFormSettings }
     * 
     */
    public GetLoginFormSettings createGetLoginFormSettings() {
        return new GetLoginFormSettings();
    }

    /**
     * Create an instance of {@link GetOpenLMLicenseOverview }
     * 
     */
    public GetOpenLMLicenseOverview createGetOpenLMLicenseOverview() {
        return new GetOpenLMLicenseOverview();
    }

    /**
     * Create an instance of {@link TestEmailSettings }
     * 
     */
    public TestEmailSettings createTestEmailSettings() {
        return new TestEmailSettings();
    }

    /**
     * Create an instance of {@link EndLogsUploading }
     * 
     */
    public EndLogsUploading createEndLogsUploading() {
        return new EndLogsUploading();
    }

    /**
     * Create an instance of {@link LogsUploaderKeepAliveResponse }
     * 
     */
    public LogsUploaderKeepAliveResponse createLogsUploaderKeepAliveResponse() {
        return new LogsUploaderKeepAliveResponse();
    }

    /**
     * Create an instance of {@link GetLicenseServersResponse }
     * 
     */
    public GetLicenseServersResponse createGetLicenseServersResponse() {
        return new GetLicenseServersResponse();
    }

    /**
     * Create an instance of {@link DeleteAlertRuleResponse }
     * 
     */
    public DeleteAlertRuleResponse createDeleteAlertRuleResponse() {
        return new DeleteAlertRuleResponse();
    }

    /**
     * Create an instance of {@link GetOptFileContent }
     * 
     */
    public GetOptFileContent createGetOptFileContent() {
        return new GetOptFileContent();
    }

    /**
     * Create an instance of {@link GetOptFileFeatureValidKeywords }
     * 
     */
    public GetOptFileFeatureValidKeywords createGetOptFileFeatureValidKeywords() {
        return new GetOptFileFeatureValidKeywords();
    }

    /**
     * Create an instance of {@link GetEmailSMSSettingsResponse }
     * 
     */
    public GetEmailSMSSettingsResponse createGetEmailSMSSettingsResponse() {
        return new GetEmailSMSSettingsResponse();
    }

    /**
     * Create an instance of {@link StartLogsUploadingResponse }
     * 
     */
    public StartLogsUploadingResponse createStartLogsUploadingResponse() {
        return new StartLogsUploadingResponse();
    }

    /**
     * Create an instance of {@link UpdateRouterGroupsAndComponents }
     * 
     */
    public UpdateRouterGroupsAndComponents createUpdateRouterGroupsAndComponents() {
        return new UpdateRouterGroupsAndComponents();
    }

    /**
     * Create an instance of {@link TestSMSSettings }
     * 
     */
    public TestSMSSettings createTestSMSSettings() {
        return new TestSMSSettings();
    }

    /**
     * Create an instance of {@link ExportRouteInstructions }
     * 
     */
    public ExportRouteInstructions createExportRouteInstructions() {
        return new ExportRouteInstructions();
    }

    /**
     * Create an instance of {@link DeleteUnmanagedProcessVendor }
     * 
     */
    public DeleteUnmanagedProcessVendor createDeleteUnmanagedProcessVendor() {
        return new DeleteUnmanagedProcessVendor();
    }

    /**
     * Create an instance of {@link GetRouterMonitoring }
     * 
     */
    public GetRouterMonitoring createGetRouterMonitoring() {
        return new GetRouterMonitoring();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplCreateResponse }
     * 
     */
    public AgentProcedureTmplCreateResponse createAgentProcedureTmplCreateResponse() {
        return new AgentProcedureTmplCreateResponse();
    }

    /**
     * Create an instance of {@link GetAlertRuleConditionDefinitions }
     * 
     */
    public GetAlertRuleConditionDefinitions createGetAlertRuleConditionDefinitions() {
        return new GetAlertRuleConditionDefinitions();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplUpdate }
     * 
     */
    public AgentProcedureTmplUpdate createAgentProcedureTmplUpdate() {
        return new AgentProcedureTmplUpdate();
    }

    /**
     * Create an instance of {@link MonitoredProcessGetNames }
     * 
     */
    public MonitoredProcessGetNames createMonitoredProcessGetNames() {
        return new MonitoredProcessGetNames();
    }

    /**
     * Create an instance of {@link GetLicenseTypesResponse }
     * 
     */
    public GetLicenseTypesResponse createGetLicenseTypesResponse() {
        return new GetLicenseTypesResponse();
    }

    /**
     * Create an instance of {@link DeleteUnmanagedProcessVendorResponse }
     * 
     */
    public DeleteUnmanagedProcessVendorResponse createDeleteUnmanagedProcessVendorResponse() {
        return new DeleteUnmanagedProcessVendorResponse();
    }

    /**
     * Create an instance of {@link GetFileFetchAvailableLicenseManagerFiles }
     * 
     */
    public GetFileFetchAvailableLicenseManagerFiles createGetFileFetchAvailableLicenseManagerFiles() {
        return new GetFileFetchAvailableLicenseManagerFiles();
    }

    /**
     * Create an instance of {@link GetLicensesProcurementResponse }
     * 
     */
    public GetLicensesProcurementResponse createGetLicensesProcurementResponse() {
        return new GetLicensesProcurementResponse();
    }

    /**
     * Create an instance of {@link ImportRouteInstructionsResponse }
     * 
     */
    public ImportRouteInstructionsResponse createImportRouteInstructionsResponse() {
        return new ImportRouteInstructionsResponse();
    }

    /**
     * Create an instance of {@link UpdateAlertRuleComponents }
     * 
     */
    public UpdateAlertRuleComponents createUpdateAlertRuleComponents() {
        return new UpdateAlertRuleComponents();
    }

    /**
     * Create an instance of {@link services.server.openlm.GetUnmanagedVendorResponse }
     * 
     */
    public services.server.openlm.GetUnmanagedVendorResponse createGetUnmanagedVendorResponse() {
        return new services.server.openlm.GetUnmanagedVendorResponse();
    }

    /**
     * Create an instance of {@link UpdateFileFetchConfig }
     * 
     */
    public UpdateFileFetchConfig createUpdateFileFetchConfig() {
        return new UpdateFileFetchConfig();
    }

    /**
     * Create an instance of {@link LogsUploaderKeepAlive }
     * 
     */
    public LogsUploaderKeepAlive createLogsUploaderKeepAlive() {
        return new LogsUploaderKeepAlive();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplDeleteResponse }
     * 
     */
    public AgentProcedureTmplDeleteResponse createAgentProcedureTmplDeleteResponse() {
        return new AgentProcedureTmplDeleteResponse();
    }

    /**
     * Create an instance of {@link GetPackageLicensesResponse }
     * 
     */
    public GetPackageLicensesResponse createGetPackageLicensesResponse() {
        return new GetPackageLicensesResponse();
    }

    /**
     * Create an instance of {@link GetFileFetchFetchingStatus }
     * 
     */
    public GetFileFetchFetchingStatus createGetFileFetchFetchingStatus() {
        return new GetFileFetchFetchingStatus();
    }

    /**
     * Create an instance of {@link GetGroupsNames }
     * 
     */
    public GetGroupsNames createGetGroupsNames() {
        return new GetGroupsNames();
    }

    /**
     * Create an instance of {@link GetAlertsRulesResponse }
     * 
     */
    public GetAlertsRulesResponse createGetAlertsRulesResponse() {
        return new GetAlertsRulesResponse();
    }

    /**
     * Create an instance of {@link GetRouterMonitoringResponse }
     * 
     */
    public GetRouterMonitoringResponse createGetRouterMonitoringResponse() {
        return new GetRouterMonitoringResponse();
    }

    /**
     * Create an instance of {@link FileFetchSpecificFileResponse }
     * 
     */
    public FileFetchSpecificFileResponse createFileFetchSpecificFileResponse() {
        return new FileFetchSpecificFileResponse();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplGetList }
     * 
     */
    public AgentProcedureTmplGetList createAgentProcedureTmplGetList() {
        return new AgentProcedureTmplGetList();
    }

    /**
     * Create an instance of {@link GetRouterGroupsResponse }
     * 
     */
    public GetRouterGroupsResponse createGetRouterGroupsResponse() {
        return new GetRouterGroupsResponse();
    }

    /**
     * Create an instance of {@link ImportRouteInstructions }
     * 
     */
    public ImportRouteInstructions createImportRouteInstructions() {
        return new ImportRouteInstructions();
    }

    /**
     * Create an instance of {@link SetFullLogging }
     * 
     */
    public SetFullLogging createSetFullLogging() {
        return new SetFullLogging();
    }

    /**
     * Create an instance of {@link GetOptFileContentResponse }
     * 
     */
    public GetOptFileContentResponse createGetOptFileContentResponse() {
        return new GetOptFileContentResponse();
    }

    /**
     * Create an instance of {@link GetLicenseProcurementComponentsResponse }
     * 
     */
    public GetLicenseProcurementComponentsResponse createGetLicenseProcurementComponentsResponse() {
        return new GetLicenseProcurementComponentsResponse();
    }

    /**
     * Create an instance of {@link AddUnmanagedVendor }
     * 
     */
    public AddUnmanagedVendor createAddUnmanagedVendor() {
        return new AddUnmanagedVendor();
    }

    /**
     * Create an instance of {@link GetRouterGroups }
     * 
     */
    public GetRouterGroups createGetRouterGroups() {
        return new GetRouterGroups();
    }

    /**
     * Create an instance of {@link services.server.openlm.AddUnmanagedVendorResponse }
     * 
     */
    public services.server.openlm.AddUnmanagedVendorResponse createAddUnmanagedVendorResponse() {
        return new services.server.openlm.AddUnmanagedVendorResponse();
    }

    /**
     * Create an instance of {@link AddAlertRule }
     * 
     */
    public AddAlertRule createAddAlertRule() {
        return new AddAlertRule();
    }

    /**
     * Create an instance of {@link TestEmailSettingsResponse }
     * 
     */
    public TestEmailSettingsResponse createTestEmailSettingsResponse() {
        return new TestEmailSettingsResponse();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionByProcessResponse }
     * 
     */
    public SetProjectToUsageSessionByProcessResponse createSetProjectToUsageSessionByProcessResponse() {
        return new SetProjectToUsageSessionByProcessResponse();
    }

    /**
     * Create an instance of {@link FileFetchSpecificFile }
     * 
     */
    public FileFetchSpecificFile createFileFetchSpecificFile() {
        return new FileFetchSpecificFile();
    }

    /**
     * Create an instance of {@link GetFileFetchFetchingStatusResponse }
     * 
     */
    public GetFileFetchFetchingStatusResponse createGetFileFetchFetchingStatusResponse() {
        return new GetFileFetchFetchingStatusResponse();
    }

    /**
     * Create an instance of {@link GetFeatureUsageStatusResponse }
     * 
     */
    public GetFeatureUsageStatusResponse createGetFeatureUsageStatusResponse() {
        return new GetFeatureUsageStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateEmailSMSSettingsResponse }
     * 
     */
    public UpdateEmailSMSSettingsResponse createUpdateEmailSMSSettingsResponse() {
        return new UpdateEmailSMSSettingsResponse();
    }

    /**
     * Create an instance of {@link AddAlertRuleResponse }
     * 
     */
    public AddAlertRuleResponse createAddAlertRuleResponse() {
        return new AddAlertRuleResponse();
    }

    /**
     * Create an instance of {@link GetLicenseUsageReport }
     * 
     */
    public GetLicenseUsageReport createGetLicenseUsageReport() {
        return new GetLicenseUsageReport();
    }

    /**
     * Create an instance of {@link GetSystemMessagesResponse }
     * 
     */
    public GetSystemMessagesResponse createGetSystemMessagesResponse() {
        return new GetSystemMessagesResponse();
    }

    /**
     * Create an instance of {@link GetLicensesActivity }
     * 
     */
    public GetLicensesActivity createGetLicensesActivity() {
        return new GetLicensesActivity();
    }

    /**
     * Create an instance of {@link GetLicensesProcurement }
     * 
     */
    public GetLicensesProcurement createGetLicensesProcurement() {
        return new GetLicensesProcurement();
    }

    /**
     * Create an instance of {@link EndLogsUploadingResponse }
     * 
     */
    public EndLogsUploadingResponse createEndLogsUploadingResponse() {
        return new EndLogsUploadingResponse();
    }

    /**
     * Create an instance of {@link GetFeatureUsageStatus }
     * 
     */
    public GetFeatureUsageStatus createGetFeatureUsageStatus() {
        return new GetFeatureUsageStatus();
    }

    /**
     * Create an instance of {@link GetAlertRuleComponents }
     * 
     */
    public GetAlertRuleComponents createGetAlertRuleComponents() {
        return new GetAlertRuleComponents();
    }

    /**
     * Create an instance of {@link SetProjectToUsageSessionByProcess }
     * 
     */
    public SetProjectToUsageSessionByProcess createSetProjectToUsageSessionByProcess() {
        return new SetProjectToUsageSessionByProcess();
    }

    /**
     * Create an instance of {@link UpdateAlertRuleComponentsResponse }
     * 
     */
    public UpdateAlertRuleComponentsResponse createUpdateAlertRuleComponentsResponse() {
        return new UpdateAlertRuleComponentsResponse();
    }

    /**
     * Create an instance of {@link GetEmailSMSSettings }
     * 
     */
    public GetEmailSMSSettings createGetEmailSMSSettings() {
        return new GetEmailSMSSettings();
    }

    /**
     * Create an instance of {@link PerformUserAuthentication }
     * 
     */
    public PerformUserAuthentication createPerformUserAuthentication() {
        return new PerformUserAuthentication();
    }

    /**
     * Create an instance of {@link GetSystemMessages }
     * 
     */
    public GetSystemMessages createGetSystemMessages() {
        return new GetSystemMessages();
    }

    /**
     * Create an instance of {@link UpdateRouterGroupsAndComponentsResponse }
     * 
     */
    public UpdateRouterGroupsAndComponentsResponse createUpdateRouterGroupsAndComponentsResponse() {
        return new UpdateRouterGroupsAndComponentsResponse();
    }

    /**
     * Create an instance of {@link GetCurrentlyConsumedLicenses }
     * 
     */
    public GetCurrentlyConsumedLicenses createGetCurrentlyConsumedLicenses() {
        return new GetCurrentlyConsumedLicenses();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplGetListResponse }
     * 
     */
    public AgentProcedureTmplGetListResponse createAgentProcedureTmplGetListResponse() {
        return new AgentProcedureTmplGetListResponse();
    }

    /**
     * Create an instance of {@link GetCurrentlyConsumedLicensesResponse }
     * 
     */
    public GetCurrentlyConsumedLicensesResponse createGetCurrentlyConsumedLicensesResponse() {
        return new GetCurrentlyConsumedLicensesResponse();
    }

    /**
     * Create an instance of {@link ExportRouteInstructionsResponse }
     * 
     */
    public ExportRouteInstructionsResponse createExportRouteInstructionsResponse() {
        return new ExportRouteInstructionsResponse();
    }

    /**
     * Create an instance of {@link services.server.openlm.UpdateFileFetchConfigResponse }
     * 
     */
    public services.server.openlm.UpdateFileFetchConfigResponse createUpdateFileFetchConfigResponse() {
        return new services.server.openlm.UpdateFileFetchConfigResponse();
    }

    /**
     * Create an instance of {@link GetOpenLMLicenseOverviewResponse }
     * 
     */
    public GetOpenLMLicenseOverviewResponse createGetOpenLMLicenseOverviewResponse() {
        return new GetOpenLMLicenseOverviewResponse();
    }

    /**
     * Create an instance of {@link GetFileFetchConfig }
     * 
     */
    public GetFileFetchConfig createGetFileFetchConfig() {
        return new GetFileFetchConfig();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplDelete }
     * 
     */
    public AgentProcedureTmplDelete createAgentProcedureTmplDelete() {
        return new AgentProcedureTmplDelete();
    }

    /**
     * Create an instance of {@link GetLoginFormSettingsResponse }
     * 
     */
    public GetLoginFormSettingsResponse createGetLoginFormSettingsResponse() {
        return new GetLoginFormSettingsResponse();
    }

    /**
     * Create an instance of {@link GetAlertRuleComponentsResponse }
     * 
     */
    public GetAlertRuleComponentsResponse createGetAlertRuleComponentsResponse() {
        return new GetAlertRuleComponentsResponse();
    }

    /**
     * Create an instance of {@link StartLogsUploading }
     * 
     */
    public StartLogsUploading createStartLogsUploading() {
        return new StartLogsUploading();
    }

    /**
     * Create an instance of {@link GetLicenses }
     * 
     */
    public GetLicenses createGetLicenses() {
        return new GetLicenses();
    }

    /**
     * Create an instance of {@link services.server.openlm.GetFileFetchConfigResponse }
     * 
     */
    public services.server.openlm.GetFileFetchConfigResponse createGetFileFetchConfigResponse() {
        return new services.server.openlm.GetFileFetchConfigResponse();
    }

    /**
     * Create an instance of {@link GetGroupsNamesResponse }
     * 
     */
    public GetGroupsNamesResponse createGetGroupsNamesResponse() {
        return new GetGroupsNamesResponse();
    }

    /**
     * Create an instance of {@link UpdateAlertRule }
     * 
     */
    public UpdateAlertRule createUpdateAlertRule() {
        return new UpdateAlertRule();
    }

    /**
     * Create an instance of {@link MonitoredProcessGetNamesResponse }
     * 
     */
    public MonitoredProcessGetNamesResponse createMonitoredProcessGetNamesResponse() {
        return new MonitoredProcessGetNamesResponse();
    }

    /**
     * Create an instance of {@link GetLicenseServers }
     * 
     */
    public GetLicenseServers createGetLicenseServers() {
        return new GetLicenseServers();
    }

    /**
     * Create an instance of {@link GetLicensesActivityResponse }
     * 
     */
    public GetLicensesActivityResponse createGetLicensesActivityResponse() {
        return new GetLicensesActivityResponse();
    }

    /**
     * Create an instance of {@link GetFileFetchAvailableLicenseManagerFilesResponse }
     * 
     */
    public GetFileFetchAvailableLicenseManagerFilesResponse createGetFileFetchAvailableLicenseManagerFilesResponse() {
        return new GetFileFetchAvailableLicenseManagerFilesResponse();
    }

    /**
     * Create an instance of {@link UpdateAlertRuleResponse }
     * 
     */
    public UpdateAlertRuleResponse createUpdateAlertRuleResponse() {
        return new UpdateAlertRuleResponse();
    }

    /**
     * Create an instance of {@link GetAlertsRules }
     * 
     */
    public GetAlertsRules createGetAlertsRules() {
        return new GetAlertsRules();
    }

    /**
     * Create an instance of {@link GetOptFileFeatureValidKeywordsResponse }
     * 
     */
    public GetOptFileFeatureValidKeywordsResponse createGetOptFileFeatureValidKeywordsResponse() {
        return new GetOptFileFeatureValidKeywordsResponse();
    }

    /**
     * Create an instance of {@link LdapRestSync }
     * 
     */
    public LdapRestSync createLdapRestSync() {
        return new LdapRestSync();
    }

    /**
     * Create an instance of {@link GetPackageLicenses }
     * 
     */
    public GetPackageLicenses createGetPackageLicenses() {
        return new GetPackageLicenses();
    }

    /**
     * Create an instance of {@link AgentProcedureTmplUpdateResponse }
     * 
     */
    public AgentProcedureTmplUpdateResponse createAgentProcedureTmplUpdateResponse() {
        return new AgentProcedureTmplUpdateResponse();
    }

    /**
     * Create an instance of {@link DeleteAlertRule }
     * 
     */
    public DeleteAlertRule createDeleteAlertRule() {
        return new DeleteAlertRule();
    }

    /**
     * Create an instance of {@link GetLicenseUsageReportResponse }
     * 
     */
    public GetLicenseUsageReportResponse createGetLicenseUsageReportResponse() {
        return new GetLicenseUsageReportResponse();
    }

    /**
     * Create an instance of {@link PerformUserAuthenticationResponse }
     * 
     */
    public PerformUserAuthenticationResponse createPerformUserAuthenticationResponse() {
        return new PerformUserAuthenticationResponse();
    }

    /**
     * Create an instance of {@link GetLicensesResponse }
     * 
     */
    public GetLicensesResponse createGetLicensesResponse() {
        return new GetLicensesResponse();
    }

    /**
     * Create an instance of {@link GetLicenseProcurementComponents }
     * 
     */
    public GetLicenseProcurementComponents createGetLicenseProcurementComponents() {
        return new GetLicenseProcurementComponents();
    }

    /**
     * Create an instance of {@link SetFullLoggingResponse }
     * 
     */
    public SetFullLoggingResponse createSetFullLoggingResponse() {
        return new SetFullLoggingResponse();
    }

    /**
     * Create an instance of {@link GetAlertDescriptionResponse }
     * 
     */
    public GetAlertDescriptionResponse createGetAlertDescriptionResponse() {
        return new GetAlertDescriptionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetAlertRuleComponents.class)
    public JAXBElement<AlertRuleComponentsRequest> createGetAlertRuleComponentsRequest(AlertRuleComponentsRequest value) {
        return new JAXBElement<AlertRuleComponentsRequest>(_GetAlertRuleComponentsRequest_QNAME, AlertRuleComponentsRequest.class, GetAlertRuleComponents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertDescriptionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetAlertDescription.class)
    public JAXBElement<AlertDescriptionRequest> createGetAlertDescriptionRequest(AlertDescriptionRequest value) {
        return new JAXBElement<AlertDescriptionRequest>(_GetAlertRuleComponentsRequest_QNAME, AlertDescriptionRequest.class, GetAlertDescription.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetRouterGroupsResult", scope = GetRouterGroupsResponse.class)
    public JAXBElement<RouterGroupsResponse> createGetRouterGroupsResponseGetRouterGroupsResult(RouterGroupsResponse value) {
        return new JAXBElement<RouterGroupsResponse>(_GetRouterGroupsResponseGetRouterGroupsResult_QNAME, RouterGroupsResponse.class, GetRouterGroupsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFormSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLoginFormSettings.class)
    public JAXBElement<LoginFormSettingsRequest> createGetLoginFormSettingsRequest(LoginFormSettingsRequest value) {
        return new JAXBElement<LoginFormSettingsRequest>(_GetAlertRuleComponentsRequest_QNAME, LoginFormSettingsRequest.class, GetLoginFormSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = DeleteAlertRule.class)
    public JAXBElement<AlertRuleRequest> createDeleteAlertRuleRequest(AlertRuleRequest value) {
        return new JAXBElement<AlertRuleRequest>(_GetAlertRuleComponentsRequest_QNAME, AlertRuleRequest.class, DeleteAlertRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetRouterGroups.class)
    public JAXBElement<RouterGroupsRequest> createGetRouterGroupsRequest(RouterGroupsRequest value) {
        return new JAXBElement<RouterGroupsRequest>(_GetAlertRuleComponentsRequest_QNAME, RouterGroupsRequest.class, GetRouterGroups.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = MonitoredProcessGetNames.class)
    public JAXBElement<BaseRequest> createMonitoredProcessGetNamesRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, MonitoredProcessGetNames.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadLmFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "FileFetchSpecificFileResult", scope = FileFetchSpecificFileResponse.class)
    public JAXBElement<DownloadLmFileResponse> createFileFetchSpecificFileResponseFileFetchSpecificFileResult(DownloadLmFileResponse value) {
        return new JAXBElement<DownloadLmFileResponse>(_FileFetchSpecificFileResponseFileFetchSpecificFileResult_QNAME, DownloadLmFileResponse.class, FileFetchSpecificFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseServersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicenseServersResult", scope = GetLicenseServersResponse.class)
    public JAXBElement<LicenseServersResponse> createGetLicenseServersResponseGetLicenseServersResult(LicenseServersResponse value) {
        return new JAXBElement<LicenseServersResponse>(_GetLicenseServersResponseGetLicenseServersResult_QNAME, LicenseServersResponse.class, GetLicenseServersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLmFilesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetFileFetchAvailableLicenseManagerFiles.class)
    public JAXBElement<GetLmFilesRequest> createGetFileFetchAvailableLicenseManagerFilesRequest(GetLmFilesRequest value) {
        return new JAXBElement<GetLmFilesRequest>(_GetAlertRuleComponentsRequest_QNAME, GetLmFilesRequest.class, GetFileFetchAvailableLicenseManagerFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetOpenLMLicenseOverview.class)
    public JAXBElement<BaseRequest> createGetOpenLMLicenseOverviewRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetOpenLMLicenseOverview.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "SetFullLoggingResult", scope = SetFullLoggingResponse.class)
    public JAXBElement<BaseResponse> createSetFullLoggingResponseSetFullLoggingResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_SetFullLoggingResponseSetFullLoggingResult_QNAME, BaseResponse.class, SetFullLoggingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = AgentProcedureTmplGetList.class)
    public JAXBElement<BaseRequest> createAgentProcedureTmplGetListRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, AgentProcedureTmplGetList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "LogsUploaderKeepAliveResult", scope = LogsUploaderKeepAliveResponse.class)
    public JAXBElement<LogsUploadingBaseResponse> createLogsUploaderKeepAliveResponseLogsUploaderKeepAliveResult(LogsUploadingBaseResponse value) {
        return new JAXBElement<LogsUploadingBaseResponse>(_LogsUploaderKeepAliveResponseLogsUploaderKeepAliveResult_QNAME, LogsUploadingBaseResponse.class, LogsUploaderKeepAliveResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetCurrentlyConsumedLicensesResult", scope = GetCurrentlyConsumedLicensesResponse.class)
    public JAXBElement<CurrentlyConsumedLicensesResponse> createGetCurrentlyConsumedLicensesResponseGetCurrentlyConsumedLicensesResult(CurrentlyConsumedLicensesResponse value) {
        return new JAXBElement<CurrentlyConsumedLicensesResponse>(_GetCurrentlyConsumedLicensesResponseGetCurrentlyConsumedLicensesResult_QNAME, CurrentlyConsumedLicensesResponse.class, GetCurrentlyConsumedLicensesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingKeepAliveRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = LogsUploaderKeepAlive.class)
    public JAXBElement<LogsUploadingKeepAliveRequest> createLogsUploaderKeepAliveRequest(LogsUploadingKeepAliveRequest value) {
        return new JAXBElement<LogsUploadingKeepAliveRequest>(_GetAlertRuleComponentsRequest_QNAME, LogsUploadingKeepAliveRequest.class, LogsUploaderKeepAlive.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAlertRuleComponentsDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = UpdateAlertRuleComponents.class)
    public JAXBElement<UpdateAlertRuleComponentsDataRequest> createUpdateAlertRuleComponentsRequest(UpdateAlertRuleComponentsDataRequest value) {
        return new JAXBElement<UpdateAlertRuleComponentsDataRequest>(_GetAlertRuleComponentsRequest_QNAME, UpdateAlertRuleComponentsDataRequest.class, UpdateAlertRuleComponents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingBaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "EndLogsUploadingResult", scope = EndLogsUploadingResponse.class)
    public JAXBElement<LogsUploadingBaseResponse> createEndLogsUploadingResponseEndLogsUploadingResult(LogsUploadingBaseResponse value) {
        return new JAXBElement<LogsUploadingBaseResponse>(_EndLogsUploadingResponseEndLogsUploadingResult_QNAME, LogsUploadingBaseResponse.class, EndLogsUploadingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportRouteInstructionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = ImportRouteInstructions.class)
    public JAXBElement<ImportRouteInstructionsRequest> createImportRouteInstructionsRequest(ImportRouteInstructionsRequest value) {
        return new JAXBElement<ImportRouteInstructionsRequest>(_GetAlertRuleComponentsRequest_QNAME, ImportRouteInstructionsRequest.class, ImportRouteInstructions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptFileFeatureValidKeywordsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetOptFileFeatureValidKeywords.class)
    public JAXBElement<OptFileFeatureValidKeywordsRequest> createGetOptFileFeatureValidKeywordsRequest(OptFileFeatureValidKeywordsRequest value) {
        return new JAXBElement<OptFileFeatureValidKeywordsRequest>(_GetAlertRuleComponentsRequest_QNAME, OptFileFeatureValidKeywordsRequest.class, GetOptFileFeatureValidKeywords.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmplResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "AgentProcedureTmplGetListResult", scope = AgentProcedureTmplGetListResponse.class)
    public JAXBElement<AgentProcedureTmplResponse> createAgentProcedureTmplGetListResponseAgentProcedureTmplGetListResult(AgentProcedureTmplResponse value) {
        return new JAXBElement<AgentProcedureTmplResponse>(_AgentProcedureTmplGetListResponseAgentProcedureTmplGetListResult_QNAME, AgentProcedureTmplResponse.class, AgentProcedureTmplGetListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "SetProjectToUsageSessionByFeatureResult", scope = SetProjectToUsageSessionByFeatureResponse.class)
    public JAXBElement<BaseResponse> createSetProjectToUsageSessionByFeatureResponseSetProjectToUsageSessionByFeatureResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_SetProjectToUsageSessionByFeatureResponseSetProjectToUsageSessionByFeatureResult_QNAME, BaseResponse.class, SetProjectToUsageSessionByFeatureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "DeleteUnmanagedProcessVendorResult", scope = DeleteUnmanagedProcessVendorResponse.class)
    public JAXBElement<BaseResponse> createDeleteUnmanagedProcessVendorResponseDeleteUnmanagedProcessVendorResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_DeleteUnmanagedProcessVendorResponseDeleteUnmanagedProcessVendorResult_QNAME, BaseResponse.class, DeleteUnmanagedProcessVendorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "AddUnmanagedVendorResult", scope = services.server.openlm.AddUnmanagedVendorResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse> createAddUnmanagedVendorResponseAddUnmanagedVendorResult(org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse>(_AddUnmanagedVendorResponseAddUnmanagedVendorResult_QNAME, org.datacontract.schemas._2004._07.openlm_server_services.AddUnmanagedVendorResponse.class, services.server.openlm.AddUnmanagedVendorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "AgentProcedureTmplUpdateResult", scope = AgentProcedureTmplUpdateResponse.class)
    public JAXBElement<BaseResponse> createAgentProcedureTmplUpdateResponseAgentProcedureTmplUpdateResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_AgentProcedureTmplUpdateResponseAgentProcedureTmplUpdateResult_QNAME, BaseResponse.class, AgentProcedureTmplUpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetFileFetchConfigResult", scope = services.server.openlm.GetFileFetchConfigResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse> createGetFileFetchConfigResponseGetFileFetchConfigResult(org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse>(_GetFileFetchConfigResponseGetFileFetchConfigResult_QNAME, org.datacontract.schemas._2004._07.openlm_server_services.GetFileFetchConfigResponse.class, services.server.openlm.GetFileFetchConfigResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetAlertRuleConditionDefinitions.class)
    public JAXBElement<BaseRequest> createGetAlertRuleConditionDefinitionsRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetAlertRuleConditionDefinitions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetFileFetchFetchingStatus.class)
    public JAXBElement<FileFetchStatusRequest> createGetFileFetchFetchingStatusRequest(FileFetchStatusRequest value) {
        return new JAXBElement<FileFetchStatusRequest>(_GetAlertRuleComponentsRequest_QNAME, FileFetchStatusRequest.class, GetFileFetchFetchingStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingStartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "StartLogsUploadingResult", scope = StartLogsUploadingResponse.class)
    public JAXBElement<LogsUploadingStartResponse> createStartLogsUploadingResponseStartLogsUploadingResult(LogsUploadingStartResponse value) {
        return new JAXBElement<LogsUploadingStartResponse>(_StartLogsUploadingResponseStartLogsUploadingResult_QNAME, LogsUploadingStartResponse.class, StartLogsUploadingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnmanagedVendorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetUnmanagedVendor.class)
    public JAXBElement<GetUnmanagedVendorRequest> createGetUnmanagedVendorRequest(GetUnmanagedVendorRequest value) {
        return new JAXBElement<GetUnmanagedVendorRequest>(_GetAlertRuleComponentsRequest_QNAME, GetUnmanagedVendorRequest.class, GetUnmanagedVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageLicensesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetPackageLicenses.class)
    public JAXBElement<PackageLicensesRequest> createGetPackageLicensesRequest(PackageLicensesRequest value) {
        return new JAXBElement<PackageLicensesRequest>(_GetAlertRuleComponentsRequest_QNAME, PackageLicensesRequest.class, GetPackageLicenses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseUsageReportRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicenseUsageReport.class)
    public JAXBElement<LicenseUsageReportRequest> createGetLicenseUsageReportRequest(LicenseUsageReportRequest value) {
        return new JAXBElement<LicenseUsageReportRequest>(_GetAlertRuleComponentsRequest_QNAME, LicenseUsageReportRequest.class, GetLicenseUsageReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "DeleteAlertRuleResult", scope = DeleteAlertRuleResponse.class)
    public JAXBElement<BaseResponse> createDeleteAlertRuleResponseDeleteAlertRuleResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_DeleteAlertRuleResponseDeleteAlertRuleResult_QNAME, BaseResponse.class, DeleteAlertRuleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "ImportRouteInstructionsResult", scope = ImportRouteInstructionsResponse.class)
    public JAXBElement<BaseResponse> createImportRouteInstructionsResponseImportRouteInstructionsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_ImportRouteInstructionsResponseImportRouteInstructionsResult_QNAME, BaseResponse.class, ImportRouteInstructionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestEmailSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = TestEmailSettings.class)
    public JAXBElement<TestEmailSettingsRequest> createTestEmailSettingsRequest(TestEmailSettingsRequest value) {
        return new JAXBElement<TestEmailSettingsRequest>(_GetAlertRuleComponentsRequest_QNAME, TestEmailSettingsRequest.class, TestEmailSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleConditionDefinitionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetAlertRuleConditionDefinitionsResult", scope = GetAlertRuleConditionDefinitionsResponse.class)
    public JAXBElement<AlertRuleConditionDefinitionsResponse> createGetAlertRuleConditionDefinitionsResponseGetAlertRuleConditionDefinitionsResult(AlertRuleConditionDefinitionsResponse value) {
        return new JAXBElement<AlertRuleConditionDefinitionsResponse>(_GetAlertRuleConditionDefinitionsResponseGetAlertRuleConditionDefinitionsResult_QNAME, AlertRuleConditionDefinitionsResponse.class, GetAlertRuleConditionDefinitionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesProcurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicensesProcurementResult", scope = GetLicensesProcurementResponse.class)
    public JAXBElement<LicensesProcurementResponse> createGetLicensesProcurementResponseGetLicensesProcurementResult(LicensesProcurementResponse value) {
        return new JAXBElement<LicensesProcurementResponse>(_GetLicensesProcurementResponseGetLicensesProcurementResult_QNAME, LicensesProcurementResponse.class, GetLicensesProcurementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetGroupsNamesResult", scope = GetGroupsNamesResponse.class)
    public JAXBElement<GroupNamesResponse> createGetGroupsNamesResponseGetGroupsNamesResult(GroupNamesResponse value) {
        return new JAXBElement<GroupNamesResponse>(_GetGroupsNamesResponseGetGroupsNamesResult_QNAME, GroupNamesResponse.class, GetGroupsNamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicenseServers.class)
    public JAXBElement<BaseRequest> createGetLicenseServersRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetLicenseServers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LMFilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetFileFetchAvailableLicenseManagerFilesResult", scope = GetFileFetchAvailableLicenseManagerFilesResponse.class)
    public JAXBElement<LMFilesResponse> createGetFileFetchAvailableLicenseManagerFilesResponseGetFileFetchAvailableLicenseManagerFilesResult(LMFilesResponse value) {
        return new JAXBElement<LMFilesResponse>(_GetFileFetchAvailableLicenseManagerFilesResponseGetFileFetchAvailableLicenseManagerFilesResult_QNAME, LMFilesResponse.class, GetFileFetchAvailableLicenseManagerFilesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetUnmanagedVendorResult", scope = services.server.openlm.GetUnmanagedVendorResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse> createGetUnmanagedVendorResponseGetUnmanagedVendorResult(org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse>(_GetUnmanagedVendorResponseGetUnmanagedVendorResult_QNAME, org.datacontract.schemas._2004._07.openlm_server_services.GetUnmanagedVendorResponse.class, services.server.openlm.GetUnmanagedVendorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProjectToUsageSessionByFeatureRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = SetProjectToUsageSessionByFeature.class)
    public JAXBElement<SetProjectToUsageSessionByFeatureRequest> createSetProjectToUsageSessionByFeatureRequest(SetProjectToUsageSessionByFeatureRequest value) {
        return new JAXBElement<SetProjectToUsageSessionByFeatureRequest>(_GetAlertRuleComponentsRequest_QNAME, SetProjectToUsageSessionByFeatureRequest.class, SetProjectToUsageSessionByFeature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingStartRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = StartLogsUploading.class)
    public JAXBElement<LogsUploadingStartRequest> createStartLogsUploadingRequest(LogsUploadingStartRequest value) {
        return new JAXBElement<LogsUploadingStartRequest>(_GetAlertRuleComponentsRequest_QNAME, LogsUploadingStartRequest.class, StartLogsUploading.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRouterGroupsAndComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = UpdateRouterGroupsAndComponents.class)
    public JAXBElement<UpdateRouterGroupsAndComponentsRequest> createUpdateRouterGroupsAndComponentsRequest(UpdateRouterGroupsAndComponentsRequest value) {
        return new JAXBElement<UpdateRouterGroupsAndComponentsRequest>(_GetAlertRuleComponentsRequest_QNAME, UpdateRouterGroupsAndComponentsRequest.class, UpdateRouterGroupsAndComponents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProjectToUsageSessionByProcessRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = SetProjectToUsageSessionByProcess.class)
    public JAXBElement<SetProjectToUsageSessionByProcessRequest> createSetProjectToUsageSessionByProcessRequest(SetProjectToUsageSessionByProcessRequest value) {
        return new JAXBElement<SetProjectToUsageSessionByProcessRequest>(_GetAlertRuleComponentsRequest_QNAME, SetProjectToUsageSessionByProcessRequest.class, SetProjectToUsageSessionByProcess.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptFileContentRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetOptFileContent.class)
    public JAXBElement<OptFileContentRequest> createGetOptFileContentRequest(OptFileContentRequest value) {
        return new JAXBElement<OptFileContentRequest>(_GetAlertRuleComponentsRequest_QNAME, OptFileContentRequest.class, GetOptFileContent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "SetProjectToUsageSessionByProcessResult", scope = SetProjectToUsageSessionByProcessResponse.class)
    public JAXBElement<BaseResponse> createSetProjectToUsageSessionByProcessResponseSetProjectToUsageSessionByProcessResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_SetProjectToUsageSessionByProcessResponseSetProjectToUsageSessionByProcessResult_QNAME, BaseResponse.class, SetProjectToUsageSessionByProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "UpdateAlertRuleComponentsResult", scope = UpdateAlertRuleComponentsResponse.class)
    public JAXBElement<BaseResponse> createUpdateAlertRuleComponentsResponseUpdateAlertRuleComponentsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_UpdateAlertRuleComponentsResponseUpdateAlertRuleComponentsResult_QNAME, BaseResponse.class, UpdateAlertRuleComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmplRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = AgentProcedureTmplUpdate.class)
    public JAXBElement<AgentProcedureTmplRequest> createAgentProcedureTmplUpdateRequest(AgentProcedureTmplRequest value) {
        return new JAXBElement<AgentProcedureTmplRequest>(_GetAlertRuleComponentsRequest_QNAME, AgentProcedureTmplRequest.class, AgentProcedureTmplUpdate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleComponentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetAlertRuleComponentsResult", scope = GetAlertRuleComponentsResponse.class)
    public JAXBElement<AlertRuleComponentsResponse> createGetAlertRuleComponentsResponseGetAlertRuleComponentsResult(AlertRuleComponentsResponse value) {
        return new JAXBElement<AlertRuleComponentsResponse>(_GetAlertRuleComponentsResponseGetAlertRuleComponentsResult_QNAME, AlertRuleComponentsResponse.class, GetAlertRuleComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonitoredProcessesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "MonitoredProcessGetNamesResult", scope = MonitoredProcessGetNamesResponse.class)
    public JAXBElement<MonitoredProcessesResponse> createMonitoredProcessGetNamesResponseMonitoredProcessGetNamesResult(MonitoredProcessesResponse value) {
        return new JAXBElement<MonitoredProcessesResponse>(_MonitoredProcessGetNamesResponseMonitoredProcessGetNamesResult_QNAME, MonitoredProcessesResponse.class, MonitoredProcessGetNamesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "AgentProcedureTmplDeleteResult", scope = AgentProcedureTmplDeleteResponse.class)
    public JAXBElement<BaseResponse> createAgentProcedureTmplDeleteResponseAgentProcedureTmplDeleteResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_AgentProcedureTmplDeleteResponseAgentProcedureTmplDeleteResult_QNAME, BaseResponse.class, AgentProcedureTmplDeleteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "ExportRouteInstructionsResult", scope = ExportRouteInstructionsResponse.class)
    public JAXBElement<BaseResponse> createExportRouteInstructionsResponseExportRouteInstructionsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_ExportRouteInstructionsResponseExportRouteInstructionsResult_QNAME, BaseResponse.class, ExportRouteInstructionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFormSettingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLoginFormSettingsResult", scope = GetLoginFormSettingsResponse.class)
    public JAXBElement<LoginFormSettingsResponse> createGetLoginFormSettingsResponseGetLoginFormSettingsResult(LoginFormSettingsResponse value) {
        return new JAXBElement<LoginFormSettingsResponse>(_GetLoginFormSettingsResponseGetLoginFormSettingsResult_QNAME, LoginFormSettingsResponse.class, GetLoginFormSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesActivityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicensesActivityResult", scope = GetLicensesActivityResponse.class)
    public JAXBElement<LicensesActivityResponse> createGetLicensesActivityResponseGetLicensesActivityResult(LicensesActivityResponse value) {
        return new JAXBElement<LicensesActivityResponse>(_GetLicensesActivityResponseGetLicensesActivityResult_QNAME, LicensesActivityResponse.class, GetLicensesActivityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "PerformUserAuthenticationResult", scope = PerformUserAuthenticationResponse.class)
    public JAXBElement<UserAuthenticationResponse> createPerformUserAuthenticationResponsePerformUserAuthenticationResult(UserAuthenticationResponse value) {
        return new JAXBElement<UserAuthenticationResponse>(_PerformUserAuthenticationResponsePerformUserAuthenticationResult_QNAME, UserAuthenticationResponse.class, PerformUserAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetFileFetchConfig.class)
    public JAXBElement<BaseRequest> createGetFileFetchConfigRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetFileFetchConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthenticationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = PerformUserAuthentication.class)
    public JAXBElement<UserAuthenticationRequest> createPerformUserAuthenticationRequest(UserAuthenticationRequest value) {
        return new JAXBElement<UserAuthenticationRequest>(_GetAlertRuleComponentsRequest_QNAME, UserAuthenticationRequest.class, PerformUserAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicensesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetCurrentlyConsumedLicenses.class)
    public JAXBElement<CurrentlyConsumedLicensesRequest> createGetCurrentlyConsumedLicensesRequest(CurrentlyConsumedLicensesRequest value) {
        return new JAXBElement<CurrentlyConsumedLicensesRequest>(_GetAlertRuleComponentsRequest_QNAME, CurrentlyConsumedLicensesRequest.class, GetCurrentlyConsumedLicenses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureUsageStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetFeatureUsageStatusResult", scope = GetFeatureUsageStatusResponse.class)
    public JAXBElement<FeatureUsageStatusResponse> createGetFeatureUsageStatusResponseGetFeatureUsageStatusResult(FeatureUsageStatusResponse value) {
        return new JAXBElement<FeatureUsageStatusResponse>(_GetFeatureUsageStatusResponseGetFeatureUsageStatusResult_QNAME, FeatureUsageStatusResponse.class, GetFeatureUsageStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportRouteInstructionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = ExportRouteInstructions.class)
    public JAXBElement<ExportRouteInstructionsRequest> createExportRouteInstructionsRequest(ExportRouteInstructionsRequest value) {
        return new JAXBElement<ExportRouteInstructionsRequest>(_GetAlertRuleComponentsRequest_QNAME, ExportRouteInstructionsRequest.class, ExportRouteInstructions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseUsageReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicenseUsageReportResult", scope = GetLicenseUsageReportResponse.class)
    public JAXBElement<LicenseUsageReportResponse> createGetLicenseUsageReportResponseGetLicenseUsageReportResult(LicenseUsageReportResponse value) {
        return new JAXBElement<LicenseUsageReportResponse>(_GetLicenseUsageReportResponseGetLicenseUsageReportResult_QNAME, LicenseUsageReportResponse.class, GetLicenseUsageReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetAlertDescriptionResult", scope = GetAlertDescriptionResponse.class)
    public JAXBElement<AlertDescriptionResponse> createGetAlertDescriptionResponseGetAlertDescriptionResult(AlertDescriptionResponse value) {
        return new JAXBElement<AlertDescriptionResponse>(_GetAlertDescriptionResponseGetAlertDescriptionResult_QNAME, AlertDescriptionResponse.class, GetAlertDescriptionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFileFetchConfigRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = UpdateFileFetchConfig.class)
    public JAXBElement<UpdateFileFetchConfigRequest> createUpdateFileFetchConfigRequest(UpdateFileFetchConfigRequest value) {
        return new JAXBElement<UpdateFileFetchConfigRequest>(_GetAlertRuleComponentsRequest_QNAME, UpdateFileFetchConfigRequest.class, UpdateFileFetchConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFullLoggingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = SetFullLogging.class)
    public JAXBElement<SetFullLoggingRequest> createSetFullLoggingRequest(SetFullLoggingRequest value) {
        return new JAXBElement<SetFullLoggingRequest>(_GetAlertRuleComponentsRequest_QNAME, SetFullLoggingRequest.class, SetFullLogging.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "UpdateAlertRuleResult", scope = UpdateAlertRuleResponse.class)
    public JAXBElement<BaseResponse> createUpdateAlertRuleResponseUpdateAlertRuleResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_UpdateAlertRuleResponseUpdateAlertRuleResult_QNAME, BaseResponse.class, UpdateAlertRuleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "UpdateRouterGroupsAndComponentsResult", scope = UpdateRouterGroupsAndComponentsResponse.class)
    public JAXBElement<BaseResponse> createUpdateRouterGroupsAndComponentsResponseUpdateRouterGroupsAndComponentsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_UpdateRouterGroupsAndComponentsResponseUpdateRouterGroupsAndComponentsResult_QNAME, BaseResponse.class, UpdateRouterGroupsAndComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageLicensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetPackageLicensesResult", scope = GetPackageLicensesResponse.class)
    public JAXBElement<PackageLicensesResponse> createGetPackageLicensesResponseGetPackageLicensesResult(PackageLicensesResponse value) {
        return new JAXBElement<PackageLicensesResponse>(_GetPackageLicensesResponseGetPackageLicensesResult_QNAME, PackageLicensesResponse.class, GetPackageLicensesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetOptFileContentResult", scope = GetOptFileContentResponse.class)
    public JAXBElement<BaseResponse> createGetOptFileContentResponseGetOptFileContentResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_GetOptFileContentResponseGetOptFileContentResult_QNAME, BaseResponse.class, GetOptFileContentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "AddAlertRuleResult", scope = AddAlertRuleResponse.class)
    public JAXBElement<AlertRuleResponse> createAddAlertRuleResponseAddAlertRuleResult(AlertRuleResponse value) {
        return new JAXBElement<AlertRuleResponse>(_AddAlertRuleResponseAddAlertRuleResult_QNAME, AlertRuleResponse.class, AddAlertRuleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestSmsSettingsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = TestSMSSettings.class)
    public JAXBElement<TestSmsSettingsRequest> createTestSMSSettingsRequest(TestSmsSettingsRequest value) {
        return new JAXBElement<TestSmsSettingsRequest>(_GetAlertRuleComponentsRequest_QNAME, TestSmsSettingsRequest.class, TestSMSSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsRulesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetAlertsRulesResult", scope = GetAlertsRulesResponse.class)
    public JAXBElement<AlertsRulesResponse> createGetAlertsRulesResponseGetAlertsRulesResult(AlertsRulesResponse value) {
        return new JAXBElement<AlertsRulesResponse>(_GetAlertsRulesResponseGetAlertsRulesResult_QNAME, AlertsRulesResponse.class, GetAlertsRulesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetEmailSMSSettings.class)
    public JAXBElement<BaseRequest> createGetEmailSMSSettingsRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetEmailSMSSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "UpdateEmailSMSSettingsResult", scope = UpdateEmailSMSSettingsResponse.class)
    public JAXBElement<BaseResponse> createUpdateEmailSMSSettingsResponseUpdateEmailSMSSettingsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_UpdateEmailSMSSettingsResponseUpdateEmailSMSSettingsResult_QNAME, BaseResponse.class, UpdateEmailSMSSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesProcurementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicensesProcurement.class)
    public JAXBElement<LicensesProcurementRequest> createGetLicensesProcurementRequest(LicensesProcurementRequest value) {
        return new JAXBElement<LicensesProcurementRequest>(_GetAlertRuleComponentsRequest_QNAME, LicensesProcurementRequest.class, GetLicensesProcurement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPResetSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "LdapRestSyncResult", scope = LdapRestSyncResponse.class)
    public JAXBElement<LDAPResetSyncResponse> createLdapRestSyncResponseLdapRestSyncResult(LDAPResetSyncResponse value) {
        return new JAXBElement<LDAPResetSyncResponse>(_LdapRestSyncResponseLdapRestSyncResult_QNAME, LDAPResetSyncResponse.class, LdapRestSyncResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmanagedProcessVendorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = AddUnmanagedVendor.class)
    public JAXBElement<UnmanagedProcessVendorRequest> createAddUnmanagedVendorRequest(UnmanagedProcessVendorRequest value) {
        return new JAXBElement<UnmanagedProcessVendorRequest>(_GetAlertRuleComponentsRequest_QNAME, UnmanagedProcessVendorRequest.class, AddUnmanagedVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetSystemMessagesResult", scope = GetSystemMessagesResponse.class)
    public JAXBElement<SystemMessagesResponse> createGetSystemMessagesResponseGetSystemMessagesResult(SystemMessagesResponse value) {
        return new JAXBElement<SystemMessagesResponse>(_GetSystemMessagesResponseGetSystemMessagesResult_QNAME, SystemMessagesResponse.class, GetSystemMessagesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "TestEmailSettingsResult", scope = TestEmailSettingsResponse.class)
    public JAXBElement<BaseResponse> createTestEmailSettingsResponseTestEmailSettingsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_TestEmailSettingsResponseTestEmailSettingsResult_QNAME, BaseResponse.class, TestEmailSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterMonitoringRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetRouterMonitoring.class)
    public JAXBElement<RouterMonitoringRequest> createGetRouterMonitoringRequest(RouterMonitoringRequest value) {
        return new JAXBElement<RouterMonitoringRequest>(_GetAlertRuleComponentsRequest_QNAME, RouterMonitoringRequest.class, GetRouterMonitoring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "AgentProcedureTmplCreateResult", scope = AgentProcedureTmplCreateResponse.class)
    public JAXBElement<BaseResponse> createAgentProcedureTmplCreateResponseAgentProcedureTmplCreateResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_AgentProcedureTmplCreateResponseAgentProcedureTmplCreateResult_QNAME, BaseResponse.class, AgentProcedureTmplCreateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenLMLicenseOverviewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetOpenLMLicenseOverviewResult", scope = GetOpenLMLicenseOverviewResponse.class)
    public JAXBElement<OpenLMLicenseOverviewResponse> createGetOpenLMLicenseOverviewResponseGetOpenLMLicenseOverviewResult(OpenLMLicenseOverviewResponse value) {
        return new JAXBElement<OpenLMLicenseOverviewResponse>(_GetOpenLMLicenseOverviewResponseGetOpenLMLicenseOverviewResult_QNAME, OpenLMLicenseOverviewResponse.class, GetOpenLMLicenseOverviewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupNamesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetGroupsNames.class)
    public JAXBElement<GroupNamesRequest> createGetGroupsNamesRequest(GroupNamesRequest value) {
        return new JAXBElement<GroupNamesRequest>(_GetAlertRuleComponentsRequest_QNAME, GroupNamesRequest.class, GetGroupsNames.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicenseTypes.class)
    public JAXBElement<BaseRequest> createGetLicenseTypesRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetLicenseTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadLmFileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = FileFetchSpecificFile.class)
    public JAXBElement<DownloadLmFileRequest> createFileFetchSpecificFileRequest(DownloadLmFileRequest value) {
        return new JAXBElement<DownloadLmFileRequest>(_GetAlertRuleComponentsRequest_QNAME, DownloadLmFileRequest.class, FileFetchSpecificFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDAPResetSyncRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = LdapRestSync.class)
    public JAXBElement<LDAPResetSyncRequest> createLdapRestSyncRequest(LDAPResetSyncRequest value) {
        return new JAXBElement<LDAPResetSyncRequest>(_GetAlertRuleComponentsRequest_QNAME, LDAPResetSyncRequest.class, LdapRestSync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnmanagedProcessVendorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = DeleteUnmanagedProcessVendor.class)
    public JAXBElement<UnmanagedProcessVendorRequest> createDeleteUnmanagedProcessVendorRequest(UnmanagedProcessVendorRequest value) {
        return new JAXBElement<UnmanagedProcessVendorRequest>(_GetAlertRuleComponentsRequest_QNAME, UnmanagedProcessVendorRequest.class, DeleteUnmanagedProcessVendor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmailSMSSettingsDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = UpdateEmailSMSSettings.class)
    public JAXBElement<UpdateEmailSMSSettingsDataRequest> createUpdateEmailSMSSettingsRequest(UpdateEmailSMSSettingsDataRequest value) {
        return new JAXBElement<UpdateEmailSMSSettingsDataRequest>(_GetAlertRuleComponentsRequest_QNAME, UpdateEmailSMSSettingsDataRequest.class, UpdateEmailSMSSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = UpdateAlertRule.class)
    public JAXBElement<AlertRuleRequest> createUpdateAlertRuleRequest(AlertRuleRequest value) {
        return new JAXBElement<AlertRuleRequest>(_GetAlertRuleComponentsRequest_QNAME, AlertRuleRequest.class, UpdateAlertRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureUsageStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetFeatureUsageStatus.class)
    public JAXBElement<FeatureUsageStatusRequest> createGetFeatureUsageStatusRequest(FeatureUsageStatusRequest value) {
        return new JAXBElement<FeatureUsageStatusRequest>(_GetAlertRuleComponentsRequest_QNAME, FeatureUsageStatusRequest.class, GetFeatureUsageStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseProcurementComponentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicenseProcurementComponentsResult", scope = GetLicenseProcurementComponentsResponse.class)
    public JAXBElement<LicenseProcurementComponentsResponse> createGetLicenseProcurementComponentsResponseGetLicenseProcurementComponentsResult(LicenseProcurementComponentsResponse value) {
        return new JAXBElement<LicenseProcurementComponentsResponse>(_GetLicenseProcurementComponentsResponseGetLicenseProcurementComponentsResult_QNAME, LicenseProcurementComponentsResponse.class, GetLicenseProcurementComponentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "UpdateFileFetchConfigResult", scope = services.server.openlm.UpdateFileFetchConfigResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse> createUpdateFileFetchConfigResponseUpdateFileFetchConfigResult(org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse>(_UpdateFileFetchConfigResponseUpdateFileFetchConfigResult_QNAME, org.datacontract.schemas._2004._07.openlm_server_services.UpdateFileFetchConfigResponse.class, services.server.openlm.UpdateFileFetchConfigResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetAlertsRules.class)
    public JAXBElement<BaseRequest> createGetAlertsRulesRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetAlertsRules.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterMonitoringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetRouterMonitoringResult", scope = GetRouterMonitoringResponse.class)
    public JAXBElement<RouterMonitoringResponse> createGetRouterMonitoringResponseGetRouterMonitoringResult(RouterMonitoringResponse value) {
        return new JAXBElement<RouterMonitoringResponse>(_GetRouterMonitoringResponseGetRouterMonitoringResult_QNAME, RouterMonitoringResponse.class, GetRouterMonitoringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OptFileFeatureValidKeywordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetOptFileFeatureValidKeywordsResult", scope = GetOptFileFeatureValidKeywordsResponse.class)
    public JAXBElement<OptFileFeatureValidKeywordsResponse> createGetOptFileFeatureValidKeywordsResponseGetOptFileFeatureValidKeywordsResult(OptFileFeatureValidKeywordsResponse value) {
        return new JAXBElement<OptFileFeatureValidKeywordsResponse>(_GetOptFileFeatureValidKeywordsResponseGetOptFileFeatureValidKeywordsResult_QNAME, OptFileFeatureValidKeywordsResponse.class, GetOptFileFeatureValidKeywordsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicenses.class)
    public JAXBElement<LicenseInfoRequest> createGetLicensesRequest(LicenseInfoRequest value) {
        return new JAXBElement<LicenseInfoRequest>(_GetAlertRuleComponentsRequest_QNAME, LicenseInfoRequest.class, GetLicenses.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogsUploadingEndRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = EndLogsUploading.class)
    public JAXBElement<LogsUploadingEndRequest> createEndLogsUploadingRequest(LogsUploadingEndRequest value) {
        return new JAXBElement<LogsUploadingEndRequest>(_GetAlertRuleComponentsRequest_QNAME, LogsUploadingEndRequest.class, EndLogsUploading.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetSystemMessages.class)
    public JAXBElement<BaseRequest> createGetSystemMessagesRequest(BaseRequest value) {
        return new JAXBElement<BaseRequest>(_GetAlertRuleComponentsRequest_QNAME, BaseRequest.class, GetSystemMessages.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "TestSMSSettingsResult", scope = TestSMSSettingsResponse.class)
    public JAXBElement<BaseResponse> createTestSMSSettingsResponseTestSMSSettingsResult(BaseResponse value) {
        return new JAXBElement<BaseResponse>(_TestSMSSettingsResponseTestSMSSettingsResult_QNAME, BaseResponse.class, TestSMSSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicensesActivity.class)
    public JAXBElement<LicensesActivityRequest> createGetLicensesActivityRequest(LicensesActivityRequest value) {
        return new JAXBElement<LicensesActivityRequest>(_GetAlertRuleComponentsRequest_QNAME, LicensesActivityRequest.class, GetLicensesActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmplRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = AgentProcedureTmplCreate.class)
    public JAXBElement<AgentProcedureTmplRequest> createAgentProcedureTmplCreateRequest(AgentProcedureTmplRequest value) {
        return new JAXBElement<AgentProcedureTmplRequest>(_GetAlertRuleComponentsRequest_QNAME, AgentProcedureTmplRequest.class, AgentProcedureTmplCreate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailSMSSettingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetEmailSMSSettingsResult", scope = GetEmailSMSSettingsResponse.class)
    public JAXBElement<EmailSMSSettingsResponse> createGetEmailSMSSettingsResponseGetEmailSMSSettingsResult(EmailSMSSettingsResponse value) {
        return new JAXBElement<EmailSMSSettingsResponse>(_GetEmailSMSSettingsResponseGetEmailSMSSettingsResult_QNAME, EmailSMSSettingsResponse.class, GetEmailSMSSettingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetFileFetchFetchingStatusResult", scope = GetFileFetchFetchingStatusResponse.class)
    public JAXBElement<FileFetchStatusResponse> createGetFileFetchFetchingStatusResponseGetFileFetchFetchingStatusResult(FileFetchStatusResponse value) {
        return new JAXBElement<FileFetchStatusResponse>(_GetFileFetchFetchingStatusResponseGetFileFetchFetchingStatusResult_QNAME, FileFetchStatusResponse.class, GetFileFetchFetchingStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesProcurementComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = GetLicenseProcurementComponents.class)
    public JAXBElement<LicensesProcurementComponentsRequest> createGetLicenseProcurementComponentsRequest(LicensesProcurementComponentsRequest value) {
        return new JAXBElement<LicensesProcurementComponentsRequest>(_GetAlertRuleComponentsRequest_QNAME, LicensesProcurementComponentsRequest.class, GetLicenseProcurementComponents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicensesResult", scope = GetLicensesResponse.class)
    public JAXBElement<LicensesResponse> createGetLicensesResponseGetLicensesResult(LicensesResponse value) {
        return new JAXBElement<LicensesResponse>(_GetLicensesResponseGetLicensesResult_QNAME, LicensesResponse.class, GetLicensesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentProcedureTmplRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = AgentProcedureTmplDelete.class)
    public JAXBElement<AgentProcedureTmplRequest> createAgentProcedureTmplDeleteRequest(AgentProcedureTmplRequest value) {
        return new JAXBElement<AgentProcedureTmplRequest>(_GetAlertRuleComponentsRequest_QNAME, AgentProcedureTmplRequest.class, AgentProcedureTmplDelete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "GetLicenseTypesResult", scope = GetLicenseTypesResponse.class)
    public JAXBElement<LicenseTypesResponse> createGetLicenseTypesResponseGetLicenseTypesResult(LicenseTypesResponse value) {
        return new JAXBElement<LicenseTypesResponse>(_GetLicenseTypesResponseGetLicenseTypesResult_QNAME, LicenseTypesResponse.class, GetLicenseTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "OpenLM.Server.Services", name = "request", scope = AddAlertRule.class)
    public JAXBElement<AlertRuleRequest> createAddAlertRuleRequest(AlertRuleRequest value) {
        return new JAXBElement<AlertRuleRequest>(_GetAlertRuleComponentsRequest_QNAME, AlertRuleRequest.class, AddAlertRule.class, value);
    }

}


package org.datacontract.schemas._2004._07.openlm_server;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;
import org.datacontract.schemas._2004._07.openlm_shared_public.ArrayOfLicenseTypes;
import org.datacontract.schemas._2004._07.openlm_shared_public.LicenseTypes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_server package. 
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

    private final static QName _DateLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "DateLevel");
    private final static QName _ConditionalParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ConditionalParameter");
    private final static QName _FeatureVendorServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FeatureVendorServer");
    private final static QName _AlertConditionOperator_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "AlertConditionOperator");
    private final static QName _ArrayOfConditionalParameter_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfConditionalParameter");
    private final static QName _ArrayOfFeatureVendorServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfFeatureVendorServer");
    private final static QName _ArrayOfLicenseStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfLicenseStatistics");
    private final static QName _LicenseServerStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseServerStatistics");
    private final static QName _LicenseInfoRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseInfoRequest");
    private final static QName _PackageLicensesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "PackageLicensesRequest");
    private final static QName _LicensesProcurementRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicensesProcurementRequest");
    private final static QName _ArrayOfCurrentlyConsumedLicense_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfCurrentlyConsumedLicense");
    private final static QName _SessionsAggregate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SessionsAggregate");
    private final static QName _LicensesProcurementComponentsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicensesProcurementComponentsRequest");
    private final static QName _SessionRefresh_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SessionRefresh");
    private final static QName _PagingData_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "PagingData");
    private final static QName _ArrayOfLicenseActivity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfLicenseActivity");
    private final static QName _LogicalOperator_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "LogicalOperator");
    private final static QName _ArrayOfSelectedStatisticsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfSelectedStatisticsRequest");
    private final static QName _ArrayOfLicenseServerStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfLicenseServerStatistics");
    private final static QName _AlertRuleConditionParameters_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "AlertRuleConditionParameters");
    private final static QName _AlertSeverity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "AlertSeverity");
    private final static QName _LicenseServerHostDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseServerHostDetails");
    private final static QName _AlertRuleDestinationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "AlertRuleDestinationType");
    private final static QName _CurrentlyConsumedLicensesRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "CurrentlyConsumedLicensesRequest");
    private final static QName _UpdateAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "UpdateAction");
    private final static QName _CurrentlyConsumedLicense_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "CurrentlyConsumedLicense");
    private final static QName _ArrayOfAlertRuleConditionDefinition_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfAlertRuleConditionDefinition");
    private final static QName _LicensesActivityRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicensesActivityRequest");
    private final static QName _FeatureProductVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FeatureProductVersion");
    private final static QName _SelectedStatisticsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SelectedStatisticsRequest");
    private final static QName _ArrayOfSelectedStatisticsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfSelectedStatisticsResponse");
    private final static QName _SelectedStatisticsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SelectedStatisticsResponse");
    private final static QName _ArrayOfSessionsAggregate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfSessionsAggregate");
    private final static QName _PortDataCompletionStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "PortDataCompletionStatus");
    private final static QName _FileFetchConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FileFetchConfig");
    private final static QName _ArrayOfLicenseServerHostDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfLicenseServerHostDetails");
    private final static QName _AlertRuleConditionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "AlertRuleConditionType");
    private final static QName _ArrayOfFeatureProductVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfFeatureProductVersion");
    private final static QName _LicenseStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseStatistics");
    private final static QName _ExportContentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", "ExportContentType");
    private final static QName _AlertRuleConditionDefinition_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "AlertRuleConditionDefinition");
    private final static QName _ArrayOfDateLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ArrayOfDateLevel");
    private final static QName _LicenseActivity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseActivity");
    private final static QName _SessionRefreshSessionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SessionID");
    private final static QName _LicenseServerHostDetailsHostName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "HostName");
    private final static QName _LicenseServerHostDetailsJavaVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "JavaVersion");
    private final static QName _LicenseServerHostDetailsBrokerVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "BrokerVersion");
    private final static QName _LicenseServerHostDetailsHostTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "HostTimeZone");
    private final static QName _LicenseServerHostDetailsPortStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "PortStatus");
    private final static QName _LicenseServerHostDetailsBrokerInstallPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "BrokerInstallPath");
    private final static QName _LicenseServerHostDetailsLmUptime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LmUptime");
    private final static QName _LicenseServerHostDetailsPortStatusSendTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "PortStatusSendTime");
    private final static QName _LicenseServerHostDetailsHostLocalTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "HostLocalTime");
    private final static QName _ConditionalParameterName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Name");
    private final static QName _LicenseStatisticsFeatureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FeatureName");
    private final static QName _LicenseStatisticsLicenseType_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseType");
    private final static QName _LicenseStatisticsVendorString_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "VendorString");
    private final static QName _LicenseStatisticsPackageID_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "PackageID");
    private final static QName _LicenseStatisticsVendor_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Vendor");
    private final static QName _LicenseStatisticsSortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SortOrder");
    private final static QName _LicenseStatisticsAdditionalKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "AdditionalKey");
    private final static QName _LicenseStatisticsNamedQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "NamedQuantity");
    private final static QName _LicenseStatisticsHostIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "HostIds");
    private final static QName _LicenseStatisticsProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ProductName");
    private final static QName _LicenseStatisticsServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Server");
    private final static QName _LicenseStatisticsVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Version");
    private final static QName _SessionsAggregatePeriod_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Period");
    private final static QName _LicensesActivityRequestFeatures_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Features");
    private final static QName _LicensesActivityRequestUserNames_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UserNames");
    private final static QName _LicensesActivityRequestLicenseTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LicenseTypes");
    private final static QName _LicensesActivityRequestStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "StartTime");
    private final static QName _LicensesActivityRequestProjectIDS_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ProjectIDS");
    private final static QName _LicensesActivityRequestServerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ServerName");
    private final static QName _LicensesActivityRequestEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "EndTime");
    private final static QName _LicensesActivityRequestProducts_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Products");
    private final static QName _LicensesActivityRequestWorkstation_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Workstation");
    private final static QName _LicensesActivityRequestGroupIDS_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "GroupIDS");
    private final static QName _SelectedStatisticsRequestFeatureVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FeatureVersion");
    private final static QName _SelectedStatisticsRequestVendorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "VendorName");
    private final static QName _LicenseActivitySource_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Source");
    private final static QName _LicenseActivityHostId_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "HostId");
    private final static QName _LicenseActivityTokenUsageTimeByFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "TokenUsageTimeByFilter");
    private final static QName _LicenseActivityHostname_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Hostname");
    private final static QName _LicenseActivityFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FirstName");
    private final static QName _LicenseActivityIdleTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "IdleTime");
    private final static QName _LicenseActivityIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "IP");
    private final static QName _LicenseActivityProjectName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ProjectName");
    private final static QName _LicenseActivityServerDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ServerDescription");
    private final static QName _LicenseActivityEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Email");
    private final static QName _LicenseActivityUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UserName");
    private final static QName _LicenseActivityGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "GroupName");
    private final static QName _LicenseActivityTokenUsageTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "TokenUsageTime");
    private final static QName _LicenseActivityLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LastName");
    private final static QName _LicenseActivityUsageTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UsageTime");
    private final static QName _LicenseActivityUsageTimeByFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UsageTimeByFilter");
    private final static QName _LicenseServerStatisticsServerLM_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ServerLM");
    private final static QName _LicenseServerStatisticsTotalQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "TotalQuantity");
    private final static QName _LicenseServerStatisticsHosts_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Hosts");
    private final static QName _CurrentlyConsumedLicenseDuration_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Duration");
    private final static QName _CurrentlyConsumedLicenseLingerDueDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "LingerDueDate");
    private final static QName _CurrentlyConsumedLicenseUserIdleTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UserIdleTime");
    private final static QName _CurrentlyConsumedLicenseRecentIdleTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "RecentIdleTime");
    private final static QName _CurrentlyConsumedLicensePhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "PhoneNumber");
    private final static QName _FileFetchConfigDownloadFileDirectory_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "DownloadFileDirectory");
    private final static QName _FileFetchConfigFileFetchUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FileFetchUrl");
    private final static QName _FileFetchConfigFileFetchTimeout_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "FileFetchTimeout");
    private final static QName _DateLevelDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Date");
    private final static QName _PagingDataDirection_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Direction");
    private final static QName _PagingDataSort_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Sort");
    private final static QName _PagingDataSearch_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Search");
    private final static QName _PagingDataSearchColumns_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "SearchColumns");
    private final static QName _LicensesProcurementRequestAssetInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "AssetInfo");
    private final static QName _LicensesProcurementRequestExpiresBefore_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ExpiresBefore");
    private final static QName _AlertRuleConditionParametersUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Users");
    private final static QName _AlertRuleConditionParametersConditionalParams_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "ConditionalParams");
    private final static QName _SelectedStatisticsResponseUsedLicenses_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UsedLicenses");
    private final static QName _SelectedStatisticsResponseBorrowUsage_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "BorrowUsage");
    private final static QName _SelectedStatisticsResponseQuantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Quantity");
    private final static QName _SelectedStatisticsResponseBorrowedLicenses_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "BorrowedLicenses");
    private final static QName _SelectedStatisticsResponseUsage_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Usage");
    private final static QName _CurrentlyConsumedLicensesRequestUserIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "UserIDs");
    private final static QName _FeatureVendorServerFeature_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", "Feature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfLicenseServerHostDetails }
     * 
     */
    public ArrayOfLicenseServerHostDetails createArrayOfLicenseServerHostDetails() {
        return new ArrayOfLicenseServerHostDetails();
    }

    /**
     * Create an instance of {@link ArrayOfConditionalParameter }
     * 
     */
    public ArrayOfConditionalParameter createArrayOfConditionalParameter() {
        return new ArrayOfConditionalParameter();
    }

    /**
     * Create an instance of {@link CurrentlyConsumedLicensesRequest }
     * 
     */
    public CurrentlyConsumedLicensesRequest createCurrentlyConsumedLicensesRequest() {
        return new CurrentlyConsumedLicensesRequest();
    }

    /**
     * Create an instance of {@link LicensesProcurementComponentsRequest }
     * 
     */
    public LicensesProcurementComponentsRequest createLicensesProcurementComponentsRequest() {
        return new LicensesProcurementComponentsRequest();
    }

    /**
     * Create an instance of {@link AlertRuleConditionDefinition }
     * 
     */
    public AlertRuleConditionDefinition createAlertRuleConditionDefinition() {
        return new AlertRuleConditionDefinition();
    }

    /**
     * Create an instance of {@link LicenseInfoRequest }
     * 
     */
    public LicenseInfoRequest createLicenseInfoRequest() {
        return new LicenseInfoRequest();
    }

    /**
     * Create an instance of {@link LicenseServerHostDetails }
     * 
     */
    public LicenseServerHostDetails createLicenseServerHostDetails() {
        return new LicenseServerHostDetails();
    }

    /**
     * Create an instance of {@link PackageLicensesRequest }
     * 
     */
    public PackageLicensesRequest createPackageLicensesRequest() {
        return new PackageLicensesRequest();
    }

    /**
     * Create an instance of {@link LicensesProcurementRequest }
     * 
     */
    public LicensesProcurementRequest createLicensesProcurementRequest() {
        return new LicensesProcurementRequest();
    }

    /**
     * Create an instance of {@link SelectedStatisticsRequest }
     * 
     */
    public SelectedStatisticsRequest createSelectedStatisticsRequest() {
        return new SelectedStatisticsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfLicenseActivity }
     * 
     */
    public ArrayOfLicenseActivity createArrayOfLicenseActivity() {
        return new ArrayOfLicenseActivity();
    }

    /**
     * Create an instance of {@link LicenseActivity }
     * 
     */
    public LicenseActivity createLicenseActivity() {
        return new LicenseActivity();
    }

    /**
     * Create an instance of {@link ConditionalParameter }
     * 
     */
    public ConditionalParameter createConditionalParameter() {
        return new ConditionalParameter();
    }

    /**
     * Create an instance of {@link ArrayOfDateLevel }
     * 
     */
    public ArrayOfDateLevel createArrayOfDateLevel() {
        return new ArrayOfDateLevel();
    }

    /**
     * Create an instance of {@link ArrayOfFeatureVendorServer }
     * 
     */
    public ArrayOfFeatureVendorServer createArrayOfFeatureVendorServer() {
        return new ArrayOfFeatureVendorServer();
    }

    /**
     * Create an instance of {@link DateLevel }
     * 
     */
    public DateLevel createDateLevel() {
        return new DateLevel();
    }

    /**
     * Create an instance of {@link SessionRefresh }
     * 
     */
    public SessionRefresh createSessionRefresh() {
        return new SessionRefresh();
    }

    /**
     * Create an instance of {@link PagingData }
     * 
     */
    public PagingData createPagingData() {
        return new PagingData();
    }

    /**
     * Create an instance of {@link FeatureProductVersion }
     * 
     */
    public FeatureProductVersion createFeatureProductVersion() {
        return new FeatureProductVersion();
    }

    /**
     * Create an instance of {@link ArrayOfSelectedStatisticsRequest }
     * 
     */
    public ArrayOfSelectedStatisticsRequest createArrayOfSelectedStatisticsRequest() {
        return new ArrayOfSelectedStatisticsRequest();
    }

    /**
     * Create an instance of {@link ArrayOfCurrentlyConsumedLicense }
     * 
     */
    public ArrayOfCurrentlyConsumedLicense createArrayOfCurrentlyConsumedLicense() {
        return new ArrayOfCurrentlyConsumedLicense();
    }

    /**
     * Create an instance of {@link SelectedStatisticsResponse }
     * 
     */
    public SelectedStatisticsResponse createSelectedStatisticsResponse() {
        return new SelectedStatisticsResponse();
    }

    /**
     * Create an instance of {@link CurrentlyConsumedLicense }
     * 
     */
    public CurrentlyConsumedLicense createCurrentlyConsumedLicense() {
        return new CurrentlyConsumedLicense();
    }

    /**
     * Create an instance of {@link ArrayOfSelectedStatisticsResponse }
     * 
     */
    public ArrayOfSelectedStatisticsResponse createArrayOfSelectedStatisticsResponse() {
        return new ArrayOfSelectedStatisticsResponse();
    }

    /**
     * Create an instance of {@link LicenseServerStatistics }
     * 
     */
    public LicenseServerStatistics createLicenseServerStatistics() {
        return new LicenseServerStatistics();
    }

    /**
     * Create an instance of {@link AlertRuleConditionParameters }
     * 
     */
    public AlertRuleConditionParameters createAlertRuleConditionParameters() {
        return new AlertRuleConditionParameters();
    }

    /**
     * Create an instance of {@link FeatureVendorServer }
     * 
     */
    public FeatureVendorServer createFeatureVendorServer() {
        return new FeatureVendorServer();
    }

    /**
     * Create an instance of {@link ArrayOfLicenseServerStatistics }
     * 
     */
    public ArrayOfLicenseServerStatistics createArrayOfLicenseServerStatistics() {
        return new ArrayOfLicenseServerStatistics();
    }

    /**
     * Create an instance of {@link FileFetchConfig }
     * 
     */
    public FileFetchConfig createFileFetchConfig() {
        return new FileFetchConfig();
    }

    /**
     * Create an instance of {@link SessionsAggregate }
     * 
     */
    public SessionsAggregate createSessionsAggregate() {
        return new SessionsAggregate();
    }

    /**
     * Create an instance of {@link ArrayOfAlertRuleConditionDefinition }
     * 
     */
    public ArrayOfAlertRuleConditionDefinition createArrayOfAlertRuleConditionDefinition() {
        return new ArrayOfAlertRuleConditionDefinition();
    }

    /**
     * Create an instance of {@link ArrayOfFeatureProductVersion }
     * 
     */
    public ArrayOfFeatureProductVersion createArrayOfFeatureProductVersion() {
        return new ArrayOfFeatureProductVersion();
    }

    /**
     * Create an instance of {@link ArrayOfLicenseStatistics }
     * 
     */
    public ArrayOfLicenseStatistics createArrayOfLicenseStatistics() {
        return new ArrayOfLicenseStatistics();
    }

    /**
     * Create an instance of {@link LicenseStatistics }
     * 
     */
    public LicenseStatistics createLicenseStatistics() {
        return new LicenseStatistics();
    }

    /**
     * Create an instance of {@link LicensesActivityRequest }
     * 
     */
    public LicensesActivityRequest createLicensesActivityRequest() {
        return new LicensesActivityRequest();
    }

    /**
     * Create an instance of {@link ArrayOfSessionsAggregate }
     * 
     */
    public ArrayOfSessionsAggregate createArrayOfSessionsAggregate() {
        return new ArrayOfSessionsAggregate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "DateLevel")
    public JAXBElement<DateLevel> createDateLevel(DateLevel value) {
        return new JAXBElement<DateLevel>(_DateLevel_QNAME, DateLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionalParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ConditionalParameter")
    public JAXBElement<ConditionalParameter> createConditionalParameter(ConditionalParameter value) {
        return new JAXBElement<ConditionalParameter>(_ConditionalParameter_QNAME, ConditionalParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureVendorServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureVendorServer")
    public JAXBElement<FeatureVendorServer> createFeatureVendorServer(FeatureVendorServer value) {
        return new JAXBElement<FeatureVendorServer>(_FeatureVendorServer_QNAME, FeatureVendorServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertConditionOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "AlertConditionOperator")
    public JAXBElement<AlertConditionOperator> createAlertConditionOperator(AlertConditionOperator value) {
        return new JAXBElement<AlertConditionOperator>(_AlertConditionOperator_QNAME, AlertConditionOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConditionalParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfConditionalParameter")
    public JAXBElement<ArrayOfConditionalParameter> createArrayOfConditionalParameter(ArrayOfConditionalParameter value) {
        return new JAXBElement<ArrayOfConditionalParameter>(_ArrayOfConditionalParameter_QNAME, ArrayOfConditionalParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfFeatureVendorServer")
    public JAXBElement<ArrayOfFeatureVendorServer> createArrayOfFeatureVendorServer(ArrayOfFeatureVendorServer value) {
        return new JAXBElement<ArrayOfFeatureVendorServer>(_ArrayOfFeatureVendorServer_QNAME, ArrayOfFeatureVendorServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfLicenseStatistics")
    public JAXBElement<ArrayOfLicenseStatistics> createArrayOfLicenseStatistics(ArrayOfLicenseStatistics value) {
        return new JAXBElement<ArrayOfLicenseStatistics>(_ArrayOfLicenseStatistics_QNAME, ArrayOfLicenseStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseServerStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseServerStatistics")
    public JAXBElement<LicenseServerStatistics> createLicenseServerStatistics(LicenseServerStatistics value) {
        return new JAXBElement<LicenseServerStatistics>(_LicenseServerStatistics_QNAME, LicenseServerStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseInfoRequest")
    public JAXBElement<LicenseInfoRequest> createLicenseInfoRequest(LicenseInfoRequest value) {
        return new JAXBElement<LicenseInfoRequest>(_LicenseInfoRequest_QNAME, LicenseInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageLicensesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "PackageLicensesRequest")
    public JAXBElement<PackageLicensesRequest> createPackageLicensesRequest(PackageLicensesRequest value) {
        return new JAXBElement<PackageLicensesRequest>(_PackageLicensesRequest_QNAME, PackageLicensesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesProcurementRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicensesProcurementRequest")
    public JAXBElement<LicensesProcurementRequest> createLicensesProcurementRequest(LicensesProcurementRequest value) {
        return new JAXBElement<LicensesProcurementRequest>(_LicensesProcurementRequest_QNAME, LicensesProcurementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCurrentlyConsumedLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfCurrentlyConsumedLicense")
    public JAXBElement<ArrayOfCurrentlyConsumedLicense> createArrayOfCurrentlyConsumedLicense(ArrayOfCurrentlyConsumedLicense value) {
        return new JAXBElement<ArrayOfCurrentlyConsumedLicense>(_ArrayOfCurrentlyConsumedLicense_QNAME, ArrayOfCurrentlyConsumedLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionsAggregate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SessionsAggregate")
    public JAXBElement<SessionsAggregate> createSessionsAggregate(SessionsAggregate value) {
        return new JAXBElement<SessionsAggregate>(_SessionsAggregate_QNAME, SessionsAggregate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesProcurementComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicensesProcurementComponentsRequest")
    public JAXBElement<LicensesProcurementComponentsRequest> createLicensesProcurementComponentsRequest(LicensesProcurementComponentsRequest value) {
        return new JAXBElement<LicensesProcurementComponentsRequest>(_LicensesProcurementComponentsRequest_QNAME, LicensesProcurementComponentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionRefresh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SessionRefresh")
    public JAXBElement<SessionRefresh> createSessionRefresh(SessionRefresh value) {
        return new JAXBElement<SessionRefresh>(_SessionRefresh_QNAME, SessionRefresh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagingData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "PagingData")
    public JAXBElement<PagingData> createPagingData(PagingData value) {
        return new JAXBElement<PagingData>(_PagingData_QNAME, PagingData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfLicenseActivity")
    public JAXBElement<ArrayOfLicenseActivity> createArrayOfLicenseActivity(ArrayOfLicenseActivity value) {
        return new JAXBElement<ArrayOfLicenseActivity>(_ArrayOfLicenseActivity_QNAME, ArrayOfLicenseActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogicalOperator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "LogicalOperator")
    public JAXBElement<LogicalOperator> createLogicalOperator(LogicalOperator value) {
        return new JAXBElement<LogicalOperator>(_LogicalOperator_QNAME, LogicalOperator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfSelectedStatisticsRequest")
    public JAXBElement<ArrayOfSelectedStatisticsRequest> createArrayOfSelectedStatisticsRequest(ArrayOfSelectedStatisticsRequest value) {
        return new JAXBElement<ArrayOfSelectedStatisticsRequest>(_ArrayOfSelectedStatisticsRequest_QNAME, ArrayOfSelectedStatisticsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseServerStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfLicenseServerStatistics")
    public JAXBElement<ArrayOfLicenseServerStatistics> createArrayOfLicenseServerStatistics(ArrayOfLicenseServerStatistics value) {
        return new JAXBElement<ArrayOfLicenseServerStatistics>(_ArrayOfLicenseServerStatistics_QNAME, ArrayOfLicenseServerStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleConditionParameters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AlertRuleConditionParameters")
    public JAXBElement<AlertRuleConditionParameters> createAlertRuleConditionParameters(AlertRuleConditionParameters value) {
        return new JAXBElement<AlertRuleConditionParameters>(_AlertRuleConditionParameters_QNAME, AlertRuleConditionParameters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertSeverity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "AlertSeverity")
    public JAXBElement<AlertSeverity> createAlertSeverity(AlertSeverity value) {
        return new JAXBElement<AlertSeverity>(_AlertSeverity_QNAME, AlertSeverity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseServerHostDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseServerHostDetails")
    public JAXBElement<LicenseServerHostDetails> createLicenseServerHostDetails(LicenseServerHostDetails value) {
        return new JAXBElement<LicenseServerHostDetails>(_LicenseServerHostDetails_QNAME, LicenseServerHostDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleDestinationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "AlertRuleDestinationType")
    public JAXBElement<AlertRuleDestinationType> createAlertRuleDestinationType(AlertRuleDestinationType value) {
        return new JAXBElement<AlertRuleDestinationType>(_AlertRuleDestinationType_QNAME, AlertRuleDestinationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicensesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "CurrentlyConsumedLicensesRequest")
    public JAXBElement<CurrentlyConsumedLicensesRequest> createCurrentlyConsumedLicensesRequest(CurrentlyConsumedLicensesRequest value) {
        return new JAXBElement<CurrentlyConsumedLicensesRequest>(_CurrentlyConsumedLicensesRequest_QNAME, CurrentlyConsumedLicensesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "UpdateAction")
    public JAXBElement<UpdateAction> createUpdateAction(UpdateAction value) {
        return new JAXBElement<UpdateAction>(_UpdateAction_QNAME, UpdateAction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentlyConsumedLicense }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "CurrentlyConsumedLicense")
    public JAXBElement<CurrentlyConsumedLicense> createCurrentlyConsumedLicense(CurrentlyConsumedLicense value) {
        return new JAXBElement<CurrentlyConsumedLicense>(_CurrentlyConsumedLicense_QNAME, CurrentlyConsumedLicense.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAlertRuleConditionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfAlertRuleConditionDefinition")
    public JAXBElement<ArrayOfAlertRuleConditionDefinition> createArrayOfAlertRuleConditionDefinition(ArrayOfAlertRuleConditionDefinition value) {
        return new JAXBElement<ArrayOfAlertRuleConditionDefinition>(_ArrayOfAlertRuleConditionDefinition_QNAME, ArrayOfAlertRuleConditionDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensesActivityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicensesActivityRequest")
    public JAXBElement<LicensesActivityRequest> createLicensesActivityRequest(LicensesActivityRequest value) {
        return new JAXBElement<LicensesActivityRequest>(_LicensesActivityRequest_QNAME, LicensesActivityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureProductVersion")
    public JAXBElement<FeatureProductVersion> createFeatureProductVersion(FeatureProductVersion value) {
        return new JAXBElement<FeatureProductVersion>(_FeatureProductVersion_QNAME, FeatureProductVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedStatisticsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SelectedStatisticsRequest")
    public JAXBElement<SelectedStatisticsRequest> createSelectedStatisticsRequest(SelectedStatisticsRequest value) {
        return new JAXBElement<SelectedStatisticsRequest>(_SelectedStatisticsRequest_QNAME, SelectedStatisticsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSelectedStatisticsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfSelectedStatisticsResponse")
    public JAXBElement<ArrayOfSelectedStatisticsResponse> createArrayOfSelectedStatisticsResponse(ArrayOfSelectedStatisticsResponse value) {
        return new JAXBElement<ArrayOfSelectedStatisticsResponse>(_ArrayOfSelectedStatisticsResponse_QNAME, ArrayOfSelectedStatisticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SelectedStatisticsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SelectedStatisticsResponse")
    public JAXBElement<SelectedStatisticsResponse> createSelectedStatisticsResponse(SelectedStatisticsResponse value) {
        return new JAXBElement<SelectedStatisticsResponse>(_SelectedStatisticsResponse_QNAME, SelectedStatisticsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSessionsAggregate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfSessionsAggregate")
    public JAXBElement<ArrayOfSessionsAggregate> createArrayOfSessionsAggregate(ArrayOfSessionsAggregate value) {
        return new JAXBElement<ArrayOfSessionsAggregate>(_ArrayOfSessionsAggregate_QNAME, ArrayOfSessionsAggregate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortDataCompletionStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "PortDataCompletionStatus")
    public JAXBElement<PortDataCompletionStatus> createPortDataCompletionStatus(PortDataCompletionStatus value) {
        return new JAXBElement<PortDataCompletionStatus>(_PortDataCompletionStatus_QNAME, PortDataCompletionStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileFetchConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FileFetchConfig")
    public JAXBElement<FileFetchConfig> createFileFetchConfig(FileFetchConfig value) {
        return new JAXBElement<FileFetchConfig>(_FileFetchConfig_QNAME, FileFetchConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseServerHostDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfLicenseServerHostDetails")
    public JAXBElement<ArrayOfLicenseServerHostDetails> createArrayOfLicenseServerHostDetails(ArrayOfLicenseServerHostDetails value) {
        return new JAXBElement<ArrayOfLicenseServerHostDetails>(_ArrayOfLicenseServerHostDetails_QNAME, ArrayOfLicenseServerHostDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "AlertRuleConditionType")
    public JAXBElement<AlertRuleConditionType> createAlertRuleConditionType(AlertRuleConditionType value) {
        return new JAXBElement<AlertRuleConditionType>(_AlertRuleConditionType_QNAME, AlertRuleConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfFeatureProductVersion")
    public JAXBElement<ArrayOfFeatureProductVersion> createArrayOfFeatureProductVersion(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_ArrayOfFeatureProductVersion_QNAME, ArrayOfFeatureProductVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseStatistics")
    public JAXBElement<LicenseStatistics> createLicenseStatistics(LicenseStatistics value) {
        return new JAXBElement<LicenseStatistics>(_LicenseStatistics_QNAME, LicenseStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Enums", name = "ExportContentType")
    public JAXBElement<ExportContentType> createExportContentType(ExportContentType value) {
        return new JAXBElement<ExportContentType>(_ExportContentType_QNAME, ExportContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertRuleConditionDefinition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AlertRuleConditionDefinition")
    public JAXBElement<AlertRuleConditionDefinition> createAlertRuleConditionDefinition(AlertRuleConditionDefinition value) {
        return new JAXBElement<AlertRuleConditionDefinition>(_AlertRuleConditionDefinition_QNAME, AlertRuleConditionDefinition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDateLevel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ArrayOfDateLevel")
    public JAXBElement<ArrayOfDateLevel> createArrayOfDateLevel(ArrayOfDateLevel value) {
        return new JAXBElement<ArrayOfDateLevel>(_ArrayOfDateLevel_QNAME, ArrayOfDateLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseActivity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseActivity")
    public JAXBElement<LicenseActivity> createLicenseActivity(LicenseActivity value) {
        return new JAXBElement<LicenseActivity>(_LicenseActivity_QNAME, LicenseActivity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SessionID", scope = SessionRefresh.class)
    public JAXBElement<String> createSessionRefreshSessionID(String value) {
        return new JAXBElement<String>(_SessionRefreshSessionID_QNAME, String.class, SessionRefresh.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostName", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsHostName(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsHostName_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "JavaVersion", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsJavaVersion(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsJavaVersion_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "BrokerVersion", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsBrokerVersion(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsBrokerVersion_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostTimeZone", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsHostTimeZone(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsHostTimeZone_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "PortStatus", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsPortStatus(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsPortStatus_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "BrokerInstallPath", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsBrokerInstallPath(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsBrokerInstallPath_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LmUptime", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsLmUptime(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsLmUptime_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "PortStatusSendTime", scope = LicenseServerHostDetails.class)
    public JAXBElement<XMLGregorianCalendar> createLicenseServerHostDetailsPortStatusSendTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicenseServerHostDetailsPortStatusSendTime_QNAME, XMLGregorianCalendar.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostLocalTime", scope = LicenseServerHostDetails.class)
    public JAXBElement<String> createLicenseServerHostDetailsHostLocalTime(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsHostLocalTime_QNAME, String.class, LicenseServerHostDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Name", scope = ConditionalParameter.class)
    public JAXBElement<String> createConditionalParameterName(String value) {
        return new JAXBElement<String>(_ConditionalParameterName_QNAME, String.class, ConditionalParameter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureName", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsFeatureName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsFeatureName_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsLicenseType(String value) {
        return new JAXBElement<String>(_LicenseStatisticsLicenseType_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "VendorString", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsVendorString(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVendorString_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "PackageID", scope = LicenseStatistics.class)
    public JAXBElement<Integer> createLicenseStatisticsPackageID(Integer value) {
        return new JAXBElement<Integer>(_LicenseStatisticsPackageID_QNAME, Integer.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Vendor", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsVendor(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVendor_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SortOrder", scope = LicenseStatistics.class)
    public JAXBElement<Integer> createLicenseStatisticsSortOrder(Integer value) {
        return new JAXBElement<Integer>(_LicenseStatisticsSortOrder_QNAME, Integer.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "NamedQuantity", scope = LicenseStatistics.class)
    public JAXBElement<Integer> createLicenseStatisticsNamedQuantity(Integer value) {
        return new JAXBElement<Integer>(_LicenseStatisticsNamedQuantity_QNAME, Integer.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostIds", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsHostIds(String value) {
        return new JAXBElement<String>(_LicenseStatisticsHostIds_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProductName", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsProductName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsProductName_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Server", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsServer(String value) {
        return new JAXBElement<String>(_LicenseStatisticsServer_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Version", scope = LicenseStatistics.class)
    public JAXBElement<String> createLicenseStatisticsVersion(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVersion_QNAME, String.class, LicenseStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Period", scope = SessionsAggregate.class)
    public JAXBElement<SlimDateTime> createSessionsAggregatePeriod(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_SessionsAggregatePeriod_QNAME, SlimDateTime.class, SessionsAggregate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Features", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createLicensesActivityRequestFeatures(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestFeatures_QNAME, ArrayOfFeatureProductVersion.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UserNames", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfstring> createLicensesActivityRequestUserNames(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_LicensesActivityRequestUserNames_QNAME, ArrayOfstring.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Vendor", scope = LicensesActivityRequest.class)
    public JAXBElement<String> createLicensesActivityRequestVendor(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVendor_QNAME, String.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseTypes", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfLicenseTypes> createLicensesActivityRequestLicenseTypes(ArrayOfLicenseTypes value) {
        return new JAXBElement<ArrayOfLicenseTypes>(_LicensesActivityRequestLicenseTypes_QNAME, ArrayOfLicenseTypes.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "StartTime", scope = LicensesActivityRequest.class)
    public JAXBElement<SlimDateTime> createLicensesActivityRequestStartTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicensesActivityRequestStartTime_QNAME, SlimDateTime.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProjectIDS", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfint> createLicensesActivityRequestProjectIDS(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LicensesActivityRequestProjectIDS_QNAME, ArrayOfint.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfstring> createLicensesActivityRequestAdditionalKey(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_LicenseStatisticsAdditionalKey_QNAME, ArrayOfstring.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerName", scope = LicensesActivityRequest.class)
    public JAXBElement<String> createLicensesActivityRequestServerName(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestServerName_QNAME, String.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "EndTime", scope = LicensesActivityRequest.class)
    public JAXBElement<SlimDateTime> createLicensesActivityRequestEndTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicensesActivityRequestEndTime_QNAME, SlimDateTime.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Products", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createLicensesActivityRequestProducts(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestProducts_QNAME, ArrayOfFeatureProductVersion.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Workstation", scope = LicensesActivityRequest.class)
    public JAXBElement<String> createLicensesActivityRequestWorkstation(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestWorkstation_QNAME, String.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "GroupIDS", scope = LicensesActivityRequest.class)
    public JAXBElement<ArrayOfint> createLicensesActivityRequestGroupIDS(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LicensesActivityRequestGroupIDS_QNAME, ArrayOfint.class, LicensesActivityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureName", scope = SelectedStatisticsRequest.class)
    public JAXBElement<String> createSelectedStatisticsRequestFeatureName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsFeatureName_QNAME, String.class, SelectedStatisticsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = SelectedStatisticsRequest.class)
    public JAXBElement<LicenseTypes> createSelectedStatisticsRequestLicenseType(LicenseTypes value) {
        return new JAXBElement<LicenseTypes>(_LicenseStatisticsLicenseType_QNAME, LicenseTypes.class, SelectedStatisticsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = SelectedStatisticsRequest.class)
    public JAXBElement<String> createSelectedStatisticsRequestAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, SelectedStatisticsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureVersion", scope = SelectedStatisticsRequest.class)
    public JAXBElement<String> createSelectedStatisticsRequestFeatureVersion(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestFeatureVersion_QNAME, String.class, SelectedStatisticsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerName", scope = SelectedStatisticsRequest.class)
    public JAXBElement<String> createSelectedStatisticsRequestServerName(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestServerName_QNAME, String.class, SelectedStatisticsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "VendorName", scope = SelectedStatisticsRequest.class)
    public JAXBElement<String> createSelectedStatisticsRequestVendorName(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestVendorName_QNAME, String.class, SelectedStatisticsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureName", scope = FeatureProductVersion.class)
    public JAXBElement<String> createFeatureProductVersionFeatureName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsFeatureName_QNAME, String.class, FeatureProductVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = FeatureProductVersion.class)
    public JAXBElement<LicenseTypes> createFeatureProductVersionLicenseType(LicenseTypes value) {
        return new JAXBElement<LicenseTypes>(_LicenseStatisticsLicenseType_QNAME, LicenseTypes.class, FeatureProductVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = FeatureProductVersion.class)
    public JAXBElement<String> createFeatureProductVersionAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, FeatureProductVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProductName", scope = FeatureProductVersion.class)
    public JAXBElement<String> createFeatureProductVersionProductName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsProductName_QNAME, String.class, FeatureProductVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Version", scope = FeatureProductVersion.class)
    public JAXBElement<String> createFeatureProductVersionVersion(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVersion_QNAME, String.class, FeatureProductVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Source", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivitySource(String value) {
        return new JAXBElement<String>(_LicenseActivitySource_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityFeatureName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsFeatureName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityLicenseType(String value) {
        return new JAXBElement<String>(_LicenseStatisticsLicenseType_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostId", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityHostId(String value) {
        return new JAXBElement<String>(_LicenseActivityHostId_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "TokenUsageTimeByFilter", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityTokenUsageTimeByFilter(String value) {
        return new JAXBElement<String>(_LicenseActivityTokenUsageTimeByFilter_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Vendor", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityVendor(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVendor_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Hostname", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityHostname(String value) {
        return new JAXBElement<String>(_LicenseActivityHostname_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "StartTime", scope = LicenseActivity.class)
    public JAXBElement<SlimDateTime> createLicenseActivityStartTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicensesActivityRequestStartTime_QNAME, SlimDateTime.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FirstName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityFirstName(String value) {
        return new JAXBElement<String>(_LicenseActivityFirstName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "IdleTime", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityIdleTime(String value) {
        return new JAXBElement<String>(_LicenseActivityIdleTime_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "IP", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityIP(String value) {
        return new JAXBElement<String>(_LicenseActivityIP_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "EndTime", scope = LicenseActivity.class)
    public JAXBElement<SlimDateTime> createLicenseActivityEndTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicensesActivityRequestEndTime_QNAME, SlimDateTime.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProductName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityProductName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsProductName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProjectName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityProjectName(String value) {
        return new JAXBElement<String>(_LicenseActivityProjectName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerDescription", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityServerDescription(String value) {
        return new JAXBElement<String>(_LicenseActivityServerDescription_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Email", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityEmail(String value) {
        return new JAXBElement<String>(_LicenseActivityEmail_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UserName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityUserName(String value) {
        return new JAXBElement<String>(_LicenseActivityUserName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "GroupName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityGroupName(String value) {
        return new JAXBElement<String>(_LicenseActivityGroupName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "TokenUsageTime", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityTokenUsageTime(String value) {
        return new JAXBElement<String>(_LicenseActivityTokenUsageTime_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LastName", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityLastName(String value) {
        return new JAXBElement<String>(_LicenseActivityLastName_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UsageTime", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityUsageTime(String value) {
        return new JAXBElement<String>(_LicenseActivityUsageTime_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureVersion", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityFeatureVersion(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestFeatureVersion_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UsageTimeByFilter", scope = LicenseActivity.class)
    public JAXBElement<String> createLicenseActivityUsageTimeByFilter(String value) {
        return new JAXBElement<String>(_LicenseActivityUsageTimeByFilter_QNAME, String.class, LicenseActivity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = LicenseServerStatistics.class)
    public JAXBElement<String> createLicenseServerStatisticsLicenseType(String value) {
        return new JAXBElement<String>(_LicenseStatisticsLicenseType_QNAME, String.class, LicenseServerStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerLM", scope = LicenseServerStatistics.class)
    public JAXBElement<String> createLicenseServerStatisticsServerLM(String value) {
        return new JAXBElement<String>(_LicenseServerStatisticsServerLM_QNAME, String.class, LicenseServerStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "TotalQuantity", scope = LicenseServerStatistics.class)
    public JAXBElement<Long> createLicenseServerStatisticsTotalQuantity(Long value) {
        return new JAXBElement<Long>(_LicenseServerStatisticsTotalQuantity_QNAME, Long.class, LicenseServerStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerDescription", scope = LicenseServerStatistics.class)
    public JAXBElement<String> createLicenseServerStatisticsServerDescription(String value) {
        return new JAXBElement<String>(_LicenseActivityServerDescription_QNAME, String.class, LicenseServerStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseServerHostDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Hosts", scope = LicenseServerStatistics.class)
    public JAXBElement<ArrayOfLicenseServerHostDetails> createLicenseServerStatisticsHosts(ArrayOfLicenseServerHostDetails value) {
        return new JAXBElement<ArrayOfLicenseServerHostDetails>(_LicenseServerStatisticsHosts_QNAME, ArrayOfLicenseServerHostDetails.class, LicenseServerStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseFeatureName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsFeatureName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseLicenseType(String value) {
        return new JAXBElement<String>(_LicenseStatisticsLicenseType_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Duration", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseDuration(String value) {
        return new JAXBElement<String>(_CurrentlyConsumedLicenseDuration_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Vendor", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseVendor(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVendor_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "StartTime", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<SlimDateTime> createCurrentlyConsumedLicenseStartTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicensesActivityRequestStartTime_QNAME, SlimDateTime.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FirstName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseFirstName(String value) {
        return new JAXBElement<String>(_LicenseActivityFirstName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "IdleTime", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseIdleTime(String value) {
        return new JAXBElement<String>(_LicenseActivityIdleTime_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "IP", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseIP(String value) {
        return new JAXBElement<String>(_LicenseActivityIP_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LingerDueDate", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseLingerDueDate(String value) {
        return new JAXBElement<String>(_CurrentlyConsumedLicenseLingerDueDate_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostIds", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseHostIds(String value) {
        return new JAXBElement<String>(_LicenseStatisticsHostIds_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProductName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseProductName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsProductName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProjectName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseProjectName(String value) {
        return new JAXBElement<String>(_LicenseActivityProjectName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Email", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseEmail(String value) {
        return new JAXBElement<String>(_LicenseActivityEmail_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UserName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseUserName(String value) {
        return new JAXBElement<String>(_LicenseActivityUserName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "GroupName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseGroupName(String value) {
        return new JAXBElement<String>(_LicenseActivityGroupName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "HostName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseHostName(String value) {
        return new JAXBElement<String>(_LicenseServerHostDetailsHostName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UserIdleTime", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseUserIdleTime(String value) {
        return new JAXBElement<String>(_CurrentlyConsumedLicenseUserIdleTime_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "RecentIdleTime", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseRecentIdleTime(String value) {
        return new JAXBElement<String>(_CurrentlyConsumedLicenseRecentIdleTime_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LastName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseLastName(String value) {
        return new JAXBElement<String>(_LicenseActivityLastName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "PhoneNumber", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicensePhoneNumber(String value) {
        return new JAXBElement<String>(_CurrentlyConsumedLicensePhoneNumber_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerName", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseServerName(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestServerName_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Version", scope = CurrentlyConsumedLicense.class)
    public JAXBElement<String> createCurrentlyConsumedLicenseVersion(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVersion_QNAME, String.class, CurrentlyConsumedLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "DownloadFileDirectory", scope = FileFetchConfig.class)
    public JAXBElement<String> createFileFetchConfigDownloadFileDirectory(String value) {
        return new JAXBElement<String>(_FileFetchConfigDownloadFileDirectory_QNAME, String.class, FileFetchConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FileFetchUrl", scope = FileFetchConfig.class)
    public JAXBElement<String> createFileFetchConfigFileFetchUrl(String value) {
        return new JAXBElement<String>(_FileFetchConfigFileFetchUrl_QNAME, String.class, FileFetchConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FileFetchTimeout", scope = FileFetchConfig.class)
    public JAXBElement<String> createFileFetchConfigFileFetchTimeout(String value) {
        return new JAXBElement<String>(_FileFetchConfigFileFetchTimeout_QNAME, String.class, FileFetchConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Features", scope = LicenseInfoRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createLicenseInfoRequestFeatures(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestFeatures_QNAME, ArrayOfFeatureProductVersion.class, LicenseInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseTypes", scope = LicenseInfoRequest.class)
    public JAXBElement<ArrayOfLicenseTypes> createLicenseInfoRequestLicenseTypes(ArrayOfLicenseTypes value) {
        return new JAXBElement<ArrayOfLicenseTypes>(_LicensesActivityRequestLicenseTypes_QNAME, ArrayOfLicenseTypes.class, LicenseInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = LicenseInfoRequest.class)
    public JAXBElement<ArrayOfstring> createLicenseInfoRequestAdditionalKey(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_LicenseStatisticsAdditionalKey_QNAME, ArrayOfstring.class, LicenseInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerName", scope = LicenseInfoRequest.class)
    public JAXBElement<String> createLicenseInfoRequestServerName(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestServerName_QNAME, String.class, LicenseInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Products", scope = LicenseInfoRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createLicenseInfoRequestProducts(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestProducts_QNAME, ArrayOfFeatureProductVersion.class, LicenseInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "VendorName", scope = LicenseInfoRequest.class)
    public JAXBElement<String> createLicenseInfoRequestVendorName(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestVendorName_QNAME, String.class, LicenseInfoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Date", scope = DateLevel.class)
    public JAXBElement<SlimDateTime> createDateLevelDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_DateLevelDate_QNAME, SlimDateTime.class, DateLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Direction", scope = PagingData.class)
    public JAXBElement<String> createPagingDataDirection(String value) {
        return new JAXBElement<String>(_PagingDataDirection_QNAME, String.class, PagingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Sort", scope = PagingData.class)
    public JAXBElement<ArrayOfstring> createPagingDataSort(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PagingDataSort_QNAME, ArrayOfstring.class, PagingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Search", scope = PagingData.class)
    public JAXBElement<String> createPagingDataSearch(String value) {
        return new JAXBElement<String>(_PagingDataSearch_QNAME, String.class, PagingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "SearchColumns", scope = PagingData.class)
    public JAXBElement<ArrayOfstring> createPagingDataSearchColumns(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_PagingDataSearchColumns_QNAME, ArrayOfstring.class, PagingData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AssetInfo", scope = LicensesProcurementRequest.class)
    public JAXBElement<String> createLicensesProcurementRequestAssetInfo(String value) {
        return new JAXBElement<String>(_LicensesProcurementRequestAssetInfo_QNAME, String.class, LicensesProcurementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ExpiresBefore", scope = LicensesProcurementRequest.class)
    public JAXBElement<SlimDateTime> createLicensesProcurementRequestExpiresBefore(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_LicensesProcurementRequestExpiresBefore_QNAME, SlimDateTime.class, LicensesProcurementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Features", scope = LicensesProcurementRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createLicensesProcurementRequestFeatures(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestFeatures_QNAME, ArrayOfFeatureProductVersion.class, LicensesProcurementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseTypes", scope = LicensesProcurementRequest.class)
    public JAXBElement<ArrayOfLicenseTypes> createLicensesProcurementRequestLicenseTypes(ArrayOfLicenseTypes value) {
        return new JAXBElement<ArrayOfLicenseTypes>(_LicensesActivityRequestLicenseTypes_QNAME, ArrayOfLicenseTypes.class, LicensesProcurementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "VendorName", scope = LicensesProcurementRequest.class)
    public JAXBElement<String> createLicensesProcurementRequestVendorName(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestVendorName_QNAME, String.class, LicensesProcurementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureVendorServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Features", scope = AlertRuleConditionParameters.class)
    public JAXBElement<ArrayOfFeatureVendorServer> createAlertRuleConditionParametersFeatures(ArrayOfFeatureVendorServer value) {
        return new JAXBElement<ArrayOfFeatureVendorServer>(_LicensesActivityRequestFeatures_QNAME, ArrayOfFeatureVendorServer.class, AlertRuleConditionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Users", scope = AlertRuleConditionParameters.class)
    public JAXBElement<ArrayOfstring> createAlertRuleConditionParametersUsers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AlertRuleConditionParametersUsers_QNAME, ArrayOfstring.class, AlertRuleConditionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfConditionalParameter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ConditionalParams", scope = AlertRuleConditionParameters.class)
    public JAXBElement<ArrayOfConditionalParameter> createAlertRuleConditionParametersConditionalParams(ArrayOfConditionalParameter value) {
        return new JAXBElement<ArrayOfConditionalParameter>(_AlertRuleConditionParametersConditionalParams_QNAME, ArrayOfConditionalParameter.class, AlertRuleConditionParameters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureName", scope = SelectedStatisticsResponse.class)
    public JAXBElement<String> createSelectedStatisticsResponseFeatureName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsFeatureName_QNAME, String.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UsedLicenses", scope = SelectedStatisticsResponse.class)
    public JAXBElement<Long> createSelectedStatisticsResponseUsedLicenses(Long value) {
        return new JAXBElement<Long>(_SelectedStatisticsResponseUsedLicenses_QNAME, Long.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "BorrowUsage", scope = SelectedStatisticsResponse.class)
    public JAXBElement<Double> createSelectedStatisticsResponseBorrowUsage(Double value) {
        return new JAXBElement<Double>(_SelectedStatisticsResponseBorrowUsage_QNAME, Double.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Quantity", scope = SelectedStatisticsResponse.class)
    public JAXBElement<Long> createSelectedStatisticsResponseQuantity(Long value) {
        return new JAXBElement<Long>(_SelectedStatisticsResponseQuantity_QNAME, Long.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = SelectedStatisticsResponse.class)
    public JAXBElement<String> createSelectedStatisticsResponseAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "BorrowedLicenses", scope = SelectedStatisticsResponse.class)
    public JAXBElement<Long> createSelectedStatisticsResponseBorrowedLicenses(Long value) {
        return new JAXBElement<Long>(_SelectedStatisticsResponseBorrowedLicenses_QNAME, Long.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "FeatureVersion", scope = SelectedStatisticsResponse.class)
    public JAXBElement<String> createSelectedStatisticsResponseFeatureVersion(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestFeatureVersion_QNAME, String.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerName", scope = SelectedStatisticsResponse.class)
    public JAXBElement<String> createSelectedStatisticsResponseServerName(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestServerName_QNAME, String.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ProductName", scope = SelectedStatisticsResponse.class)
    public JAXBElement<String> createSelectedStatisticsResponseProductName(String value) {
        return new JAXBElement<String>(_LicenseStatisticsProductName_QNAME, String.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Usage", scope = SelectedStatisticsResponse.class)
    public JAXBElement<Double> createSelectedStatisticsResponseUsage(Double value) {
        return new JAXBElement<Double>(_SelectedStatisticsResponseUsage_QNAME, Double.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "VendorName", scope = SelectedStatisticsResponse.class)
    public JAXBElement<String> createSelectedStatisticsResponseVendorName(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestVendorName_QNAME, String.class, SelectedStatisticsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "UserIDs", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<ArrayOfint> createCurrentlyConsumedLicensesRequestUserIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_CurrentlyConsumedLicensesRequestUserIDs_QNAME, ArrayOfint.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Features", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createCurrentlyConsumedLicensesRequestFeatures(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestFeatures_QNAME, ArrayOfFeatureProductVersion.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseTypes", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<ArrayOfLicenseTypes> createCurrentlyConsumedLicensesRequestLicenseTypes(ArrayOfLicenseTypes value) {
        return new JAXBElement<ArrayOfLicenseTypes>(_LicensesActivityRequestLicenseTypes_QNAME, ArrayOfLicenseTypes.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<ArrayOfstring> createCurrentlyConsumedLicensesRequestAdditionalKey(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_LicenseStatisticsAdditionalKey_QNAME, ArrayOfstring.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "ServerName", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<String> createCurrentlyConsumedLicensesRequestServerName(String value) {
        return new JAXBElement<String>(_LicensesActivityRequestServerName_QNAME, String.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFeatureProductVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Products", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<ArrayOfFeatureProductVersion> createCurrentlyConsumedLicensesRequestProducts(ArrayOfFeatureProductVersion value) {
        return new JAXBElement<ArrayOfFeatureProductVersion>(_LicensesActivityRequestProducts_QNAME, ArrayOfFeatureProductVersion.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "VendorName", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<String> createCurrentlyConsumedLicensesRequestVendorName(String value) {
        return new JAXBElement<String>(_SelectedStatisticsRequestVendorName_QNAME, String.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "GroupIDS", scope = CurrentlyConsumedLicensesRequest.class)
    public JAXBElement<ArrayOfint> createCurrentlyConsumedLicensesRequestGroupIDS(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_LicensesActivityRequestGroupIDS_QNAME, ArrayOfint.class, CurrentlyConsumedLicensesRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "LicenseType", scope = FeatureVendorServer.class)
    public JAXBElement<LicenseTypes> createFeatureVendorServerLicenseType(LicenseTypes value) {
        return new JAXBElement<LicenseTypes>(_LicenseStatisticsLicenseType_QNAME, LicenseTypes.class, FeatureVendorServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Feature", scope = FeatureVendorServer.class)
    public JAXBElement<String> createFeatureVendorServerFeature(String value) {
        return new JAXBElement<String>(_FeatureVendorServerFeature_QNAME, String.class, FeatureVendorServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Vendor", scope = FeatureVendorServer.class)
    public JAXBElement<String> createFeatureVendorServerVendor(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVendor_QNAME, String.class, FeatureVendorServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "AdditionalKey", scope = FeatureVendorServer.class)
    public JAXBElement<String> createFeatureVendorServerAdditionalKey(String value) {
        return new JAXBElement<String>(_LicenseStatisticsAdditionalKey_QNAME, String.class, FeatureVendorServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Server", scope = FeatureVendorServer.class)
    public JAXBElement<String> createFeatureVendorServerServer(String value) {
        return new JAXBElement<String>(_LicenseStatisticsServer_QNAME, String.class, FeatureVendorServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.VO", name = "Version", scope = FeatureVendorServer.class)
    public JAXBElement<String> createFeatureVendorServerVersion(String value) {
        return new JAXBElement<String>(_LicenseStatisticsVersion_QNAME, String.class, FeatureVendorServer.class, value);
    }

}

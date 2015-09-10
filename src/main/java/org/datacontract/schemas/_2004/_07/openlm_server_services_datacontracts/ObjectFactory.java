
package org.datacontract.schemas._2004._07.openlm_server_services_datacontracts;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.openlm_shared.SlimDateTime;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.openlm_server_services_datacontracts package. 
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

    private final static QName _ArrayOfRouteInstructionDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfRouteInstructionDisplay");
    private final static QName _RouterMonitoringResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterMonitoringResponse");
    private final static QName _ArrayOfRouterPortStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfRouterPortStatistics");
    private final static QName _RouterPortStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterPortStatistics");
    private final static QName _ArrayOfLimitPeriod_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfLimitPeriod");
    private final static QName _ArrayOfRouterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfRouterInfo");
    private final static QName _ImportRouteInstructionsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ImportRouteInstructionsRequest");
    private final static QName _RouterMonitoringRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterMonitoringRequest");
    private final static QName _ArrayOfRouterGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfRouterGroup");
    private final static QName _ArrayOfRouterGroupMonitoring_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfRouterGroupMonitoring");
    private final static QName _LimitPeriod_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "LimitPeriod");
    private final static QName _RouterMonitoringDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterMonitoringDetails");
    private final static QName _RouterGroupsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroupsRequest");
    private final static QName _RouterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterInfo");
    private final static QName _RouterGroupsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroupsResponse");
    private final static QName _RouteInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouteInstruction");
    private final static QName _RouterDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterDetails");
    private final static QName _RouterConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterConfig");
    private final static QName _ArrayOfRouterMonitoringDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ArrayOfRouterMonitoringDetails");
    private final static QName _RouterGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroup");
    private final static QName _RouterGroupMonitoring_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroupMonitoring");
    private final static QName _RouteInstructionDisplay_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouteInstructionDisplay");
    private final static QName _UpdateRouterGroupsAndComponentsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "UpdateRouterGroupsAndComponentsRequest");
    private final static QName _ExportRouteInstructionsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ExportRouteInstructionsRequest");
    private final static QName _RouterGroupMonitoringRoutersMonitoringDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RoutersMonitoringDetails");
    private final static QName _RouterGroupMonitoringRouterGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroupName");
    private final static QName _RouterGroupMonitoringRouterDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterDescription");
    private final static QName _RouteInstructionTargetHost_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "TargetHost");
    private final static QName _RouteInstructionClientIPStart_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ClientIPStart");
    private final static QName _RouteInstructionTargetPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "TargetPort");
    private final static QName _RouteInstructionClientIPEnd_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ClientIPEnd");
    private final static QName _RouteInstructionListenerPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ListenerPort");
    private final static QName _RouteInstructionLimitPeriods_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "LimitPeriods");
    private final static QName _RouterInfoConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Config");
    private final static QName _RouterInfoDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Description");
    private final static QName _RouterInfoDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Details");
    private final static QName _RouterInfoConfiguredDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ConfiguredDate");
    private final static QName _RouterMonitoringDetailsRouteInstructionsLastApplied_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouteInstructionsLastApplied");
    private final static QName _RouterMonitoringDetailsLoadInTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "LoadInTimestamp");
    private final static QName _RouterMonitoringDetailsRouteInstructionsLastSent_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouteInstructionsLastSent");
    private final static QName _RouterMonitoringDetailsLastKeepAliveDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "LastKeepAliveDate");
    private final static QName _RouterMonitoringDetailsLastRestarted_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "LastRestarted");
    private final static QName _RouterMonitoringDetailsMachineTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "MachineTime");
    private final static QName _RouterMonitoringDetailsPortsStatistics_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "PortsStatistics");
    private final static QName _RouterMonitoringDetailsLastActivityDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "LastActivityDate");
    private final static QName _RouterMonitoringResponseRouterGroupMonitors_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroupMonitors");
    private final static QName _UpdateRouterGroupsAndComponentsRequestUpdatedGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "UpdatedGroups");
    private final static QName _RouterDetailsIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "IP");
    private final static QName _RouterDetailsVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Version");
    private final static QName _RouterDetailsHostname_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Hostname");
    private final static QName _RouterMonitoringRequestRouterIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterIDs");
    private final static QName _RouterMonitoringRequestGroupIDs_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "GroupIDs");
    private final static QName _ImportRouteInstructionsRequestFileContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "FileContent");
    private final static QName _LimitPeriodEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "EndTime");
    private final static QName _LimitPeriodStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "StartTime");
    private final static QName _RouterPortStatisticsTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Timestamp");
    private final static QName _RouterPortStatisticsErrorMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "ErrorMsg");
    private final static QName _RouterGroupRouters_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Routers");
    private final static QName _RouterGroupRouteInstructions_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouteInstructions");
    private final static QName _RouterGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "Name");
    private final static QName _RouterGroupsResponseRouterGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", "RouterGroups");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.openlm_server_services_datacontracts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateRouterGroupsAndComponentsRequest }
     * 
     */
    public UpdateRouterGroupsAndComponentsRequest createUpdateRouterGroupsAndComponentsRequest() {
        return new UpdateRouterGroupsAndComponentsRequest();
    }

    /**
     * Create an instance of {@link ExportRouteInstructionsRequest }
     * 
     */
    public ExportRouteInstructionsRequest createExportRouteInstructionsRequest() {
        return new ExportRouteInstructionsRequest();
    }

    /**
     * Create an instance of {@link RouterMonitoringRequest }
     * 
     */
    public RouterMonitoringRequest createRouterMonitoringRequest() {
        return new RouterMonitoringRequest();
    }

    /**
     * Create an instance of {@link RouterMonitoringResponse }
     * 
     */
    public RouterMonitoringResponse createRouterMonitoringResponse() {
        return new RouterMonitoringResponse();
    }

    /**
     * Create an instance of {@link RouterGroupsResponse }
     * 
     */
    public RouterGroupsResponse createRouterGroupsResponse() {
        return new RouterGroupsResponse();
    }

    /**
     * Create an instance of {@link ImportRouteInstructionsRequest }
     * 
     */
    public ImportRouteInstructionsRequest createImportRouteInstructionsRequest() {
        return new ImportRouteInstructionsRequest();
    }

    /**
     * Create an instance of {@link RouterGroupsRequest }
     * 
     */
    public RouterGroupsRequest createRouterGroupsRequest() {
        return new RouterGroupsRequest();
    }

    /**
     * Create an instance of {@link RouterMonitoringDetails }
     * 
     */
    public RouterMonitoringDetails createRouterMonitoringDetails() {
        return new RouterMonitoringDetails();
    }

    /**
     * Create an instance of {@link LimitPeriod }
     * 
     */
    public LimitPeriod createLimitPeriod() {
        return new LimitPeriod();
    }

    /**
     * Create an instance of {@link ArrayOfRouterInfo }
     * 
     */
    public ArrayOfRouterInfo createArrayOfRouterInfo() {
        return new ArrayOfRouterInfo();
    }

    /**
     * Create an instance of {@link RouterInfo }
     * 
     */
    public RouterInfo createRouterInfo() {
        return new RouterInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRouterMonitoringDetails }
     * 
     */
    public ArrayOfRouterMonitoringDetails createArrayOfRouterMonitoringDetails() {
        return new ArrayOfRouterMonitoringDetails();
    }

    /**
     * Create an instance of {@link RouterPortStatistics }
     * 
     */
    public RouterPortStatistics createRouterPortStatistics() {
        return new RouterPortStatistics();
    }

    /**
     * Create an instance of {@link RouterConfig }
     * 
     */
    public RouterConfig createRouterConfig() {
        return new RouterConfig();
    }

    /**
     * Create an instance of {@link ArrayOfRouterGroup }
     * 
     */
    public ArrayOfRouterGroup createArrayOfRouterGroup() {
        return new ArrayOfRouterGroup();
    }

    /**
     * Create an instance of {@link RouterGroup }
     * 
     */
    public RouterGroup createRouterGroup() {
        return new RouterGroup();
    }

    /**
     * Create an instance of {@link ArrayOfRouteInstructionDisplay }
     * 
     */
    public ArrayOfRouteInstructionDisplay createArrayOfRouteInstructionDisplay() {
        return new ArrayOfRouteInstructionDisplay();
    }

    /**
     * Create an instance of {@link RouteInstruction }
     * 
     */
    public RouteInstruction createRouteInstruction() {
        return new RouteInstruction();
    }

    /**
     * Create an instance of {@link ArrayOfRouterPortStatistics }
     * 
     */
    public ArrayOfRouterPortStatistics createArrayOfRouterPortStatistics() {
        return new ArrayOfRouterPortStatistics();
    }

    /**
     * Create an instance of {@link RouterDetails }
     * 
     */
    public RouterDetails createRouterDetails() {
        return new RouterDetails();
    }

    /**
     * Create an instance of {@link ArrayOfRouterGroupMonitoring }
     * 
     */
    public ArrayOfRouterGroupMonitoring createArrayOfRouterGroupMonitoring() {
        return new ArrayOfRouterGroupMonitoring();
    }

    /**
     * Create an instance of {@link ArrayOfLimitPeriod }
     * 
     */
    public ArrayOfLimitPeriod createArrayOfLimitPeriod() {
        return new ArrayOfLimitPeriod();
    }

    /**
     * Create an instance of {@link RouterGroupMonitoring }
     * 
     */
    public RouterGroupMonitoring createRouterGroupMonitoring() {
        return new RouterGroupMonitoring();
    }

    /**
     * Create an instance of {@link RouteInstructionDisplay }
     * 
     */
    public RouteInstructionDisplay createRouteInstructionDisplay() {
        return new RouteInstructionDisplay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteInstructionDisplay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfRouteInstructionDisplay")
    public JAXBElement<ArrayOfRouteInstructionDisplay> createArrayOfRouteInstructionDisplay(ArrayOfRouteInstructionDisplay value) {
        return new JAXBElement<ArrayOfRouteInstructionDisplay>(_ArrayOfRouteInstructionDisplay_QNAME, ArrayOfRouteInstructionDisplay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterMonitoringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterMonitoringResponse")
    public JAXBElement<RouterMonitoringResponse> createRouterMonitoringResponse(RouterMonitoringResponse value) {
        return new JAXBElement<RouterMonitoringResponse>(_RouterMonitoringResponse_QNAME, RouterMonitoringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterPortStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfRouterPortStatistics")
    public JAXBElement<ArrayOfRouterPortStatistics> createArrayOfRouterPortStatistics(ArrayOfRouterPortStatistics value) {
        return new JAXBElement<ArrayOfRouterPortStatistics>(_ArrayOfRouterPortStatistics_QNAME, ArrayOfRouterPortStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterPortStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterPortStatistics")
    public JAXBElement<RouterPortStatistics> createRouterPortStatistics(RouterPortStatistics value) {
        return new JAXBElement<RouterPortStatistics>(_RouterPortStatistics_QNAME, RouterPortStatistics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLimitPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfLimitPeriod")
    public JAXBElement<ArrayOfLimitPeriod> createArrayOfLimitPeriod(ArrayOfLimitPeriod value) {
        return new JAXBElement<ArrayOfLimitPeriod>(_ArrayOfLimitPeriod_QNAME, ArrayOfLimitPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfRouterInfo")
    public JAXBElement<ArrayOfRouterInfo> createArrayOfRouterInfo(ArrayOfRouterInfo value) {
        return new JAXBElement<ArrayOfRouterInfo>(_ArrayOfRouterInfo_QNAME, ArrayOfRouterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportRouteInstructionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ImportRouteInstructionsRequest")
    public JAXBElement<ImportRouteInstructionsRequest> createImportRouteInstructionsRequest(ImportRouteInstructionsRequest value) {
        return new JAXBElement<ImportRouteInstructionsRequest>(_ImportRouteInstructionsRequest_QNAME, ImportRouteInstructionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterMonitoringRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterMonitoringRequest")
    public JAXBElement<RouterMonitoringRequest> createRouterMonitoringRequest(RouterMonitoringRequest value) {
        return new JAXBElement<RouterMonitoringRequest>(_RouterMonitoringRequest_QNAME, RouterMonitoringRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfRouterGroup")
    public JAXBElement<ArrayOfRouterGroup> createArrayOfRouterGroup(ArrayOfRouterGroup value) {
        return new JAXBElement<ArrayOfRouterGroup>(_ArrayOfRouterGroup_QNAME, ArrayOfRouterGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterGroupMonitoring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfRouterGroupMonitoring")
    public JAXBElement<ArrayOfRouterGroupMonitoring> createArrayOfRouterGroupMonitoring(ArrayOfRouterGroupMonitoring value) {
        return new JAXBElement<ArrayOfRouterGroupMonitoring>(_ArrayOfRouterGroupMonitoring_QNAME, ArrayOfRouterGroupMonitoring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimitPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "LimitPeriod")
    public JAXBElement<LimitPeriod> createLimitPeriod(LimitPeriod value) {
        return new JAXBElement<LimitPeriod>(_LimitPeriod_QNAME, LimitPeriod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterMonitoringDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterMonitoringDetails")
    public JAXBElement<RouterMonitoringDetails> createRouterMonitoringDetails(RouterMonitoringDetails value) {
        return new JAXBElement<RouterMonitoringDetails>(_RouterMonitoringDetails_QNAME, RouterMonitoringDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterGroupsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroupsRequest")
    public JAXBElement<RouterGroupsRequest> createRouterGroupsRequest(RouterGroupsRequest value) {
        return new JAXBElement<RouterGroupsRequest>(_RouterGroupsRequest_QNAME, RouterGroupsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterInfo")
    public JAXBElement<RouterInfo> createRouterInfo(RouterInfo value) {
        return new JAXBElement<RouterInfo>(_RouterInfo_QNAME, RouterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroupsResponse")
    public JAXBElement<RouterGroupsResponse> createRouterGroupsResponse(RouterGroupsResponse value) {
        return new JAXBElement<RouterGroupsResponse>(_RouterGroupsResponse_QNAME, RouterGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteInstruction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouteInstruction")
    public JAXBElement<RouteInstruction> createRouteInstruction(RouteInstruction value) {
        return new JAXBElement<RouteInstruction>(_RouteInstruction_QNAME, RouteInstruction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterDetails")
    public JAXBElement<RouterDetails> createRouterDetails(RouterDetails value) {
        return new JAXBElement<RouterDetails>(_RouterDetails_QNAME, RouterDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterConfig")
    public JAXBElement<RouterConfig> createRouterConfig(RouterConfig value) {
        return new JAXBElement<RouterConfig>(_RouterConfig_QNAME, RouterConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterMonitoringDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ArrayOfRouterMonitoringDetails")
    public JAXBElement<ArrayOfRouterMonitoringDetails> createArrayOfRouterMonitoringDetails(ArrayOfRouterMonitoringDetails value) {
        return new JAXBElement<ArrayOfRouterMonitoringDetails>(_ArrayOfRouterMonitoringDetails_QNAME, ArrayOfRouterMonitoringDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroup")
    public JAXBElement<RouterGroup> createRouterGroup(RouterGroup value) {
        return new JAXBElement<RouterGroup>(_RouterGroup_QNAME, RouterGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterGroupMonitoring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroupMonitoring")
    public JAXBElement<RouterGroupMonitoring> createRouterGroupMonitoring(RouterGroupMonitoring value) {
        return new JAXBElement<RouterGroupMonitoring>(_RouterGroupMonitoring_QNAME, RouterGroupMonitoring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteInstructionDisplay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouteInstructionDisplay")
    public JAXBElement<RouteInstructionDisplay> createRouteInstructionDisplay(RouteInstructionDisplay value) {
        return new JAXBElement<RouteInstructionDisplay>(_RouteInstructionDisplay_QNAME, RouteInstructionDisplay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRouterGroupsAndComponentsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "UpdateRouterGroupsAndComponentsRequest")
    public JAXBElement<UpdateRouterGroupsAndComponentsRequest> createUpdateRouterGroupsAndComponentsRequest(UpdateRouterGroupsAndComponentsRequest value) {
        return new JAXBElement<UpdateRouterGroupsAndComponentsRequest>(_UpdateRouterGroupsAndComponentsRequest_QNAME, UpdateRouterGroupsAndComponentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportRouteInstructionsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ExportRouteInstructionsRequest")
    public JAXBElement<ExportRouteInstructionsRequest> createExportRouteInstructionsRequest(ExportRouteInstructionsRequest value) {
        return new JAXBElement<ExportRouteInstructionsRequest>(_ExportRouteInstructionsRequest_QNAME, ExportRouteInstructionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterMonitoringDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RoutersMonitoringDetails", scope = RouterGroupMonitoring.class)
    public JAXBElement<ArrayOfRouterMonitoringDetails> createRouterGroupMonitoringRoutersMonitoringDetails(ArrayOfRouterMonitoringDetails value) {
        return new JAXBElement<ArrayOfRouterMonitoringDetails>(_RouterGroupMonitoringRoutersMonitoringDetails_QNAME, ArrayOfRouterMonitoringDetails.class, RouterGroupMonitoring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroupName", scope = RouterGroupMonitoring.class)
    public JAXBElement<String> createRouterGroupMonitoringRouterGroupName(String value) {
        return new JAXBElement<String>(_RouterGroupMonitoringRouterGroupName_QNAME, String.class, RouterGroupMonitoring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterDescription", scope = RouterGroupMonitoring.class)
    public JAXBElement<String> createRouterGroupMonitoringRouterDescription(String value) {
        return new JAXBElement<String>(_RouterGroupMonitoringRouterDescription_QNAME, String.class, RouterGroupMonitoring.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "TargetHost", scope = RouteInstruction.class)
    public JAXBElement<String> createRouteInstructionTargetHost(String value) {
        return new JAXBElement<String>(_RouteInstructionTargetHost_QNAME, String.class, RouteInstruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ClientIPStart", scope = RouteInstruction.class)
    public JAXBElement<String> createRouteInstructionClientIPStart(String value) {
        return new JAXBElement<String>(_RouteInstructionClientIPStart_QNAME, String.class, RouteInstruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "TargetPort", scope = RouteInstruction.class)
    public JAXBElement<String> createRouteInstructionTargetPort(String value) {
        return new JAXBElement<String>(_RouteInstructionTargetPort_QNAME, String.class, RouteInstruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ClientIPEnd", scope = RouteInstruction.class)
    public JAXBElement<String> createRouteInstructionClientIPEnd(String value) {
        return new JAXBElement<String>(_RouteInstructionClientIPEnd_QNAME, String.class, RouteInstruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ListenerPort", scope = RouteInstruction.class)
    public JAXBElement<String> createRouteInstructionListenerPort(String value) {
        return new JAXBElement<String>(_RouteInstructionListenerPort_QNAME, String.class, RouteInstruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLimitPeriod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "LimitPeriods", scope = RouteInstruction.class)
    public JAXBElement<ArrayOfLimitPeriod> createRouteInstructionLimitPeriods(ArrayOfLimitPeriod value) {
        return new JAXBElement<ArrayOfLimitPeriod>(_RouteInstructionLimitPeriods_QNAME, ArrayOfLimitPeriod.class, RouteInstruction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Config", scope = RouterInfo.class)
    public JAXBElement<RouterConfig> createRouterInfoConfig(RouterConfig value) {
        return new JAXBElement<RouterConfig>(_RouterInfoConfig_QNAME, RouterConfig.class, RouterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Description", scope = RouterInfo.class)
    public JAXBElement<String> createRouterInfoDescription(String value) {
        return new JAXBElement<String>(_RouterInfoDescription_QNAME, String.class, RouterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Details", scope = RouterInfo.class)
    public JAXBElement<RouterDetails> createRouterInfoDetails(RouterDetails value) {
        return new JAXBElement<RouterDetails>(_RouterInfoDetails_QNAME, RouterDetails.class, RouterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ConfiguredDate", scope = RouterInfo.class)
    public JAXBElement<SlimDateTime> createRouterInfoConfiguredDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterInfoConfiguredDate_QNAME, SlimDateTime.class, RouterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouteInstructionsLastApplied", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsRouteInstructionsLastApplied(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsRouteInstructionsLastApplied_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Description", scope = RouterMonitoringDetails.class)
    public JAXBElement<String> createRouterMonitoringDetailsDescription(String value) {
        return new JAXBElement<String>(_RouterInfoDescription_QNAME, String.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "LoadInTimestamp", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsLoadInTimestamp(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsLoadInTimestamp_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouteInstructionsLastSent", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsRouteInstructionsLastSent(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsRouteInstructionsLastSent_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "LastKeepAliveDate", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsLastKeepAliveDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsLastKeepAliveDate_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "LastRestarted", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsLastRestarted(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsLastRestarted_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterConfig }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterConfig", scope = RouterMonitoringDetails.class)
    public JAXBElement<RouterConfig> createRouterMonitoringDetailsRouterConfig(RouterConfig value) {
        return new JAXBElement<RouterConfig>(_RouterConfig_QNAME, RouterConfig.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "MachineTime", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsMachineTime(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsMachineTime_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouterDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterDetails", scope = RouterMonitoringDetails.class)
    public JAXBElement<RouterDetails> createRouterMonitoringDetailsRouterDetails(RouterDetails value) {
        return new JAXBElement<RouterDetails>(_RouterDetails_QNAME, RouterDetails.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterPortStatistics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "PortsStatistics", scope = RouterMonitoringDetails.class)
    public JAXBElement<ArrayOfRouterPortStatistics> createRouterMonitoringDetailsPortsStatistics(ArrayOfRouterPortStatistics value) {
        return new JAXBElement<ArrayOfRouterPortStatistics>(_RouterMonitoringDetailsPortsStatistics_QNAME, ArrayOfRouterPortStatistics.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "LastActivityDate", scope = RouterMonitoringDetails.class)
    public JAXBElement<SlimDateTime> createRouterMonitoringDetailsLastActivityDate(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterMonitoringDetailsLastActivityDate_QNAME, SlimDateTime.class, RouterMonitoringDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterGroupMonitoring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroupMonitors", scope = RouterMonitoringResponse.class)
    public JAXBElement<ArrayOfRouterGroupMonitoring> createRouterMonitoringResponseRouterGroupMonitors(ArrayOfRouterGroupMonitoring value) {
        return new JAXBElement<ArrayOfRouterGroupMonitoring>(_RouterMonitoringResponseRouterGroupMonitors_QNAME, ArrayOfRouterGroupMonitoring.class, RouterMonitoringResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "UpdatedGroups", scope = UpdateRouterGroupsAndComponentsRequest.class)
    public JAXBElement<ArrayOfRouterGroup> createUpdateRouterGroupsAndComponentsRequestUpdatedGroups(ArrayOfRouterGroup value) {
        return new JAXBElement<ArrayOfRouterGroup>(_UpdateRouterGroupsAndComponentsRequestUpdatedGroups_QNAME, ArrayOfRouterGroup.class, UpdateRouterGroupsAndComponentsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "IP", scope = RouterDetails.class)
    public JAXBElement<String> createRouterDetailsIP(String value) {
        return new JAXBElement<String>(_RouterDetailsIP_QNAME, String.class, RouterDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Version", scope = RouterDetails.class)
    public JAXBElement<String> createRouterDetailsVersion(String value) {
        return new JAXBElement<String>(_RouterDetailsVersion_QNAME, String.class, RouterDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Hostname", scope = RouterDetails.class)
    public JAXBElement<String> createRouterDetailsHostname(String value) {
        return new JAXBElement<String>(_RouterDetailsHostname_QNAME, String.class, RouterDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "IP", scope = RouterMonitoringRequest.class)
    public JAXBElement<String> createRouterMonitoringRequestIP(String value) {
        return new JAXBElement<String>(_RouterDetailsIP_QNAME, String.class, RouterMonitoringRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Version", scope = RouterMonitoringRequest.class)
    public JAXBElement<String> createRouterMonitoringRequestVersion(String value) {
        return new JAXBElement<String>(_RouterDetailsVersion_QNAME, String.class, RouterMonitoringRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterIDs", scope = RouterMonitoringRequest.class)
    public JAXBElement<ArrayOfint> createRouterMonitoringRequestRouterIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_RouterMonitoringRequestRouterIDs_QNAME, ArrayOfint.class, RouterMonitoringRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "GroupIDs", scope = RouterMonitoringRequest.class)
    public JAXBElement<ArrayOfint> createRouterMonitoringRequestGroupIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_RouterMonitoringRequestGroupIDs_QNAME, ArrayOfint.class, RouterMonitoringRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Hostname", scope = RouterMonitoringRequest.class)
    public JAXBElement<String> createRouterMonitoringRequestHostname(String value) {
        return new JAXBElement<String>(_RouterDetailsHostname_QNAME, String.class, RouterMonitoringRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "GroupIDs", scope = RouterGroupsRequest.class)
    public JAXBElement<ArrayOfint> createRouterGroupsRequestGroupIDs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_RouterMonitoringRequestGroupIDs_QNAME, ArrayOfint.class, RouterGroupsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "FileContent", scope = ImportRouteInstructionsRequest.class)
    public JAXBElement<String> createImportRouteInstructionsRequestFileContent(String value) {
        return new JAXBElement<String>(_ImportRouteInstructionsRequestFileContent_QNAME, String.class, ImportRouteInstructionsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "EndTime", scope = LimitPeriod.class)
    public JAXBElement<String> createLimitPeriodEndTime(String value) {
        return new JAXBElement<String>(_LimitPeriodEndTime_QNAME, String.class, LimitPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "StartTime", scope = LimitPeriod.class)
    public JAXBElement<String> createLimitPeriodStartTime(String value) {
        return new JAXBElement<String>(_LimitPeriodStartTime_QNAME, String.class, LimitPeriod.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlimDateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Timestamp", scope = RouterPortStatistics.class)
    public JAXBElement<SlimDateTime> createRouterPortStatisticsTimestamp(SlimDateTime value) {
        return new JAXBElement<SlimDateTime>(_RouterPortStatisticsTimestamp_QNAME, SlimDateTime.class, RouterPortStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "ErrorMsg", scope = RouterPortStatistics.class)
    public JAXBElement<String> createRouterPortStatisticsErrorMsg(String value) {
        return new JAXBElement<String>(_RouterPortStatisticsErrorMsg_QNAME, String.class, RouterPortStatistics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Routers", scope = RouterGroup.class)
    public JAXBElement<ArrayOfRouterInfo> createRouterGroupRouters(ArrayOfRouterInfo value) {
        return new JAXBElement<ArrayOfRouterInfo>(_RouterGroupRouters_QNAME, ArrayOfRouterInfo.class, RouterGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Description", scope = RouterGroup.class)
    public JAXBElement<String> createRouterGroupDescription(String value) {
        return new JAXBElement<String>(_RouterInfoDescription_QNAME, String.class, RouterGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouteInstructionDisplay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouteInstructions", scope = RouterGroup.class)
    public JAXBElement<ArrayOfRouteInstructionDisplay> createRouterGroupRouteInstructions(ArrayOfRouteInstructionDisplay value) {
        return new JAXBElement<ArrayOfRouteInstructionDisplay>(_RouterGroupRouteInstructions_QNAME, ArrayOfRouteInstructionDisplay.class, RouterGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "Name", scope = RouterGroup.class)
    public JAXBElement<String> createRouterGroupName(String value) {
        return new JAXBElement<String>(_RouterGroupName_QNAME, String.class, RouterGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRouterGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts.Router", name = "RouterGroups", scope = RouterGroupsResponse.class)
    public JAXBElement<ArrayOfRouterGroup> createRouterGroupsResponseRouterGroups(ArrayOfRouterGroup value) {
        return new JAXBElement<ArrayOfRouterGroup>(_RouterGroupsResponseRouterGroups_QNAME, ArrayOfRouterGroup.class, RouterGroupsResponse.class, value);
    }

}


package org.datacontract.schemas._2004._07.openlm_server_services;

import org.datacontract.schemas._2004._07.openlm_server.*;
import org.datacontract.schemas._2004._07.openlm_server_services_datacontracts.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseInfo" type="{http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts}RequestBaseInfo" minOccurs="0"/>
 *         &lt;element name="SaasToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequest", propOrder = {
    "baseInfo",
    "saasToken"
})
@XmlSeeAlso({
    LDAPResetSyncRequest.class,
    OptFileFeatureValidKeywordsRequest.class,
    AlertRuleRequest.class,
    UpdateFileFetchConfigRequest.class,
    AlertRuleComponentsRequest.class,
    UserAuthenticationRequest.class,
    AgentProcedureTmplRequest.class,
    GetUnmanagedVendorRequest.class,
    FeatureUsageStatusRequest.class,
    GroupNamesRequest.class,
    SetFullLoggingRequest.class,
    SetProjectToUsageSessionRequest.class,
    DownloadLmFileRequest.class,
    UpdateEmailSMSSettingsDataRequest.class,
    EmailSettingsRequest.class,
    UpdateAlertRuleComponentsDataRequest.class,
    LicenseUsageReportRequest.class,
    LoginFormSettingsRequest.class,
    OptFileContentRequest.class,
    LogsUploadingBaseRequest.class,
    GetLmFilesRequest.class,
    SMSSettingsRequest.class,
    AlertDescriptionRequest.class,
    FileFetchStatusRequest.class,
    CurrentlyConsumedLicensesRequest.class,
    LicensesProcurementComponentsRequest.class,
    LicenseInfoRequest.class,
    PackageLicensesRequest.class,
    LicensesProcurementRequest.class,
    LicensesActivityRequest.class,
    UpdateRouterGroupsAndComponentsRequest.class,
    ExportRouteInstructionsRequest.class,
    RouterMonitoringRequest.class,
    ImportRouteInstructionsRequest.class,
    RouterGroupsRequest.class
})
public class BaseRequest {

    @XmlElementRef(name = "BaseInfo", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestBaseInfo> baseInfo;
    @XmlElementRef(name = "SaasToken", namespace = "http://schemas.datacontract.org/2004/07/OpenLM.Server.Services.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> saasToken;

    /**
     * Gets the value of the baseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestBaseInfo }{@code >}
     *     
     */
    public JAXBElement<RequestBaseInfo> getBaseInfo() {
        return baseInfo;
    }

    /**
     * Sets the value of the baseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestBaseInfo }{@code >}
     *     
     */
    public void setBaseInfo(JAXBElement<RequestBaseInfo> value) {
        this.baseInfo = value;
    }

    /**
     * Gets the value of the saasToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSaasToken() {
        return saasToken;
    }

    /**
     * Sets the value of the saasToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSaasToken(JAXBElement<String> value) {
        this.saasToken = value;
    }

}

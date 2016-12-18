package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;


/**
 * Values for SFC Vnfm Tacker setup
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-vnfm-tacker</b>
 * <br>(Source path: <i>META-INF/yang/sfc-vnfm-tacker.yang</i>):
 * <pre>
 * grouping initial-values {
 *     leaf sfc-vnfm-tacker-name {
 *         type string;
 *     }
 *     leaf sfc-vnfm-tacker-password {
 *         type string;
 *     }
 *     leaf sfc-vnfm-uri {
 *         type string;
 *     }
 *     leaf sfc-vnfm-tacker-port {
 *         type int32;
 *     }
 *     leaf sfc-vnfm-keystone-port {
 *         type int32;
 *     }
 *     leaf sfc-vnfm-tacker-tenant {
 *         type string;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-vnfm-tacker/initial-values</i>
 *
 */
public interface InitialValues
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc:vnfm:tacker",
        "2015-12-23", "initial-values").intern();

    /**
     * This is the username used for authentication with tacker service.
     *
     */
    java.lang.String getSfcVnfmTackerName();
    
    /**
     * This is the password used for authentication with tacker service.
     *
     */
    java.lang.String getSfcVnfmTackerPassword();
    
    /**
     * This is the URI used for communication with services.
     *
     */
    java.lang.String getSfcVnfmUri();
    
    /**
     * This is the port that Tacker uses for communication.
     *
     */
    java.lang.Integer getSfcVnfmTackerPort();
    
    /**
     * This is the port that Keystone uses for communication.
     *
     */
    java.lang.Integer getSfcVnfmKeystonePort();
    
    /**
     * This is the tenant name used for tacker.
     *
     */
    java.lang.String getSfcVnfmTackerTenant();

}


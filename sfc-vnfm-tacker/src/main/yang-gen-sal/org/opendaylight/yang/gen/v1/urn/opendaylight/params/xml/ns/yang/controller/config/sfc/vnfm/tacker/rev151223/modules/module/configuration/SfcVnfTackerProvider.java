package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.InitialValues;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-vnfm-tacker</b>
 * <br>(Source path: <i>META-INF/yang/sfc-vnfm-tacker.yang</i>):
 * <pre>
 * case sfc-vnf-tacker-provider {
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
 * <i>sfc-vnfm-tacker/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc:vnfm:tacker?revision=2015-12-23)sfc-vnf-tacker-provider</i>
 *
 */
public interface SfcVnfTackerProvider
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.vnfm.tacker.rev151223.modules.module.configuration.SfcVnfTackerProvider>,
    InitialValues,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc:vnfm:tacker",
        "2015-12-23", "sfc-vnf-tacker-provider").intern();


}


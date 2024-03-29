package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.l2renderer.impl.rev140901.modules.module.configuration.sfc.l2renderer.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>sfc-l2renderer-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfcofl2-provider-impl.yang</i>):
 * <pre>
 * container notification-service {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:sfc-l2renderer:impl?revision=2014-09-01)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>sfc-l2renderer-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:sfc-l2renderer:impl?revision=2014-09-01)sfc-l2renderer-impl/notification-service</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.l2renderer.impl.rev140901.modules.module.configuration.sfc.l2renderer.impl.NotificationServiceBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.l2renderer.impl.rev140901.modules.module.configuration.sfc.l2renderer.impl.NotificationServiceBuilder
 *
 */
public interface NotificationService
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.l2renderer.impl.rev140901.modules.module.configuration.sfc.l2renderer.impl.NotificationService>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sfc-l2renderer:impl",
        "2014-09-01", "notification-service").intern();


}


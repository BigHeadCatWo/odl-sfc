package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sfc.test.consumer.impl.rev140701;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.binding.RpcService;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>sfc-test-consumer-impl</b>
 * <br>(Source path: <i>META-INF/yang/sfc-test-consumer-impl@2014-06-12.yang</i>):
 * <pre>
 * rpc test-b-read-sfc {
 *     "Shortcut JMX call for testing:reading SFC";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-b-put-sfs {
 *     "Shortcut JMX call for testing: creating a set of SFs";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-b-put-sfc {
 *     "Shortcut JMX call for testing: creating SFC";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-b-delete-sfc {
 *     "Shortcut JMX call for testing: deleting SFC";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-c-put-data {
 *     "Shortcut JMX call for testing: creating all data";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-a-read-sf {
 *     "Shortcut JMX call for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-a-put-sf {
 *     "Shortcut JMX call for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * rpc test-a-delete-sf {
 *     "Shortcut JMX call for testing.";
 *     input {
 *         leaf context-instance {
 *             type instance-identifier;
 *         }
 *     }
 *     
 *     output {
 *         leaf result {
 *             type boolean;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface SfcTestConsumerImplService
    extends
    RpcService
{




    /**
     * Shortcut JMX call for testing:reading SFC
     *
     */
    Future<RpcResult<TestBReadSfcOutput>> testBReadSfc(TestBReadSfcInput input);
    
    /**
     * Shortcut JMX call for testing: creating a set of SFs
     *
     */
    Future<RpcResult<TestBPutSfsOutput>> testBPutSfs(TestBPutSfsInput input);
    
    /**
     * Shortcut JMX call for testing: creating SFC
     *
     */
    Future<RpcResult<TestBPutSfcOutput>> testBPutSfc(TestBPutSfcInput input);
    
    /**
     * Shortcut JMX call for testing: deleting SFC
     *
     */
    Future<RpcResult<TestBDeleteSfcOutput>> testBDeleteSfc(TestBDeleteSfcInput input);
    
    /**
     * Shortcut JMX call for testing: creating all data
     *
     */
    Future<RpcResult<TestCPutDataOutput>> testCPutData(TestCPutDataInput input);
    
    /**
     * Shortcut JMX call for testing.
     *
     */
    Future<RpcResult<TestAReadSfOutput>> testAReadSf(TestAReadSfInput input);
    
    /**
     * Shortcut JMX call for testing.
     *
     */
    Future<RpcResult<TestAPutSfOutput>> testAPutSf(TestAPutSfInput input);
    
    /**
     * Shortcut JMX call for testing.
     *
     */
    Future<RpcResult<TestADeleteSfOutput>> testADeleteSf(TestADeleteSfInput input);

}


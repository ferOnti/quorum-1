package org.web3j.quorum.methods.response;

import org.web3j.protocol.core.Response;

/**
 * quorum_privateKey
 */
public class PrivateKey extends Response<String> {
    public String privateKey() {
        return getResult();
    }
}

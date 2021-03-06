//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import java.util.List;
import com.yahoo.rdl.*;

//
// JWKList - JSON Web Key (JWK) List
//
public class JWKList {
    public List<JWK> keys;

    public JWKList setKeys(List<JWK> keys) {
        this.keys = keys;
        return this;
    }
    public List<JWK> getKeys() {
        return keys;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != JWKList.class) {
                return false;
            }
            JWKList a = (JWKList) another;
            if (keys == null ? a.keys != null : !keys.equals(a.keys)) {
                return false;
            }
        }
        return true;
    }
}

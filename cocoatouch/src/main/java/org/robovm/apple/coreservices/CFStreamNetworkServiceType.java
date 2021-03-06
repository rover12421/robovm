/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coreservices;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFStreamNetworkServiceType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFStreamNetworkServiceType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFStreamNetworkServiceType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFStreamNetworkServiceType toObject(Class<CFStreamNetworkServiceType> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFStreamNetworkServiceType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFStreamNetworkServiceType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFStreamNetworkServiceType> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(cls, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFStreamNetworkServiceType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFStreamNetworkServiceType.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFStreamNetworkServiceType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFStreamNetworkServiceType o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final CFStreamNetworkServiceType VoIP = new CFStreamNetworkServiceType("VoIP");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final CFStreamNetworkServiceType Video = new CFStreamNetworkServiceType("Video");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final CFStreamNetworkServiceType Voice = new CFStreamNetworkServiceType("Voice");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final CFStreamNetworkServiceType Background = new CFStreamNetworkServiceType("Background");
    /*</constants>*/
    
    private static /*<name>*/CFStreamNetworkServiceType/*</name>*/[] values = new /*<name>*/CFStreamNetworkServiceType/*</name>*/[] {/*<value_list>*/VoIP, Video, Voice, Background/*</value_list>*/};
    
    /*<name>*/CFStreamNetworkServiceType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFStreamNetworkServiceType/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFStreamNetworkServiceType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFStreamNetworkServiceType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 4.0 and later.
         */
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeVoIP", optional=true)
        public static native CFString VoIP();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeVideo", optional=true)
        public static native CFString Video();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeVoice", optional=true)
        public static native CFString Voice();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="kCFStreamNetworkServiceTypeBackground", optional=true)
        public static native CFString Background();
        /*</values>*/
    }
}

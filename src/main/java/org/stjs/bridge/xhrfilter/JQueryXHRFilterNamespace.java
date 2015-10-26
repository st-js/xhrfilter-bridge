package org.stjs.bridge.xhrfilter;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryNamespace;

@SyntheticType
public class JQueryXHRFilterNamespace extends JQueryNamespace {

	public native void ajaxRegisterFilter(XHRFilter filter);

	public Array<XHRFilter> ajaxFilters;
}

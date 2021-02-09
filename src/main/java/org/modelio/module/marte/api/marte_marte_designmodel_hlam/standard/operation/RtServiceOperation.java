/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << RtService_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtServiceOperation {
    public static final String STEREOTYPE_NAME = "RtService_Operation";

    public static final String RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE = "RtService_Operation_concPolicy";

    public static final String RTSERVICE_OPERATION_EXEKIND_TAGTYPE = "RtService_Operation_exeKind";

    public static final String RTSERVICE_OPERATION_ISATOMIC_TAGTYPE = "RtService_Operation_isAtomic";

    public static final String RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE = "RtService_Operation_synchKind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    protected final Operation elt;

    /**
     * Tells whether a {@link RtServiceOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RtService_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtServiceOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RtService_Operation >> then instantiate a {@link RtServiceOperation} proxy.
     * 
     * @return a {@link RtServiceOperation} proxy on the created {@link Operation}.
     */
    public static RtServiceOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtServiceOperation.STEREOTYPE_NAME);
        return RtServiceOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RtServiceOperation} proxy from a {@link Operation} stereotyped << RtService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link RtServiceOperation} proxy or <i>null</i>.
     */
    public static RtServiceOperation instantiate(final Operation obj) {
        return RtServiceOperation.canInstantiate(obj) ? new RtServiceOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtServiceOperation} proxy from a {@link Operation} stereotyped << RtService_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link RtServiceOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtServiceOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RtServiceOperation.canInstantiate(obj))
        	return new RtServiceOperation(obj);
        else
        	throw new IllegalArgumentException("RtServiceOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RtServiceOperation other = (RtServiceOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtService_Operation_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtService_Operation_concPolicy() {
        return this.elt.getTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtService_Operation_exeKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtService_Operation_exeKind() {
        return this.elt.getTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtService_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtService_Operation_synchKind() {
        return this.elt.getTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtService_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtService_Operation_isAtomic() {
        return this.elt.isTagged(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtService_Operation_concPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtService_Operation_concPolicy(final String value) {
        this.elt.putTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtService_Operation_exeKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtService_Operation_exeKind(final String value) {
        this.elt.putTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'RtService_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtService_Operation_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtService_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtService_Operation_synchKind(final String value) {
        this.elt.putTagValue(RtServiceOperation.MdaTypes.RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    protected RtServiceOperation(final Operation elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT;

        public static TagType RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT;

        public static TagType RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT;

        public static TagType RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00cef7df-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_CONCPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7e0-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_EXEKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7e1-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7e2-0ccf-11df-8525-001302895b2b");
            RTSERVICE_OPERATION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00d15a2c-0ccf-11df-8525-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}

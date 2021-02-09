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
 * Proxy class to handle a {@link Operation} with << RtAction_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtActionOperation {
    public static final String STEREOTYPE_NAME = "RtAction_Operation";

    public static final String RTACTION_OPERATION_ISATOMIC_TAGTYPE = "RtAction_Operation_isAtomic";

    public static final String RTACTION_OPERATION_MSGSIZE_TAGTYPE = "RtAction_Operation_msgSize";

    public static final String RTACTION_OPERATION_SYNCHKIND_TAGTYPE = "RtAction_Operation_synchKind";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    protected final Operation elt;

    /**
     * Tells whether a {@link RtActionOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RtAction_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RtAction_Operation >> then instantiate a {@link RtActionOperation} proxy.
     * 
     * @return a {@link RtActionOperation} proxy on the created {@link Operation}.
     */
    public static RtActionOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOperation.STEREOTYPE_NAME);
        return RtActionOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RtActionOperation} proxy from a {@link Operation} stereotyped << RtAction_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link RtActionOperation} proxy or <i>null</i>.
     */
    public static RtActionOperation instantiate(final Operation obj) {
        return RtActionOperation.canInstantiate(obj) ? new RtActionOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionOperation} proxy from a {@link Operation} stereotyped << RtAction_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link RtActionOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtActionOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RtActionOperation.canInstantiate(obj))
        	return new RtActionOperation(obj);
        else
        	throw new IllegalArgumentException("RtActionOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtActionOperation other = (RtActionOperation) obj;
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
     * Getter for string property 'RtAction_Operation_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_Operation_msgSize() {
        return this.elt.getTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_Operation_synchKind() {
        return this.elt.getTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtAction_Operation_isAtomic() {
        return this.elt.isTagged(RtActionOperation.MdaTypes.RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_Operation_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_Operation_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionOperation.MdaTypes.RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_Operation_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_Operation_msgSize(final String value) {
        this.elt.putTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_Operation_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_Operation_synchKind(final String value) {
        this.elt.putTagValue(RtActionOperation.MdaTypes.RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    protected RtActionOperation(final Operation elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT;

        public static TagType RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT;

        public static TagType RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00cef7db-0ccf-11df-8525-001302895b2b");
            RTACTION_OPERATION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "00cef7dc-0ccf-11df-8525-001302895b2b");
            RTACTION_OPERATION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4d2a9866-1237-11df-8f55-0014222a9f79");
            RTACTION_OPERATION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "52f39507-1237-11df-8f55-0014222a9f79");
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

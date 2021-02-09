/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.callaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link CallAction} with << RtAction_CallAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtActionCallAction {
    public static final String STEREOTYPE_NAME = "RtAction_CallAction";

    public static final String RTACTION_CALLACTION_ISATOMIC_TAGTYPE = "RtAction_CallAction_isAtomic";

    public static final String RTACTION_CALLACTION_MSGSIZE_TAGTYPE = "RtAction_CallAction_msgSize";

    public static final String RTACTION_CALLACTION_SYNCHKIND_TAGTYPE = "RtAction_CallAction_synchKind";

    /**
     * The underlying {@link CallAction} represented by this proxy, never null.
     */
    protected final CallAction elt;

    /**
     * Tells whether a {@link RtActionCallAction proxy} can be instantiated from a {@link MObject} checking it is a {@link CallAction} stereotyped << RtAction_CallAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof CallAction) && ((CallAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionCallAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link CallAction} stereotyped << RtAction_CallAction >> then instantiate a {@link RtActionCallAction} proxy.
     * 
     * @return a {@link RtActionCallAction} proxy on the created {@link CallAction}.
     */
    public static RtActionCallAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.CallAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionCallAction.STEREOTYPE_NAME);
        return RtActionCallAction.instantiate((CallAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionCallAction} proxy from a {@link CallAction} stereotyped << RtAction_CallAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a CallAction
     * @return a {@link RtActionCallAction} proxy or <i>null</i>.
     */
    public static RtActionCallAction instantiate(final CallAction obj) {
        return RtActionCallAction.canInstantiate(obj) ? new RtActionCallAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionCallAction} proxy from a {@link CallAction} stereotyped << RtAction_CallAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link CallAction}
     * @return a {@link RtActionCallAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtActionCallAction safeInstantiate(final CallAction obj) throws IllegalArgumentException {
        if (RtActionCallAction.canInstantiate(obj))
        	return new RtActionCallAction(obj);
        else
        	throw new IllegalArgumentException("RtActionCallAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtActionCallAction other = (RtActionCallAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link CallAction}. 
     * @return the CallAction represented by this proxy, never null.
     */
    public CallAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_CallAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_CallAction_msgSize() {
        return this.elt.getTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_CallAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_CallAction_synchKind() {
        return this.elt.getTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_CallAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtAction_CallAction_isAtomic() {
        return this.elt.isTagged(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_CallAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_CallAction_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_CallAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_CallAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_CallAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_CallAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionCallAction.MdaTypes.RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    protected RtActionCallAction(final CallAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT;

        public static TagType RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT;

        public static TagType RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a13ac171-0ff9-11df-86fe-0014222a9f79");
            RTACTION_CALLACTION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ada74cd9-0ff9-11df-86fe-0014222a9f79");
            RTACTION_CALLACTION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "60d761a6-1237-11df-8f55-0014222a9f79");
            RTACTION_CALLACTION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "60d761a7-1237-11df-8f55-0014222a9f79");
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

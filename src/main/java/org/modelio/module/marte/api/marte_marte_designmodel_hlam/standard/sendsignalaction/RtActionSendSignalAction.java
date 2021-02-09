/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
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
 * Proxy class to handle a {@link SendSignalAction} with << RtAction_SendSignalAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtActionSendSignalAction {
    public static final String STEREOTYPE_NAME = "RtAction_SendSignalAction";

    public static final String RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE = "RtAction_SendSignalAction_isAtomic";

    public static final String RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE = "RtAction_SendSignalAction_msgSize";

    public static final String RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE = "RtAction_SendSignalAction_synchKind";

    /**
     * The underlying {@link SendSignalAction} represented by this proxy, never null.
     */
    protected final SendSignalAction elt;

    /**
     * Tells whether a {@link RtActionSendSignalAction proxy} can be instantiated from a {@link MObject} checking it is a {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof SendSignalAction) && ((SendSignalAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionSendSignalAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >> then instantiate a {@link RtActionSendSignalAction} proxy.
     * 
     * @return a {@link RtActionSendSignalAction} proxy on the created {@link SendSignalAction}.
     */
    public static RtActionSendSignalAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.SendSignalAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionSendSignalAction.STEREOTYPE_NAME);
        return RtActionSendSignalAction.instantiate((SendSignalAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a SendSignalAction
     * @return a {@link RtActionSendSignalAction} proxy or <i>null</i>.
     */
    public static RtActionSendSignalAction instantiate(final SendSignalAction obj) {
        return RtActionSendSignalAction.canInstantiate(obj) ? new RtActionSendSignalAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link SendSignalAction}
     * @return a {@link RtActionSendSignalAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtActionSendSignalAction safeInstantiate(final SendSignalAction obj) throws IllegalArgumentException {
        if (RtActionSendSignalAction.canInstantiate(obj))
        	return new RtActionSendSignalAction(obj);
        else
        	throw new IllegalArgumentException("RtActionSendSignalAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtActionSendSignalAction other = (RtActionSendSignalAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link SendSignalAction}. 
     * @return the SendSignalAction represented by this proxy, never null.
     */
    public SendSignalAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_SendSignalAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_SendSignalAction_msgSize() {
        return this.elt.getTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_SendSignalAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_SendSignalAction_synchKind() {
        return this.elt.getTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_SendSignalAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtAction_SendSignalAction_isAtomic() {
        return this.elt.isTagged(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_SendSignalAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_SendSignalAction_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_SendSignalAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_SendSignalAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_SendSignalAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_SendSignalAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    protected RtActionSendSignalAction(final SendSignalAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT;

        public static TagType RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT;

        public static TagType RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6732ea1a-14b3-11df-ad67-001302895b2b");
            RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6732ea1b-14b3-11df-ad67-001302895b2b");
            RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6732ea1c-14b3-11df-ad67-001302895b2b");
            RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6732ea1d-14b3-11df-ad67-001302895b2b");
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

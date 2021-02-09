/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.opaqueaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
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
 * Proxy class to handle a {@link OpaqueAction} with << RtAction_OpaqueAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtActionOpaqueAction {
    public static final String STEREOTYPE_NAME = "RtAction_OpaqueAction";

    public static final String RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE = "RtAction_OpaqueAction_isAtomic";

    public static final String RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE = "RtAction_OpaqueAction_msgSize";

    public static final String RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE = "RtAction_OpaqueAction_synchKind";

    /**
     * The underlying {@link OpaqueAction} represented by this proxy, never null.
     */
    protected final OpaqueAction elt;

    /**
     * Tells whether a {@link RtActionOpaqueAction proxy} can be instantiated from a {@link MObject} checking it is a {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof OpaqueAction) && ((OpaqueAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOpaqueAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >> then instantiate a {@link RtActionOpaqueAction} proxy.
     * 
     * @return a {@link RtActionOpaqueAction} proxy on the created {@link OpaqueAction}.
     */
    public static RtActionOpaqueAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.OpaqueAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionOpaqueAction.STEREOTYPE_NAME);
        return RtActionOpaqueAction.instantiate((OpaqueAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a OpaqueAction
     * @return a {@link RtActionOpaqueAction} proxy or <i>null</i>.
     */
    public static RtActionOpaqueAction instantiate(final OpaqueAction obj) {
        return RtActionOpaqueAction.canInstantiate(obj) ? new RtActionOpaqueAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtActionOpaqueAction} proxy from a {@link OpaqueAction} stereotyped << RtAction_OpaqueAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link OpaqueAction}
     * @return a {@link RtActionOpaqueAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtActionOpaqueAction safeInstantiate(final OpaqueAction obj) throws IllegalArgumentException {
        if (RtActionOpaqueAction.canInstantiate(obj))
        	return new RtActionOpaqueAction(obj);
        else
        	throw new IllegalArgumentException("RtActionOpaqueAction: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtActionOpaqueAction other = (RtActionOpaqueAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link OpaqueAction}. 
     * @return the OpaqueAction represented by this proxy, never null.
     */
    public OpaqueAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_OpaqueAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_OpaqueAction_msgSize() {
        return this.elt.getTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_OpaqueAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getRtAction_OpaqueAction_synchKind() {
        return this.elt.getTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_OpaqueAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isRtAction_OpaqueAction_isAtomic() {
        return this.elt.isTagged(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_OpaqueAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_OpaqueAction_isAtomic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtAction_OpaqueAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_OpaqueAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_OpaqueAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setRtAction_OpaqueAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionOpaqueAction.MdaTypes.RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    protected RtActionOpaqueAction(final OpaqueAction elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT;

        public static TagType RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT;

        public static TagType RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "682d416d-14b3-11df-ad67-001302895b2b");
            RTACTION_OPAQUEACTION_ISATOMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "682d416e-14b3-11df-ad67-001302895b2b");
            RTACTION_OPAQUEACTION_SYNCHKIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "682d416f-14b3-11df-ad67-001302895b2b");
            RTACTION_OPAQUEACTION_MSGSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "682d4170-14b3-11df-ad67-001302895b2b");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.sendsignalaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("44e526a6-12b2-43fe-8187-2c1626fc532a")
public class RtActionSendSignalAction {
    @objid ("8c66bdce-7a12-48ab-aa40-b2340434bc78")
    public static final String STEREOTYPE_NAME = "RtAction_SendSignalAction";

    @objid ("1701a996-ede0-4bda-a34c-38f87e232302")
    public static final String RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE = "RtAction_SendSignalAction_isAtomic";

    @objid ("17a3506f-2a14-4aa8-9559-8596c2e7c33c")
    public static final String RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE = "RtAction_SendSignalAction_msgSize";

    @objid ("799a8aed-a014-444a-a877-2de58a2db262")
    public static final String RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE = "RtAction_SendSignalAction_synchKind";

    /**
     * The underlying {@link SendSignalAction} represented by this proxy, never null.
     */
    @objid ("5414ae83-5d17-4521-80da-c073143c5edb")
    protected final SendSignalAction elt;

    /**
     * Tells whether a {@link RtActionSendSignalAction proxy} can be instantiated from a {@link MObject} checking it is a {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("d52973bc-079b-41ce-b38d-3c567c0277db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof SendSignalAction) && ((SendSignalAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtActionSendSignalAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >> then instantiate a {@link RtActionSendSignalAction} proxy.
     * 
     * @return a {@link RtActionSendSignalAction} proxy on the created {@link SendSignalAction}.
     */
    @objid ("a3e365ac-99ec-4642-9485-f4c417415cc9")
    public static RtActionSendSignalAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("SendSignalAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtActionSendSignalAction.STEREOTYPE_NAME);
        return RtActionSendSignalAction.instantiate((SendSignalAction)e);
    }

    /**
     * Tries to instantiate a {@link RtActionSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtAction_SendSignalAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a SendSignalAction
     * @return a {@link RtActionSendSignalAction} proxy or <i>null</i>.
     */
    @objid ("ff4543d9-86d4-4406-9ac3-c6fb85027e4f")
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
    @objid ("839c1e90-a8d2-4e0d-b561-9f73a5343d7b")
    public static RtActionSendSignalAction safeInstantiate(final SendSignalAction obj) throws IllegalArgumentException {
        if (RtActionSendSignalAction.canInstantiate(obj))
        	return new RtActionSendSignalAction(obj);
        else
        	throw new IllegalArgumentException("RtActionSendSignalAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("21e0b0a1-2b21-41a2-85ed-8015a149bfce")
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
    @objid ("500a82e6-b2bf-44e7-b01a-4e2f196e598a")
    public SendSignalAction getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtAction_SendSignalAction_msgSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb8eb19b-ba63-47d4-b870-00a055fee9e0")
    public String getRtAction_SendSignalAction_msgSize() {
        return this.elt.getTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtAction_SendSignalAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("87af6fab-3ad3-47a7-9880-d8b0f3090322")
    public String getRtAction_SendSignalAction_synchKind() {
        return this.elt.getTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT);
    }

    @objid ("cc6ecf87-c37c-4e10-83da-82006263410d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtAction_SendSignalAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("49cb4530-9f00-44b6-b107-ad1d9b32d39b")
    public boolean isRtAction_SendSignalAction_isAtomic() {
        return this.elt.isTagged(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtAction_SendSignalAction_isAtomic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3935b96c-1081-4050-9a16-9a2349382ed9")
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
    @objid ("9c4fd512-25dd-4908-9fb5-4c2cd5d9c12f")
    public void setRtAction_SendSignalAction_msgSize(final String value) {
        this.elt.putTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtAction_SendSignalAction_synchKind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("342b4653-4808-4433-a55a-60849a7f886d")
    public void setRtAction_SendSignalAction_synchKind(final String value) {
        this.elt.putTagValue(RtActionSendSignalAction.MdaTypes.RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT, value);
    }

    @objid ("36f856fe-e176-42c2-a965-0b9d9a60f2ad")
    protected RtActionSendSignalAction(final SendSignalAction elt) {
        this.elt = elt;
    }

    @objid ("42783aaf-9034-4d56-92c5-2e5325379053")
    public static final class MdaTypes {
        @objid ("47a325ff-c216-46f4-8a6b-ea7861ddd400")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f0231f4-9eff-4477-b966-e1a00ffb3780")
        public static TagType RTACTION_SENDSIGNALACTION_ISATOMIC_TAGTYPE_ELT;

        @objid ("a3247184-475d-42ce-9ddb-60d862c36467")
        public static TagType RTACTION_SENDSIGNALACTION_SYNCHKIND_TAGTYPE_ELT;

        @objid ("0f4800f8-033b-49a9-854a-70ed278d83c2")
        public static TagType RTACTION_SENDSIGNALACTION_MSGSIZE_TAGTYPE_ELT;

        @objid ("7c697377-7b91-4f72-963c-aca06f4348a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed9679d1-cdf5-4bd2-92e7-d18a20cc7551")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f528222-a0e5-4ae8-aa37-d2583a96a711")
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

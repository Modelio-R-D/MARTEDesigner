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
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link SendSignalAction} with << RtFeature_SendSignalAction >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("005f0779-9265-440f-aa93-c456baccf03a")
public class RtFeatureSendSignalAction {
    @objid ("af17f8fd-fcb7-4b6f-b351-b6bd221d94d4")
    public static final String STEREOTYPE_NAME = "RtFeature_SendSignalAction";

    @objid ("6d652bf5-c36f-4794-a02a-6c6bb486cc61")
    public static final String RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE = "RtFeature_SendSignalAction_specification";

    /**
     * The underlying {@link SendSignalAction} represented by this proxy, never null.
     */
    @objid ("9dfec320-3bf1-429e-af1f-c993f0cfc654")
    protected final SendSignalAction elt;

    /**
     * Tells whether a {@link RtFeatureSendSignalAction proxy} can be instantiated from a {@link MObject} checking it is a {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8d119135-fe12-4fd3-b0cf-6e21faea33ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof SendSignalAction) && ((SendSignalAction) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSendSignalAction.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >> then instantiate a {@link RtFeatureSendSignalAction} proxy.
     * 
     * @return a {@link RtFeatureSendSignalAction} proxy on the created {@link SendSignalAction}.
     */
    @objid ("149514fa-eab6-4299-a44c-046fb34bd296")
    public static RtFeatureSendSignalAction create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("SendSignalAction");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSendSignalAction.STEREOTYPE_NAME);
        return RtFeatureSendSignalAction.instantiate((SendSignalAction)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a SendSignalAction
     * @return a {@link RtFeatureSendSignalAction} proxy or <i>null</i>.
     */
    @objid ("6ef461e4-6292-45c5-b97c-05c407134194")
    public static RtFeatureSendSignalAction instantiate(final SendSignalAction obj) {
        return RtFeatureSendSignalAction.canInstantiate(obj) ? new RtFeatureSendSignalAction(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureSendSignalAction} proxy from a {@link SendSignalAction} stereotyped << RtFeature_SendSignalAction >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link SendSignalAction}
     * @return a {@link RtFeatureSendSignalAction} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("493ccc0e-6702-4284-9fbd-7361c6e91fd4")
    public static RtFeatureSendSignalAction safeInstantiate(final SendSignalAction obj) throws IllegalArgumentException {
        if (RtFeatureSendSignalAction.canInstantiate(obj))
        	return new RtFeatureSendSignalAction(obj);
        else
        	throw new IllegalArgumentException("RtFeatureSendSignalAction: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("21716966-d17a-4e74-94f5-676da6175d73")
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
        RtFeatureSendSignalAction other = (RtFeatureSendSignalAction) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link SendSignalAction}. 
     * @return the SendSignalAction represented by this proxy, never null.
     */
    @objid ("d5fb34e0-9345-4fb3-a543-3ac5837c4c9c")
    public SendSignalAction getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_SendSignalAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("f01fe0f3-8fdb-4b39-8e77-33e31be062ea")
    public String getRtFeature_SendSignalAction_specificationNote() {
        return this.elt.getNoteContent(RtFeatureSendSignalAction.MdaTypes.RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("c2b0a4dd-7bd0-4725-8021-5ce9942174df")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_SendSignalAction_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("7f1c6222-546c-4907-b900-33e3e770040f")
    public void setRtFeature_SendSignalAction_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureSendSignalAction.MdaTypes.RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("a539db9a-f0ab-4692-8cf8-0c23fccf485d")
    protected RtFeatureSendSignalAction(final SendSignalAction elt) {
        this.elt = elt;
    }

    @objid ("8e598a68-2cf6-4706-a939-25d1ce6bbfc7")
    public static final class MdaTypes {
        @objid ("fa69e975-9648-45cf-99e9-49beb2b9db0e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("98dffe02-9760-4ddd-884a-5cf35f319fc2")
        public static NoteType RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT;

        @objid ("620241cc-5d2f-4960-9be8-f85e58be2904")
        private static Stereotype MDAASSOCDEP;

        @objid ("66a1fdea-1091-414f-9333-4119eb29d700")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ea1c058-6cd9-4e34-9dc2-b6c384442b18")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3076f704-14b3-11df-ad67-001302895b2b");
            RTFEATURE_SENDSIGNALACTION_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "1ae28044-9276-11e0-aeeb-0027103f347c");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
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
 * Proxy class to handle a {@link Message} with << RtFeature_Message >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("87afb071-baa5-49fd-bc6f-c18742ab93d6")
public class RtFeatureMessage {
    @objid ("3abf32de-d791-4fc1-823d-124fdf830984")
    public static final String STEREOTYPE_NAME = "RtFeature_Message";

    @objid ("200d3d91-93e7-4438-8a9c-1fcac0238cc0")
    public static final String RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE = "RtFeature_Message_specification";

    /**
     * The underlying {@link Message} represented by this proxy, never null.
     */
    @objid ("ee4b9475-deda-4a2e-b7d6-3ee741683272")
    protected final Message elt;

    /**
     * Tells whether a {@link RtFeatureMessage proxy} can be instantiated from a {@link MObject} checking it is a {@link Message} stereotyped << RtFeature_Message >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("489a0b01-47af-4029-8ad6-de384acc5bcc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Message) && ((Message) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureMessage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Message} stereotyped << RtFeature_Message >> then instantiate a {@link RtFeatureMessage} proxy.
     * 
     * @return a {@link RtFeatureMessage} proxy on the created {@link Message}.
     */
    @objid ("ae9da5d0-9866-447d-b262-6b1119fe386e")
    public static RtFeatureMessage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Message");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureMessage.STEREOTYPE_NAME);
        return RtFeatureMessage.instantiate((Message)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureMessage} proxy from a {@link Message} stereotyped << RtFeature_Message >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Message
     * @return a {@link RtFeatureMessage} proxy or <i>null</i>.
     */
    @objid ("6aa244af-ba90-4689-9672-7f83bed34e9d")
    public static RtFeatureMessage instantiate(final Message obj) {
        return RtFeatureMessage.canInstantiate(obj) ? new RtFeatureMessage(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureMessage} proxy from a {@link Message} stereotyped << RtFeature_Message >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Message}
     * @return a {@link RtFeatureMessage} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a29ddff8-5eac-4d8e-abc1-d8696523d465")
    public static RtFeatureMessage safeInstantiate(final Message obj) throws IllegalArgumentException {
        if (RtFeatureMessage.canInstantiate(obj))
        	return new RtFeatureMessage(obj);
        else
        	throw new IllegalArgumentException("RtFeatureMessage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4f7e7ada-11ff-4d32-83de-514e48442582")
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
        RtFeatureMessage other = (RtFeatureMessage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Message}. 
     * @return the Message represented by this proxy, never null.
     */
    @objid ("19bc2989-a19a-4cec-b3c1-4ebbf672f019")
    public Message getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Message_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("85622657-5897-4db7-9642-e2347c439daa")
    public String getRtFeature_Message_specificationNote() {
        return this.elt.getNoteContent(RtFeatureMessage.MdaTypes.RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("1d6f5ead-b289-4c36-bd39-d0bdd3e30058")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Message_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("39760ff5-c220-4559-a801-f90b319baad3")
    public void setRtFeature_Message_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureMessage.MdaTypes.RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("2ff7a19e-de1e-470c-8a2b-546d481477c1")
    protected RtFeatureMessage(final Message elt) {
        this.elt = elt;
    }

    @objid ("9715b8ac-89a4-4d1e-bf8a-6842a1b05a2c")
    public static final class MdaTypes {
        @objid ("57f267a7-ee8d-4441-81d4-78ee1e74a5f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2f39fe57-13ef-4551-bd76-49fa5affe939")
        public static NoteType RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT;

        @objid ("95ee1efb-cd58-42f0-8e0f-96758526f53f")
        private static Stereotype MDAASSOCDEP;

        @objid ("48000776-4db2-4fc4-9e59-02bbd69ebbe2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("816da684-f624-4792-a36e-6fcfd562dc66")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "754992b2-0ff8-11df-86fe-0014222a9f79");
            RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "17189c4e-9276-11e0-aeeb-0027103f347c");
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

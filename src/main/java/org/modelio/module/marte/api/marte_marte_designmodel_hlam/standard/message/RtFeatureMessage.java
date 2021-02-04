/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("647b9635-46ed-4fd5-bb91-977f7b2f879f")
    public static final String STEREOTYPE_NAME = "RtFeature_Message";

    @objid ("02f7b359-6201-4d6e-b50c-69c6d4b3cbdd")
    public static final String RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE = "RtFeature_Message_specification";

    /**
     * The underlying {@link Message} represented by this proxy, never null.
     */
    @objid ("dcaa0aa1-672f-41da-aae8-9560bb138335")
    protected final Message elt;

    /**
     * Tells whether a {@link RtFeatureMessage proxy} can be instantiated from a {@link MObject} checking it is a {@link Message} stereotyped << RtFeature_Message >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("85970170-ed77-4d77-911d-345ba8c807c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Message) && ((Message) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureMessage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Message} stereotyped << RtFeature_Message >> then instantiate a {@link RtFeatureMessage} proxy.
     * 
     * @return a {@link RtFeatureMessage} proxy on the created {@link Message}.
     */
    @objid ("f40747a7-140e-4b99-91fd-3d5924ccfa65")
    public static RtFeatureMessage create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Message");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureMessage.STEREOTYPE_NAME);
        return RtFeatureMessage.instantiate((Message)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureMessage} proxy from a {@link Message} stereotyped << RtFeature_Message >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Message
     * @return a {@link RtFeatureMessage} proxy or <i>null</i>.
     */
    @objid ("0ae4f568-539a-4d9e-b9ca-612bfb34428d")
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
    @objid ("bf06685a-8549-4692-bb8d-ed50a55037ca")
    public static RtFeatureMessage safeInstantiate(final Message obj) throws IllegalArgumentException {
        if (RtFeatureMessage.canInstantiate(obj))
        	return new RtFeatureMessage(obj);
        else
        	throw new IllegalArgumentException("RtFeatureMessage: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8fd3b2d3-196a-44af-85c5-48683a87da28")
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
    @objid ("400743c3-089a-43ea-be25-c3ce7eeebccd")
    public Message getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Message_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("e54cb0ff-73ec-4581-9665-e42b3acf017d")
    public String getRtFeature_Message_specificationNote() {
        return this.elt.getNoteContent(RtFeatureMessage.MdaTypes.RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("90d4683c-0122-462e-a3a4-abea16e71d1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Message_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("17550bea-f4ee-48a0-89fc-f27136182699")
    public void setRtFeature_Message_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureMessage.MdaTypes.RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("1ceb22d9-291e-453a-840a-a3eb6af5bae1")
    protected RtFeatureMessage(final Message elt) {
        this.elt = elt;
    }

    @objid ("9715b8ac-89a4-4d1e-bf8a-6842a1b05a2c")
    public static final class MdaTypes {
        @objid ("76e5dab6-3d51-40f7-93d6-6d643b5feaa5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03bbd916-1c2a-495e-9627-d4b30a703dd1")
        public static NoteType RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT;

        @objid ("4e9c1a93-108b-49d3-9f19-8a8a8a158d93")
        private static Stereotype MDAASSOCDEP;

        @objid ("efe69e13-ed1e-4f28-82a0-8beaf55c7958")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b016f915-76dc-4c95-9d83-e55db93854e8")
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

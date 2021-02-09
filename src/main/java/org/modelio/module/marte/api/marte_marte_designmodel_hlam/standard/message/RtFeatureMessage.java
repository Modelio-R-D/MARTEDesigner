/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class RtFeatureMessage {
    public static final String STEREOTYPE_NAME = "RtFeature_Message";

    public static final String RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE = "RtFeature_Message_specification";

    /**
     * The underlying {@link Message} represented by this proxy, never null.
     */
    protected final Message elt;

    /**
     * Tells whether a {@link RtFeatureMessage proxy} can be instantiated from a {@link MObject} checking it is a {@link Message} stereotyped << RtFeature_Message >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Message) && ((Message) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureMessage.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Message} stereotyped << RtFeature_Message >> then instantiate a {@link RtFeatureMessage} proxy.
     * 
     * @return a {@link RtFeatureMessage} proxy on the created {@link Message}.
     */
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
    public static RtFeatureMessage safeInstantiate(final Message obj) throws IllegalArgumentException {
        if (RtFeatureMessage.canInstantiate(obj))
        	return new RtFeatureMessage(obj);
        else
        	throw new IllegalArgumentException("RtFeatureMessage: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtFeatureMessage other = (RtFeatureMessage) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Message}. 
     * @return the Message represented by this proxy, never null.
     */
    public Message getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Message_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getRtFeature_Message_specificationNote() {
        return this.elt.getNoteContent(RtFeatureMessage.MdaTypes.RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Message_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setRtFeature_Message_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureMessage.MdaTypes.RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT, value);
    }

    protected RtFeatureMessage(final Message elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static NoteType RTFEATURE_MESSAGE_SPECIFICATION_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
